/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Product.ProductList;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class Manufacture extends Enterprise {
    
     //private ProductList prodList;
    
    public Manufacture(String name){
        super(name,EnterpriseType.Manufacture);
        //prodList = new ProductList();
    }

//    public ProductList getProdList() {
//        return prodList;
//    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
