/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization;
import Business.Role.DoctorAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sanka_001
 */
public class DoctorAdminOrganization extends Organization{

    public DoctorAdminOrganization(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorAdminRole());
        return roles;
       }
    
}
