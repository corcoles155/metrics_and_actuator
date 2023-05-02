package org.sanchez.corcoles.ana.pruebasconcepto.service;

import com.github.javafaker.Faker;
import org.sanchez.corcoles.ana.pruebasconcepto.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private Faker faker;

    private List<User> users;

    @PostConstruct
    public void init() {
        users = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            users.add(new User(faker.name().name(), faker.name().lastName(), faker.artist().name()));
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUser(final String name) {
        return users.
                stream().
                filter(user -> user.getName().equals(name)).
                findAny().
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("User with name %s doesn't exist", name)));
    }
}
