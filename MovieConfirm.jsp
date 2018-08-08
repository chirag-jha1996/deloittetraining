<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking</title>
<script src="script.js">
</script>
</head>
<body >
<div style="font-family:broadway;color:yellow;padding:20px;text-align:center;font-size:300%;">
<h1 >MovieScoop</h1>
</div>



<form name="confirm" action="" >
<table>


<tr>
<td><div style="margin-left:50%">Date</div> </td>
<td><input type = "date" name="date" required><br><br>
</td>
</tr>
<tr>
<td><div style="margin-left:50%;">Number of Seats</div></td>
<td><input type="text" name ="NumberOfSeats" id="num_Of_Seats" onKeyUp="calculatePrice()" required><br><br>
</td></tr>	

<tr>
<td><div style="margin-left:50%">Location</div></td>
<td><select style="font-size:100%;font-family:Trebuchet;margin-left:30%;" name = "Location" required>

<option value="Bangalore">Bangalore</option>
<option value="Mumbai">Mumbai</option>
<option value="Delhi">Delhi</option>
<option value="Kolkata">Kolkata</option>
</select><br><br></td>
</tr>
<tr>
<td><div style="font-size:100%;margin-left:50%;">Price</div></td>
<td><input type="text" id="priceBox"></td></tr>

<tr>
<td><div style="margin-left:50%"><input type="submit" value="Pay!" onClick="myFunction()"></div></td>
</tr>
</table>
<script>
function myFunction(){
	alert("seats booked");
	}
</script>
</form>
</body>
</html>