<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: macbookair
  Date: 2017/12/4
  Time: 上午12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>regist</title>
</head>
<body>

    <s:form action="regist" method="POST">
        <s:textfield label="用户名" name="user.username"></s:textfield>
        <s:textfield label="密码" name="user.password"></s:textfield>
        <s:submit label="注册"></s:submit>
    </s:form>
</body>
</html>
