/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

/**
 *
 * @author Floyed Pinto
 */
public abstract class User {

    public User(String userName, String password){
        
        this.userName = userName;
        this.password = password;
        
    }
    
    private String userName;
    
    private String password;
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
