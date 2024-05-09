package com.app.demo.exceptioon;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.app.demo.responseStructure.ResponseStructure;

@ControllerAdvice
public class ApplicationExceptionHandler {
	@ExceptionHandler(value= NoDataForGivenIdException.class)
	public ResponseEntity<ResponseStructure<String>> noDataForGivenIdExceptionHandler(NoDataForGivenIdException ie){
		ResponseStructure<String > responseStructure=new ResponseStructure<>();
		responseStructure.setMessage("No Id Found");
		responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
		responseStructure.setData(ie.getMessage());
		
		return  new ResponseEntity<ResponseStructure<String>>(responseStructure,HttpStatus.NOT_FOUND);
	}
}
