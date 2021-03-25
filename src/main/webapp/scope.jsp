<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
/*
scope에는 총 4가지 영역 있는데
작은순서대로 나열하면
pageContext -> request -> session -> application
이 작은 순서라는게 뭐냐면 제일 빨리 죽는애
*/
pageContext.setAttribute("userName","페이지-길동");
request.setAttribute("userName", "리퀘스트-길동");
session.setAttribute("userName","세션-길동");
application.setAttribute("userName", "어플리케이션-길동");
RequestDispatcher rd = request.getRequestDispatcher("/forward.jsp");
rd.forward(request, response);
%>

${userName} 
<br>
어플리 : 윤웅재, 가온, 소희, 태윤, 진석, 
<br>
페이지 : 안준, 상혁, 경수, 상범, 두희, 장훈, 경훈