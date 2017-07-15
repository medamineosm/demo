package com.example.demo.Service;

import com.example.demo.Models.User;
import org.springframework.stereotype.Service;

/**
 * Created by Ouasmine on 14/07/2017.
 */
@Service
public class ValidationService {

    public boolean registationValidation(User user){
        if(user.getPassword().length() < 8)
            return false;
        else{
            if(user.getPassword().equals(user.getRePassword())){
                return true;
            }else{
                return false;
            }
        }
    }
}
