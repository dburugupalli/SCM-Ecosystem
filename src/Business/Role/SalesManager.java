/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.SalesDepartment;
import Business.Organization.QualityDepartment;
import Business.Organization.SalesDepartment;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SalesManager.SalesManagerWorkAreaJPanel;

/**
 *
 * @author Dell
 */
public class SalesManager extends Role{
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SalesManagerWorkAreaJPanel(userProcessContainer, account, (SalesDepartment)organization, enterprise,business);
    }
    
}
