/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickchat_part_1;

import java.util.regex.Pattern;
/**
 *
 * @author Student
 */

public class Login {

    private String username;
    private String password;
    private String cellPhone;
    private String firstName;
    private String lastName;

    // Constructor
    public Login(String firstName, String lastName, String username, String password, String cellPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.cellPhone = cellPhone;
    }

    // Check Username
    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

    // Check Password
    public boolean checkPasswordComplexity() {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$";
        return Pattern.matches(regex, password);
    }

    // Check Cell Phone
    // Reference: https://regexlib.com
    public boolean checkCellPhoneNumber() {
        String regex = "^\\+27\\d{9}$";
        return Pattern.matches(regex, cellPhone);
    }

    // Register User
    public String registerUser() {

        if (!checkUserName()) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }

        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

        if (!checkCellPhoneNumber()) {
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }

        return "Username successfully captured.\nPassword successfully captured.\nCell phone number successfully added.";
    }

    // Login User
    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }

    // Login Status Message
    public String returnLoginStatus(boolean status) {
        if (status) {
            return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}   

