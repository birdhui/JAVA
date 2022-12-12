<%-- 폼 페이지에 입력한 데이터(아이디와 비밀번호)값의 유무 검사하기 --%>
<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
	<title>Login</title>
	<style>
	/* 써라운드에어체 */
	@import url('https://webfontworld.github.io/Cafe24SsurroundAir/Cafe24SsurroundAir.css');
	
	h1 {
		font-family: 'Cafe24SsurroundAir';
		text-align: center;		/* 텍스트 정렬 : 중앙 */
		color: 	#000066;		/* 글꼴색 설정 */
	}
	.text {
		margin-top: 380px;
	}
	</style>
</head>
<script type="text/javascript">
	function checkLogin() {
		var form = document.loginForm;
		
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
		else if (form.passwd.value == "") {
			alert("비밀번호를 입력해주세요.");
			form.passwd.focus();
			return false;
		}
		else if (!isNaN(form.id.value.substr(0, 1))) {
			alert("아이디는 숫자로 시작할 수 없습니다!");
			document.form.id.select();
		}
		else if (form.id.value.length < 5 || form.id.value.length > 10) {
			alert("아이디를 5~10자 이내로 입력해주세요.");
			form.id.select();
			return;
		}
		else if (form.passwd.value.length < 4 || form.passwd.value.length > 8) {
			alert("비밀번호는 4자 이상으로 입력해야 합니다!");
			form.passwd.select();
			return;
		}
		else if (isNaN(form.passwd.value)) {
			alert("비밀번호는 숫자만 입력 가능합니다!");
			form.passwd.select();
			return;
		}
		form.submit();
	}
</script>
<body>
	<form name="loginForm" action="login_proccess.jsp" method="post">
	<div class="text">
		<h1> 아이디 : <input type="text" name="id"></h1>
		<h1> 비밀번호 : <input type="password" name="passwd"></h1>
		<h1> <input type="button" value="전송" onclick="checkLogin()"></h1>
	</div>
	</form>
</body>
</html>