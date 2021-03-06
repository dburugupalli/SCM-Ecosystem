/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.QualityAnalystRole;



import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Manufacture;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.ProductDepartment;
import Business.Organization.QualityDepartment;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProductTestRequest;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class ProcessRequestToAnotherNetworkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessRequestToAnotherNetworkJPanel
     */
    
    private JPanel userProcessContainer;
    private QualityDepartment organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private ProductDepartment dept;
    private EcoSystem system;
    public ProcessRequestToAnotherNetworkJPanel(JPanel userProcessContainer,UserAccount userAccount,QualityDepartment organization,Enterprise enterprise,EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.system = system;
        populateNetworkComboBox();
    }
    
     private void populateNetworkComboBox(){
        networkComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkComboBox.addItem(network);
        }
    }
    
    public void populateEnterpriseComboBox(Network network){
        
        
        
        if(network!=null){
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            
                System.out.println("Enterprise"+enterprise);
                enterpriseComboBox.addItem(enterprise);
                if(enterprise.getEnterpriseType()== Manufacture){
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

        jLabel12 = new javax.swing.JLabel();
        networkComboBox = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        enterpriseComboBox = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        orgComboBox = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel12.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel12.setText("Network");

        networkComboBox.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        networkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboBoxActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel13.setText("Enterprise");

        enterpriseComboBox.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        enterpriseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseComboBoxActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel14.setText("Organization");

        orgComboBox.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel10.setText("Comments");

        txtMessage.setColumns(20);
        txtMessage.setFont(new java.awt.Font("Gabriola", 1, 14)); // NOI18N
        txtMessage.setRows(5);
        jScrollPane2.setViewportView(txtMessage);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 36)); // NOI18N
        jLabel1.setText("Process Request To Another Network");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(49, 49, 49)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(networkComboBox, 0, 103, Short.MAX_VALUE)
                                        .addComponent(enterpriseComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(orgComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(btnSubmit))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1)))
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(networkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnSubmit)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkComboBoxActionPerformed
        // TODO add your handling code here:
       
        Network network = (Network) networkComboBox.getSelectedItem();

        System.out.println(system.getNetworkList()+"--network");

        

        populateEnterpriseComboBox(network);
    }//GEN-LAST:event_networkComboBoxActionPerformed

    private void enterpriseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseComboBoxActionPerformed
        // TODO add your handling code here:
        orgComboBox.removeAllItems();
        Enterprise enterprise = (Enterprise) enterpriseComboBox.getSelectedItem();
        
        for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
            orgComboBox.addItem(org);
        }
        
        
    }//GEN-LAST:event_enterpriseComboBoxActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        ProductTestRequest request = new ProductTestRequest();
        request.setMessage(txtMessage.getText());
        
        
        Network network = (Network)networkComboBox.getSelectedItem();
        Enterprise ent = (Enterprise)enterpriseComboBox.getSelectedItem();
        Organization org = (Organization)orgComboBox.getSelectedItem();

for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
            
           
                if(enterprise.equals(ent)){
                    
                    
                    for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                        
                        if(organization.equals(org)){
                            
                            System.out.println(organization);
                        if (organization instanceof QualityDepartment) {
                            request.setSender(userAccount);
                            
                            organization.getWorkQueue().getWorkRequestList().add(request);
                            userAccount.getWorkQueue().getWorkRequestList().add(request);
                            
                            
                            
                            
                        }
                        
                        
                        }
                    }
                }
                        }
        
        
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox enterpriseComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox networkComboBox;
    private javax.swing.JComboBox orgComboBox;
    private javax.swing.JTextArea txtMessage;
    // End of variables declaration//GEN-END:variables
}
