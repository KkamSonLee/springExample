package org.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/testServlet")
public class TestServletClass extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("--- doGet ---");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("--- doPost ---");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("--- init ---");
    }

    @Override
    public void destroy() {
        System.out.println("--- destroy ---");
    }
    //어노테이션 없으면 따로 추가해줘야함 ALT + ENTER
    @PostConstruct
    public void postConstruct(){
        System.out.println("--- postConstruct ---");

    }
    //어노테이션 필요함
    @PreDestroy
    public void preDestroy(){
        System.out.println("--- preDestroy ---");
    }
}
