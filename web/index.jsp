<%--
  Created by IntelliJ IDEA.
  User: eugen
  Date: 15.03.2017
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="hello.html" method="post">
    <input type="text" name="username">
    <button type="submit">Ok</button>
  </form>
  <form action="calc.html" method="post">
     a = <input type="number" name="a"> <br/>
     b = <input type="number" name="b"> <br/>
     <button type="submit">Sum</button>
  </form>
  <form action="tabul.html" method="post">
    start: <input type="text" name="start"> finish: <input type="text" name="finish"> step: <input type="text" name="step">
    <button type="submit">Tab</button>
  </form>
  </body>
</html>
