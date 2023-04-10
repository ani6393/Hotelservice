package com.ani.user.Repository;

import com.ani.user.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, String >
{

}
