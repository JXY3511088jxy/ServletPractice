package com;

import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    public void init(ServletConfig config){
        System.out.println("init of Hello Servlet");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response){

        Enumeration<String> headerNames= request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String header = headerNames.nextElement();
            String value = request.getHeader(header);
            System.out.printf("%s\t%s%n",header,value);
        }

        try {
            //下面三行代码的作用是告诉浏览器不使用缓存
            response.setDateHeader("Expires", 0);
            response.setHeader("Cache-Control", "no-cache");
            response.setHeader("pragma", "no-cache");

            response.setContentType("text/html; charset=UTF-8");
            response.getWriter().println("<h1>Hello Servlet!你好，我来了</h1>");
            response.getWriter().println(new Date().toLocaleString());
      //      response.setContentType("word/lol");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
