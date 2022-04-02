package model;

// Object Relational Mapping for Java-Json
public class JsonOrm {
  // {
  // "isOk": true,
  // "User": {
  // "firstname": "Sunghyun",
  // "lastname": "Cho"
  // }
  // }
  private boolean isOk;
  private User user;

  public JsonOrm(boolean isOk, User user) {
    this.isOk = isOk;
    this.user = user;
  }

  public boolean isOk() {
    return isOk;
  }

  public User getUser() {
    return user;
  }

  public void setOk(boolean isOk) {
    this.isOk = isOk;
  }

  public void setUser(User user) {
    this.user = user;
  }
}