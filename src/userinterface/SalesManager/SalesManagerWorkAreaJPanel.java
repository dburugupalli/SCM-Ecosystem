/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SalesManager;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Order;
import Business.OrdersDirectory;
import Business.Organization.Organization;
import Business.Organization.ProductDepartment;
import Business.Organization.QualityDepartment;
import Business.Organization.SalesDepartment;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProductTestRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.BasicStroke;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Dell
 */
public class SalesManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SalesManagerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private SalesDepartment organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private ProductDepartment dept;
    private EcoSystem system;
    public SalesManagerWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount,SalesDepartment organization,Enterprise enterprise,EcoSystem system) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.system = system;

        populateProductTable();
        populateOrderTable();
        populateSalesRequestTable();
        populateComboBox();
    }
public void populateComboBox(){
        prodListComboBox.removeAllItems();
        
        //System.out.println(proddept.getProdList().getProductList().toString());
        
        
        System.out.println(system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList());
         
         
         for(Enterprise enterprise: system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()){
             
             System.out.println(enterprise.getOrganizationDirectory().getOrganizationList()+"-----");
                       for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
              
              System.out.println(organization);
            if(organization instanceof ProductDepartment){
                for(Product prod:((ProductDepartment) organization).getProdList().getProductList()){
                    //System.out.println(prod.toString());
                     System.out.println(prod.toString());
            
                    prodListComboBox.addItem(prod.getProductName());
                }
            }
        }
         
        }
  
    
    }
    
    public void populateProductTable(){
        
         DefaultTableModel model = (DefaultTableModel) tblProductList.getModel();
         model.setRowCount(0);
         System.out.println("retriev");
         //System.out.println(system.getNetworkList().get(0).getorderDirectory()+"-1-");
         
        // System.out.println(system.getNetworkList().get(0).getorderDirectory().getOrderList()+"-2-");
         
         
         for(Enterprise enterprise: system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()){
                      System.out.println(enterprise.getOrganizationDirectory().getOrganizationList()+"-----");
         
          for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
              
              System.out.println(organization);
            if(organization instanceof ProductDepartment){
                for(Product prod:((ProductDepartment) organization).getProdList().getProductList()){
                    //System.out.println(prod.toString());
                    
                Object[] row = new Object[7];
                row[0] = prod.getProductId();
                row[1] = prod.getProductName();
                row[2] = prod.getProductPrice();
                row[3] = prod.getProductCategory();
                row[4] = prod.getQuantity();
                row[5] = prod.getMfd_Date();
                row[6] = prod.getQualityChecktatus();
                 model.addRow(row);
                  
                    
                }
            }
        }
         
         
         }
         
      }
    public void populateSalesRequestTable(){
      DefaultTableModel model = (DefaultTableModel) workSalesRequestJTable.getModel();
      
        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
              System.out.println(request.toString());
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            row[4] = request.getMessage();

            model.addRow(row);
        }
    
    }
    public void populateOrderTable(){
        
        DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
        
        model.setRowCount(0);
       
        System.out.println(system.getNetworkList().get(0).getOrderDirectory()+"---");
        
        for(Order o :system.getNetworkList().get(0).getOrderDirectory().getOrderList()){
            

            System.out.println(o+"-----");

             System.out.println(o.toString()+"-----");
            Object[] row = new Object[9];
            row[0] = o.getOrderId();
            row[1] = o.getProductName();
            row[2] = o.getPrice();
            row[4] = o.getPrice()*o.getQuantity();
            row[3] = o.getQuantity();
            row[5] = o.getPlacedBy();
            row[6] = o.getAssigned_to();
            row[7] = o.getOrderDate();
            row[8] = o.getStatus();
            
            model.addRow(row);
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductList = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        lineGraphButton = new javax.swing.JButton();
        barGraphButton = new javax.swing.JButton();
        limitButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        workSalesRequestJTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        prodListComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        tblProductList.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        tblProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Product Id", "Product Name", "Unit Price", "category", "quantity", "Mfg Date", "Quality Check Status"
            }
        ));
        tblProductList.setRowHeight(24);
        jScrollPane1.setViewportView(tblProductList);

        tblOrder.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "OrderId", "Product Name", "Price per Unit", "Quantity", "Total price", "created by", "assigned_to", "created date", "date_updated"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrder.setRowHeight(24);
        jScrollPane2.setViewportView(tblOrder);

        lineGraphButton.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        lineGraphButton.setText("Product vs sales graph");
        lineGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineGraphButtonActionPerformed(evt);
            }
        });

        barGraphButton.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        barGraphButton.setText("Bar Graph");
        barGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barGraphButtonActionPerformed(evt);
            }
        });

        limitButton.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        limitButton.setText("MAX/MIN Inventory Limits ");
        limitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limitButtonActionPerformed(evt);
            }
        });

        workSalesRequestJTable.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        workSalesRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Last Updated", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workSalesRequestJTable.setRowHeight(24);
        jScrollPane3.setViewportView(workSalesRequestJTable);

        jButton2.setText("AssignMe");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        prodListComboBox.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        prodListComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        prodListComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodListComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Product Inventory Table");

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 36)); // NOI18N
        jLabel2.setText("Sales Manager");

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Orders Table");

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel4.setText("Select the Product");

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel5.setText("Sold vs Avalable Products");

        jLabel6.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel6.setText("Last Four Sales Report");

        jLabel8.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setText("Sales Work Request Table");

        jButton1.setText("Sell");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel7.setText("Min and Max Inventory Limit");

        jButton3.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jButton3.setText("OrderQ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btnBack.setText("<<back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton3)
                        .addGap(214, 214, 214)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnBack)
                        .addGap(223, 223, 223)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(barGraphButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4)
                                .addGap(61, 61, 61)
                                .addComponent(prodListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lineGraphButton)
                            .addComponent(limitButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(31, 31, 31)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnBack)))
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jButton3))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(prodListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lineGraphButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(barGraphButton)
                    .addComponent(jLabel7)
                    .addComponent(limitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lineGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
           try {
                              XYDataset dataset ;

            dataset = createDataset();
                JFreeChart chart = ChartFactory.createXYLineChart( "Prodcut Quantities for the last four months", 
                "Month", 
                "Units sold", 
                dataset, 
                PlotOrientation.VERTICAL,
                true, 
                true, 
                false );
    
//    BarRenderer renderer= null;
//    renderer = new BarRenderer();
    ChartFrame  frame = new ChartFrame("Average Salary vs Age",chart);
            XYPlot plot = chart.getXYPlot();

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));
        

        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.white);

        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);
        
        plot.setRangeCrosshairValue(5d);
        plot.setDomainCrosshairValue(5d);
        
