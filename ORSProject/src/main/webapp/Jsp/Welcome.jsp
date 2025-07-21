<%@page import="in.co.rays.Proj4.bean.RoleBean"%>
<%@page import="in.co.rays.Proj4.controller.ORSView"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=ORSView.WelcomeCtl%>">
		<%@ include file="Header.jsp"%>
		<br> <br> <br>
		<h1 align="center">
			<font size="10px" color="navy">Welcome to ORS</font>
		</h1>

		<%
			UserBean beanUserBean = (UserBean) session.getAttribute("user");
			if (beanUserBean != null) {
				if (beanUserBean.getRoleId() == RoleBean.STUDENT) {
		%>

		<h2 align="Center">
			<a style="color: maroon" href="#">Click here to see your
				Marksheet </a>
		</h2>

		<%
			}
			}
		%>

	</form>
</body>
</html>