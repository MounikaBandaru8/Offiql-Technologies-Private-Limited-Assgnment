<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> View Customer Email Details</h1>
<h2>Details as submitted as follows:</h2>
<form action="getdetails" method="post">
    <input type="number" name="cid">
    <input type="submit" value="submit">
@recipients = 'email@address.com',
@query = 'SELECT Ename, COUNT(*) TotalCount
            FROM emp
            GROUP BY Ename
            HAVING COUNT(*) > 1' ,
@subject = 'Count of Employee Names',
@attach_query_result_as_file = 0
    
</form>


</body>
</html>