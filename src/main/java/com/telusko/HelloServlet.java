package com.telusko;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    // GET 요청이 들어오면 실행되는 메서드
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        System.out.println("In Service"); // 서버 콘솔에 로그 출력

        res.setContentType("text/html"); // 응답을 HTML로 설정

        PrintWriter out = res.getWriter(); // 브라우저로 출력할 객체 생성

        out.println("<h2><b>Hello World</b></h2>"); // HTML을 브라우저에 전달
    }
}