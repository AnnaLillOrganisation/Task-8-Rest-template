package org.example.service;

import org.example.model.User;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<User[]>getAllUsers();
    String createUser(User user);
    String updateUser(User user);
    String deleteUser(Long id);
}
