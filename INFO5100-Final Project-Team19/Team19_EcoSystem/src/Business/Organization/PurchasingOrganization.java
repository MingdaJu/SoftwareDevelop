/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MarketSalerRole;
import Business.Role.PurchasingRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class PurchasingOrganization extends Organization{

    public PurchasingOrganization() {
        super(Organization.Type.Purchasing.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PurchasingRole());
        return roles;
    }
     
   
    
    
}
