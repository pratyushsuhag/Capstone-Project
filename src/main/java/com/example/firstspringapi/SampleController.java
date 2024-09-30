package com.example.firstspringapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//making controller capable enough to handle http request so that make it restcontroller
//This controller will be containing HTTP API's
//localhost:8080/xyz
@RestController
 //any request coming to xyz endpoint should come to this controller
 //all the api's for /sample endpoint should come to this controller
@RequestMapping("/sample")
public class SampleController {
    //multiple api's can be called using this method
    //eg. using getMapping we can set that when this method will be called
    //like if we call localhost:8080/sample/sayHello then below method will be called
    //calling the above api will trigger the below method
    @GetMapping("sayHello/{name}")
 public String sayHello(@PathVariable("name")String name){
     return name + " Says hello to Everyone";
 }

 @GetMapping("/sayBye")
    public String sayBye(){
        return "Bye Everyone";
 }

}
