package com.example.demo.Service;

import com.example.demo.Models.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Ouasmine on 14/07/2017.
 */
@Service
public class ValidationService {

    @Value("${password.regex}")
    private String regexPassword;


    public boolean registationValidation(User user){
        if(user.getPassword().equals(user.getRePassword())){
            return user.getPassword().matches(regexPassword);
        }else{
            return false;
        }
    }
}
