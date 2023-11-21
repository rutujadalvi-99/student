<html>
<body>

<h2>SMS</h2>

<form action="updateStudent">

 roll<input type="text" name="rollno" value="${student.rollno}"  readonly/>
 name<input type="text" name="name" value="${student.name}" /> <br/>
 email <input type="text" name="email" value="${student.email}" /> <br/>
 city <input type="text" name="city" value="${student.city}" /> <br/>

<button type="submit">Update</button>
</form>


</body>
</html>