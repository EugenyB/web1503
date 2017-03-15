
<%--
  Created by IntelliJ IDEA.
  User: eugen
  Date: 15.03.2017
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
   <jsp:useBean id="calc" scope="request" type="model.Calculator"/>
   <h1>${calc.a} + ${calc.b} = ${calc.sum}</h1>
   <h2>${calc.a} - ${calc.b} = ${calc.a - calc.b}</h2>
</body>
</html>
