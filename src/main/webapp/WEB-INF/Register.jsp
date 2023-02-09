<%--
  Created by IntelliJ IDEA.
  User: paulswann
  Date: 2/8/23
  Time: 8:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register for the AdLister</title>
</head>
<body>
<h1>Register</h1>
<form action="/register" method="POST">
    <div>
    <label for="username">Username</label>
    <input id="username" type="text" name="username" placeholder="Enter name">
 </div>
    <div>
    <label for="email">Email</label>
    <input id="email" type="text" name="email" placeholder="Enter email">
 </div>
    <div>
    <label for="password">Password</label>
    <input id="password" name="password" placeholder="Password:" type="password">
    </div>
    <button>Register</button>
</form>

</body>
</html>
