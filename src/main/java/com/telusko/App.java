package com.telusko;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws LifecycleException {

        System.out.println("Hello World!"); // 테스트용 출력

        Tomcat tomcat = new Tomcat(); // 톰캣 서버 객체 생성
        tomcat.setPort(8080); // 포트 8080으로 설정

        Context context = tomcat.addContext("", null); // 웹 애플리케이션 생성 (루트 경로)

        // HelloServlet을 Tomcat에 등록
        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());

        // /hello 요청이 오면 HelloServlet 실행
        context.addServletMappingDecoded("/hello", "HelloServlet");

        tomcat.start(); // 서버 시작

        tomcat.getServer().await(); // 서버 계속 실행 유지
    }
}