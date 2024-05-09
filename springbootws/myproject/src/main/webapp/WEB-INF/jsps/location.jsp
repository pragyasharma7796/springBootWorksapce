<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location</title>
<link rel="stylesheet" href="bs/css/bootstrap.min.css">
<script src="bs/js/jQuery.js"></script>
  <script src="bs/js/bootstrap.min.js"></script>
  
  <script>
  			$(document).ready(function(){
				$("#addlocation").hide();
				
				$("#list").hide();
				$("#add").click(function(){
					$("#addlocation").show();
					$("#searchList").hide();
				})
				$("#search").click(function(){
					$("#searchList").show();
					$("#addlocation").hide();
					})
				$("#searchbutton").click(function(){
					var v = $("#locationName ").children("option:selected").val();
					var tab= $("#tab").html();
					$.ajax({
						url:"getlocationByName/"+v,
						type:'GET',
						success:function(data){
							console.log(data);
							$(data).each(function(i,d){
								var l=d;
								tab=tab+"<tr><td>"+d.locationId+"</td><td>"+d.locationName+"</td><td>"+d.address+"</td><td><a href='#' onclick=\" update("+d.locationId+",'"+d.locationName+"','"+d.address+"')\">update</a></td><td><a href='#'>Remove</a></td></tr>"
							})
							$("#tab").html(tab);
							$("#list").show();
						}
					})
				})
			})
			
			function update( i,n,a){
  				
  				$("#locationId1").val(i);
  				$("#locationName1").val(n);
  				$("#address1").val(a);
  				$("#myModal").modal();
  			}
  </script>
</head>
<body>
<div class="container">
	<jsp:include page="Heade.jsp"></jsp:include>
	<div class="h3 text-center">Manage Location</div>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <a class="navbar-brand" href="#">Navbar</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	
	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
	    <ul class="navbar-nav mr-auto">
	      <li class="nav-item active">
	        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="#" id="add">Add</a>
	      </li>  
	      <li class="nav-item">
	        <a class="nav-link" href="#" id="search">Search</a>
	      </li>
	      
	    </ul>	    
	  </div>
	</nav>
	<div class="border mt-4 p-4 col-10 offset-1" id="addlocation">
		<div class="h4 text-center">Add Location</div>
		<form:form action="addLocation" modelAttribute="location">
			<div class="form-group">
		    <label for="locationName">Location Name</label>
		    <form:input path="locationName" class="form-control"/>
		  </div>
		  <div class="form-group">
		    <label for="address">Address</label>
		    <form:input path="address" class="form-control"/>
		  </div>
		  <div class="text-center">
		  <button type="submit" class="btn btn-primary">Submit</button>
		  </div>
		</form:form>
	</div>
	<div id="searchList">
		<div class="h4 text-center">Search Location</div>
		<form action="">
			<div class="form-group">
		    <label for="address">Address</label>
		    <select class="form-control" name="locationName" id="locationName">
		    	<option value="">---select value---</option>
		    	<option value="warehouse">WareHouse</option>
		    	<option value="Customer">Customer</option>
		    	<option value = "seller">Seller</option>
		    </select>
		    <div class="text-center mt-4">
		    <button type="button" id="searchbutton" class="btn btn-primary">Submit</button>
		    </div>
		  </div>
		</form>
		<div id="list"> 
		<div>List of Location</div>
			<table id="tab" class="table">
				<tr><th>Id</th><th>Name</th><th>Address</th><th>update</th><th>remove</th></tr>
			</table>
		</div>
	</div>
	<div class="modal" id="myModal">
    <div class="modal-dialog modal-xl">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Modal Heading</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
          <div class="border mt-4 p-4 col-10 offset-1" id="addlocation">
		<div class="h4 text-center">Update Location</div>
		<form:form action="updateLocation" modelAttribute="location">
		<div class="form-group">
		    <label for="locationId">Location Id</label>
		    <form:input path="locationId" class="form-control" id="locationId1"/>
		  </div>
		<div class="form-group">
		    <label for="locationName">Location Name</label>
		    <form:input path="locationName" class="form-control " id="locationName1"/>
		  </div>
		  <div class="form-group">
		    <label for="address">Address</label>
		    <form:input path="address" class="form-control" id="address1"/>
		  </div>
		  <div class="text-center">
		  <button type="submit" class="btn btn-primary">Submit</button>
		  </div>
		</form:form>
	</div>
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
        </div>
        
      </div>
    </div>
  </div>
  
	
</div>
</body>
</html>