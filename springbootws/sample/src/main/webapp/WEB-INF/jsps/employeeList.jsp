<%@page import="com.app.sample.dto.EmployeeDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
<link rel="stylesheet" href="bs/css/bootstrap.min.css">
  <script src="bs/js/jQuery.js"></script>
  <script src="bs/js/bootstrap.min.js"></script>
  <script>
	$(document).ready(function(){
	  $(".myBtn").click(function(){
		  var i = $(".myBtn").val();
		  console.log(i)
		  
      $.ajax({
        url:"editEmployee/"+i,
        type:'GET',
        success :function(data){
          $("#id").val(data.id)
          $("#name").val(data.name)
          $("#email").val(data.email)
          $("#dob").val(data.dob)
          $("#salary").val(data.salary)
          $("#status").val(data.status)
          console.log(data)
         
        }

      })
	    $("#myModal").modal();
	  });
	 $("#saveBtn").click(function(){
        
        var str = {
          id:$("#id").val(),
          name:$("#name").val(),
          email:$("#email").val(),
          dob:$("#dob").val(),
          salary: $("#salary").val(),
          status: $("#status").val(),
        }
        $.ajax({
          url:"updateEmployee",
          type:'GET',
          dataType:'json',
          async: false,
          data:str,
          success:function(data){
            console.log(data)
            
           // $("#myModal").;
          }

        })
        location.reload();

   })
   
  });
</script>
    <style>
  .modal-header, h4 {
        color:white !important;
    text-align: center;
    font-size: 30px;
  }
  .modal-footer {
    background-color: #f9f9f9;
  }
  </style>
</head>
<body>
	<div class="container">
	<jsp:include page="Heade.jsp"></jsp:include>
	
	
	<div>
		<table class="table">
			<tr><th>Id</th><th>Name</th><th>Email</th>
			<th>Age</th><th>Date of Birth</th>
			<th>Salary</th><th>Status</th><th>Edit</th><th>Delete</th>
			</tr>
		
			<c:forEach items="${empList}" var="e">
			<tr>
			<td>${e.id}</td>
			<td>${e.name}</td>
			<td>${e.email}</td>
			<td>${e.age }</td>
			<td>${e.dob}</td>
			<td>${e.salary}</td>
			<td>${e.status}</td>
			<td><button type="button" class="btn btn-default btn-lg myBtn"  value="${e.id} ">Edit</button></td>
			<td><a href="deleteEmployee?id=${e.id}">Delete</a></td>
			</tr>
			</c:forEach>
		
		</table>
	</div>
	</div>
	
	<!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header bg-primary" style="padding:35px 50px;">
                    <h4> Edit Employee</h4>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
          <div class="card bordered-primary col-10 mt-4 offset-2 mb-3">
                <div class="card-header bg-primary"><h3>Edit Employee</h3></div>
                 <form  class="form" method="post">
                <div class="card-body">
               
                  <div class="form-group">
                    <label class="col-sm-4 control-label">Id</label>
                    <div class="col-sm-8 float-right">
                    <input name="id" id="id" class="form-control"/>                       
                     
                    </div>
                </div>

                    <div class="form-group">
                        <label class="col-sm-4 control-label">Name</label>
                        <div class="col-sm-8 float-right">
                        <input name="name" id="name" class="form-control"/>                       
                         
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-4 control-label">email</label>
                        <div class="col-sm-8 float-right">
                        <input name="email" id="email" class="form-control"/>                       
                         
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label class="col-sm-4 control-label">salary</label>
                        <div class="col-sm-8 float-right">
                        <input name="salary" id="salary" class="form-control"/>                       
                         
                        </div>
                    </div>
                
                 <div class="form-group">
                        <label class="col-sm-4 control-label">Date of birth</label>
                        <div class="col-sm-8 float-right">
                        <input  name= "dob" id="dob" class="form-control" />                      
                         
                        </div>
                   </div>
                   
                     <div class="form-group">
                        <label class="col-sm-4 control-label">Status</label>
                        <div class="col-sm-8 float-right">
                        <input name="status" id="status" class="form-control"/>                         
                   </div>
                   </div>      
                        
                       
                   </div>
                <div class="card-footer mt-4">
                    <button class="btn btn-primary offset-6" type="button" id="saveBtn">Submit</button>
                </div>
              </form>
        
    </div>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Cancel</button>
          
        </div>
      </div>
      
    </div>
  </div> 

 

	
</body>
</html>