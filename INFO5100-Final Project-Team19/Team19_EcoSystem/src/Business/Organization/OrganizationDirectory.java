/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.FactorySaler.getValue())){
            organization = new FactorySalerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Purchasing.getValue())){
            organization = new PurchasingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Production.getValue())){
            organization = new ProductionOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Hr.getValue())){
            organization = new HrOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.MarketSaler.getValue())){
            organization = new MarketSalerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }

    public void deleteOrg(Organization organization) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        organizationList.remove(organization);
    }

    public void deleteUser(UserAccount user) {
        organizationList.remove(user);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}