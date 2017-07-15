package com.example.demo.Service;

import com.example.demo.Dao.UserDao;
import com.example.demo.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Ouasmine on 14/07/2017.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private ValidationService validationService;

    public User registerUser(User user){
        if(validationService.registationValidation(user))
            return userDao.save(new User(user));
        return null;
    }

    public Collection<User> findAllUsers(){
        System.out.println(userDao.findAll());
        return userDao.findAll();
    }

    public void deleteUser(String emailUser){
        userDao.delete(emailUser);
    }

}
