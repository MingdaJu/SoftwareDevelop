/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FactorySalerOrganization;
import Business.Organization.MarketSalerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.PurchasingRole.PurchasingWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.MarketSalerRole.MarketSalerControlJPanel;
import userinterface.MarketSalerRole.MarketSalerWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class MarketSalerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new MarketSalerControlJPanel(userProcessContainer, account, (MarketSalerOrganization)organization, enterprise);
    }
    
}
