package org.example;


import org.example.model.User;
import org.example.service.UserService;
import org.example.service.UserServiceImpl;
import org.springframework.web.client.RestTemplate;


public class Main
{
    public static void main( String[] args ){
        RestTemplate restTemplate = new RestTemplate();
        UserService userService = new UserServiceImpl(restTemplate);

        User user1 = new User(3L, "James", "Brown", (byte) 30);
        User user2 = new User(3L, "Thomas", "Shelby", (byte) 35);

        userService.getAllUsers();

        String result = userService.createUser(user1) +
                userService.updateUser(user2) +
                userService.deleteUser(3L);
        System.out.println(result.length());
    }
}
