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
import UserInterface.Doctor.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sanka_001
 */

public class DoctorRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, QuickAssist system, Network network) {
        return new DoctorWorkAreaJPanel(userProcessContainer, account, organization, enterprise, system);
    }
}
