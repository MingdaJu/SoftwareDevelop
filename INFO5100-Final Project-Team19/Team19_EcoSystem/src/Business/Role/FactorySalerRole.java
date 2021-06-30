/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FactorySalerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.MarketSalerRole.MarketSalerWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.FactorySalerRole.FactorySalerControlJPanel;
import userinterface.FactorySalerRole.FactorySalerWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class FactorySalerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FactorySalerControlJPanel(userProcessContainer, account, (FactorySalerOrganization)organization, enterprise);
    }
    
    
}
