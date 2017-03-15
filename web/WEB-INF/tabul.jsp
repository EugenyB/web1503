<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: eugen
  Date: 15.03.2017
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tabulation</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
   <jsp:useBean id="tabul" scope="request" class="model.Tabul"/>
   <table>
       <thead>
       <tr><th>X</th><th>Y</th></tr>
       </thead>
       <tbody>
            <c:forEach items="${tabul.points}" var="p">
                <tr>
                    <td>
                        <fmt:formatNumber value="${p.x}" maxFractionDigits="2" minFractionDigits="2"/>
                    </td>
                    <td>
                        <fmt:formatNumber value="${p.y}" maxFractionDigits="2" minFractionDigits="2"/>
                    </td>
                </tr>
            </c:forEach>
       </tbody>
   </table>
</body>
</html>
