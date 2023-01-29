<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="safari">
<%
        int i = Integer.parseInt(request.getParameter("firstnum"));
		int j = Integer.parseInt(request.getParameter("secondnum"));
		
		int Add= i+j;
		
		out.println("Add Two Num : - " + Add);
		 %>
</body>
</html>