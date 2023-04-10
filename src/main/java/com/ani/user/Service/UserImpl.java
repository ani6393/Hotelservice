package com.ani.user.Service;

import com.ani.user.Entity.User;
import com.ani.user.Exception.ResourceNotFoundException;
import com.ani.user.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserImpl implements UserService
{
    @Autowired
    private UserRepo userRepoe;

    @Override
    public User saveUser(User user)
    {
        // Generated Unique User Id
        String s = UUID.randomUUID().toString();
       user.setUserId(s);
        return userRepoe.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepoe.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepoe.findById(userId).orElseThrow(()->new ResourceNotFoundException("This id is not store in database server!! "+userId));
    }
}
