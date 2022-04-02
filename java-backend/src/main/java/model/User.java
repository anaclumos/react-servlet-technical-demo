package model;

public class User {
  private String firstName;
  private String lastName;

  public User(String first_name, String last_name) {
    this.firstName = first_name;
    this.lastName = last_name;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }
}