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
public class SupplyOrderDirectory {
    
    private ArrayList<Order> supplyorderList;
    
    public SupplyOrderDirectory()
    {
       supplyorderList = new ArrayList<Order>(); 
    }
    
    public Order addnewOrder(){
        Order newOrder = new Order();
       
        supplyorderList.add(newOrder);
        return newOrder;
    }
    
    

    /**
     * @return the orderDirectory
     */
    public ArrayList<Order> getsupplyorderList() {
        return supplyorderList;
    }

    /**
     * @param orderDirectory the orderDirectory to set
     */
    public void setsupplyorderList(ArrayList<Order> supplyorderList) {
        this.supplyorderList = supplyorderList;
    }
    
}
