<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<%@ taglib prefix="s" uri="/struts-tags" %>  
 <%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body background="Images/bg-0125.gif">

	Author ID: <s:property value="author.authorid"/></br>
	Author Name: <s:property value="author.name"/></br>
	Author Age: <s:property value="author.age"/></br>
	Author Country: <s:property value="author.country"/></br>
	
	Author's Books:</br>
<table>
	<s:iterator value="book" var="single">
	<tr>	
		<s:url value="show" var="url" >
			<s:param name="isbn" value="#single.isbn"></s:param>
			<s:param name="title" value="#single.title"></s:param>
			<s:param name="authorid" value="#single.authorid"></s:param>
			<s:param name="publisher" value="#single.publisher"></s:param>
			<s:param name="publishdate" value="#single.publishdate"></s:param>
			<s:param name="price" value="#single.price"></s:param>
			<s:param name="authorname" value="authorname"></s:param>
		</s:url>
		<td>
		<s:a href="%{url}">
			《<s:property value="#single.title"/>》
		</s:a>
		</td>
		<s:url value="delete" var="url" >
			<s:param name="isbn" value="#single.isbn"></s:param>
			<s:param name="authorname" value="authorname"></s:param>
		</s:url>
		<td>
		<s:a href="%{url}">
			<button>Delete</button>
		</s:a>
		</td>
	</s:iterator>
</table>
	<s:form action="search">
		<s:submit value="back"/>
	</s:form>
		
</body>
</html>