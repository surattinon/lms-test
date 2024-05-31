package org.LMS.displays;

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
}
