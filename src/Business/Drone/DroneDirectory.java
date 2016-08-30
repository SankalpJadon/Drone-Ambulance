/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drone;

import java.util.ArrayList;

/**
 *
 * @author sanka_001
 */
public class DroneDirectory {
    ArrayList<Drone> droneList;

    public DroneDirectory() {
    
        droneList=new ArrayList<>();
    
    }

    public ArrayList<Drone> getDroneList() {
        return droneList;
    }
    
    public Drone createAndAddDrone(String name,String address,  double longitude, double latitude){
        Drone drone=new Drone();
        drone.setName(name);
        drone.setAddress(address);
        drone.setLatitude(latitude);
        drone.setLongitude(longitude);
        droneList.add(drone);
        return drone;
    }
    
    public void deleteDrone(Drone drone){
        droneList.remove(drone);
    }
    
    
}
