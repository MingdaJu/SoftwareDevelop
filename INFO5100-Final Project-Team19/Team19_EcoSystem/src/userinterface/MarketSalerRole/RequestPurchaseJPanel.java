/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MarketSalerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FactoryEnterprise;
import Business.Organization.HrOrganization;
import Business.Organization.PurchasingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SalerToPurchaserRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class RequestPurchaseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    //private int count;

    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestPurchaseJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
    }

    private boolean namePatternCorrect() {
        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher m = p.matcher(IDJTextField.getText());
        boolean b = m.matches();
        return b;
    }

    private boolean numberPatternCorrect() {
        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher m = p.matcher(numberJTextField.getText());
        boolean b = m.matches();
        return b;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        IDJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        numberJTextField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setText("Request");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 110, 33));

        jLabel1.setText("Product ID:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 110, 33));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 110, 30));
        add(IDJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 160, -1));

        jLabel2.setText("Number:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));
        add(numberJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        //count++;
        String id = IDJTextField.getText();
        String number = numberJTextField.getText();

        SalerToPurchaserRequest request = new SalerToPurchaserRequest();
        request.setProductID(id);
        request.setNumber(number);
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setTag("SalerToPurchase");
        if (id == null || id.equals("")) {
            JOptionPane.showMessageDialog(null, "Please input Product ID");
            return;
        }
        if (number == null || number.equals("")) {
            JOptionPane.showMessageDialog(null, "Please input Number");
            return;
        }

        if (!namePatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Produt ID");
            return;
        }

        if (!numberPatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Number");
            return;
        }
        

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof PurchasingOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
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
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null, "Sent Successfully");
            IDJTextField.setText("");
            numberJTextField.setText("");
        }

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        MarketSalerWorkAreaJPanel dwjp = (MarketSalerWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField numberJTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}