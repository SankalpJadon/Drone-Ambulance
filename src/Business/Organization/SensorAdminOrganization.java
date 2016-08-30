/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.Role;
import Business.Role.SensorAdminRole;
import java.util.ArrayList;

/**
 *
 * @author sanka_001
 */
public class SensorAdminOrganization extends Organization{

    public SensorAdminOrganization(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SensorAdminRole());
        return roles;
    }
    
}
