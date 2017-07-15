package com.example.demo.Service;

import com.example.demo.DemoApplication;
import com.example.demo.Models.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Ouasmine on 15/07/2017.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = DemoApplication.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;
    private User user;

    @Before
    public void setUp() throws Exception {
        this.user = new User();
        user.setEmail("m.amine.osm@gmail.com");
        user.setPassword("1233445666");
        user.setRePassword("1233445666");
    }

    @Test
    public void registerUser() throws Exception {
        assertNotNull( userService.registerUser(this.user));
    }

    @Test
    public void findAllUsers() throws Exception {
        assertEquals(0, userService.findAllUsers().size());
    }

    @Test
    public void deleteUser() throws Exception {
        userService.deleteUser(user.getEmail());
        assertEquals(0, userService.findAllUsers().size());
    }

}