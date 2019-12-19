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
public class Customer extends User{
    
    private String custName;
    
    private int age;

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    public Customer(String userName, String password){
        
        super(userName,password);
        
    }
    
}
