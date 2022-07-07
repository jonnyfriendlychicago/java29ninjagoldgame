<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>java28omikujiform</title>
</head>
<body>
	<h1>java28omikujiform Dashboard</h1>
	<h2>Here is your Omikuji!</h2>
	<p>submitted elNumero: <c:out value="${elNumero}"/></p>
	<p>submitted city: <c:out value="${city}"/></p>
	<p>submitted person: <c:out value="${person}"/></p>
	<p>submitted profHobb: <c:out value="${profHobb}"/></p>
	<p>submitted animal: <c:out value="${animal}"/></p>
	<p>submitted nicety: <c:out value="${nicety}"/></p>
	<p>In <c:out value="${elNumero}"/> years, you will live in <c:out value="${city}"/> with <c:out value="${person}"/> as your roommate, <c:out value="${profHobb}"/> for a living. The next time you see a <c:out value="${animal}"/>, you will have good luck.  Also, <c:out value="${nicety}"/>. </p>
	<a href= "/">Do it again!</a>
</body>
</html>