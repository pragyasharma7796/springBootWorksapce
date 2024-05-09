<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
<link rel="stylesheet" href="bs/css/bootstrap.min.css">
<script src="bs/js/jQuery.js"></script>
  <script src="bs/js/bootstrap.min.js"></script>
  <script>
		async function uploadFile() {
		  let formData = new FormData(); 
		  console.log("formData");
		  formData.append("file", fileupload.files[0]);
		  console.log(fileupload.files[0]);
		  let response = await fetch('/upload', {
		    method: "POST", 
		    body: formData
		  }); 
		
		   if (response.status == 200) {
		    alert("File successfully uploaded.");
		  }
		  
		  if (response.status == 500) {
			    alert("Error .");
			  }
		} 
</script>
</head>
<body>
	<div class="container">
	<jsp:include page="Heade.jsp"></jsp:include>
	
		<div class="card bordered-primary col-10 mt-4 offset-2">
                <div class="card-header bg-primary"><h3>Add Product</h3></div>
                 <form:form  action="uplaodProduct" modelAttribute="product" class="form">
                <div class="card-body">
               
                    <div class="form-group">
                        <label class="col-sm-4 control-label">Product Name</label>
                        <div class="col-sm-8 float-right">
                        <form:input path="name" class="form-control"/>                       
                         
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-4 control-label">price</label>
                        <div class="col-sm-8 float-right">
                        <form:input path="price" class="form-control"/>                       
                         
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label class="col-sm-4 control-label">Quantity</label>
                        <div class="col-sm-8 float-right">
                        <form:input path="availableQuatity" class="form-control"/>                       
                         
                        </div>
                    </div>
                
                 <div class="form-group">
                        <label class="col-sm-4 control-label">SubCategory</label>
                        <div class="col-sm-8 float-right">
                        <input type="text" name= "subcategory" class="form-control">                      
                         
                        </div>
                   </div>
                   
                     <div class="form-group">
                        <label class="col-sm-4 control-label">Description</label>
                        <div class="col-sm-8 float-right">
                        <form:input path="description" class="form-control"/>                         
                   </div>
                   </div>      
                        
                        <div class="form-group">
                        <label class="col-sm-4 control-label">Upload image</label>
                        <div class="col-sm-8 float-right">
                     	 <input id="fileupload" type="file" name="fileupload" />  <button type="button" onclick="uploadFile()" id="upload-button">Upload</button>
						            
                        
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