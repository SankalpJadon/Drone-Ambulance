/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Drone.DroneDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Hospital.HospitalDirectory;
import Business.Patient.PatientDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author sanka_001
 */
public abstract class Organization {

    private String name;
    private int organizationId;
    private static int counter;
    public int listSize;
    private WorkQueue workQueue;
    private UserAccountDirectory userAccountDirectory;
    private PatientDirectory patientDirectory;
    private EmployeeDirectory employeeDirectory;
    private HospitalDirectory hospitalDirectory;
    private DroneDirectory droneDirectory;

    public enum Type {

        SysAdmin("SysAdmin"),
        Drone("Drone"),
        DroneWarehouseAdmin("Drone Warehouse Admin"),
        DoctorAdmin("Doctor Admin"),
        Patient("Patient"),
        SensorAdmin("Sensor Admin"),
        Doctor("Doctor"),
        Mayor("Mayor"),
        Hospital("Hospital");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        patientDirectory = new PatientDirectory();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        hospitalDirectory=new HospitalDirectory();
        droneDirectory=new DroneDirectory();
        organizationId = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public DroneDirectory getDroneDirectory() {
        return droneDirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }


    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public PatientDirectory getPersonDirectory() {
        return patientDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    @Override
    public String toString() {
        return name;
    }

}
