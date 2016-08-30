/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.Role.Role;
import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author sanka_001
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise= null;
       
        if(type==Enterprise.EnterpriseType.Mayor){
            enterprise= new MayorEnterprise(name);
            enterpriseList.add(enterprise);
        }
       
        else if(type==Enterprise.EnterpriseType.HealthAssistant){
            enterprise= new HealthAssistantEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.Hospital){
            enterprise= new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
                
        return enterprise;
    }
 
 
}
