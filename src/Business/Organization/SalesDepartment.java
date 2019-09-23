/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SalesManager;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class SalesDepartment extends Organization{
    
    public SalesDepartment() {
        super(Organization.Type.SalesDepartment.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SalesManager());
        return roles;
    }
    
}
