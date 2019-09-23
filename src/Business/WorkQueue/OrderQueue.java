/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class OrderQueue {
    
    private ArrayList<OrderWorkRequest> orderworkRequestList;

    public OrderQueue() {
        orderworkRequestList = new ArrayList();
    }

    public ArrayList<OrderWorkRequest> getorderworkRequestList() {
        return orderworkRequestList;
    }
    
}
