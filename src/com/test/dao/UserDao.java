package com.test.dao;

import com.test.model.User;
 

  
  public interface UserDao {
      public User getUser(User user);
     public void addUser(User user);
      public void updateUser(User user);
     public void deleteUser(int UserId);
}