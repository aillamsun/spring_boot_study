package com.example.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by sungang on 2016/12/15.
 */
public class DemoInterceptor implements HandlerInterceptor {

    /**
     * 在请求处理之前进行调用（Controller方法调用之前）
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle方法执行");
        return true;
    }

    /**
     * 请求处理之后进行调用，但是在视图被渲染之前(Controller方法调用之后)
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(javax.servlet.http.HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle方法执行");
    }

    /**
     * 在整个请求结束之后被调用，也就是在DispatcherServlet渲染了对应的视图之后执行
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(javax.servlet.http.HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion方法执行");
    }
}
