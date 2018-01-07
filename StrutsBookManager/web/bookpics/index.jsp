<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: macbookair
  Date: 2017/12/2
  Time: 下午3:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>星银河畔</title>
  </head>
  <body>
  <a href="showBooks">展示图书</a>
  <hr>
  <table border="1" cellspacing="0" bgcolor="#fff8dc">
    <tr>
      <td>书籍编号</td>
      <td>书名</td>
      <td>价格</td>
      <td>作者</td>
      <td>封面</td>
    </tr>
  <s:iterator value="#session.books" var="books">
   <tr onmouseup="this.style.backgroundColor='#ffff66'";
       onmouseout="this.style.backgroundColor='#fff8dc';" >
     <td> <s:property value="#books.bid" /> </td>
     <td> <s:property value="#books.bname"/> </td>
     <td> <s:property value="#books.price"/> </td>
     <td> <s:property value="#books.author"/> </td>

   </tr>
  </s:iterator>

  </table>
  <hr><br>
  <s:form action="insertBook" method="POST" enctype="multipart/form-data">
    <s:textfield label="编号" name="book.bid"/>
    <s:textfield label="书名" name="book.bname"/>
    <s:textfield label="价格" name="book.price"/>
    <s:textfield label="作者" name="book.author"/>
    <s:file label="封面" name="file"/>
    <s:file label="txt" name="file"/>
    <s:submit label="上传"/>
  </s:form>

  <s:debug/>
  </body>
</html>
