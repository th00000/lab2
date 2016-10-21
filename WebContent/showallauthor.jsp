<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
body
{ 
	background-image: url(6.jpg);  
	background-repeat:no-repeat;
   	background-size:100%;
   	background-attachment: fixed;
}
td
{
	color:white;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%-- <s:debug></s:debug> --%>
<body>
	<h1	style="font-size: 50px;text-align:center; color:gray;">
		Show All Authors
	</h1>
<%-- 	<s:debug></s:debug> --%>
	<table border="1" style="width:500px; margin:0 auto;">
		<tr>
			<td>Authorid</td>
			<td>Name</td>
			<td>Age</td>
			<td>Country</td>
		</tr>
		
		
		<s:iterator value="all_author" var="i">
				<tr>
					<td><s:property value="#i.authorid"/></td>
					<td><s:property value="#i.name"/></td>
					<td><s:property value="#i.age"/></td>
					<td><s:property value="#i.country"/></td>
				</tr>
		</s:iterator>
	</table>
	
	<s:url action="back" var="back" >
<%-- 		<s:param name="isbn" value="#i.isbn"></s:param> --%>
	</s:url>
	<s:a href="%{back}" style="position:relative; top:30px; left:45%;">
		<button>
			Back
		</button>
	</s:a>
	
	
</body>
</html>