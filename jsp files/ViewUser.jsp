<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> View Customer Details</h1>
<h2>Details as submitted as follows:</h2>
<form action="getdetails" method="post">
    <input type="number" name="cid">
    <input type="submit" value="submit">
    public User getUser(String id) {
    User user = users.stream()
		.filter(t -> id.equals(t.getId()))
		.findFirst()
		.orElse(null);
		
    return user;
}
    
</form>
</body>
</html>