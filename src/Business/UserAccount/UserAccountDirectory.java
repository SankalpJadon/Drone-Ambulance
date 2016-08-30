/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Patient.Patient;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sanka_001
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String userName, String password) {
          for (UserAccount ua : userAccountList) {
            if (ua.getUserName().equals(userName) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public boolean checkIfUsernameIsUnique(String userName){
        for(UserAccount ua: userAccountList){
            if(ua.getUserName().equals(userName)){
                return false;
            }
        }
        return true;
    }
     
    public UserAccount createEmployeeUserAccount(String userName, String password, Employee employee, Role role){
        UserAccount ua=new UserAccount();
        ua.setUserName(userName);
        ua.setPassword(password);
        ua.setRole(role);
        ua.setEmployee(employee);
        userAccountList.add(ua);
        return ua;
    } 
     
    public UserAccount createPatientUserAccount(String userName, String password, Patient patient, Role role){
        UserAccount ua=new UserAccount();
        ua.setUserName(userName);
        ua.setPassword(password);
        ua.setRole(role);
        ua.setPatient(patient);
        userAccountList.add(ua);
        return ua;
    } 
    
    public void deletePatientUserAccount(UserAccount ua){
        userAccountList.remove(ua);
    }

    public void deleteEmployeeUserAccount(UserAccount ua){
        userAccountList.remove(ua);
    }


}
