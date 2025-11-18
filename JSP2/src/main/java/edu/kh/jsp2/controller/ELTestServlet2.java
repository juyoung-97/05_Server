package edu.kh.jsp2.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/el/scope")
public class ELTestServlet2 extends HttpServlet{
	
	// a태그 요청은 GET 방식 -> doGet() 오버라이딩
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		// 요청처리
		
		// 1. page scope -> JSP 에서만 확인가능 (딱 1페이지)
		
		// 2. request scope
		// - 요청받은 Servlet과 요청이 위임된 JSP 까지 유지되는 객체
		
		// 3. session scope
		// - 클라이언트가 서버에 첫 요청 시 서버쪽에 생성되는 객체
		// - 클라이언트가 브라우저를 종료하거나 지정된 세션 만료 시간이 지나면 사라짐
		// -> 위 상황이 아니면 계속 유지되는 객체
		
		// 4. application scope
		// - 서버 전체에 1개만 존재하는 객체
		// -> 모든 클라이언트가 공유
		// - 서버 시작 시 생성, 서버 종료시 소멸
		
		
		// 응답처리
		
		
		
		
		
	}
}
