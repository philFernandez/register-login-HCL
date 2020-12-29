<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
</head>

<body>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:choose>
        <c:when test="${not empty user}">
            <h1>You're Logged In!</h1>
            <hr>
            <h2>Dashboard</h2>
            <table border="1" cellpadding="5">
                <tr>
                    <th>User Name</th>
                    <th>User Email</th>
                </tr>
                <tr>
                    <td> ${user.getUsername()} </td>
                    <td> ${user.getEmail()} </td>
                </tr>
            </table>
            <hr>
            <a href="logout.jsp"><button>Logout</button></a>
        </c:when>
        <c:otherwise>
            <h2>Please Login to View This Page</h2>
            <hr>
            <a href="login.jsp"><button>Login</button></a>
        </c:otherwise>
    </c:choose>

</body>

</html>