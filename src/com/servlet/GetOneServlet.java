package com.servlet;

import com.bean.Hero1;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetOneServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Hero1 hero = new Hero1();
        hero.setName("盖伦");
        hero.setHp(353);

        JSONObject json= new JSONObject();

        json.put("hero", JSONObject.fromObject(hero));
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print(json);
    }
}
