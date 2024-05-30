package org.LMS;

import org.LMS.apps.login;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        JOptionPane popup = new JOptionPane();
        String[] opts = {"Login", "Exit"};

        int choice = popup.showOptionDialog(
                null,
                "Welcome to Stamford LMS App.",
                "Stamford LMS",
                popup.YES_NO_OPTION,
                popup.INFORMATION_MESSAGE,
                null,
                opts,
                opts[0]
        );

        if (choice == JOptionPane.YES_OPTION) {
            login panel = new login();
            panel.loginUI();
        }
    }
}