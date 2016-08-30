/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Drone.Drone;
import Business.Hospital.Hospital;
import Business.Patient.Patient;

/**
 *
 * @author sanka_001
 */
public class QuickAssistDoctorWorkRequest extends WorkRequest {
    private Patient patient;    
    private Hospital hospital;
    private Drone drone;
    
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public Drone getDrone() {
        return drone;
    }

    public void setDrone(Drone drone) {
        this.drone = drone;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
   
}
