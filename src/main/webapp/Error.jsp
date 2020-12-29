<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isErrorPage="true" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Error</title>
    </head>

    <body>
        <h1>Error!</h1>
        <h2>
            <%=exception.getMessage() %><br />
        </h2>
        <table>
            <tr>
                <td><a href="index.jsp">Home</a></td>
            </tr>
            <tr>
                <td><a href="dashboard.jsp">Dashboard</a></td>
            </tr>
            <tr>
                <td><a href="login.jsp">Login</a></td>
            </tr>
            <tr>
                <td><a href="register.jsp">Register</a></td>
            </tr>
        </table>
    </body>

    </html>