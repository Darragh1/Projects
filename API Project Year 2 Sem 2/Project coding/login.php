<!DOCTYPE html>
<html>
<head>
<style>

body {background-image:url("music1.jpg");
color:#2E8AE6;
font-family:'Georgia', Times New Roman,
}

</style>
</style>

    <title>Login</title>

</head>
<body>


<h2>Login or Sign up today</h2>
<?php
if (!isset($_POST['submit'])){
?>
<!-- The HTML login form -->
    <form action="<?=$_SERVER['PHP_SELF']?>" method="post">
<center>
<font color='red' size='4'>Not registered yet?
</font><a href='register.php'>
Sign Up Here</a>
</center>
         <table bgcolor="#E8F1FF" width='255' border='1' align='center'>
		  <tr>
	      <td align='center'>UserName:</td>
		   <td><input type='text' name='username' /></td>
	  </tr>
	   <tr>
	      <td align='center'>Password:</td>
		   <td><input type='password' name='password' /></td>
	  </tr>
	    <tr>
	      <td colspan='5' align='center'><input type='submit' name='submit' value='Login' /></td>
	  </tr>
	 
 
        
		</table>
 
    
<?php
} else {
    require_once("db_const.php");
    $mysqli = new mysqli(DB_HOST, DB_USER, DB_PASS, DB_NAME);
    # check connection
    if ($mysqli->connect_errno) {
        echo "<p>MySQL error no {$mysqli->connect_errno} : {$mysqli->connect_error}</p>";
        exit();
    }
 
    $username = $_POST['username'];
    $password = $_POST['password'];
 
    $sql = "SELECT * from users WHERE username LIKE '{$username}' AND password LIKE '{$password}' LIMIT 1";
    $result = $mysqli->query($sql);
    if (!$result->num_rows == 1) {
        echo "<p>Invalid username/password combination</p>";
    } else {
         echo "<script>window.open('welcome.php','_self')</script>";
        // do stuff
    }
}
?>        
</body>
</html>