/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ran
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        // Three roles: LabAssistant, Doctor, Admin
        
        Business business = Business.getInstance();
        
        //create admin organization
        AdminOrganization adminOrg = new AdminOrganization();
        //add created admin organization into Business
        business.getOrganizationDirectory().getOrganizationList().add(adminOrg);
        
        //Create a new employee
        Employee employee = new Employee();
        employee.setName("Pavan");
        
        //Create a new account
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole("Admin");
        //assign the account to employee
        account.setEmployee(employee);
        
        //add the employee to admin organization
        adminOrg.getEmployeeDirectory().getEmployeeList().add(employee);
        //add the account into admin organization
        adminOrg.getUserAccountDirectory().getUserAccountList().add(account);
        
        //create lab organization
        LabOrganization labOrg = new LabOrganization();
        //add created admin organization into Business
        business.getOrganizationDirectory().getOrganizationList().add(labOrg);
        
         //Create a new employee
        Employee employee2 = new Employee();
        employee2.setName("Ben");
        
        //Create a new account
        UserAccount account2 = new UserAccount();
        account2.setUsername("lab");
        account2.setPassword("lab");
        account2.setRole("Lab Assistant");
        //assign the account to employee
        account2.setEmployee(employee2);
        
        //add the employee to lab organization
        labOrg.getEmployeeDirectory().getEmployeeList().add(employee2);
        //add the account into lab organization
        labOrg.getUserAccountDirectory().getUserAccountList().add(account2);
        
        //create lab organization
        DoctorOrganization doctorOrg = new DoctorOrganization();
        //add created admin organization into Business
        business.getOrganizationDirectory().getOrganizationList().add(doctorOrg);
        
         //Create a new employee
        Employee employee3 = new Employee();
        employee3.setName("Jackie");
        
        //Create a new account
        UserAccount account3 = new UserAccount();
        account3.setUsername("doctor");
        account3.setPassword("doctor");
        account3.setRole("Doctor");
        //assign the account to employee
        account3.setEmployee(employee3);
        
        //add the employee to admin organization
        doctorOrg.getEmployeeDirectory().getEmployeeList().add(employee3);
        //add the account into admin organization
        doctorOrg.getUserAccountDirectory().getUserAccountList().add(account3);
        
        return business;
    }
    
}
