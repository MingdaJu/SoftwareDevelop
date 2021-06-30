/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ProductionRole;

import Business.Enterprise.Enterprise;
import Business.Organization.FactorySalerOrganization;
import Business.Organization.ProductionOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MarketToFactoryRequest;
import Business.WorkQueue.SalerToProductionRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.FactorySalerRole.ProcessWorkRequestJpanel;

/**
 *
 * @author jumin
 */
public class ProductionWorkAreaJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ProductionWorkAreaJpanel
     */
    private JPanel userProcessContainer;
    private ProductionOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;

    public ProductionWorkAreaJpanel(JPanel userProcessContainer, UserAccount account, ProductionOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        populateRequestTable();
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
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Product ID", "Number", "Sender", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(348, 348, 348)
                            .addComponent(refreshJButton))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addComponent(assignJButton)
                            .addGap(132, 132, 132)
                            .addComponent(processJButton)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(refreshJButton)
                    .addGap(7, 7, 7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(assignJButton)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(processJButton)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }

        Object id = workRequestJTable.getValueAt(selectedRow, 0);
        int idd = Integer.parseInt(id.toString());
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            if (request.getRequestID() == idd) {
                if (request.getReceiver()!=null) {
                    JOptionPane.showMessageDialog(null, "You have assigned this request!");
                    return;
                }

                request.setReceiver(userAccount);
                //System.out.println(account);
                request.setStatus("Pending");

            }
        }
        populateRequestTable();


    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
        Object id = workRequestJTable.getValueAt(selectedRow, 0);
        int idd = Integer.parseInt(id.toString());
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            if (request.getRequestID() == idd) {
                if (request.getReceiver() == null) {
                    JOptionPane.showMessageDialog(null, "You haven't assign this request!");
                    return;
                }
                if (request.getStatus().equals("Completed")) {
                    JOptionPane.showMessageDialog(null, "You have been processed this request!");
                    return;
                }
                request.setStatus("Processing");
                ProcessWorkRequestJPanel ProcessWorkRequestJpanel = new ProcessWorkRequestJPanel(userProcessContainer, (SalerToProductionRequest) request);
                userProcessContainer.add("processWorkRequestJPanel", ProcessWorkRequestJpanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }

        }

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed

    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    void populateRequestTable() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {

            if (request.getTag() != null && request.getTag().equals("SalerToProduction")) {

                Object[] row = new Object[7];
                int requestID = ((SalerToProductionRequest) request).getRequestID();
                row[0] = requestID;
                String productID = ((SalerToProductionRequest) request).getProductID();
                row[1] = productID;
                String number = ((SalerToProductionRequest) request).getNumber();
                row[2] = number;
                row[3] = request.getSender();
                row[4] = request.getReceiver();
                row[5] = request.getStatus();
                String result = ((SalerToProductionRequest) request).getResult();
                row[6] = result == null ? "Waiting" : result;

                model.addRow(row);
            }
        }
    }
}