<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<a href="/">Home</a>&nbsp;&nbsp;&nbsp;

<a href="/balance">view  Balance</a>&nbsp;&nbsp;&nbsp;

<a href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;

<a href="/withdraw">withdraw</a>&nbsp;&nbsp;&nbsp;

<a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;

<a href="/close">close Account</a>&nbsp;&nbsp;&nbsp;

<a href="about">About</a>&nbsp;&nbsp;&nbsp;


<html>
<head> <link rel="stylesheet" href="style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
     rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
      crossorigin="anonymous"></head>
<body style="text-align:center">
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
  align:center;
}

td, th {
  border: 2px solid #dddddd;
  text-align: left;
  padding: 20px;
}


tr:nth-child(even) {
  background-color: #dddddd;
}
</style>

<form>
<h1>User Details</h1>
<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>Ac</th>
		<th>User Name</th>
		<th>Amount</th>
		<th>Address</th>
		<th>Transfer account</th>
	</tr>
	<c:if test="${ users != null }" >
	<c:forEach var="p" items="${users}">
		<tr>
			<td>${p.ac}</td>
			<td>${p.name}</td>
			<td>${p.amount}</td>
			<td>${p.address}</td>
			<td>${p.tranac}</td>
		</tr>
	</c:forEach>
	</c:if>
	<c:if test="${ user != null }" >
		<tr>
			<td>${user.ac}</td>
			<td>${user.name}</td>
			<td>${user.amount}</td>
			<td>${user.address}</td>
			<td>${user.tranac}</td>
		</tr>
	</c:if>
</table>
</form>
<br />
</body>
