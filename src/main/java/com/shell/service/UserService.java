package com.shell.service;

import com.shell.dao.UserDao;
import com.shell.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserDao userDao;
    
    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    void addUser(User user) {
        userDao.addUser(user);
    }
    
    void addUser(String name, int age) {
        userDao.addUser(name, age);
    }
    
    void deleteUser(int id) {
    	userDao.deleteUserByID(id);
    }
    
    void deleteUser(String name) {
    	userDao.deleteUserByName(name);
    }
    
    void updateUser(int id, String name) {
    	userDao.updateUserNameByID(id, name);
    }

    String queryUserName(int id) {
        return userDao.queryNameByID(id);
    }

    List<User> queryUser(String name) {
        return userDao.queryUserByName(name);
    }
}
