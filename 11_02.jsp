<!-- 스크립틀릿 태그에 0~10까지 짝수 출력하기 -->
<html>
<head>
<title>Scriptlet Tag_Even Number</title>
</head>
<body>
	<%
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				out.println(i + "<br>");
			}
		}
	%>
</body>
</html>