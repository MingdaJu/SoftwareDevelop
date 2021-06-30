package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Factory;
import static Business.Enterprise.Enterprise.EnterpriseType.Market;
import Business.Network.Network;
import Business.Organization.FactorySalerOrganization;
import Business.Organization.HrOrganization;
import Business.Organization.MarketSalerOrganization;
import Business.Organization.Organization;
import Business.Organization.ProductionOrganization;
import Business.Organization.PurchasingOrganization;
import Business.Role.AdminRole;
import Business.Role.FactorySalerRole;
import Business.Role.HrRole;
import Business.Role.MarketSalerRole;
import Business.Role.ProductionRole;
import Business.Role.PurchasingRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees
        //create user account
        Network Setnetwork1 = system.createAndAddNetwork();
        Setnetwork1.setName("Boston");
        Network Setnetwork2 = system.createAndAddNetwork();
        Setnetwork2.setName("New York");
        Network Setnetwork3 = system.createAndAddNetwork();
        Setnetwork3.setName("San Francisco");
        //create an enterprise
        Enterprise Setenterprise1 = Setnetwork1.getEnterpriseDirectory().createAndAddEnterprise("Walmart", Market);
        Enterprise Setenterprise2 = Setnetwork2.getEnterpriseDirectory().createAndAddEnterprise("Target", Market);
        Enterprise Setenterprise3 = Setnetwork3.getEnterpriseDirectory().createAndAddEnterprise("Kellogg", Factory);
        Enterprise Setenterprise4 = Setnetwork3.getEnterpriseDirectory().createAndAddEnterprise("HardWare", Factory);
        //create enterprise admin
        Employee admin1 = Setenterprise1.getEmployeeDirectory().createEmployee("Tomas");
        UserAccount account1 = Setenterprise1.getUserAccountDirectory().createUserAccount("WalmartAdmin", "WalmartAdmin", admin1, new AdminRole());
        Employee admin2 = Setenterprise2.getEmployeeDirectory().createEmployee("Jackson");
        UserAccount account2 = Setenterprise2.getUserAccountDirectory().createUserAccount("TargetAdmin", "CocaColaAdmin", admin2, new AdminRole());
        Employee admin3 = Setenterprise3.getEmployeeDirectory().createEmployee("Cindy");
        UserAccount account3 = Setenterprise3.getUserAccountDirectory().createUserAccount("KelloggAdmin", "KelloggAdmin", admin3, new AdminRole());
        Employee admin4 = Setenterprise3.getEmployeeDirectory().createEmployee("Peter");
        UserAccount account4 = Setenterprise3.getUserAccountDirectory().createUserAccount("HardWareAdmin", "HardWareAdmin", admin4, new AdminRole());
        
        //initialize some organizations
        Setenterprise1.getOrganizationDirectory().createOrganization(Organization.Type.Hr);
        Setenterprise1.getOrganizationDirectory().createOrganization(Organization.Type.MarketSaler);
        Setenterprise1.getOrganizationDirectory().createOrganization(Organization.Type.Purchasing);
        Setenterprise2.getOrganizationDirectory().createOrganization(Organization.Type.Hr);
        Setenterprise2.getOrganizationDirectory().createOrganization(Organization.Type.MarketSaler);
        Setenterprise2.getOrganizationDirectory().createOrganization(Organization.Type.Purchasing);
        Setenterprise3.getOrganizationDirectory().createOrganization(Organization.Type.FactorySaler);
        Setenterprise3.getOrganizationDirectory().createOrganization(Organization.Type.Production);
        Setenterprise4.getOrganizationDirectory().createOrganization(Organization.Type.FactorySaler);
        Setenterprise4.getOrganizationDirectory().createOrganization(Organization.Type.Production);
        //have some employees and user accounts
        for(Organization organization:Setenterprise1.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof HrOrganization) {
                Employee employee1 = organization.getEmployeeDirectory().createEmployee("Joy");
                //organization.getEmployeeDirectory().getEmployeeList().add(employee1);
                organization.getUserAccountDirectory().createUserAccount("WalmartHr1", "WalmartHr1", employee1, new HrRole());
            }
        }
        for(Organization organization:Setenterprise1.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof MarketSalerOrganization) {
                Employee employee2 = organization.getEmployeeDirectory().createEmployee("Kelly");
                //organization.getEmployeeDirectory().getEmployeeList().add(employee2);
                organization.getUserAccountDirectory().createUserAccount("WalmartMarketSaler1", "WalmartMarketSaler1", employee2, new MarketSalerRole());
            }
        }
        for(Organization organization:Setenterprise1.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof PurchasingOrganization) {
                Employee employee3 = organization.getEmployeeDirectory().createEmployee("Ken");
                //organization.getEmployeeDirectory().getEmployeeList().add(employee3);
                organization.getUserAccountDirectory().createUserAccount("WalmartPurchasing1", "WalmartPurchasing1", employee3, new PurchasingRole());
            }
        }
        for(Organization organization:Setenterprise2.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof HrOrganization) {
                Employee employee4 = organization.getEmployeeDirectory().createEmployee("Nancy");
                //organization.getEmployeeDirectory().getEmployeeList().add(employee4);
                organization.getUserAccountDirectory().createUserAccount("TargetHr1", "TargetHr1", employee4, new HrRole());
            }
        }
        for(Organization organization:Setenterprise2.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof MarketSalerOrganization) {
                Employee employee5 = organization.getEmployeeDirectory().createEmployee("Rachel");
                //organization.getEmployeeDirectory().getEmployeeList().add(employee5);
                organization.getUserAccountDirectory().createUserAccount("TargetSaler1", "TargetMarketSaler1", employee5, new MarketSalerRole());
            }
        }
        for(Organization organization:Setenterprise2.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof PurchasingOrganization) {
                Employee employee6 = organization.getEmployeeDirectory().createEmployee("Sarah");
                //organization.getEmployeeDirectory().getEmployeeList().add(employee6);
                organization .getUserAccountDirectory().createUserAccount("TargetPurchasing1", "TargetPurchasing1", employee6, new PurchasingRole());
            }
        }
        for(Organization organization:Setenterprise3.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof FactorySalerOrganization) {
                Employee employee7 = organization.getEmployeeDirectory().createEmployee("Tina");
                //organization.getEmployeeDirectory().getEmployeeList().add(employee7);
                organization.getUserAccountDirectory().createUserAccount("KelloggFactorySaler1", "KelloggFactorySaler1", employee7, new FactorySalerRole());
            }
        }
        for(Organization organization:Setenterprise3.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof ProductionOrganization) {
                Employee employee8 = organization.getEmployeeDirectory().createEmployee("Zoey");
                //organization.getEmployeeDirectory().getEmployeeList().add(employee8);
                organization.getUserAccountDirectory().createUserAccount("KelloggProduction1", "KelloggProduction1", employee8, new ProductionRole());
            }
        }
        for(Organization organization:Setenterprise4.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof FactorySalerOrganization) {
                Employee employee9 = organization.getEmployeeDirectory().createEmployee("Jack");
                //organization.getEmployeeDirectory().getEmployeeList().add(employee7);
                organization.getUserAccountDirectory().createUserAccount("HardWareFactorySaler1", "HardWareFactorySaler1", employee9, new FactorySalerRole());
            }
        }
        for(Organization organization:Setenterprise4.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof ProductionOrganization) {
                Employee employee10 = organization.getEmployeeDirectory().createEmployee("Rose");
                //organization.getEmployeeDirectory().getEmployeeList().add(employee8);
                organization.getUserAccountDirectory().createUserAccount("HardWareProduction1", "HardWareProduction1", employee10, new ProductionRole());
            }
        }
        Employee employee = system.getEmployeeDirectory().createEmployee("aa");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("aa", "aa", employee, new SystemAdminRole());
        return system;
    }
    
}
