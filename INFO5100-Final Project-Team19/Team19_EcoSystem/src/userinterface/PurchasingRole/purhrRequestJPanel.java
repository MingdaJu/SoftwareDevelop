/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PurchasingRole;

import Business.Enterprise.Enterprise;
import Business.Organization.HrOrganization;
import Business.Organization.Organization;
import Business.Organization.PurchasingOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;

import Business.WorkQueue.salerToHrRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jumin
 */
public class purhrRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form purhrRequestJPanel
     */
    private JPanel userProcessContainer;
    private PurchasingOrganization organization;
    private Enterprise enterprise;
    private UserAccount account;

    public purhrRequestJPanel(JPanel userProcessContainer, UserAccount account, PurchasingOrganization organization, Enterprise enterprise) {
        initComponents();
        hrJComboBox.addItem("Apply Promotion");
        hrJComboBox.addItem("Apply Resignation");
        hrJComboBox.addItem("Ask a Rise");
        hrJComboBox.addItem("Apply for Vacation");
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.account = account;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestBtn = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        remarkTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        hrJComboBox = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();

        requestBtn.setText("Request");
        requestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBtnActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        jLabel2.setText("Remark:");

        jLabel1.setText("Request Type:");

        hrJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrJComboBoxActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(requestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(134, 134, 134)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(hrJComboBox, 0, 175, Short.MAX_VALUE)
                        .addComponent(remarkTextField))
                    .addContainerGap(135, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(hrJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(19, 19, 19)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(remarkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(150, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBtnActionPerformed
        // TODO add your handling code here:
        String remark = remarkTextField.getText();

        salerToHrRequest request = new salerToHrRequest();
        request.setHrtype((String) hrJComboBox.getSelectedItem());
        request.setRemark(remark);
        request.setSender(account);
        request.setStatus("Sent");
        request.setTag("SalerToHr");

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof HrOrganization) {

                org = organization;
                break;
            }
        }
        if (org != null) {
            //request.setRequestID(org.getWorkQueue().getWorkRequestList().size());
            if (org.getWorkQueue().getWorkRequestList().isEmpty()) {
                int count = 1;
                request.setRequestID(count);
            }
            if (org.getWorkQueue().getWorkRequestList().size() != 0) {

                for (WorkRequest request1 : org.getWorkQueue().getWorkRequestList()) {

                    int a = request1.getRequestID();
                    request.setRequestID(a + 1);

                }

            }
            org.getWorkQueue().getWorkRequestList().add(request);

            account.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null, "Sent Successfully");
            remarkTextField.setText("");
        }
    }//GEN-LAST:event_requestBtnActionPerformed

    private void hrJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrJComboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_hrJComboBoxActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SendToHRJpanel dwjp = (SendToHRJpanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JComboBox hrJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField remarkTextField;
    private javax.swing.JButton requestBtn;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
