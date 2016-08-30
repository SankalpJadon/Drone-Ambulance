/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Employee.Employee;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sanka_001
 */
public class VitalSignDirectory {
    ArrayList<VitalSign> vitalSignList;
    
    public VitalSignDirectory(){
        vitalSignList=new ArrayList<>();
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    
    
    public VitalSign createAndAddVitalSign(int dBP, int weight, int sBP, int heartRate,int respRate, int temperature, Date timeStamp, String condition){
        VitalSign vitalSign=new VitalSign();
        vitalSign.setdBloodPressure(dBP);
        vitalSign.setWeight(weight);
        vitalSign.setsBloodPressure(sBP);
        vitalSign.setTemperature(temperature);
        vitalSign.setHeartRate(heartRate);
        vitalSign.setRespRate(respRate);
        vitalSign.setTimeStamp(timeStamp);
        vitalSign.setCondition(condition);
        vitalSignList.add(vitalSign);
        return vitalSign;
    }
}
