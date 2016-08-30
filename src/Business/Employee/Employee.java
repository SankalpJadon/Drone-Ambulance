/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author sanka_001
 */
public class Employee {
    private String firstName;
    //private String lastName;
    private int EmpId;
    private static int count=1;
    private String address;
    Boolean Status;
    UserAccount userAccount;
    
    
    public Employee(){
        EmpId= count;
        count++;
    }


    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   
    public int getEmpId() {
        return EmpId;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean Status) {
        this.Status = Status;
    }


    public void setEmpId(int EmpId) {
        this.EmpId = EmpId;
    }
    public static int getCount() {
        return count;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return firstName;
    }

    
}
