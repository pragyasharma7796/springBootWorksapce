<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bs/css/bootstrap.min.css">
<script src="bs/js/jQuery.js"></script>
  <script src="bs/js/bootstrap.min.js"></script>
  <script>
  $(document).ready(function(){
				$("#select").click(function(){
					$("this").html;
					console.log($(this).find('option:selected').html());
					if($(this).find('option:selected').html() == "Other"){
						$("#otherlocation").prop('disabled', false);
					}else{
						$("#otherlocation").prop('disabled', true);
						}
							
				})
		})
  </script>
</head>
<body>
<jsp:include page="Heade.jsp"></jsp:include>
<div class="card bordered-primary col-8 mt-4 offset-2">
                <div class="card-header bg-primary"><h3>Add WareHause</h3></div>
                 <form:form  action="enterWareHouse" modelAttribute="warehouse" class="form">
                <div class="card-body">
               
                    <div class="form-group">
                        <label class="col-sm-4 control-label">WareHouse Name</label>
                        <div class="col-sm-8 float-right">
                        <form:input path="wareHauseName" class="form-control"/>                       
                         <span id="empid-error"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-4 control-label">Address</label>
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
                        <label class="col-sm-4 control-label">Phone</label>
                        <div class="col-sm-8 float-right">
                            <form:input path="phone" class="form-control"/>
                        </div>
                    </div>
                     <div class="form-group">
                        <label class="col-sm-4 control-label">password</label>
                        <div class="col-sm-8 float-right">
                            <form:input path="pwd" class="form-control"/>
                        </div>
                    </div>		
                    <div class="form-group">
                        <label class="col-sm-4 control-label">Location</label>
                        <div class="col-sm-8 float-right">
                        	<%-- <form:select path="location"  >
                        			<form:options itemLabel="${location.address }" items="${ locationList}"/>
                        	</form:select> --%>
                            <select name="location" class="form-control" id="select">
                            	<option value="">---select option---</option>
                            	<c:forEach items="${ locationList}" var="l">
                            		<option value="${l.locationId }">${ l.address}</option>
                            	</c:forEach>
                            	<option value="" id="other">Other</option>
                            </select>    
                        </div>
                    </div>	
                     <div class="form-group">
                        <label class="col-sm-4 control-label">AddLocation</label>
                        <div class="col-sm-8 float-right">
                            <input type="text" class="form-control" disabled="disabled" id="otherlocation">
                        </div>
                    </div>							
                         
                </div>
                <div class="card-footer">
                    <button class="btn btn-primary offset-6" type="submit" id="saveBtn">Submit</button>
                </div>
              </form:form>
        
    </div>
  
</body>
</html>