package org.LMS.apps;

import org.LMS.displays.userQuery;

import javax.swing.JOptionPane;

public class login {
  public void loginUI() {
    userQuery user = new userQuery();

    String username;
    String password;
    username = JOptionPane.showInputDialog("Enter Username");
    password = JOptionPane.showInputDialog("Enter Password");

    user.verify(username, password);
    user.getUserDisplay();
  }
}
