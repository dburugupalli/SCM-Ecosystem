/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class Product {
    
    private String productId ;
    private String productName;
    private int productPrice;
    private String productCategory;
    private Date Mfd_Date;
    private int quantity;
    private String qualityChecktatus;
    private static int counter = 1;
    private int currentcount;

    private double minLimit;
    private double maxLimit;

    public double getMinLimit() {
        return minLimit;
    }

    public void setMinLimit(double minLimit) {
        this.minLimit = minLimit;
    }

    public double getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(double maxLimit) {
        this.maxLimit = maxLimit;
    }


    private int maxInventoryLimit;
    private int minInventoryLimit;
    public int getCurrentcount() {
        return currentcount;
    }
    public int getMaxInventoryLimit() {
        maxInventoryLimit = 10; // default;
        return maxInventoryLimit;
    }

    public void setMaxInventoryLimit(int maxInventoryLimit) {
        
        this.maxInventoryLimit = maxInventoryLimit;
    }

    public int getMinInventoryLimit() {
        minInventoryLimit = 5; 
        return minInventoryLimit;
    }

    public void setMinInventoryLimit(int minInventoryLimit) {
        this.minInventoryLimit = minInventoryLimit;
    }
    public void setCurrentcount(int currentcount) {
        this.currentcount = currentcount;
    }
    

    public Product() {
      
      // this.productId = "prod"+currentcount;
       Mfd_Date = new Date();
       
        
    }

    

    public Date getMfd_Date() {
        return Mfd_Date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Product.counter = counter;
    }
    
    
  
    
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQualityChecktatus() {
        return qualityChecktatus;
    }

    public void setQualityChecktatus(String qualityChecktatus) {
        this.qualityChecktatus = qualityChecktatus;
    }
    

    @Override
    public String toString() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
    
    
}
