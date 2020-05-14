<%--
  Created by IntelliJ IDEA.
  User: JiaLi
  Date: 2020/5/13
  Time: 11:56 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆系统Demo</title>
</head>
<body>
<h1 align="center">登陆系统Demo</h1>

<form action="login" method="post">
    <table align="center">
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="name" /></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="pwd" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <img src="/login" height="25px">
            </td>
        </tr>
        <tr>
            <td>验证码：</td>
            <td><input type="text" name="captcha" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="登陆" />
                <input type="reset" value="重置" />
            </td>
        </tr>
    </table>
</form>
</body>
</html>
