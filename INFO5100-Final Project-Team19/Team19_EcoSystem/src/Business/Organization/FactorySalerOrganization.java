/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FactorySalerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class FactorySalerOrganization extends Organization{

    public FactorySalerOrganization() {
        super(Organization.Type.FactorySaler.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FactorySalerRole());
        return roles;
    }
     
}