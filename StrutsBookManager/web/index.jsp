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
    <style type="text/css">
      .title{
        align-items: center;
        text-align: center;
        margin-bottom: 30px;

      }
      .show{

      }
      .show td{
        text-align: center;
        width: 150px;
      }
    </style>
    <title>星银河畔</title>
  </head>
  <body>

  <div class="title"><img src="2.png" align="center" width="686" height="50"></div>
  <a href="showBooks">展示图书</a>
  <hr>
  <div class="show">
  <table border="1" cellspacing="0" bgcolor="#fff8dc">
    <tr>
      <td>书籍编号</td>
      <td>书名</td>
      <td>价格</td>
      <td>作者</td>
      <td>封面</td>
    </tr>
  <s:iterator value="#session.books" var="books1">
   <tr onmouseup="this.style.backgroundColor='#ffff66'";
       onmouseout="this.style.backgroundColor='#fff8dc';"
       <s:if test="#books1.odd">style="background-color:#bbbbbb"</s:if>>

     <td> <s:property value="#books1.bid" /> </td>
     <td> <s:property value="#books1.bname"/> </td>
     <td> <s:property value="#books1.price"/> </td>
     <td> <s:property value="#books1.author"/> </td>
     <td> <img src="<s:property value="#books1.picurl"/>" width="100px" height="140px"> </td>
     <td> <a href="<s:url action="delete"><s:param name="book.bid" value="%{#books1.bid}"/></s:url>">删除</a> </td>
     <td> <a href="<s:url action="download"><s:param name="fileName" value="%{#books1.bname}"/><s:param name="filePath" value="%{#books1.fileurl}"/></s:url>">下载</a>  </td>

   </tr>
  </s:iterator>

  </table>
  <hr>
  </div>
    <br>
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
