<%-- 폼 페이지에 입력한 데이터(아이디와 비밀번호)값의 유무 검사하기 --%>
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
			
			if ((ch<'a' || ch>'z') && (ch>'A' || ch<'Z') && (ch>'0' || ch<'9')) {
				alert("아이디는 영문 소문자만 입력 가능합니다!");
				form.id.select();
				return;
			}
		}
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
		else if (!isNaN(form.id.value.substr(0, 1))) {
			alert("아이디는 숫자로 시작할 수 없습니다!");
			document.form.id.select();
		}		
		else if (form.id.value.length < 6 || form.id.value.length > 12) {
			alert("아이디는 6~12자 이내로 입력해주세요.");
			form.id.select();
			return;
		}		
		else if (form.password.value.length < 4) {
			alert("비밀번호는 4자 이상으로 입력해야 합니다.");
			form.password.select();
			return;
		}
		else if (isNaN(form.password.value)) {
			alert("비밀번호는 숫자만 입력 가능합니다!");
			form.password.select();
			return;
		}
		
		form.submit();
	}
</script>
<body>
	<form name="loginform" action="validation_process.jsp" method="post">
		<p> 아이디 : <input type="text" name="id">
		<p> 비밀번호 : <input type="password" name="password">
		<p> <input type="button" value="전송" onclick="checkLogin()">
	</form>
</body>
</html>