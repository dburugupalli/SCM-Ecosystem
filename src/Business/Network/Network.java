/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.OrdersDirectory;
import Business.SupplyOrderDirectory;
import Business.WorkQueue.OrderQueue;

/**
 *
 * @author MyPC1
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private OrdersDirectory orderDirectory;
    //private OrderQueue orderQ;

    private static int counter;

    private SupplyOrderDirectory supplyorderDirectry;

    
    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int count) {
        counter = count;
    }
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
        orderDirectory = new OrdersDirectory();
        supplyorderDirectry = new SupplyOrderDirectory();
      //  orderQ = new OrderQueue();
       
    }

//    public OrderQueue getOrderQ() {
//        return orderQ;
//    }

//    public void setOrderQ(OrderQueue orderQ) {
//        this.orderQ = orderQ;
//    }
    

    public SupplyOrderDirectory getSupplyorderDirectry() {
        return supplyorderDirectry;
    }

    public void setSupplyorderDirectry(SupplyOrderDirectory supplyorderDirectry) {
        this.supplyorderDirectry = supplyorderDirectry;
    }
    

    public OrdersDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrdersDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    

    
    
    
    @Override
    public String toString(){
        return name;
    }
    
}
