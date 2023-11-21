<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>

<table>
<thead><tr><th>RollNo</th>
<th>Name</th>
<th>Email</th>
<th>City</th>
</thead>
<tbody>
<c:forEach items="${student}" var="cp" >
<tr>
<td>${cp.rollno} </td>
<td> ${cp.name}</td>
<td> ${cp.email} </td>
<td> ${cp.city} </td>
<td>
<a href="editStudent?rollno=${cp.rollno }">Edit</a> | 
<a href="deleteStudent?rollno=${cp.rollno }">Delete</a>

</td>
</tr>

</c:forEach>
</tbody>

</table>
</body>
</html>