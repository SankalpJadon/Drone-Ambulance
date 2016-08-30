/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author sanka_001
 */
public class PatientDirectory {
    ArrayList<Patient> patientList;
    
    public PatientDirectory(){
        patientList = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public Patient createPatient(String fname, String sensorId, String address){
       Patient patient=new Patient();
       patient.setFirstName(fname);
       patientList.add(patient);
       return patient;
    }
    
    public void deletePatient(Patient patient){
        patientList.remove(patient);
    }
    
    
}
