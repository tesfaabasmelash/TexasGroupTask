package com.javaproject;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setUserName("tesfaab@yahoo.com"); // correct
        registration.setEmail("tesfa  ab@yahoo.com"); // space in between
        registration.setEmail("tesfaab@gmail.com"); // not yahoo domain
        registration.setUserName(""); // blank
        registration.setUserName("jo  hkk"); // space in between
        registration.setPassword("12345qwer"); // correct
        registration.setPassword("12345 qwer");// space in between


    }
}