package org.LMS.apps;

import org.LMS.displays.userQuery;

import java.util.Scanner;

public class login {
   public void loginUI() {
       Scanner input = new Scanner(System.in);
       userQuery user = new userQuery();

       String username;
       String password;

       System.out.print("Username: ");
       username = input.nextLine();
       System.out.print("Password: ");
       password = input.nextLine();

       input.close();

       user.query(username, password);
       user.getUserDisplay();
   }
}