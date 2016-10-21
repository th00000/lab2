<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
body
{ 
	background-image: url(9.jpg);  
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
			Add a New Book
		</h1>
		<s:form action="add">
			<table style="width:400;margin:0 auto;">
				<tr>
					<td><s:textfield name="isbn" label="Input An Isbn"/></td>
				</tr>
				
				<tr>
					<td> <s:textfield name="title" label="Input An Title" /></td>
				</tr>
				<tr>
					<td> <s:textfield name="authorid" label="Input An Authorid" /></td>
				</tr>
				<tr>
					<td> <s:textfield name="publisher" label="Input An Publisher"/></td>
				</tr>
				<tr>
					<td> <s:textfield name="Publishdate" label="Input An Publishedate"/></td>
				</tr>
				<tr>
					<td> <s:textfield name="price" label="Input An Price"/></td>
				</tr>
			</table>
		
		<s:submit value="Insert" style="position:relative; float:left; left:600px; top:30px;" ></s:submit>
	</s:form>
	
	<s:url action="back" var="back" >
<%-- 		<s:param name="isbn" value="#i.isbn"></s:param> --%>
	</s:url>
	<s:a href="%{back}" style="position:relative; top:30px; left:35%;">
		<button>
			Back
		</button>
	</s:a>
</body>
</html>