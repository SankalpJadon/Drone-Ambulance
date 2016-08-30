/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Drone.Drone;
import Business.Employee.Employee;
import Business.Patient.Patient;
import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author sanka_001
 */
public class PatientDoctorWorkRequest extends WorkRequest{
    private Patient assignedPatient;
    private Employee assignedDoctor;
    private Drone assignedDrone;
    private double eta;
    
    public Employee getAssignedDoctor() {
        return assignedDoctor;
    }

    public double getEta() {
        return eta;
    }

    public void setEta(double eta) {
        this.eta = eta;
    }

    public void setAssignedDoctor(Employee assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    public Drone getAssignedDrone() {
        return assignedDrone;
    }

    public void setAssignedDrone(Drone assignedDrone) {
        this.assignedDrone = assignedDrone;
    }

    public Patient getAssignedPatient() {
        return assignedPatient;
    }

    public void setAssignedPatient(Patient assignedPatient) {
        this.assignedPatient = assignedPatient;
    }

    @Override
    public void setRequestDate(Date requestDate) {
        super.setRequestDate(requestDate); //To change body of generated methods, choose Tools | Templates.
    }

    


  
    
}
