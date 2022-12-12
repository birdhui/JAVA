<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Login_process</title>
<style>
	/* 써라운드에어체 */
	@import url('https://webfontworld.github.io/Cafe24SsurroundAir/Cafe24SsurroundAir.css');
	
	h1, h3 {
		font-family: 'Cafe24SsurroundAir';
		text-align: center;		/* 텍스트 정렬 : 중앙 */
		color: 	#000066;		/* 글꼴색 설정 */
	}
	.text {
		margin-top: 380px;
	}
</style>
</head>
<body>
	<div class="text">
	<h1>입력에 성공했습니다.</h1>
	<%
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
	%>
	<h3> 아이디 : <%=id%></h3>
	<h3> 비밀번호 : <%=password%></h3>
	</div>
</body>
</html>