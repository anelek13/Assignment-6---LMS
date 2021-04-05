package com.example.librarymanagementsystem.service;

import com.example.librarymanagementsystem.entity.Address;
import com.example.librarymanagementsystem.entity.User;

import java.util.List;

public class UserService {
    public void addNewUser(String name, Address address, int age){
        User user = new User();
        user.setName(name);
        user.setAddress(address);
        user.setAge(age);
    }
    public void findUserByName(List<User> userList, String name){
        for(User user : userList){
            if(user.getName().equals(name))
                user.toString();
            else System.out.println("User not found!");
        }
    }
}
