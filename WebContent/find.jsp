<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
body
{ 
	background-image: url(3.jpg);  
	background-repeat:no-repeat;
   	background-size:100%;
   	background-attachment: fixed;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1	style="font-size: 50px;text-align:center;">
		Find Books of Author
	</h1>	
	<center>
		<s:form action="find">
			<s:textfield name="input" label="Input An AuthorName"/>
			<s:submit />
		</s:form>
	</center>
</body>
</html>