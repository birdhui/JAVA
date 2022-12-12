<html>
<head>
<title>Scriptlet Tag_Count</title>
</head>
	<%
		int count = 0;	// 지역 변수 count를 0으로 초기화
	%>
<body>
	Page Count is
	<%
	out.println(++count);	// 지역 변수 count를 1증가시킴
	%>
</body>
</html>