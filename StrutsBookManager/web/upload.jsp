<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: macbookair
  Date: 2017/12/9
  Time: 下午7:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传</title>
</head>
<body>
<s:form enctype="multipart/form-data" action="uploadTest" method="POST">
    <s:file name="upload"/>
    <s:file name="upload"/>
<s:submit/>
</s:form>
</body>
</html>
