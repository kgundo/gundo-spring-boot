package com.example.gundo.controllers.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gundo.models.user.User;

@RestController
public class UserController {

 @RequestMapping("/users")
 public List<User> getUsers() {
   System.out.println("getUser......");
   return Arrays.asList(new User("5", "近本"), new User("51", "中野"), new User("1", "森下"));
 }
    
}
