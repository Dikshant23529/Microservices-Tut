package com.microuser.controllers;

import com.microuser.entities.User;
import com.microuser.services.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v0/user/")
public class UserControllers {

    @Autowired
    private UserImpl userImpl;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<>(this.userImpl.createUser(user), HttpStatus.CREATED);
    }

    @PutMapping("update/{userid}")
    public ResponseEntity<User> updateUser(@PathVariable String userid, @RequestBody User user){
        return new ResponseEntity<>(this.userImpl.updateUser(userid, user), HttpStatus.ACCEPTED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(this.userImpl.getALlUsers(), HttpStatus.OK);
    }
    @DeleteMapping("delete/{userid}")
    public ResponseEntity<String> deleteUser(@PathVariable String userid)
    {
        return new ResponseEntity<>("user deleted Successfully", HttpStatus.ACCEPTED);
    }

}
