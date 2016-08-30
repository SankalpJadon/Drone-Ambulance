/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drone;

/**
 *
 * @author sanka_001
 */
public class Drone {
    static int droneId=1;
    String address;
    String name;
    double longitude;
    double latitude;
    int count;
    boolean availability= true;
    public Drone(){
       droneId= count;
       count++;
        
    }
    public int getDroneId() {
        return droneId;
    }

    public void setDroneId(int DroneId) {
        this.droneId = DroneId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String Address) {
        this.address = Address;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
