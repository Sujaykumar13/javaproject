<%@ page isELIgnored="false" %>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<h1>Data is fetch</h1>
<table border="1">
<tr>
<th>firstName</th>
<th>lastName</th>
<th>parentName</th>
<th>contactNumber</th>
<th>birthDate</th>
<th>email</th>
<th>password</th>
<th>confirmPassword</th>
<th>Update</th>
<th>ViewByEmail</th>
<th>Delete</th>
</tr>

<c:forEach items="${fetch}" var="singleDto">
<tr>
<td>${singleDto.firstName}</td>
<td>${singleDto.lastName}</td>
<td>${singleDto.parentName}</td>
<td>${singleDto.contactNumber}</td>
<td>${singleDto.birthDate}</td>
<td>${singleDto.email}</td>
<td>${singleDto.password}</td>
<td>${singleDto.confirmPassword}</td>
<td><a href="getProfilePage?id=${singleDto.id}">Update</a></td>
<td><a href="getProfilePageByEmail?email=${singleDto.email}">View</a></td>
<td><a href="deleteData/${singleDto.id}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>