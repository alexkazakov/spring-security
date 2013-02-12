<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF8" %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
    <title>Login</title>
<body>
<c:if test='${not empty param.error}'>
    <span style="color: red; ">
        Login error. <br/>
        Reason : ${sessionScope['SPRING_SECURITY_LAST_EXCEPTION'].message}
    </span>
</c:if>

<spring:message code="login.text"/>

<form method='POST' action='<c:url value='/j_spring_security_check' />'>
    <table>
        <tr>
            <td align='right'>Username</td>
            <td><input type='text' name='j_username'/></td>
        </tr>
        <tr>
            <td align='right'>Password</td>
            <td><input type='password' name='j_password'/></td>
        </tr>
        <tr>
            <td colspan='2' align='right'>
                <input type="submit" value="Логин"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>