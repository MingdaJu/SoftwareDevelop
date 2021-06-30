/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Customer;
import Business.CustomerDirectory;
import Business.Flight;
import Business.FlightDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jumin
 */
public class CustomerSearch extends javax.swing.JPanel {

    /**
     * Creates new form Customer
     */
    JPanel CardSequenceJPanel;
    private CustomerDirectory customerDirectory;
    private FlightDirectory flightDirectory;

    CustomerSearch(JPanel CardSequenceJPanel, CustomerDirectory customerDirectory, FlightDirectory flightDirectory) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.customerDirectory = customerDirectory;
        this.flightDirectory = flightDirectory;
        setTimeRange();
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
        tblFlights = new javax.swing.JTable();
        txtTakeOffDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDestination = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFlightNumber = new javax.swing.JTextField();
        txtDeparture = new javax.swing.JTextField();
        btnSearchFlightNum = new javax.swing.JButton();
        btnSearchDetail = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTimeRange = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSearchAirliners = new javax.swing.JButton();
        txtAirliners = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        tblFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "Take off date", "Take off time", "Arrival time", "Departure", "Destination", "Airliner", "Airplane"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false
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
            tblFlights.getColumnModel().getColumn(6).setResizable(false);
            tblFlights.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Departure:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Customer Search Flight");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Flight Number:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Take off Date:");

        btnSearchFlightNum.setText("Search by Flight Number");
        btnSearchFlightNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchFlightNumActionPerformed(evt);
            }
        });

        btnSearchDetail.setText("Search by Details");
        btnSearchDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDetailActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Destination:");

        jTimeRange.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Time Range:");

        jLabel1.setText("_________________________________________________________________________________________________________________________________________");

        jLabel3.setText("_________________________________________________________________________________________________________________________________________");

        btnSearchAirliners.setText("Search by Airliners");
        btnSearchAirliners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAirlinersActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Airliners:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(251, 251, 251)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(btnSearchDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(397, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTakeOffDate, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTimeRange, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(btnSearchFlightNum)
                        .addGap(156, 156, 156))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel8)
                        .addGap(98, 98, 98)
                        .addComponent(txtAirliners, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnSearchAirliners, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchFlightNum))
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtTakeOffDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTimeRange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(36, 36, 36)
                .addComponent(btnSearchDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchAirliners)
                    .addComponent(txtAirliners, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.CardSequenceJPanel.remove(this);
        CardLayout layout=(CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchFlightNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchFlightNumActionPerformed
        // TODO add your handling code here:
        if (txtFlightNumber == null|| txtFlightNumber.equals("")) {
            JOptionPane.showMessageDialog(null, "Flight number can't be empty!");
            return;
        }
        if (!flightPatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Flight number should be in the form like HU481");
            return;
        }
        DefaultTableModel dtm = (DefaultTableModel) tblFlights.getModel();
        dtm.setRowCount(0);
        for (Flight flight : flightDirectory.getFlightList()) {
            if (txtFlightNumber.getText().equals(flight.getFlightNumber())) {
                Object[] row = new Object[8];
                row[0] = flight;
                row[1] = flight.getTakeOffDate();
                row[2] = flight.getTakeOffTime();
                row[3] = flight.getArrival();
                row[4] = flight.getDeparture();
                row[5] = flight.getDestination();
                row[6] = flight.getAirliner();
                row[7] = flight.getAirplane();

            dtm.addRow(row);
            }
            
        }
    }//GEN-LAST:event_btnSearchFlightNumActionPerformed

    private void btnSearchDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDetailActionPerformed
        // TODO add your handling code here:
        if (txtTakeOffDate == null|| txtTakeOffDate.equals("")) {
            JOptionPane.showMessageDialog(null, "Take off date can't be empty!");
            return;
        }
        if (txtDeparture == null|| txtDeparture.equals("")) {
            JOptionPane.showMessageDialog(null, "Departure can't be empty!");
            return;
        }
        if (txtDestination == null|| txtDestination.equals("")) {
            JOptionPane.showMessageDialog(null, "Destination can't be empty!");
            return;
        }
        if (!DatePatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Date should be in the form of YYYY-MM-DD");
            return;
        }
        String TimeRange = null;
        if (jTimeRange.getSelectedIndex()==0) {
            TimeRange = "Morning";
        }
        else if (jTimeRange.getSelectedIndex()==1) {
            TimeRange = "Afternoon";
        }
        else if (jTimeRange.getSelectedIndex()==2) {
            TimeRange = "Evening";
        }
        DefaultTableModel dtm = (DefaultTableModel) tblFlights.getModel();
        dtm.setRowCount(0);
        for (Flight flight : flightDirectory.getFlightList()) {
            if (txtTakeOffDate.getText().equals(flight.getTakeOffDate()) && txtDestination.getText().equals(flight.getDestination()) && txtDeparture.getText().equals(flight.getDeparture()) && TimeRange.equals(flight.getTimerange())) {

                Object[] row = new Object[8];
                row[0] = flight;
                row[1] = flight.getTakeOffDate();
                row[2] = flight.getTakeOffTime();
                row[3] = flight.getArrival();
                row[4] = flight.getDeparture();
                row[5] = flight.getDestination();
                row[6] = flight.getAirliner();
                row[7] = flight.getAirplane();

            dtm.addRow(row);
            }
            
        }
    }//GEN-LAST:event_btnSearchDetailActionPerformed

    private void btnSearchAirlinersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAirlinersActionPerformed
        // TODO add your handling code here:
        if (txtAirliners == null|| txtAirliners.equals("")) {
            JOptionPane.showMessageDialog(null, "Airliners can't be empty!");
            return;
        }
        DefaultTableModel dtm = (DefaultTableModel) tblFlights.getModel();
        dtm.setRowCount(0);
        for (Flight flight : flightDirectory.getFlightList()) {
            if (txtAirliners.getText().equals(flight.getAirliner())) {
                Object[] row = new Object[8];
                row[0] = flight;
                row[1] = flight.getTakeOffDate();
                row[2] = flight.getTakeOffTime();
                row[3] = flight.getArrival();
                row[4] = flight.getDeparture();
                row[5] = flight.getDestination();
                row[6] = flight.getAirliner();
                row[7] = flight.getAirplane();

            dtm.addRow(row);
            }
            
        }
    }//GEN-LAST:event_btnSearchAirlinersActionPerformed

    private boolean flightPatternCorrect() {
        Pattern p = Pattern.compile("^[A-Z][A-Z][0-9][0-9][0-9]$");
        Matcher m = p.matcher(txtFlightNumber.getText());
        boolean b = m.matches();
        return b;
    }
    
    private boolean DatePatternCorrect() {
        Pattern p = Pattern.compile("^[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]$");
        Matcher m = p.matcher(txtTakeOffDate.getText());
        boolean b = m.matches();
        return b;
    }
    
    private void setTimeRange() {
        jTimeRange.removeAllItems();
        jTimeRange.addItem("Morning");
        jTimeRange.addItem("Afternoon");
        jTimeRange.addItem("Evening");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearchAirliners;
    private javax.swing.JButton btnSearchDetail;
    private javax.swing.JButton btnSearchFlightNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jTimeRange;
    private javax.swing.JTable tblFlights;
    private javax.swing.JTextField txtAirliners;
    private javax.swing.JTextField txtDeparture;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtFlightNumber;
    private javax.swing.JTextField txtTakeOffDate;
    // End of variables declaration//GEN-END:variables
}
