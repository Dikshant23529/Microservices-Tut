package com.microuser.services;

import com.microuser.entities.User;

import java.util.List;

public interface UserServices {

    User createUser(User user);

    List<User> getALlUsers();

    User getUserById(String userid);

    User updateUser(String userid, User user);

    void deleteUser(String userid);
}
