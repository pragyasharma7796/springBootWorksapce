package ExcetionHandleAnnotion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ExcetionHandleAnnotion.ExctionHandling.EmplyeeNotFoundException;
import ExcetionHandleAnnotion.ExctionHandling.ErrorObject;
import ExcetionHandleAnnotion.dto.Employee;
import ExcetionHandleAnnotion.service.EmpService;

@RestController
public class EmplController {
	@Autowired
	EmpService empService;
	
//	@ExceptionHandler
//	ResponseEntity<ErrorObject> exceptionHandle(EmplyeeNotFoundException emplyeeNotFoundException){
//		ErrorObject errorObject = new ErrorObject(HttpStatus.NOT_FOUND.value(),emplyeeNotFoundException.getMessage(), System.currentTimeMillis());
//		return new ResponseEntity<ErrorObject>(errorObject,HttpStatus.NOT_FOUND);
//	}
//	@ExceptionHandler(EmplyeeNotFoundException.class)
//	ResponseEntity<ErrorObject> exceptionHandle(){
//		ErrorObject errorObject = new ErrorObject(HttpStatus.NOT_FOUND.value(),"Employee Not Found", System.currentTimeMillis());
//		return new ResponseEntity<ErrorObject>(errorObject,HttpStatus.NOT_FOUND);
//	}

	
	@RequestMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return empService.getEmployee(id);	
	}
}
