package org.LMS.apps;

import javax.swing.JOptionPane;

public class librarianApp {
  public void librarianUI(String name, String password, String role) {
    // TODO Librarian pane with JOptionPane
    JOptionPane.showMessageDialog(null, "Welcome to LMS Librarian\n" +
        "Your name: \"" + name + "\"\n" +
        "Your role: \"" + role + "\"\n" +
        "You can use terminal to manage the library,\n" +
        "Press \"OK\" to continue.");
  }

}
