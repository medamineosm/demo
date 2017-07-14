package com.example.demo.Dao;

import com.example.demo.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ouasmine on 14/07/2017.
 */
@Repository
public interface UserDao extends MongoRepository<User, String>{
}
