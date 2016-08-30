/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.UserAccount.UserAccount;

/**
 *
 * @author sanka_001
 */
public class Patient {
    String sensorId;
    int age;
    String firstName;
    VitalSignDirectory vitalSignDirectory;
    double latitude;
    String emergencyPhone;
    double longitude;
    String address;
    UserAccount userAccount;
    
    public Patient(){
    vitalSignDirectory= new VitalSignDirectory();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSensorId() {
        return sensorId;
    }

    public VitalSignDirectory getVitalSignDirectory() {
        return vitalSignDirectory;
    }

    public void setVitalSignDirectory(VitalSignDirectory vitalSignDirectory) {
        this.vitalSignDirectory = vitalSignDirectory;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getFirstName() {
        return firstName;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return firstName;
    }
    
    
    
}
