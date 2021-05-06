package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

//controller
@RestController
public class HelloWorld {

    @Autowired
    private MessageSource messageSource;

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

    //  Internationalization - 01
//    @GetMapping(path = "/hello-world-internationalized")
//    public String helloWorldInternationalized(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
//        return messageSource.getMessage("good.morning.message", null, locale);
//    }

    //  Internationalization - 02
    @GetMapping(path = "/hello-world-internationalized")
    public String helloWorldInternationalized() {
        return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
    }


}
