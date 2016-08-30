/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import java.util.ArrayList;

/**
 *
 * @author sanka_001
 */
public class HospitalDirectory {
    ArrayList<Hospital> hospitalList;
    
    public HospitalDirectory(){
        hospitalList=new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }
    
    public Hospital createHospital(String name, String address, int hospitalID, String phone, double longitude, double latitude){
        Hospital hospital= new Hospital();
        hospital.setHospitalName(name);
        hospital.setAddress(address);
        hospital.setHospitalID(hospitalID);
        hospital.setPhone(phone);
        hospital.setLongitude(longitude);
        hospital.setLatitude(latitude);
        hospitalList.add(hospital);
        return hospital;
    }
    
    public void deleteHospital(Hospital hospital){
        hospitalList.remove(hospital);
    }
    
    
}
