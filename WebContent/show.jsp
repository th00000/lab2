<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
body
{ 
	background-image: url(8.jpg);  
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
		Book
	</h1>
<%-- 	<s:debug></s:debug> --%>
	<table border="1" style="width:500px; margin:0 auto;">
		<tr>
			<td>Isbn</td>
			<td>Title</td>
			<td>Authorid</td>
			<td>Publisher</td>
			<td>Publishdate</td>
			<td>Price</td>
		</tr>
		
		<tr>
			<td><s:property value="show_book.isbn"/></td>
			<td><s:property value="show_book.title"/></td>
			<td><s:property value="show_book.authorid"/></td>
			<td><s:property value="show_book.publisher"/></td>
			<td><s:property value="show_book.publishdate"/></td>
			<td><s:property value="show_book.price"/></td>
		</tr>
		
	</table>
	
	<s:url action="back" var="back" >
<%-- 		<s:param name="isbn" value="#i.isbn"></s:param> --%>
	</s:url>
	<s:a href="%{back}" style="position:relative; top:30px; left:35%;">
		<button>
			Back
		</button>
	</s:a>
	
	<s:url action="delete" var="delete" >
		<s:param name="isbn" value="show_book.isbn"></s:param>
	</s:url>
	<s:a href="%{delete}" style="position:relative; top:30px; left:50%;">
		<button>
			Delete
		</button>
	</s:a>
</body>
</html>