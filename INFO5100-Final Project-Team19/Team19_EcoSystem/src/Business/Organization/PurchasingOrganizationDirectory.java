/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author jumin
 */
public class PurchasingOrganizationDirectory {
    private ArrayList<PurchasingOrganization> purchasingOrganizationList;
    
    public PurchasingOrganizationDirectory() {
        this.purchasingOrganizationList = new ArrayList<PurchasingOrganization>();
    }

    public ArrayList<PurchasingOrganization> getPurchasingOrganizationList() {
        return purchasingOrganizationList;
    }

    public void setPurchasingOrganizationList(ArrayList<PurchasingOrganization> purchasingOrganizationList) {
        this.purchasingOrganizationList = purchasingOrganizationList;
    }
    public Organization createPurchasingOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Purchasing.getValue())){
            organization = new PurchasingOrganization();
            purchasingOrganizationList.add((PurchasingOrganization) organization);
        }
        return organization;
    }
}
