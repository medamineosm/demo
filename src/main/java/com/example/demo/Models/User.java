package com.example.demo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


/**
 * Created by Ouasmine on 14/07/2017.
 */
@Document
public class User {

    @Id
    private String email;
    private String name;
    private String famillyName;
    private String password;
    private String rePassword;
    private Date createAt;

    public User() {
    }

    public User(User user) {
        this.email = user.email;
        this.name = user.name;
        this.famillyName = user.famillyName;
        this.password = user.password;
        this.rePassword = user.rePassword;
        this.createAt = new Date();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamillyName() {
        return famillyName;
    }

    public void setFamillyName(String famillyName) {
        this.famillyName = famillyName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public boolean isValidePassword(){
        return password.equals(rePassword);
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", famillyName='" + famillyName + '\'' +
                ", password='" + password + '\'' +
                ", rePassword='" + rePassword + '\'' +
                ", createAt=" + createAt +
                '}';
    }
}
