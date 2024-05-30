package org.LMS.displays;

import org.LMS.apps.adminApp;
import org.LMS.apps.librarianApp;
import org.LMS.databases.userDB;

public class userDisplay {
    String name;
    String password;
    String role;

    public void setInfo(String username, String password, String role) {
        this.name = username;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void getInfo() {
        System.out.println("========================");
        System.out.println("Name: " + name);
        System.out.println("Password: " + password);
        System.out.println("Role: " + role);
        System.out.println("========================");
    }

    public class userQuery {
        userDB db = new userDB();
        String[][] data = db.userInfo;

        public String name;
        private String password;
        public String role;
        public boolean isFound;

        public void query(String name, String password) {
            for (int column = 0; column < data.length; column++) {
                if (data[column][0].equals(name) && data[column][1].equals(password)) {
                    this.name = data[column][0];
                    this.password = data[column][1];
                    this.role = data[column][2];
                    isFound = true;
                    break;
                }
            }
        }
        public void getUserDisplay() {
            if (isFound) {
                userDisplay user = new userDisplay();
                user.setInfo(name, password, role);
                switch (role) {
                    case "admin":
                        adminApp admin = new adminApp();
                        admin.adminUI(name, password, role);
                        break;
                    case "librarian":
                        librarianApp librarian = new librarianApp();
                        librarian.librarianUI(name, password, role);
                        break;
                }
            } else {
                System.out.println("Username or password is incorrect.");
            }
        }
    }
}
