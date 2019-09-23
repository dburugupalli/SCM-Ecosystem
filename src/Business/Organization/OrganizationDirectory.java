/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.QualityDepartment.getValue())){
            organization = new QualityDepartment();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ProductDepartment.getValue())){
            organization = new ProductDepartment();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SalesDepartment.getValue())){
            organization = new SalesDepartment();
            organizationList.add(organization);
        }
        return organization;
    }
}