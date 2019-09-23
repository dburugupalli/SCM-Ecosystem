/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Wholesaler;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Manufacture;
import static Business.Enterprise.Enterprise.EnterpriseType.WholeSaler;
import Business.Network.Network;
import Business.Order;
import Business.OrdersDirectory;
import Business.Organization.Organization;
import Business.Product.Product;
import Business.Product.ProductList;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.ManageNetworkJPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import Business.Organization.ProductDepartment;
import Business.Organization.SalesDepartment;

import java.util.Random;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderWorkRequest;

/**
 *
 * @author Dell
 */
public class WholeSalerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WholeSalerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    //EcoSystem ecosystem;
    ProductList productList;
    Enterprise enterprise;
    ProductDepartment proddept;
    OrdersDirectory orders;
    UserAccount userAccount;
   // private OrdersDirectory orders;
    EcoSystem system;
    public WholeSalerWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount, Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = userAccount;
        
         populateNetworkComboBox();
         
        
        valueLabel.setText(enterprise.getName());
        System.out.println(system.getNetworkList()+"----");
        //System.out.println(system.getNetworkList().get(0).getorderDirectory()+"--network--");
        orders = new OrdersDirectory();
        //System.out.println(orders);

       //  populateProductNameComboBox();
       // populatepriceComboBox();
       
       
       
    }
    
    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
    public void populateEnterpriseComboBox(Network network){
        
        
        
        if(network!=null){
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            
                System.out.println("Enterprise"+enterprise);
               
                if(enterprise.getEnterpriseType()== Manufacture){
                     enterpriseJComboBox.addItem(enterprise);
                    for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
                        if(org instanceof ProductDepartment){
                            System.out.println(((ProductDepartment) org).getProdList().getProductList());
                        }
                    }
                }
        }
            
        
        }
    
    }
    
  
    
   
    
    
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productNameComboBox = new javax.swing.JComboBox();
        txtProductName = new javax.swing.JLabel();
        btnCreateOrder = new javax.swing.JButton();
        txtQuant = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnOrderQ = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        txtPrice = new javax.swing.JTextField();

        productNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameComboBoxActionPerformed(evt);
            }
        });

        txtProductName.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        txtProductName.setText("Product Name");

        btnCreateOrder.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btnCreateOrder.setText("Create Order");
        btnCreateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOrderActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel1.setText("Quantity");

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel2.setText("WholeSaler Work Area");

        btnOrderQ.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btnOrderQ.setText("Order Queue");
        btnOrderQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderQActionPerformed(evt);
            }
        });

        lblPrice.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        lblPrice.setText("Price");

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel3.setText("Network");

        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel4.setText("Enterprise");

        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProductName)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(348, 348, 348)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(productNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnOrderQ, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnCreateOrder)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(networkJComboBox))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(productNameComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrderQ, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(207, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOrderActionPerformed
        // TODO add your handling code here:
       
          String name = productNameComboBox.getSelectedItem().toString();
          
          Product prod = (Product)productNameComboBox.getSelectedItem();
          
          
         int quantity = Integer.parseInt(txtQuant.getText());
         String placedby = valueLabel.getText();
         //System.out.println(orders.getOrderList());
         Order order = orders.addnewOrder();
         order.setProductName(name);
         order.setQuantity(quantity);
         order.setPlacedBy(placedby);
         order.setPrice(prod.getProductPrice()*(Integer.parseInt(txtQuant.getText())));
         Random rand = new Random();
         int lt = rand.nextInt(5);
         order.setLeadTime(lt);
         int ss = rand.nextInt(3);
         order.setSafetyStock(ss);
         system.getNetworkList().get(0).getOrderDirectory().getOrderList().add(order);
         System.out.println(orders);
         
         
         
         WholesalerProcessRequestJPanel whlslrprjp=new WholesalerProcessRequestJPanel(userProcessContainer, system,orders);
      userProcessContainer.add("WholeSalerProcessRequestJPanel",whlslrprjp);
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
      layout.next(userProcessContainer);
      
      
      OrderWorkRequest orderRequest = new OrderWorkRequest();
      
      orderRequest.setSender(userAccount);
        System.out.println(orderRequest.getSender()+"-----Order");
      orderRequest.setProd(prod);
        System.out.println(orderRequest.getProdId());
      orderRequest.setProdId(prod.getProductId());
      orderRequest.setOrderStatus("Order Placed");
      orderRequest.setMessage("Order placed for"+order.getProductName()+"quantity -"+order.getQuantity());
      enterprise.getOrderQ().getorderworkRequestList().add(orderRequest);
        System.out.println(enterprise.getOrderQ().getorderworkRequestList().add(orderRequest));
      
      
      Network network = (Network)networkJComboBox.getSelectedItem();
      Enterprise ent = (Enterprise)enterpriseJComboBox.getSelectedItem();
       // Organization org = (Organization)orgComboBox.getSelectedItem();

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

            if (enterprise.equals(ent)) {
                ent.getOrderQ().getorderworkRequestList().add(orderRequest);

               
                            
                            
               System.out.println(ent.getOrderQ().getorderworkRequestList().add(orderRequest));
                            
                            
                        }
                    
                }
            
        
      
      
      
      
      



    }//GEN-LAST:event_btnCreateOrderActionPerformed

    private void btnOrderQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderQActionPerformed
        // TODO add your handling code here:
        
        OrderQueueJPanel orjp=new OrderQueueJPanel(userProcessContainer, system,enterprise);
        userProcessContainer.add("OrderQueueJPanel",orjp);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOrderQActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        // TODO add your handling code here:
       productNameComboBox.removeAllItems();
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        System.out.println("Enterprise ---"+enterprise);
         if(enterprise.getEnterpriseType() == Manufacture ){
            for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList()){
                System.out.println(org+"---");
                if(org instanceof ProductDepartment){
                    for(Product prod : ((ProductDepartment) org).getProdList().getProductList()){
                        productNameComboBox.addItem(prod);
                        
                        System.out.println(prod);
                    }
                }
            }
        }
         
        //System.out.println(enterprise.getOrganizationDirectory()+"EnterpriseType");
       
        
        
        
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
        
        
       
         
         Network network = (Network) networkJComboBox.getSelectedItem();
          enterpriseJComboBox.removeAllItems();
         
         System.out.println(system.getNetworkList()+"--network");
        
            populateEnterpriseComboBox(network);
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            
                System.out.println("Enterprise"+enterprise);
        }
            
                
                
            
           
        
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void productNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameComboBoxActionPerformed
        // TODO add your handling code here:
        Product prod = (Product)productNameComboBox.getSelectedItem();
        txtPrice.setText(String.valueOf(prod.getProductPrice()));
    }//GEN-LAST:event_productNameComboBoxActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateOrder;
    private javax.swing.JButton btnOrderQ;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JComboBox productNameComboBox;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JLabel txtProductName;
    private javax.swing.JTextField txtQuant;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
