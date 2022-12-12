<html>
<head>
<title>Expression Tag</title>
</head>
	<%
		int count=0;
	%>
<body>
	Page Count is
	<%= ++count %>	<%-- 지역 변수 count를 1 증가시킴 / 세미콜론으로 종료하지 않음 --%>
</body>
</html>

<%--
	표현문 태그
	: 웹 브라우저에 출력할 부분을 표현
	: 숫자, 문자, 불린 등의 기본 데이터 타입과 자바 객체 타입도 사용 가능
--%>