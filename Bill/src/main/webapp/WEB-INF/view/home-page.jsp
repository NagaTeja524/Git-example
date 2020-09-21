<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>
</head>
<body>
   <h1 align="center">welcome to home page</h1>
   <hr>
    
    <form:form action="process-bill" modelAttribute="bill">

		<div align="center">
		  
		    <label>Credit Card :</label>
			<form:input path="creditcard" />
			<form:errors path="creditcard" cssClass="error"></form:errors>
		    <br>
		    <br>
			<label>Amount :</label>
			<form:input path="amount" />
			<form:errors path="amount" cssClass="error"></form:errors>
            <br>
		    <br>
		    <label for=cn>Currency :</label>
			<form:input id="cn" path="currency" />
			<form:errors path="currency" cssClass="error"></form:errors>
            <br>
		    <br>
            <label for=dt>Date :</label>
			<form:input id="dt" path="date" />
			<form:errors path="date" cssClass="error"></form:errors>
			<br>
		    <br>
            <input type="submit" value="PayBill">
		</div>
	</form:form>
</body>
</html>