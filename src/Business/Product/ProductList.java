/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;


import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.ProductDepartment;
import Business.ProductCategory.ProductCategory;
import Business.Product.Product;


import java.util.ArrayList;

/**
 *
 * @author B D Sai Santosh
 */
public class ProductList {

   
    private ArrayList<Product> productList;
    
    
     public ProductList() {
         productList = new ArrayList<Product>();
        //this.productList = productList;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public Product createProduct(String name,int price,int quantity,String category,String status,String prodId){
        

        //Product product = new Product();
        Product product = new Product();
        //String prid=generatepid();
        
        product.setProductName(name);
        product.setProductPrice(price);
        product.setQuantity(quantity);
        product.setProductCategory(category);
        product.setQualityChecktatus(status);
       product.setProductId(prodId);
        //product.setProductName(productName);
        productList.add(product);
        return product;
    }

        
        
    
    public void removeCategory(String productId){
        
        Product product = null;
        for(Product p:productList){
            if(p != null && p.getProductId() == productId){
                product = p;
            }
        }
        if(product !=null){
            productList.remove(product);
        }
    
    }
  
}
