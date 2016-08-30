/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.Date;

/**
 *
 * @author sanka_001
 */
public class VitalSign {
    int sBloodPressure;
    int dBloodPressure;
    int respRate;
    int weight;
    int heartRate;
    int temperature;
    Date timeStamp;
    String condition;
    
    public int getsBloodPressure() {
        return sBloodPressure;
    }

    public int getRespRate() {
        return respRate;
    }

    public void setRespRate(int respRate) {
        this.respRate = respRate;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setsBloodPressure(int sBloodPressure) {
        this.sBloodPressure = sBloodPressure;
    }

    public int getdBloodPressure() {
        return dBloodPressure;
    }

    public void setdBloodPressure(int dBloodPressure) {
        this.dBloodPressure = dBloodPressure;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    
}
