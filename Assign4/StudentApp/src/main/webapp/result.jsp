<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.StudentBean" %>

<%
    StudentBean s = (StudentBean) request.getAttribute("student");
%>

<html>
<head>
    <title>Student Result</title>
</head>
<body>

    <h2>Student Profile</h2>

    <% if (s != null) { %>

        Roll No: <%= s.getRoll() %> <br><br>
        Name: <%= s.getName() %> <br><br>
        Department: <%= s.getDept() %> <br><br>
        Marks: <%= s.getMarks() %> <br><br>
        Percentage: <%= s.getPercentage() %> % <br><br>

    <% } else
    
    { %>

        <h3>No data found ❌</h3>

    <% } %>

</body>
</html>