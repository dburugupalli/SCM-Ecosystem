/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class OrdersDirectory {
    
    private ArrayList<Order> orderList;
    
    public OrdersDirectory()
    {
       orderList = new ArrayList<Order>(); 
    }
    
    public Order addnewOrder(){
        Order newOrder = new Order();
       
        orderList.add(newOrder);
        return newOrder;
    }
    
    

    /**
     * @return the orderDirectory
     */
    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    /**
     * @param orderDirectory the orderDirectory to set
     */
    public void setOrderDirectory(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
}
