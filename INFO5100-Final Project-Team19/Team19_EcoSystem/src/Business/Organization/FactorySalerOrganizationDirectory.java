/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author jumin
 */
public class FactorySalerOrganizationDirectory {
    private ArrayList<FactorySalerOrganization> factorySalerOrganizationList;
    
    public FactorySalerOrganizationDirectory() {
        this.factorySalerOrganizationList = new ArrayList<FactorySalerOrganization>();
    }

    public ArrayList<FactorySalerOrganization> getFactorySalerOrganizationList() {
        return factorySalerOrganizationList;
    }

    public void setFactorySalerOrganizationList(ArrayList<FactorySalerOrganization> FactorySalerOrganizationList) {
        this.factorySalerOrganizationList = FactorySalerOrganizationList;
    }
    public Organization createFactorySalerOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.FactorySaler.getValue())){
            organization = new FactorySalerOrganization();
            factorySalerOrganizationList.add((FactorySalerOrganization) organization);
        }
        return organization;
    }
}
