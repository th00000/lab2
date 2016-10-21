<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
body
{ 
	background-image: url(1.jpg);  
	background-repeat:no-repeat;
   	background-size:100%;
   	background-attachment: fixed;
}
</style>
<body>
	<h1	style="font-size: 50px;text-align:center; color:gray;">
		Book Manage
	</h1>
	<table style="width:400;margin:0 auto;">
	
		<tr>
			<td>
				<s:url action="query" var="query" >
				</s:url>
				<s:a href="%{query}" style="width:100%; text-align:center;">
					<button style="margin: 0 auto">
						Find Books of Authors
					</button>
				</s:a>
			</td>
		</tr>
		
		<tr>
			<td>
				<s:url action="input" var="input_nb" >
				</s:url>
				<s:a href="%{input_nb}" style="width:100%; text-align:center;">
					<button style="margin: 0 auto">
						Add a New Book
					</button>
				</s:a>		
			</td>
		</tr>
		
		<tr>
			<td>
				<s:url action="showallbook" var="showallbook" >
				</s:url>
				<s:a href="%{showallbook}" style="width:100%; text-align:center;">
					<button style="margin: 0 auto">
						 Show All Books
					</button>
				</s:a>		
			</td>
		</tr>
		
		<tr>
			<td>
				<s:url action="showallauthor" var="showallauthor" >
				</s:url>
				<s:a href="%{showallauthor}" style="width:100%; text-align:center;">
					<button style="margin: 0 auto">
						 Show All Authors
					</button>
				</s:a>		
			</td>
		</tr>
		
	</table>
</body>
</html>
<%-- <s:form action="find"> --%>
<%-- 				<s:textfield name="input" label="Input An AuthorName"/> --%>
<%-- 				<s:submit /> --%>
<%-- 				</s:form> --%>