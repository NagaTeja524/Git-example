<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Bill</h1>
<hr>

    Bill against the credit card number <span style="color: blue"> ${bill.creditcard} </span>
    towards amount <span style="color: blue"> ${bill.amount} - ${bill.currency} </span>
    generated dated (on) <span style="color: blue"> ${bill.date} </span>
    
    
  
</body>
</html>