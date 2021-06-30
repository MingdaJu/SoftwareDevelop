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
public class HrOrganizationDirectory {
    private ArrayList<HrOrganization> hrOrganizationList;
    public HrOrganizationDirectory() {
        this.hrOrganizationList = new ArrayList<HrOrganization>();
    }
     public Organization createHrOrganization(Organization.Type type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Hr.getValue())) {
            organization = new HrOrganization();
            hrOrganizationList.add((HrOrganization) organization);
        }
        return organization;
    }
}