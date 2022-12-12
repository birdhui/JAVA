<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Implicit Objects</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String userid = request.getParameter("id");
		String password = request.getParameter("passwd");
	%>
	<%--
		<% %> : 스크립틀릿 태그
				자바 로직 코드를 작성하는 데 사용
	 --%>
	<p> 아이디 : <%=userid%></p>
	<p> 비밀번호 : <%=password%></p>
	<%--
		<%= %> : 표현문 태그
				 변수, 계산식, 메소드 호출 결과를 문자열 형태로 출력하는 데 사용
	 --%>
</body>
</html>