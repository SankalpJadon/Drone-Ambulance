/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DroneRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sanka_001
 */
public class DroneOrganization extends Organization{

    public DroneOrganization(String name) {
        super(name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DroneRole());
        return roles;
       }
    
}
