
package MyServlets;

import Service.AccountService;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 *
 * @author 850354
 */
public class LoginServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //we create a session 
        HttpSession seshs = request.getSession();
        
        
        //get the logout parameter from the href earlier
       if (request.getParameter("logout") !=null){
           //invalid session since the logout button is pressed 
           seshs.invalidate();
           //post a message to the user so they would know that they are logged out
           request.setAttribute("Error", "You have logged out of your account");
           //get them back to login page 
           getServletContext().getRequestDispatcher("/web-INF/login.jsp").forward(request, response);
           
           //**close the if**
           return;
       }
       //jus let them stay in home page if the logout is null
       response.sendRedirect("home");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // create a session 
        HttpSession seshes = request.getSession();
        
        //create account service 
        AccountService acc = new AccountService();
        
        //get the user name and password using the name u gave in the login input tags
        String tboxUser = request.getParameter("username");
        String tboxpass = request.getParameter("password");
        
        
        
        
    }

}
