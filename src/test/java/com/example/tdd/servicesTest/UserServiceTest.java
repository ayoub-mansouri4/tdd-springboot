package com.example.tdd.servicesTest;

import com.example.tdd.services.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class UserServiceTest {

    private UserServiceImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new UserServiceImpl();
    }

    @Test
    @DisplayName("numberPhoneValidatorTest is passed successfully")
    void numberPhoneValidatorTest(){
        //Given
        String phoneNumber="+212632236881";
        //when
        boolean isValid =underTest.test(phoneNumber);
        //then
        assertThat(isValid).isTrue();

    }
}
