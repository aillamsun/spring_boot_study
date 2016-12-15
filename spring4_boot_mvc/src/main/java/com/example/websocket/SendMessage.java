package com.example.websocket;

import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Created by sungang on 2016/12/15.
 */
@ServerEndpoint("/sendMessage")
@Component
public class SendMessage {

    private static int onlineCount = 0;

    //当我们往一个容器添加元素的时候，不直接往当前容器添加，而是先将当前容器进行Copy，复制出一个新的容器，
    //然后新的容器里添加元素，添加完元素之后，再将原容器的引用指向新的容器. 实现读写分离
    private static CopyOnWriteArraySet<SendMessage> webSocketSet = new CopyOnWriteArraySet<>();

    private Session session;

    /**
     * 创建一个socket会话时调用的方法
     *
     * @param session
     */
    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
        webSocketSet.add(this);
        System.out.println("Socket当前链接数" + webSocketSet.size());
    }

    /**
     * 关闭一个socket会话时调用的方法
     */
    @OnClose
    public void onClose() {
        webSocketSet.remove(this);
        System.out.println("Socket当前链接数" + webSocketSet.size());
    }

    /**
     * socket通讯方法
     *
     * @param message
     * @param session
     * @throws IOException
     */
    @OnMessage
    public void onMessage(String message, Session session) throws IOException {
        System.out.println("来自客户端的消息:" + message);
        //循环set里的当前链接的socket发送信息
        for (SendMessage item : webSocketSet) {
            item.sendMessage(message);
        }
        System.out.println(session.getRequestURI());

    }

    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
    }

}
