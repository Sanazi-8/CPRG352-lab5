
package Service;

import Models.User;

/**
 *
 * @author 850354
 */
public class AccountService {
    //here we enforce the user to input the two
    //names we want for testing, like they already signed up
    //now they are loging in with the info 
    
    public User login(String username, String password){
        //here is how we enforce user input with names adam and betty with pass 
        //of password
        
        if ((username.equals("betty") || username.equals("adam")) && password.equals("password")){
            //creates a new user
            return new User (username, null);
        } 
        
        return null;
    }
}
