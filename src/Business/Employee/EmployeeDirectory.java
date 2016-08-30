/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author sanka_001
 */
public class EmployeeDirectory {
    ArrayList<Employee> employeeList;
    
    public EmployeeDirectory(){
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee createEmployee(String name, int empId,String  address){
       Employee employee=new Employee();
       employee.setFirstName(name);
      
       employee.setAddress(address);
 
       employee.setEmpId(empId);
       employeeList.add(employee);
       return employee;
    }

    public void deleteEmployee(Employee employee){
       employeeList.remove(employee);
    }
 
    
    
}
