/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import Business.Role.LabAssistantRole;
import Business.Product.ProductList;
import Business.Role.ProductManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class ProductDepartment extends Organization{
    
    private ProductList prodList;

    public ProductDepartment() {
        super(Organization.Type.ProductDepartment.getValue());
        prodList = new ProductList();
    }

    public void setProdList(ProductList prodList) {
        this.prodList = prodList;
    }

    public ProductList getProdList() {
        return prodList;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ProductManager());
        return roles;
    }
     
   
    
    
}
