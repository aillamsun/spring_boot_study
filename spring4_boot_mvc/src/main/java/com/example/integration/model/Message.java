package com.example.integration.model;

/**
 * Created by sungang on 2016/12/24.
 */
public class Message {

    public enum MessageType {
        CREATE,
        UPDATE,
        DELETE
    }

    private String name;
    private MessageType messageType;
    private String body;

    public Message() {
    }

    public Message(String name, MessageType messageType, String body) {
        this.name = name;
        this.messageType = messageType;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String toString() {
        return name + ", " + messageType + ", " + body;
    }
}
