package model;

public class User {
  private String firstname;
  private String lastname;

  public User(String first_name, String last_name) {
    this.firstname = first_name;
    this.lastname = last_name;
  }

  public String getFirstName() {
    return firstname;
  }

  public String getLastName() {
    return lastname;
  }
}