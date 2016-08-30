/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.QuickAssist;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.*;
import java.util.*; 
import com.twilio.sdk.*; 
import com.twilio.sdk.resource.factory.*; 
import com.twilio.sdk.resource.instance.*; 
import com.twilio.sdk.resource.list.*; 
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorAdminOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.QuickAssist;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientDoctorWorkRequest;
import Business.WorkQueue.QuickAssistDoctorWorkRequest;
import Business.WorkQueue.WorkQueue;
import com.twilio.sdk.TwilioRestClient;
import static com.twilio.sdk.examples.AccessTokenExamples.ACCOUNT_SID;
import static com.twilio.sdk.examples.AuthExamples.AUTH_TOKEN;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.apache.http.NameValuePair;
import java.util.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.http.message.BasicNameValuePair;
/**
 *
 * @author sanka_001
 */
public class AssistanceRequestedJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    QuickAssist system;
    UserAccount userAccount;
    Enterprise enterprise;
    Patient patient;
    WorkQueue workQueue;
    UserAccount reciever;
//     public static final String ACCOUNT_SID = "ACd8797b54afad359cbcc3e19de8a575e4"; 
// public static final String AUTH_TOKEN = "[AuthToken]";
    double latitude;
    double longitude;
    Network network;
    //private Object client;
    /**
     * Creates new form MedicineRequestedJPanel
     */
    public AssistanceRequestedJPanel(JPanel userProcessContainer,QuickAssist system,UserAccount userAccount,Enterprise enterprise,Patient patient, Network network) {
        initComponents();
        this.setBackground(Color.white);
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.patient=patient;
        this.network=network;
        Browser browser = new Browser();
        BrowserView browserView = new BrowserView(browser);
       //TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN); 
       
       //jPanel1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       jPanel1.add(browserView, BorderLayout.CENTER);
       //jPanel1.setLocationRelativeTo(null);
       jPanel1.setVisible(true);
       longitude=patient.getLongitude();
       latitude=patient.getLatitude();
       browser.loadURL("http://www.google.com/maps/place/"+longitude+","+latitude+"/@"+longitude+","+latitude+",16z");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHead = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnRequeset = new javax.swing.JButton();

        lblHead.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblHead.setText("Request Emergency Assistance");

        jPanel1.setLayout(new java.awt.BorderLayout());

        btnBack.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRequeset.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRequeset.setText("Request");
        btnRequeset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequesetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHead, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 649, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRequeset)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblHead, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnRequeset))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void sendSMS() throws TwilioRestException {
        String ACCOUNT_SID= "ACd8797b54afad359cbcc3e19de8a575e4";
 // Find your Account Sid and Token at twilio.com/user/account 
        String AUTH_TOKEN= "75738f915c4050d8791117ca2e2d0316";
 
      
	TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
	 List<NameValuePair> params = new ArrayList<NameValuePair>();
	 params.add(new BasicNameValuePair("To", "+18572944202")); 
	 params.add(new BasicNameValuePair("From", "+17743151099")); 
	 params.add(new BasicNameValuePair("Body", "Emergency situation, "+ patient.getFirstName()+" reported alarmingly abnormal vital signs. Patient is located at " +patient.getAddress()+" QuickAssist is on its way, please rush to the patient and follow the doctor on the drone's video screen for instructions "));   
 
	 MessageFactory messageFactory = client.getAccount().getMessageFactory(); 
	 Message message = messageFactory.create(params); 
	 System.out.println(message.getSid()); 
        
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
          userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRequesetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequesetActionPerformed
         try {
            sendSMS();
        } catch (TwilioRestException ex) {
            Logger.getLogger(AssistanceRequestedJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Enterprise inEnt;
        PatientDoctorWorkRequest request = new PatientDoctorWorkRequest();
        request.setSender(userAccount);
        request.setStatus("Pending to be assigned");
        request.setAssignedPatient(patient);
        Organization org1 = null;
        Organization org2= null;
        Organization org3= null;
        /////////////////////request to doctoradmin
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof DoctorAdminOrganization){
              //  org1=(DoctorAdminOrganization)organization;
                org1=organization;
                break;
            }
        }
        if (org1!=null){
            org1.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        
        //////////////////////hospitalrequest to hospital
        QuickAssistDoctorWorkRequest hospitalRequest= new QuickAssistDoctorWorkRequest();
        hospitalRequest.setPatient(patient);
        String address= patient.getAddress();
        hospitalRequest.setSender(userAccount);
        hospitalRequest.setStatus("Request Ambulance at "+address);
        for(Enterprise ent: network.getEnterpriseDirectory().getEnterpriseList()){
            if(ent instanceof HospitalEnterprise){
               inEnt= ent;
               for(Organization organization: inEnt.getOrganizationDirectory().getOrganizationList()){
                   
                   if(organization instanceof HospitalOrganization){
                       org2= (HospitalOrganization) organization;
                       
                   }
                   if(org2!= null){
                        org2.getWorkQueue().getWorkRequestList().add(hospitalRequest);
                        userAccount.getWorkQueue().getWorkRequestList().add(hospitalRequest);
                   }  
               }
            }
        }                                          
    }//GEN-LAST:event_btnRequesetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequeset;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHead;
    // End of variables declaration//GEN-END:variables
}