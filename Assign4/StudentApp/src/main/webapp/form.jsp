<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Student Form</title>
</head>
<body>

    <h2>Enter Student Details</h2>

    <form action="StudentServlet" method="post">

        Roll No:
        <input type="text" name="rollNo" required>
        <br><br>

        Marks (out of 500):
        <input type="number" name="marks" min="0" max="500" required>
        <br><br>

        <input type="submit" value="Submit">

    </form>

</body>
</html>