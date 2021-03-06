package model;

import java.util.ArrayList;

public class UserModel {

  // Singleton Design Pattern
  private static UserModel instance = null;

  public static UserModel getInstance() {
    if (instance == null) {
      instance = new UserModel();
    }
    return instance;
  }

  // Attributes
  ArrayList<User> users;

  public UserModel() {
    users = new ArrayList<User>();
  }

  public void addUser(User user) {
    users.add(user);
  }

  public void addUser(String firstname, String lastname) {
    User user = new User(firstname, lastname);
    users.add(user);
  }

  public User getUser(int index) {
    return users.get(index);
  }

  public int getUserCount() {
    return users.size();
  }

  public void removeUser(int index) {
    users.remove(index);
  }

  public User getUserWithLastName(String lastname) {
    for (User user : users) {
      if (user.getLastName().toLowerCase().equals(lastname.toLowerCase())) {
        return user;
      }
    }
    return null;
  }

  public User exists(String firstname, String lastname) {
    for (User user : users) {
      if (user.getFirstName().toLowerCase().equals(firstname.toLowerCase())
          && user.getLastName().toLowerCase().equals(lastname.toLowerCase())) {
        return user;
      }
    }
    return null;
  }
}
