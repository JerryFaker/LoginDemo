<%--
  Created by IntelliJ IDEA.
  User: JiaLi
  Date: 2020/5/14
  Time: 5:11 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
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
            <img src="/login">
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
