<%@ page contentType="text/html; charset=utf-8" %>	<%-- 스크립틀릿 태그 --%>
<html>
<head>
<title>id-password-test</title>
</head>
<body>
	<h3>입력에 성공했습니다.</h3>
	<%
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
	%>
	<p> 아이디 : <%=id%>
	<p> 비밀번호 : <%=password%>
</body>