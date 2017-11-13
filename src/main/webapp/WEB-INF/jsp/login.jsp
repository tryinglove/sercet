<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"  %>
<html>
<body>
<form action="login" method="post" >
    用户名：<input type="text" name="userName"/><br>
    密码：<input type="text" name="userPassword"/><br>
    ${message}
    <input type="submit">
</form>
</body>
</html>
