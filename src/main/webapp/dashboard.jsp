<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
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
                    <th class="hide">Password</th>
                </tr>
                <tr>
                    <td> ${user.getUsername()} </td>
                    <td> ${user.getEmail()} </td>
                    <!-- this would never be done in a real application
                    because this element contains a user password in 
                    clear text. This is just from demonstrative purposes. -->
                    <td class="hide"> ${user.getPassword()} </td>
                </tr>
            </table>
            <hr>
            <a href="index.jsp"><button class="pad">Home</button></a>
            <a href="logout.jsp"><button class="pad">Logout</button></a>
            <button id="showpass">Show Password</button>
            <script src="script.js"></script>
        </c:when>
        <c:otherwise>
            <h2>Please Login to View This Page</h2>
            <hr>
            <a href="login.jsp"><button>Login</button></a>
            <h4>Need an account?</h4>
            <a href="register.jsp"><button>Register</button></a>
        </c:otherwise>
    </c:choose>

</body>

</html>