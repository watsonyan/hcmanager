<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:fielderror fieldName="username" theme="simple"></s:fielderror>
	<form action="login" method="post">
	u:<input type="text" name="username"><br/>
	p:<input type="password" name="password"><br/>
	<input type="submit" value="login">
	</form>
	<s:debug></s:debug>
	<s:property value="fieldErrors.username[0]"/>
	
</body>
</html>