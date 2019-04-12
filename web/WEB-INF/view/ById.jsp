<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: J
  Date: 2018/12/26
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" modelAttribute="byid" action="update">
    <table>
        <tr>
            <td>
                <form:input path="id" readonly="true"></form:input></td>
        </tr>
        <tr>
            <td><form:input path="name"></form:input></td>
        </tr>
        <tr>
            <td><form:radiobuttons path="sex" items="${slist}"></form:radiobuttons></td>
        </tr>
        <tr>
            <td><form:input path="date" type="date"></form:input></td>
        </tr>
        <tr>
            <td><form:select path="grade.id" items="${glist}" itemValue="id" itemLabel="grade_name"></form:select></td>
        </tr>
        <tr>
            <td>
                <button type="submit">提交</button>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
