<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
body
{ 
	background-image: url(7.jpg);  
   	background-attachment: fixed;
}
td
{
	color:red;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%-- <s:debug></s:debug> --%>
<body>
	<h1	style="font-size: 50px;text-align:center; color:gray">
		Show All Books
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
			<td>Delete</td>
		</tr>
		
		
		<s:iterator value="all_book" var="i">
				<tr>
					<td><s:property value="#i.isbn"/></td>
					<td><s:property value="#i.title"/></td>
					<td><s:property value="#i.authorid"/></td>
					<td><s:property value="#i.publisher"/></td>
					<td><s:property value="#i.publishdate"/></td>
					<td><s:property value="#i.price"/></td>
					<td>
						<s:url action="delete" var="delete" >
						<s:param name="isbn" value="#i.isbn"></s:param>
<%-- 						<s:param name="authorname" value="#i.authorid"></s:param> --%>
						</s:url>
						<s:a href="%{delete}">
							<button>
								delete							
							</button>
						</s:a>
					</td>
				</tr>
		</s:iterator>
	</table>
	
	<s:url action="back" var="back" >
<%-- 		<s:param name="isbn" value="#i.isbn"></s:param> --%>
	</s:url>
	<s:a href="%{back}" style="position:relative; top:30px; left:50%;">
		<button>
			Back
		</button>
	</s:a>
	
	
</body>
</html>