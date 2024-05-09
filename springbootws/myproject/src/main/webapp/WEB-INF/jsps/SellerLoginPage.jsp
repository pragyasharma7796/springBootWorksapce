<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<jsp:include page="Heade.jsp"></jsp:include>
	<div class="card bordered-primary col-10 mt-4 offset-2">
                <div class="card-header bg-primary"><h3>Seller Registration Form</h3></div>
                <form class="form">
                  <div class="card-body">
               
                    <div class="form-group">
                        <label class="col-sm-4 control-label">Seller Id</label>
                        <div class="col-sm-8 float-right">
                           <input type="text" class="form control">                      
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-4 control-label">Password</label>
                        <div class="col-sm-8 float-right">
                           <input type="password" class="form control">                      
                        </div>
                    </div>
                    </div>
                    <div class="card-footer mt-4">
                    <button class="btn btn-primary offset-6" type="submit" id="saveBtn">Submit</button>
                </div>
                </form>
      </div>
</div>
</body>
</html>