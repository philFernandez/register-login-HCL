<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Logout</title>
</head>
<body>
   <%
       session.invalidate();
   %> 
   <h1>You're Logged Out...</h1>
   <hr>
   <h3>Goodbye!</h3>
   <br>
   <a href="index.jsp"><button>Home</button></a>
</body>
</html>