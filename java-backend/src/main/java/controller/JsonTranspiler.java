package controller;

import java.util.HashMap;

import com.google.gson.Gson;

import model.User;

// JsonDriver is a friendly wrapper class for the JsonParser and JsonWriter classes.
public class JsonTranspiler {

  // Singleton Pattern
  private static JsonTranspiler instance = null;

  public static JsonTranspiler getInstance() {
    if (instance == null) {
      instance = new JsonTranspiler();
    }
    return instance;
  }

  // Attributes
  public JsonTranspiler() {
  }

  public String bad() {
    HashMap<String, Object> map = new HashMap<String, Object>();
    map.put("isOk", false);
    map.put("User", null);
    return new Gson().toJson(map);
  }

  public String good(User user) {
    HashMap<String, Object> map = new HashMap<String, Object>();
    map.put("isOk", true);
    map.put("User", user);
    return new Gson().toJson(map);
  }
}
