/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.QuickAssist;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author sanka_001
 */
public abstract class Role {
     
    public enum RoleType{
        SysAdmin("System Admin Role"),
        EnterpriseAdmin("Admin Role"),
        DroneWarehouse("Drone Warehouse Role"),
        Drone("Drone Role"),
        HealthAssistantAdmin("Health Assistant Admin Role"),
        Patient("Patient Role"),
        Doctor("Doctor Role"),
        Mayor("Mayor Role"),
        SensorAdmin("Sensor Admin Role"),
        HospitalReception("Hospital Reception Role");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            QuickAssist business,
            Network network);

    @Override
    public String toString() {
     return this.getClass().getName();
    }
}
