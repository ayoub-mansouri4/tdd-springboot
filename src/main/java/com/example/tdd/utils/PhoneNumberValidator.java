package com.example.tdd.utils;

import com.example.tdd.services.UserService;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

@Component
public class PhoneNumberValidator implements Predicate<String> {
    @Override
    public boolean test(String phoneNumber) {
        return phoneNumber.startsWith("+212") && phoneNumber.length() == 13;
    }
}