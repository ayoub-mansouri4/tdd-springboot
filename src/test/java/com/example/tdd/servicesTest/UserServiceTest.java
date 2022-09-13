package com.example.tdd.servicesTest;

import com.example.tdd.services.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class UserServiceTest {

    private UserServiceImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new UserServiceImpl();
    }

    /*@Test
    @DisplayName("numberPhoneValidatorTest is passed successfully")
    void numberPhoneValidatorTest(){
        //Given
        String phoneNumber="+212632236881";
        //when
        boolean isValid =underTest.test(phoneNumber);
        //then
        assertThat(isValid).isTrue();

    }
     */

     @ParameterizedTest
     @CsvSource({
             "+212632236881,true",
             "212632236881,false",
             "+3363236881,false",
             "+212632236881111,false"
     })
    void numberPhoneValidatorTest(String phoneNumber,boolean expexted){
        //when
        boolean isValid =underTest.test(phoneNumber);
        //then
        assertThat(isValid).isEqualTo(expexted);

    }
}
