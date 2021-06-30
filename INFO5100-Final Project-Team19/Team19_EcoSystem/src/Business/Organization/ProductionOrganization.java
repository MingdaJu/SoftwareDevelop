/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ProductionRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jumin
 */
public class ProductionOrganization extends Organization{
    public ProductionOrganization() {
        super(Organization.Type.Production.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ProductionRole());
        return roles;
    }
}
