package com.app.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
       @GetMapping("/trial")
       public String display() {
    	   System.out.println("this is controller class");
    	   return "hi there";
       }
       @GetMapping("/trial2")
       public Car getCar() {
    	   return new Car(1,"Cobra","Shelby");
       }
       @PostMapping("/trial2")
       public String saveCar(@RequestBody Car car) {
    	   System.out.println(car);
    	   return "car save successfully";
       }
       @PutMapping("/trial2/{id}")
       public String updateCar(@PathVariable("id") int id) {
    	   System.out.println("obj with "+id+" updated");
    	   return  "obj with "+id+" updated";
       }
       @PutMapping("/trial3/{car}")
       public String updateCar1(@PathVariable("car") String car) {
    	   System.out.println("obj with "+car+" updated");
    	   return  "obj with "+car+" updated";
       }
       @DeleteMapping("/trial2/{id}")
       public String deleteCar(@PathVariable("id") int id) {
    	   System.out.println("obj with "+id+" deleted");
    	   return "obj with "+ id+" delete";
       }
       @PostMapping("/login")
       public String login(@RequestParam("user") String user,@RequestParam("pass")String pass) {
    	   System.out.println(user+" "+pass);
    	   return "successfully login";
       }
       
}
