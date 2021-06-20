/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author 850354
 */
public class User {
    //in this class i want to get the user's input and set
    //thread safety remember
    private String username;
    private String password;
    
    public User(String username, String password){
      this.username =username;
      this.password =password;
    }
    
    public String getUsername (){
            return username;
    }
    
    public void setUsername (String username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    public void setPassword (String password){
        this.password = password;
    }
    
}
    

