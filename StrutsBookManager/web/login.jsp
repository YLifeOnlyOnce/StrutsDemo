<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: macbookair
  Date: 2017/12/3
  Time: 下午11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<s:i18n name="message.messages">
    <html>
<head>
    <title>快速登陆</title>
</head>
<body onload="alert('张鑫真tm牛逼');">
    
    <%--<s:select list="{1:'男',2:'女'}" name="sex" label="abc" listKey="key" listValue="value" headerKey="0" headerValue="aabb"/>--%>

        <%--<select name="">--%>
        <%--<option name="source"/>--%>
        <%--<option name="nnnnn"/>--%>
        <%--</select>--%>

    <s:text name="welcome"></s:text>
    <span style="color: red">${message}</span>
    <s:form action="login" method="POST">
        <s:textfield label="用户名" name="user.username"></s:textfield>
        <s:textfield label="密码" name="user.password"></s:textfield>
        <s:submit label="登陆"></s:submit>

    </s:form>
     <a href="regist.jsp">注册</a>x

</body>
</html>
</s:i18n>
