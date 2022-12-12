<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>id-password-length_number test</title>
</head>
<script type="text/javascript">
	function checkLogin() {
		var form = document.loginform;
		
		for (i=0; i<form.id.value.length; i++) {
			var ch = form.id.value.charAt(i);
			
			if ((ch<'a'||ch>'z') && (ch>'A'||ch<'Z') && (ch>'0'||ch<'9')) {
				alert("아이디는 영문 소문자만 입력 가능합니다!");
				form.id.select();
				return;
			}
		}
		
		if (isNaN(form.password.value)) {
			alert("비밀번호는 숫자만 입력 가능합니다!");
			form.password.select();
			return;
		}
		form.submit();
	}
</script>
<body>
	<form name="loginform" action="validation_04_process.jsp" method="post">
		<p> 아이디 : <input type="text" name="id">
		<p> 비밀번호 : <input type="password" name="password">
		<p> <input type="button" value="전송" onclick="checkLogin()">
	</form>
</body>
</html>

<%--
	기본 유효성 검사 - 숫자 여부 확인하기
	: 숫자 여부는 isNaN()함수를 활용하여 검사
	
	isNaN (isNotaNumber)
	: isNaN() 함수의 인자 값이 숫자이면 false를 반환하고 숫자가 아니면 true를 반환
--%>