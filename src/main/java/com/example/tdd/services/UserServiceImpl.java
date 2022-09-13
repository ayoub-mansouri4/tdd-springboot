package com.example.tdd.services;


import com.example.tdd.models.User;
import com.example.tdd.repositories.UserRepository;
import com.example.tdd.utils.PhoneNumberValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class UserServiceImpl implements UserService {
     @Autowired
    UserRepository userRepository;
     @Autowired
    PhoneNumberValidator phoneNumberValidator;

    @Override
    public boolean addUser(User user) {
        if(phoneNumberValidator.test(user.getPhoneNumber())) return  true;
        return false;
    }
}
