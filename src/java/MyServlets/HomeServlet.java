/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyServlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 850354
 */
public class HomeServlet extends HttpServlet {

    //this class is just for getting username and validating if it is not empty
    //as we are not showing anything on the users end we delete the do post method
    //elimination of useless code!!
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //first create a session for the user
        HttpSession sesh = request.getSession(true);
        
        //we make the session to get the username the user has inputted from the 
        //form text box(don forget to cast it to string)!!
       
        String getMyUser = (String) sesh.getAttribute("username");
        
        //validate the username
        if ((getMyUser.equals("") || getMyUser == null)){
            //so this is saying if the user name is empty send the user back to 
            // login page (REMEMBER UR NOT SUPPOSED TO FORWARD UR REDIRECTING!!)
            response.sendRedirect("login");
        } else {
            //send em back to home page 
            
            getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
        }
        
    }

}

