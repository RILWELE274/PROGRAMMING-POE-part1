/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quickchat_part_1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ===== REGISTRATION =====
        System.out.println("=== REGISTER ===");

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Username: ");
        String username = input.nextLine();

        System.out.print("Enter Password: ");
        String password = input.nextLine();

        System.out.print("Enter Cell Phone (+27...): ");
        String cellPhone = input.nextLine();

        Login user = new Login(firstName, lastName, username, password, cellPhone);

        System.out.println("\n--- REGISTRATION RESULT ---");
        System.out.println(user.registerUser());

        // ===== LOGIN =====
        System.out.println("\n=== LOGIN ===");

        System.out.print("Enter Username: ");
        String loginUsername = input.nextLine();

        System.out.print("Enter Password: ");
        String loginPassword = input.nextLine();

        boolean loginSuccess = user.loginUser(loginUsername, loginPassword);

        System.out.println(user.returnLoginStatus(loginSuccess));
    }
}
