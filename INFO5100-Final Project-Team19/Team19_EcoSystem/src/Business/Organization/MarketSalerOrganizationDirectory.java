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
public class MarketSalerOrganizationDirectory {

    private ArrayList<MarketSalerOrganization> marketSalerOrganizationList;

    public MarketSalerOrganizationDirectory() {
        this.marketSalerOrganizationList = new ArrayList<MarketSalerOrganization>();
    }

    public ArrayList<MarketSalerOrganization> getMarketSalerOrganizationList() {
        return marketSalerOrganizationList;
    }

    public void setMarketSalerOrganizationList(ArrayList<MarketSalerOrganization> marketSalerOrganizationList) {
        this.marketSalerOrganizationList = marketSalerOrganizationList;
    }

    public Organization createMarketSalerOrganization(Organization.Type type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.MarketSaler.getValue())) {
            organization = new MarketSalerOrganization();
            marketSalerOrganizationList.add((MarketSalerOrganization) organization);
        }
        return organization;
    }
}
