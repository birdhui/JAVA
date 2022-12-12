<%--
	기본 유효성 검사 - 입력 데이터 길이 검사
	: 입력 데이터의 제한 길이를 검사
	  아이디와 비밀번호 4~12자 이내로 / 영어와 숫자 혼합 입력 / 첫 문자는 숫자로 시작 할 수 없음 등을 검사
	  
	  document. 폼 이름. 입력양식 이름. value. length
--%>
<%@ page contentType="text/html; charset=utf-8" %>	<%-- 스크립틀릿 태그 --%>
<html>
<head>
<title>id-password-length_test</title>
</head>
<script type="text/javascript">
	function checkLogin() {
		var form = document.loginForm;
		
		if (form.id.value.length < 6 || form.id.value.length > 12) {
			alert("이름을 6~12자 이내로 입력해주세요.");
			form.id.select();
			return;
		}
		
		if (form.password.value.length < 4) {
			alert("비밀번호는 4자 이상으로 입력해야 합니다.");
			form.password.select();
			return;
		}
		form.submit();
	}
</script>
<body>
	<form name="loginForm" action="validation_03_process.jsp" method="post">
		<p> 아이디 : <input type="text" name="id">
		<p> 비밀번호 : <input type="password" name="password">
		<p> <input type="button" value="전송" onclick="checkLogin()">
	</form>
</body>
</html>