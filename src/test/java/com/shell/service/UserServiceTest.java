package com.shell.service;

import com.shell.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/ApplicationContext.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private User user;

    @Test
    public void addUserByNameAndAge() throws Exception {
        userService.addUser("V", 11);
    }
    
    @Test
    public void addUserByUser() throws Exception {
    	user.setName("C");
    	user.setAge(24);
    	userService.addUser(user);
    }
    
    @Test
    public void deleteUserByName() throws Exception {
        userService.deleteUser("V");
    }
    
    @Test
    public void updateUserNameByID() throws Exception {
    	userService.updateUser(21, "你好");
    }

    @Test
    public void queryUserNameByID() throws Exception {
        assertEquals(userService.queryUserName(21), "你好");
        System.out.println(userService.queryUserName(21));
    }

    @Test
    public void queryUserByName() throws Exception {
        for (User element:userService.queryUser("C")
             ) {
            System.out.println(element.toString());
        }
    }
}