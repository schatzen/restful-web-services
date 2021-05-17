//package com.in28minutes.rest.webservices.restfulwebservices.versioning;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class PersonVersioningController {
//
//    // Basic
//    @GetMapping("/v1/person")
//    public PersonV1 personV1() {
//        return new PersonV1("Bob Charlie");
//    }
//
//    @GetMapping("/v2/person")
//    public PersonV2 personV2() {
//        return new PersonV2(new Name("Bob", "Charlie"));
//    }
//
//    // Params
//    @GetMapping(value = "/person/param", params = "version=1")
//    public PersonV1 paramV1() {
//        return new PersonV1("Bob Charlie");
//    }
//
//    @GetMapping(value = "/person/param", params = "version=2")
//    public PersonV2 paramV2() {
//        return new PersonV2(new Name("Bob", "Charlie"));
//    }
//
//    // Headers
//    @GetMapping(value = "/person/header", headers = "X-API-VERSION=1")
//    public PersonV1 headerV1() {
//        return new PersonV1("Bob Charlie");
//    }
//
//    @GetMapping(value = "/person/header", headers = "X-API-VERSION=2")
//    public PersonV2 headerV2() {
//        return new PersonV2(new Name("Bob", "Charlie"));
//    }
//
//    // Produces
//    @GetMapping(value = "/person/produce", produces = "application/vnd.company.app-v1+json")
//    public PersonV1 produceV1() {
//        return new PersonV1("Bob Charlie");
//    }
//
//    @GetMapping(value = "/person/produce", produces = "application/vnd.company.app-v1+json")
//    public PersonV2 produceV2() {
//        return new PersonV2(new Name("Bob", "Charlie"));
//    }
//}
