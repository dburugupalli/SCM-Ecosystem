/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Product.Product;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class OrderWorkRequest extends WorkRequest {
    private String orderStatus;
    private Product prod;
    private String prodId;
    private int quant;
   

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Product getProd() {
        return prod;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }

    public int getQuant() {
        return quant;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }
    
    


    
    
    
   
    
}
