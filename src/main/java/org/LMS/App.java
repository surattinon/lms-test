package org.LMS;

import org.LMS.App;
import org.LMS.apps.login;

import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) {
    String[] opts = { "Login", "Exit" };

    int choice = JOptionPane.showOptionDialog(
        null,
        "Welcome to Stamford LMS App.",
        "Stamford LMS",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        null,
        opts,
        opts[0]);

    if (choice == JOptionPane.YES_OPTION) {
      login panel = new login();
      panel.loginUI();
    }
  }
}
