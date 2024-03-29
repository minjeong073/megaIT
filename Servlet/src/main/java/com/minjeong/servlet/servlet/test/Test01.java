package com.minjeong.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test01 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/plain");

        PrintWriter out = resp.getWriter();

        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 M월 dd일");
        out.println("오늘의 날짜는 " + formatter.format(now) + " !");
    }

}