//        ValueAxis rangeAxis = chart.getCategoryPlot().getRangeAxis();
//        rangeAxis.setMaximumCategoryLabelWidthRatio(2);
        
      //  chart.getLegend().setFrame(BlockBorder.NONE);

        chart.setTitle(new TextTitle("Product sales for last 4 months",
                        new Font("Serif", java.awt.Font.BOLD, 18)
                )
        );
    
    frame.setVisible(true);
    frame.setSize(1000,850);
        } catch (IOException ex) {
            Logger.getLogger(SalesManagerWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }                                             
    
        private XYDataset createDataset() throws IOException {
              String prodname = prodListComboBox.getSelectedItem().toString();
        XYSeries series = new XYSeries(prodname);
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
       
            int qty = 0;
            for(Order o1 :system.getNetworkList().get(0).getOrderDirectory().getOrderList()){
                if(prodname.equalsIgnoreCase(o1.getProductName())){
                    qty =qty+o1.getQuantity();
                }
            
            hmap.put(05,qty);
        }
            
        for(int i=4;i>=1;i--){
            qty  = (int) (Math.random() * (100-20)) + 20;
            hmap.put(i,qty);
        }
        
                    Iterator entries = hmap.entrySet().iterator();
                    while (entries.hasNext()) {
                    HashMap.Entry entry = (HashMap.Entry) entries.next();
                    Integer key = (Integer)entry.getKey();
                    Integer value = (Integer)entry.getValue();
                    series.add(key,value);
                    
                    }
//        series.add(18, 567);
//        series.add(20, 1750);
//        series.add(22,1600);
//        series.add(25, 1000);
//        series.add(30, 1100);
//        series.add(35,950);
//        series.add(40, 1005);
//        series.add(45,950);
//        series.add(50, 930);
//
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        return dataset;
    }
        
        
   

     
    private void barGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barGraphButtonActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        
        //map create on productname(key) for orderstable
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        for(Order o :system.getNetworkList().get(0).getOrderDirectory().getOrderList()){
            String pname = o.getProductName();
            int qty = 0;
            for(Order o1 :system.getNetworkList().get(0).getOrderDirectory().getOrderList()){
                if(pname.equalsIgnoreCase(o1.getProductName())){
                    qty =qty+o1.getQuantity();
                }
            }
            hmap.put(pname,qty);
        }
        
          for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof ProductDepartment){
                for(Product prod:((ProductDepartment) organization).getProdList().getProductList()){
                    int qtysold = 0;
                   
                    Iterator entries = hmap.entrySet().iterator();
                    while (entries.hasNext()) {
                    HashMap.Entry entry = (HashMap.Entry) entries.next();
                    String key = (String)entry.getKey();
                    
                    if(key.equalsIgnoreCase(prod.getProductName())){
                    Integer value = (Integer)entry.getValue();
                    data.setValue(value, "Quantity sold", key);
                    data.setValue(prod.getQuantity(), "Quantity Avaialable", prod.getProductName());
                    }
                    
                    }
        }
        //data.setValue(25,"Quantity sold","p1");
//        data.setValue(20,"Quantity available","p1");
//        data.setValue(35,"Quantity sold","p2");
//        data.setValue(10,"Quantity available","p2");
//        data.setValue(05,"Quantity sold","p3");
//        data.setValue(25,"Quantity available","p3");
        }
        
    }//GEN-LAST:event_barGraphButtonActionPerformed
     JFreeChart jchart = ChartFactory .createBarChart3D("Product quantities", "product name", "Quantity", data, PlotOrientation.VERTICAL, true, true, true);
        
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        plot.setBackgroundPaint(Color.WHITE);
        ChartFrame chfm = new ChartFrame("Product Quantities", jchart,true);
        chfm.setVisible(true);
        chfm.setSize(1000, 800);
    }
    private void limitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limitButtonActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset data = new DefaultCategoryDataset();
          for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof ProductDepartment){
                for(Product prod:((ProductDepartment) organization).getProdList().getProductList()){
                   int min=0;
                   int max=0;
                   int count=1;
                   
                   for(Order o :system.getNetworkList().get(0).getOrderDirectory().getOrderList()){
                       if(prod.getProductName().equalsIgnoreCase(o.getProductName())){
                       min=min+((o.getLeadTime()+o.getSafetyStock())*prod.getQuantity());
                       max=max+(min+(min/2))*prod.getQuantity();
                       count=count+1;
                   }
                   }
                  min=(min/count);
                  max=(max/count);
                   prod.setMinLimit(min);
                   prod.setMaxLimit(max);
                   data.setValue(min, "Minimum Inventory LImit", prod.getProductName());
                   data.setValue(max, "Maximum Inventory LImit", prod.getProductName());
                }
            }
        }
        JFreeChart jchart = ChartFactory .createBarChart3D("Product quantities", "product name", "Quantity", data, PlotOrientation.VERTICAL, true, true, true);
        
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        plot.setBackgroundPaint(Color.WHITE);
        ChartFrame chfm = new ChartFrame("Inventory Limits of Products", jchart,true);
        chfm.setVisible(true);
        chfm.setSize(1000, 800);
    }//GEN-LAST:event_limitButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRow = workSalesRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }
        WorkRequest request = (WorkRequest) workSalesRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Sales  Analysis in Process");
        populateSalesRequestTable();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void prodListComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodListComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodListComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = workSalesRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }
        WorkRequest request = (WorkRequest) workSalesRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Added to DB & Completed");
        populateSalesRequestTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
         OrderQueueJPanel orjp=new OrderQueueJPanel(userProcessContainer, system,enterprise,userAccount);
        userProcessContainer.add("OrderQueueJPanel",orjp);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed
     
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton barGraphButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton limitButton;
    private javax.swing.JButton lineGraphButton;
    private javax.swing.JComboBox prodListComboBox;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblProductList;
    private javax.swing.JTable workSalesRequestJTable;
    // End of variables declaration//GEN-END:variables
}
