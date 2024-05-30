package org.LMS.apps;

import org.LMS.displays.userQuery;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class login {
   public void loginUI() {
       userQuery user = new userQuery();
       JOptionPane popup = new JOptionPane();

       String username;
       String password;
       username = popup.showInputDialog("Enter Username");
       password = popup.showInputDialog("Enter Password");

       user.verify(username, password);
       user.getUserDisplay();
   }
}