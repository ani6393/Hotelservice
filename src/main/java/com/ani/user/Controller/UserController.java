package com.ani.user.Controller;


import com.ani.user.Entity.User;
import com.ani.user.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;
     //create
    @PostMapping("/")
    public ResponseEntity<User> createUser(@RequestBody User user)
    {
        User saveUser = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveUser);
    }
    //get Single User
    @GetMapping("/{userId}")
public ResponseEntity<User>getSingleUser(@PathVariable String userId)
{
    User Oneuser = userService.getUser(userId);
return ResponseEntity.ok(Oneuser);
}
    //Get All User
    @GetMapping("/")
    public ResponseEntity<List<User>>getAllUser(){
        List<User> allUser = userService.getAllUser();
   return ResponseEntity.ok(allUser);
    }
}
