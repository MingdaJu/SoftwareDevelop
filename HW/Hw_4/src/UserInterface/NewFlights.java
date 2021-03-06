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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jumin
 */
public class NewFlights extends javax.swing.JPanel {

    /**
     * Creates new form NewAirliners
     */
    private FlightDirectory flightList;
    private JPanel CardSequenceJPanel;

    NewFlights(JPanel CardSequenceJPanel, FlightDirectory flightList) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.flightList = flightList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDeparture = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDestination = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtTakeOffTime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFlightNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAirliner = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtArrival = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTakeOffDate = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtAirplane1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("New Flights");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Departure:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Destination:");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Take off Time:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Flight Number:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Airplane:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Arrival:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Take off Date:");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Airliner:");

        jCheckBox1.setText("Morning");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Time Range:");

        jCheckBox2.setText("Afternoon");

        jCheckBox3.setText("Evening");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAirplane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtTakeOffDate, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtArrival, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtTakeOffTime, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(442, 442, 442))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(318, 318, 318)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTakeOffTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTakeOffDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArrival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAirplane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addGap(36, 36, 36)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.CardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) this.CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
        Component[] comps = this.CardSequenceJPanel.getComponents();
        for (Component comp : comps) {
            if (comp instanceof UpdateFlights) {
                UpdateFlights manageP = (UpdateFlights) comp;

                manageP.populateTable();
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String flightNumber = txtFlightNumber.getText();
        String takeOffTime = txtTakeOffTime.getText();
        String takeOffDate = txtTakeOffDate.getText();
        String arrival = txtArrival.getText();
        String departure = txtDeparture.getText();
        String destination = txtDestination.getText();
        String airplane = txtAirliner.getText();
        String airliner = txtAirliner.getText();

        if (flightNumber == null || flightNumber.equals("")) {
            JOptionPane.showMessageDialog(null, "Please input a Flight Number");
            return;
        }
        if (!flightPatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Flight number should be in the form like HU481");
            return;
        }
        if (takeOffTime == null || takeOffTime.equals("")) {
            JOptionPane.showMessageDialog(null, "Please input a Take Off Time");
            return;
        }
        if (takeOffDate == null || takeOffDate.equals("")) {
            JOptionPane.showMessageDialog(null, "Please input a Take Off Date");
            return;
        }
        if (!DatePatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Date should be in the form of YYYY-MM-DD");
            return;
        }
        if (!TimePatternCorrect1()) {
            JOptionPane.showMessageDialog(null, "Take off time should be in the form of xx:xx");
            return;
        }
        if (!TimePatternCorrect2()) {
            JOptionPane.showMessageDialog(null, "Arrival Time should be in the form of xx:xx");
            return;
        }
        if (arrival == null || arrival.equals("")) {
            JOptionPane.showMessageDialog(null, "Please input a Arrival");
            return;
        }
        if (departure == null || departure.equals("")) {
            JOptionPane.showMessageDialog(null, "Please input a Departurer");
            return;
        }
        if (destination == null || destination.equals("")) {
            JOptionPane.showMessageDialog(null, "Please input a Destination");
            return;
        }
        if (airplane == null || airplane.equals("")) {
            JOptionPane.showMessageDialog(null, "Please input a Airplane");
            return;
        }
        if (airliner == null || airliner.equals("")) {
            JOptionPane.showMessageDialog(null, "Please input a Airliner");
            return;
        }
        if (jCheckBox1.isSelected() == false && jCheckBox2.isSelected() == false && jCheckBox3.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Please choose at least one time range");
            return;
        }
        if (jCheckBox1.isSelected() && jCheckBox2.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please choose only one time range");
            return;
        } else if (jCheckBox1.isSelected() && jCheckBox3.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please choose only one time range");
            return;
        } else if (jCheckBox2.isSelected() && jCheckBox3.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please choose only one time range");
            return;
        }

        Flight flight = new Flight();
        flight.setFlightNumber(flightNumber);
        flight.setDestination(destination);
        flight.setDeparture(departure);
        flight.setTakeOffTime(takeOffTime);
        flight.setTakeOffDate(takeOffDate);
        flight.setArrival(arrival);
        flight.setAirplane(airplane);
        flight.setAirliner(airliner);
        if (jCheckBox1.isSelected()) {
            flight.setTimerange("Morning");
        }
        if (jCheckBox2.isSelected()) {
            flight.setTimerange("Afternoon");
        }
        if (jCheckBox3.isSelected()) {
            flight.setTimerange("Evening");
        }
        JOptionPane.showMessageDialog(null, "Flight auccessfully created");
        flightList.getFlightList().add(flight);
    }//GEN-LAST:event_btnCreateActionPerformed

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
    
    private boolean TimePatternCorrect1() {
        Pattern p = Pattern.compile("^[0-2][0-9]:[0-6][0-9]$");
        Matcher m = p.matcher(txtTakeOffTime.getText());
        boolean b = m.matches();
        return b;
    }
    
    private boolean TimePatternCorrect2() {
        Pattern p = Pattern.compile("^[0-2][0-9]:[0-6][0-9]$");
        Matcher m = p.matcher(txtArrival.getText());
        boolean b = m.matches();
        return b;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAirliner;
    private javax.swing.JTextField txtAirplane1;
    private javax.swing.JTextField txtArrival;
    private javax.swing.JTextField txtDeparture;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtFlightNumber;
    private javax.swing.JTextField txtTakeOffDate;
    private javax.swing.JTextField txtTakeOffTime;
    // End of variables declaration//GEN-END:variables
}
