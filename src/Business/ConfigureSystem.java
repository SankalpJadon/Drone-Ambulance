/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Patient.Patient;

import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author sanka_001
 */
public class ConfigureSystem {
    
    public static QuickAssist configure(){
        QuickAssist system = QuickAssist.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        //Person person= new Person();
        //Person person=new Employee();
        //Employee employee= person.getEmployee();
       
        Employee emp = system.getEmployeeDirectory().createEmployee("RRH",0,"40 clearway st.");
        UserAccount ua = system.getUserAccountDirectory().createEmployeeUserAccount("sysadmin", "sysadmin",emp , new SystemAdminRole());
        
        return system;
    }
}
