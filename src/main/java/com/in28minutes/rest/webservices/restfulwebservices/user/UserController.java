package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDaoService service;

    // retrieveAllUsers
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();

    }

    // retrieveUser(int id)
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        User user = service.findOne(id);

        if(user == null)
            throw new UserNotFoundException("id-" + id);
        return user;
    }

    // Created
    // input - details of user
    // output = created & return the created URI
    @PostMapping("/users")
    public ResponseEntity<Object> createdUser(@Valid @RequestBody User user) {
        User savedUser = service.save(user);

        // header에 추가
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();

        // 반환 값
        return ResponseEntity.created(location).build();
    }

    // retrieveUser(int id)
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        User user = service.deleteById(id);

        if(user == null)
            throw new UserNotFoundException("id-" + id);
    }
}
