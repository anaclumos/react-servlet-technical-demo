package view;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import model.UserModel;

@WebListener
public class Initialize implements ServletContextListener {

  @Override
  public void contextDestroyed(ServletContextEvent contextEvent) {
    System.out.println("Server destroyed");
  }

  // Run this before web application is started
  @Override
  public void contextInitialized(ServletContextEvent contextEvent) {
    System.out.println("Server started");
    ServletContext context = contextEvent.getServletContext();

    // Initialize the pseudo-database
    // Get UserModel
    UserModel userModel = UserModel.getInstance();

    // Add dummy users.
    // For real projects, this will be replaced by a database driver query.
    userModel.addUser("Sunghyun", "Cho");
    userModel.addUser("Danial", "Asaria");
    userModel.addUser("Tristan", "Whang");
    userModel.addUser("Jack", "Stark");
    userModel.addUser("Helen", "Spight");
    userModel.addUser("Jordan", "Cahoon");

    // Print
    System.out.println("User count: " + userModel.getUserCount());
  }
}