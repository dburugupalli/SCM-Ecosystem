 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Product.ProductList;
import Business.WorkQueue.OrderQueue;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
   // private ProductList prodlist;
    private OrderQueue orderQ;
   

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

   
    
    public enum EnterpriseType{
        Manufacture("Manufacture"),
        Supplier("Supplier"),
        WholeSaler("wholesaler");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        orderQ = new OrderQueue();
        //prodlist = new ProductList();
       
    }
    
    

//    public ProductList getProdlist() {
//        return prodlist;
//    }

    public OrderQueue getOrderQ() {
        return orderQ;
    }

    public void setOrderQ(OrderQueue orderQ) {
        this.orderQ = orderQ;
    }
    
}
