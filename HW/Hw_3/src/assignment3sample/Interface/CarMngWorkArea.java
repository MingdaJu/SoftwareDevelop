/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3sample.Interface;

import assignment3sample.Business.Car;
import assignment3sample.Business.CarInformationList;
import java.awt.CardLayout;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * @author jumin
 */
public class CarMngWorkArea extends javax.swing.JPanel {
       private JPanel userProcessContainer;
       private CarInformationList carInformationList;
    /**
     * Creates new form carMngWorkArea
     */
    

    CarMngWorkArea(JPanel userProcessContainer, CarInformationList carInformationList) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.carInformationList=carInformationList;
        Date now=new Date();
        carInformationList.setDate(now);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageCar = new javax.swing.JButton();
        btnCreateCar = new javax.swing.JButton();

        btnManageCar.setText("Manage Your Cars");
        btnManageCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCarActionPerformed(evt);
            }
        });

        btnCreateCar.setText("Create a Car");
        btnCreateCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnManageCar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(689, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(btnCreateCar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(689, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(btnManageCar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(676, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(btnCreateCar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(758, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCarActionPerformed
        // TODO add your handling code here:
        ManageCars managecars=new  ManageCars(userProcessContainer,carInformationList);
        userProcessContainer.add("ManageCars",managecars);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCarActionPerformed

    private void btnCreateCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCarActionPerformed
        // TODO add your handling code here:
        CreateCars createcars=new CreateCars(userProcessContainer,carInformationList);
        userProcessContainer.add("CreateCars",createcars);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateCarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCar;
    private javax.swing.JButton btnManageCar;
    // End of variables declaration//GEN-END:variables
}
