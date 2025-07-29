<%@page import="in.co.rays.Proj4.bean.UserBean"%>
<%@page import="in.co.rays.Proj4.controller.LoginCtl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		UserBean user = (UserBean) session.getAttribute("user");
	%>
	<%
		if (user != null) {
	%>
	<h3>
		Hi,
		<%=user.getFirstName()%>
		(<%=session.getAttribute("role")%>)
	</h3>
	<a href="UserCtl"><b>Add User</b></a>
	<b>|</b>
	<a href="UserListCtl"><b>User List</b></a>
	<b>|</b>
	<a href="RoleCtl"><b>Add Role</b></a>
	<b>|</b>
	<a href="RoleListCtl"><b>Role List</b></a>
	<b>|</b>
	<a href="CollegeCtl"><b>Add College</b></a>
	<b>|</b>
	<a href="CollegeListCtl"><b>College List</b></a>
	<b>|</b>
	<a href="StudentCtl"><b>Add Student</b></a>
	<b>|</b>
	<a href="StudentListCtl"><b>Student List</b></a>
	<b>|</b>
	<a href="MarksheetCtl"><b>Add Marksheet</b></a>
	<b>|</b>
	<a href="MarksheetListCtl"><b>Marksheet List</b></a>
	<b>|</b>
	<a href="LoginCtl?operation=<%=LoginCtl.OP_LOG_OUT%>"><b>Logout</b></a>
	<%
		} else {
	%>
	<h3>Hi, Guest</h3>
	<a href="WelcomeCtl"><b>Welcome</b></a> |
	<a href="LoginCtl"><b>Login</b></a>
	<%
		}
	%>
	<hr>
</body>
</html>