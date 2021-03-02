package com.invoicegenerator.service;

import com.invoicegenerator.model.User;
import com.invoicegenerator.repository.UserRepository;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void addUser(String firstName, String lastName, String email) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setId(1L);

        repository.save(user);
    }

    public User getUserByEmail(String email) {
        return repository.getUserByEmail(email);
    }
}
