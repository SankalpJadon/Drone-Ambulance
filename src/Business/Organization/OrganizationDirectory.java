/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author sanka_001
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type, String name) {
        Organization organization = null;

        if (type.getValue().equals(Type.SysAdmin.getValue())) {
            organization = new SystemAdminOrganization("System Admin");
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Type.Mayor.getValue())) {
            organization = new MayorOrganization(name);
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Type.DoctorAdmin.getValue())) {
            organization = new DoctorAdminOrganization(name);
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Type.SensorAdmin.getValue())) {
            organization = new SensorAdminOrganization(name);
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DroneWarehouseAdmin.getValue())) {
            organization = new DroneAdminOrganization(name);
            organizationList.add(organization);
        } 
         else if (type.getValue().equals(Type.Drone.getValue())) {
            organization = new DroneOrganization(name);
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Patient.getValue())) {
            organization = new PatientOrganization(name);
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Type.Hospital.getValue())) {
            organization = new HospitalOrganization(name);
            organizationList.add(organization);
        } 
        
        return organization;
    }
    
    public void deleteOrganization(Organization org){
        organizationList.remove(org);
    }

}
