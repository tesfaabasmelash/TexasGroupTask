package com.javaproject;
/*
    Task5
        Create  Registration  Class  in  which  you would have variables as email,
        userName and password that have an access scope only within its own class.
        After creating an object of the class user should be able to call  methods
        and  in  each  method separately pass values to set users email, username and password.
        Requirements: A.Valid email consider to be only yahooB.
                      Valid userName and password cannot be empty and should be of length larger than 6 characters.
                      Also valid password cannot contain userName.
 */
public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        String[] arrEmail = email.split("@");
        String[] arrEmail2 = arrEmail[1].split("[.]");
        if (arrEmail2[0].equals("yahoo")) {
            if(email.contains(" ")){
                System.out.println("No space in between email.");
            }else {
               // email = email;
                System.out.println(email);
            }
        } else {
            System.out.println("Your email should be only yahoo.");
        }
        System.out.println("Given email is:"+email);
    }

    public String getEmail() {
        return email;
    }

    public void setUserName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Username can not be empty or no space");
        } else if (userName.length() <= 6) {
            System.out.println("Username should be greater than 6 characters");
        } else if(userName.contains(" ")){
            System.out.println("No space in between user name.");
        }else {
            this.userName = userName;
        }
        System.out.println("Given user name is:"+userName);
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        if (password.isEmpty()) {
            System.out.println("Password can not be empty or no space.");
        } else if (password.length() <= 6) {
            System.out.println("Password should be greater than 6 characters");
        } else if(password.contains(" ")){
            System.out.println("No space in between password.");
        }else if (userName != null) {
            if (password.contains(userName)) {
                System.out.println("Password can not contain username");
            } else {
                this.password = password;

            }
        } else {
            System.out.println("Username is empty");
        }
        System.out.println("Given password is:"+password);
    }

    public String getPassword() {
        return password;
    }
}