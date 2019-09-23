/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiner.SupplierProducts;

import java.util.Date;

/**
 *
 * @author B D Sai Santosh
 */
public class supplierProducts {
        
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

    public Date getMfd_Date() {
        return Mfd_Date;
    }

    public void setMfd_Date(Date Mfd_Date) {
        this.Mfd_Date = Mfd_Date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getQualityChecktatus() {
        return qualityChecktatus;
    }

    public void setQualityChecktatus(String qualityChecktatus) {
        this.qualityChecktatus = qualityChecktatus;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        supplierProducts.counter = counter;
    }

    public int getCurrentcount() {
        return currentcount;
    }

    public void setCurrentcount(int currentcount) {
        this.currentcount = currentcount;
    }

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

}
