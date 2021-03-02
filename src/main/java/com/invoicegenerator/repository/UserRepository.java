package com.invoicegenerator.repository;

import com.invoicegenerator.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User getUserByEmail(String email);

}
