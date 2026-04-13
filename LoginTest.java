/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package quickchart_part_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoginTest{

    // =========================
    // USERNAME TESTS
    // =========================

    @Test
    public void testUsernameCorrect() {
        Login user = new Login("kyl_1", "Password1!", "+27838968976");
        assertTrue(user.checkUserName());
    }

    @Test
    public void testUsernameIncorrect() {
        Login user = new Login("kyle!!!!!!!", "Password1!", "+27838968976");
        assertFalse(user.checkUserName());
    }

    // =========================
    // PASSWORD TESTS
    // =========================

    @Test
    public void testPasswordCorrect() {
        Login user = new Login("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        assertTrue(user.checkPasswordComplexity());
    }

    @Test
    public void testPasswordIncorrect() {
        Login user = new Login("kyl_1", "password", "+27838968976");
        assertFalse(user.checkPasswordComplexity());
    }

    // =========================
    // CELL PHONE TESTS
    // =========================

    @Test
    public void testCellCorrect() {
        Login user = new Login("kyl_1", "Password1!", "+27838968976");
        assertTrue(user.checkCellPhoneNumber());
    }

    @Test
    public void testCellIncorrect() {
        Login user = new Login("kyl_1", "Password1!", "08966553");
        assertFalse(user.checkCellPhoneNumber());
    }

    // =========================
    // LOGIN TESTS
    // =========================

    @Test
    public void testLoginSuccess() {
        Login user = new Login("kyl_1", "Password1!", "+27838968976");
        assertTrue(user.loginUser("kyl_1", "Password1!"));
    }

    @Test
    public void testLoginFail() {
        Login user = new Login("kyl_1", "Password1!", "+27838968976");
        assertFalse(user.loginUser("wrong", "wrong"));
    }

    // =========================
    // assertEquals (VERY IMPORTANT FOR RUBRIC)
    // =========================

    @Test
    public void testRegisterSuccessMessage() {
        Login user = new Login("kyl_1", "Ch&&sec@ke99!", "+27838968976");

        String expected = "Username successfully captured.\nPassword successfully captured.\nCell phone number successfully added.";

        assertEquals(expected, user.registerUser());
    }

    @Test
    public void testRegisterUsernameFailMessage() {
        Login user = new Login("kyle!!!!!!!", "Ch&&sec@ke99!", "+27838968976");

        String expected = "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";

        assertEquals(expected, user.registerUser());
    }

    @Test
    public void testRegisterPasswordFailMessage() {
        Login user = new Login("kyl_1", "password", "+27838968976");

        String expected = "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";

        assertEquals(expected, user.registerUser());
    }

    @Test
    public void testRegisterCellFailMessage() {
        Login user = new Login("kyl_1", "Ch&&sec@ke99!", "08966553");

        String expected = "Cell phone number incorrectly formatted or does not contain international code.";

        assertEquals(expected, user.registerUser());
    }
}