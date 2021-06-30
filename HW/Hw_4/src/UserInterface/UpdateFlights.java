/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Flight;
import Business.FlightDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jumin
 */
public class UpdateFlights extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirliners
     */
    private FlightDirectory flightDirectory;
    private JPanel CardSequenceJPanel;

    UpdateFlights(JPanel CardSequenceJPanel, FlightDirectory flightDir) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.flightDirectory = flightDir;
        populateTable(); //To change body of generated methods, choose Tools | Templates.
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblFlights.getModel();
        dtm.setRowCount(0);
        for (Flight flight : flightDirectory.getFlightList()) {
            Object[] row = new Object[6];
            row[0] = flight;
            row[1] = flight.getTakeOffDate();
            row[2] = flight.getDeparture();
            row[3] = flight.getDestination();
            row[4] = flight.getTakeOffTime();
            row[5] = flight.getArrival();

            dtm.addRow(row);
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

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFlights = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnViewFlights = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnNewFlights = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        jButton2.setText("jButton1");

        tblFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "Take off Date", "Departure", "Destination", "Take Off Time", "Arrival Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFlights);
        if (tblFlights.getColumnModel().getColumnCount() > 0) {
            tblFlights.getColumnModel().getColumn(0).setResizable(false);
            tblFlights.getColumnModel().getColumn(1).setResizable(false);
            tblFlights.getColumnModel().getColumn(2).setResizable(false);
            tblFlights.getColumnModel().getColumn(3).setResizable(false);
            tblFlights.getColumnModel().getColumn(4).setResizable(false);
            tblFlights.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Flights");

        btnViewFlights.setText("View Flights");
        btnViewFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFlightsActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnNewFlights.setText("New Flights");
        btnNewFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewFlightsActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnViewFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnNewFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(44, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.CardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) this.CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFlightsActionPerformed
        // TODO add your handling code here:
       int selectedRow = tblFlights.getSelectedRow();
        
        if(selectedRow>=0){
            Flight flight= (Flight) tblFlights.getValueAt(selectedRow,0);
            ViewFlights flights= new ViewFlights(CardSequenceJPanel,flight,this.flightDirectory);
            this.CardSequenceJPanel.add("ViewFlights",flights);
            CardLayout layout = (CardLayout) this.CardSequenceJPanel.getLayout();
            layout.next(CardSequenceJPanel);
                    
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnViewFlightsActionPerformed

    private void btnNewFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewFlightsActionPerformed
        // TODO add your handling code here:
       NewFlights NFPanel = new NewFlights(CardSequenceJPanel,flightDirectory);
       CardSequenceJPanel.add("NewFlights",NFPanel);
       CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
       layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_btnNewFlightsActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
           int selectedRow = tblFlights.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Flight flight = (Flight)tblFlights.getValueAt(selectedRow, 0);
                flightDirectory.getFlightList().remove(flight);
                populateTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNewFlights;
    private javax.swing.JButton btnViewFlights;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFlights;
    // End of variables declaration//GEN-END:variables
}
