package org.LMS.apps;

import org.LMS.displays.userQuery;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class adminApp {
  public void adminUI(String name, String password, String role) {
    Scanner input = new Scanner(System.in);
    userQuery show = new userQuery();

    JOptionPane.showMessageDialog(null, "Welcome to LMS Admin\n" +
        "Your name: \"" + name + "\"\n" +
        "Your role: \"" + role + "\"\n" +
        "You can use terminal to manage the library,\n" +
        "Press \"OK\" to continue.");
    System.out.println("Admin Panel");
    System.out.println("=========================");
    System.out.println("1. Veiw Books");
    System.out.println("2. View Users");
    System.out.println("=========================");
    System.out.print("Please enter options:");
    int opts = input.nextInt();
    switch (opts) {
      case 1:
        break;
      case 2:
        show.getUserList();
        break;
      default:
        System.out.println("Invalid option");
    }
    input.close();
  }
}
