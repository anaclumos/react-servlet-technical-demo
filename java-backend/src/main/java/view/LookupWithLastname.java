package view;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import controller.JsonTranspiler;
import model.User;
import model.UserModel;

@WebServlet("/lookupwithlastname")
public class LookupWithLastname extends HttpServlet {
  private static final long serialVersionUID = 1L;

  public LookupWithLastname() {
    super();
  }

  protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
      throws javax.servlet.ServletException, java.io.IOException {
    UserModel userModel = UserModel.getInstance();
    JsonTranspiler jsonTranspiler = JsonTranspiler.getInstance();

    String lastname = request.getParameter("lastname");

    System.out.println("lastname: " + lastname);

    if (lastname == null) {
      response.getWriter().print(jsonTranspiler.bad());
    } else {
      User user = userModel.getUserWithLastName(lastname);
      if (user == null) {
        response.getWriter().print(jsonTranspiler.bad());
      } else {
        response.getWriter().print(jsonTranspiler.good(user));
      }
    }
  }

  protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
      throws javax.servlet.ServletException, java.io.IOException {
    doGet(request, response);
  }
}
