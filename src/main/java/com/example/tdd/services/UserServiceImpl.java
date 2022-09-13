package com.example.tdd.services;


import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class UserServiceImpl implements UserService, Predicate<String> {
    @Override
    public boolean test(String phoneNumber) {
        return phoneNumber.startsWith("+212") && phoneNumber.length()==13;
    }
}
