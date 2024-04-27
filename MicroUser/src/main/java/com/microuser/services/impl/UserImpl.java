package com.microuser.services.impl;

import com.microuser.entities.User;
import com.microuser.repo.UserRepo;
import com.microuser.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UserServices {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User createUser(User user) {
        return this.userRepo.save(user);
    }

    @Override
    public List<User> getALlUsers() {
        return this.userRepo.findAll();
    }

    @Override
    public User getUserById(String userid) {
        return this.userRepo.findByUserId(userid);
    }

    @Override
    public User updateUser(String userid, User user) {
        User getUserByUserid = this.userRepo.findByUserId(userid);
        getUserByUserid.setAbout(user.getAbout());
        getUserByUserid.setName(user.getName());
        return this.userRepo.save(getUserByUserid);
    }

    @Override
    public void deleteUser(String userid) {
        this.userRepo.deleteById(userid);
    }
}
