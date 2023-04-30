package org.sanchez.corcoles.ana.pruebasconcepto.controller;

import io.micrometer.core.annotation.Timed;
import org.sanchez.corcoles.ana.pruebasconcepto.model.User;
import org.sanchez.corcoles.ana.pruebasconcepto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    @Timed("get.users")
    public ResponseEntity<List<User>> getUsers() {
        return new ResponseEntity<>(service.getUsers(), HttpStatus.OK);
    }
}
