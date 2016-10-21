<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
body
{ 
	background-image: url(5.jpg);  
	background-repeat:no-repeat;
   	background-size:100%;
   	background-attachment: fixed;
}
</style>
<body>
	<h1 style="font-size: 50px;text-align:center;">
		Books of
		<s:property value="now_name"/> 
	</h1>
	<table border=1 style="width:400px;margin:0 auto;">
			<tr>
				<td>title</td>
				<td>show</td>
				<td>delete</td>
			</tr>
			<s:iterator value="au_book" var="i">
				<tr>
					<td>
							<s:property value="#i.title"/>
					</td>
					
					<td>
						<s:url action="show" var="show" >
						<s:param name="isbn" value="#i.isbn"></s:param>
						</s:url>
						<s:a href="%{show}">
							<button>
								show
							</button>
						</s:a>
					</td>
					
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
		<s:a href="%{back}" style="position:relative; top:20px; left:45%;">
			<button>
				Back
			</button>
		</s:a>		
<%-- 	<s:form action="adda"> --%>
<%-- 		<s:submit value="Add An Author"/> --%>
<%-- 	</s:form> --%>
		
	
</body>
</html>
