# spring-boot-project-with-h2-db
Spring boot project with H2 memory database, performing create, delete, get and update operations. Handling spring boot way global exception handling and Swagger UI for Rest End points
1.In this Project I have created two tables in database
  a.user table
  b.email table
# Access the H2 Database from Browser using below URL
http://localhost:8089/h2-console/user.jsp
http://localhost:8089/h2-console/email.jsp
# Creating  rest Endpoints
 1.	POST /user    ( Creates a new user)
 <form method ="post" action="details">
 Enter Customer First Name<input type="text" name="fname"><br>
 Enter Customer Last Name:<input type="text" name="lname"><br>
 Enter Customer Email Address:<input type="email" name="cemail"><br>
 Enter Customer Phone Number:<input type="tel" name="cphone"><br>
 <input type="submit" value="submit">
 </form>
 2.	GET  /users   ( Returns list of users)
  <form action="getdetails" method="get">
    <input type="number" name="cid">
    <input type="submit" value="submit">
  </form>
 3.	GET  /user/{id} (Return user by id)
 <form action="getdetails" method="get">
    public User getUser(Int  id) {
    User user = users.stream()
		.filter(t -> id.equals(t.getId()))
		.findFirst()
		.orElse(null);
    return user;
  }
  </form>
 4.	POST /email    (Create an email in DB)
  <form method ="post" action="details">
Enter from Email<input type="email" name="femail"><br>
Enter to Email Name:<input type="email" name="temail"><br>
Enter subject:<input type="text" name="csub"><br>
Enter body:<input type="text" name="cbody"><br>

<input type="submit" value="submit">
</form>
5.GET  /emails/count?user={userID} (Returns number of email send by a user)
  using sql query counted the no of emails send by an user by using primarykey userid
# Finally done Testing the Application



    






