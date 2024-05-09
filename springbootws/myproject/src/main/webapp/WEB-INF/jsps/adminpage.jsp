<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>admin</title>
<link rel="stylesheet" href="bs/css/bootstrap.min.css">
<script src="bs/js/jQuery.js"></script>
  <script src="bs/js/bootstrap.min.js"> </script>
  <script type="text/javascript">
		$(document).ready(function(){
			$("#categorydiv").hide();
			$("#Category").click(function(){
				$("#categorydiv").toggle();
				})
			})
  </script>
</head>
<body>
	<div class="container">
	<jsp:include page="Heade.jsp"></jsp:include>
	<h3>Welcome Admin</h3>
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
	        <a class="nav-link" href="location" id="add">Location</a>
	      </li>  
	      <li class="nav-item">
	        <a class="nav-link" href="#" id="search">WareHause</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="#"  id="Category">Category</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="#" id="search">SubCategory</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="#" id="search">Seller</a>
	      </li>
	    </ul>	    
	  </div>
	</nav>
	<div id="categorydiv">
		<div class="mt-4">
			<div class="h4 text-center">Add Category</div>
			<form:form action="addCategory" modelAttribute="category">
			<div class="row"><div class="col-5 offset-3"><form:input path="categoryName" class="form-control"/></div> <div class="col-2"><button  class="form-control">ADD</button></div></div>
			</form:form>
		</div>
		<div class="col-9 offset-2 mt-4">
			<table class="table table-bordered">
			<tr><th>CatergoryId</th><th>Category Name</th><th>Remove</th></tr>
			<c:forEach items="${categoryList }" var="c">
				<tr><td>${c.categoryId }</td><td>${c.categoryName}</td><td><a href="removeCategory?id=${c.categoryId}" >remove</a></td></tr>
			</c:forEach>
			
			</table>
		</div>
	</div>
	</div>
</body>
</html>