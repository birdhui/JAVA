<%--
	기본 유효성 검사 - 데이터 유무 확인하기
	  : 입력 항목에 입력한 데이터 값이 있는지 없는지 확인하고
	    데이터 길이, 숫자 등 기본적인 것이 맞는지 검사
	  -> 데이터의 유무를 검증하는 것
	  
	 document. 폼 이름. 입력항목 이름. value;
--%>
<%@ page contentType="text/html; charset=utf-8" %>	<%-- 스크립틀릿 태그 --%>
<html>
<head>
<title>id-password-test</title>
</head>
<script type="text/javascript">
	function checkLogin() {
		var form = document.loginform;
			
		if (form.id.value == "") {
			alert("아이디를 입력해주세요.");
			form.id.focus();
			return false;
		}
		else if (form.password.value == "") {
			alert("비밀번호를 입력해주세요.");
			form.passwd.focus();
			return false;
		}
		form.submit();
	}
</script>
<body>
	<form name="loginform" action="validation_02_process.jsp" method="post">
		<p> 아이디 : <input type="text" name="id">
		<p> 비밀번호 : <input type="text" name="password">
		<p> <input type="submit" value="전송" onclick="checkLogin()">
	</form>
</body>
</html>