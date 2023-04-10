package com.ani.user.Service;

import com.ani.user.Entity.Rating;
import com.ani.user.Entity.User;

import java.util.List;

public interface UserService
{
    User saveUser(User user);

    List<User> getAllUser();

    User getUser(String userId);


}
