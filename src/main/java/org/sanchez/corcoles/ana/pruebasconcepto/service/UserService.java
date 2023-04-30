package org.sanchez.corcoles.ana.pruebasconcepto.service;

import com.github.javafaker.Faker;
import org.sanchez.corcoles.ana.pruebasconcepto.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private Faker faker;

    public List<User> getUsers() {
        final List<User> users = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            users.add(new User(faker.name().name(), faker.name().lastName(), faker.artist().name()));
        }
        return users;
    }
}
