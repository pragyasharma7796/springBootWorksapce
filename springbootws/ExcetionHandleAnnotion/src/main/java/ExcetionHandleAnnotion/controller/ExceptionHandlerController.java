package ExcetionHandleAnnotion.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import ExcetionHandleAnnotion.ExctionHandling.EmplyeeNotFoundException;
import ExcetionHandleAnnotion.ExctionHandling.ErrorObject;

@RestControllerAdvice
public class ExceptionHandlerController {
	
	@ExceptionHandler
	ResponseEntity<ErrorObject> exceptionHandle(EmplyeeNotFoundException emplyeeNotFoundException){
		ErrorObject errorObject = new ErrorObject(HttpStatus.NOT_FOUND.value(),emplyeeNotFoundException.getMessage(), System.currentTimeMillis());
		return new ResponseEntity<ErrorObject>(errorObject,HttpStatus.NOT_FOUND);
	}

}
