<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Seller Registraion Form</title>
<link rel="stylesheet" href="bs/css/bootstrap.min.css">
<script src="bs/js/jQuery.js"></script>
  <script src="bs/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<jsp:include page="Heade.jsp"></jsp:include>
	<div class="card bordered-primary col-10 mt-4 offset-2">
                <div class="card-header bg-primary"><h3>Seller Registration Form</h3></div>
                 <form:form  action="saveSeller" modelAttribute="seller" class="form">
                <div class="card-body">
               
                    <div class="form-group">
                        <label class="col-sm-4 control-label">Seller Name</label>
                        <div class="col-sm-8 float-right">
                        <form:input path="sellerName" class="form-control"/>                       
                         
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-4 control-label">address</label>
                        <div class="col-sm-8 float-right">
                        <form:input path="address" class="form-control"/>                       
                         
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label class="col-sm-4 control-label">email</label>
                        <div class="col-sm-8 float-right">
                        <form:input path="email" class="form-control"/>                       
                         
                        </div>
                    </div>
                
                 <div class="form-group">
                        <label class="col-sm-4 control-label">phone No.</label>
                        <div class="col-sm-8 float-right">
                        <input type="text" name= "phone" class="form-control">                      
                         
                        </div>
                   </div>
                   
                     <div class="form-group">
                        <label class="col-sm-4 control-label">create password</label>
                        <div class="col-sm-8 float-right">
                        <form:input path="password" class="form-control"/>                         
                   </div>
                   </div>      
                        
                       
                   </div>
                <div class="card-footer mt-4">
                    <button class="btn btn-primary offset-6" type="submit" id="saveBtn">Submit</button>
                </div>
              </form:form>
        
    </div>
</div>
</body>
</html>