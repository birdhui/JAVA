<%-- 유효성 검사를 위해 핸들러 함수를 만드는 과정
	 폼 페이지에 입력한 아이디와 비밀번호 출력하기
 --%>
<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
	<title>Handler function-basic</title>
</head>
	<script type="text/javascript">
		function checkform() {
			alert("아이디 : " + document.loginForm.id.value + "\n" +
					"비밀번호 : " + document.loginForm.passwd.value);
				<%--
							document. 폼 이름. 입력항목 이름. value;
				--%>
		}
	</script>
<body>
	<form name="loginForm">
		<p> 아 이 디 : <input type="text" name="id">
		<p> 비밀번호 : <input type="password" name="passwd">
		<p> <input type="submit" value="전송" onclick="checkform()">	
									<%--
											onclick="핸들러 함수()"
									--%>
	</form>
</body>
</html>

<%-- 
	결과값
	: 아이디, 비밀번호 입력 시 alert로 인해
	  알림창에 아이디 값과 비밀번호 값이 출력됨
--%>