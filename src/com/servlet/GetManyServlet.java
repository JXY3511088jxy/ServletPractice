package com.servlet;

import com.bean.Hero1;
import net.sf.json.JSONSerializer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetManyServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Hero1> heros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Hero1 hero = new Hero1();
            hero.setName("name"+i);
            hero.setHp(500+i);
            heros.add(hero);
        }

        String result = JSONSerializer.toJSON(heros).toString();

        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print(result);
    }
    public static void main(String[] args) {
        List<Hero1> heros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Hero1 hero = new Hero1();
            hero.setName("name"+i);
            hero.setHp(500+i);
            heros.add(hero);
        }

        System.out.println(JSONSerializer.toJSON(heros).toString());
    }
}
