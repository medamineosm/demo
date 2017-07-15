package com.example.demo.Service;

import com.example.demo.Models.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ouasmine on 15/07/2017.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ValidationService.class)
public class ValidationServiceTest {

    private User user;
    @Autowired
    private ValidationService validationService;

    @Before
    public void setUp() throws Exception {
        this.user = new User();
        user.setEmail("m.amine.osm@gmail.com");
        user.setPassword("1233445666");
        user.setRePassword("wewew");
    }

    @Test
    public void registationValidation() throws Exception {
        assertEquals(false, validationService.registationValidation(this.user));
    }

    @Test
    public void useCaseValidation(){
        this.user.setRePassword("");
        this.user.setPassword("");
        assertEquals(false, validationService.registationValidation(this.user));
        this.user.setRePassword("A123b");
        this.user.setPassword("A123b");
        assertEquals(false, validationService.registationValidation(this.user));
        this.user.setRePassword("Carlos2017");
        this.user.setPassword("Carlos2017");
        System.out.println(this.user);
        assertEquals(true, validationService.registationValidation(this.user));

    }

}