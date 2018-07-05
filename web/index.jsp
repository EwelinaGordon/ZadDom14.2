<%--
  Created by IntelliJ IDEA.
  User: gordo
  Date: 05.07.2018
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Tekst</title>
  </head>
  <body>
    <form method="post" action="TextServlet">
      <h1>Przelicznik tekstu</h1>
      <textarea rows ="10" cols = "20" name = "text"></textarea> <br>
      <input type = "submit" name = "Wyslij">

    </form>

  </body>
</html>
