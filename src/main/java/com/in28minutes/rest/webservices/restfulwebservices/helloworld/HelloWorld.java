package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

//controller
@RestController
public class HelloWorld {

//    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
//    public String hellworld(){
//        return "HelloWorld";
//    }

    @GetMapping(path = "/hello-world")
    public String hellworld() {
        return "HelloWorld";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean hellworldBean() {
        return new HelloWorldBean("hello, world");
    }

    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean hellworldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello, %s", name));
    }


}
