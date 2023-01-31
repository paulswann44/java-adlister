<%--
  Created by IntelliJ IDEA.
  User: paulswann
  Date: 1/31/23
  Time: 11:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color Picker</title>
</head>
<body>
    <form action="pickcolor" method="post">
        <label for="color">What is your favorite color?</label>
        <input type="text" id="color" name="color">
        <input type="submit" value="Submit Color">
    </form>

</body>
</html>
