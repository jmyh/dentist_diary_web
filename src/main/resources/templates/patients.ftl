<html>
<head>
    <title>Title</title>
</head>

<div>
    <div>
        Already in System!
    </div>
    <table>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
        </tr>
        <#list patientsFromServer as patient>
        <tr>
            <td>${patient.firstName}</td>
            <td>${patient.lastName}</td>
        </tr>
        </#list>
    </table>
</div>
</body>
</html>