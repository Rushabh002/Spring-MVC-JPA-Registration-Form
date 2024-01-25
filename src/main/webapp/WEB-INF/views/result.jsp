<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <table>
        <tr>
            <th>ID</th>
            <th>Email</th>
            <th>Username</th>
            <th>Password</th>
        </tr>
        <tr>
            <c:if test="${r != null}">
                <td>${r.id}</td>
                <td>${r.email}</td>
                <td>${r.username}</td>
                <td>${r.pass}</td>
            </c:if>
        </tr>
    </table>

    <c:if test="${error != null}">
        <div>${error}</div>
    </c:if>
</body>
</html>
