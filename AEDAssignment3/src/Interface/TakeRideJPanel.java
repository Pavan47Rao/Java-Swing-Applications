/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pavanrao
 */
public class TakeRideJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TakeRideJPanel
     */
    private List<Car> carList;
    private JPanel carContainer;
    private List<Car> availableCarList;

    TakeRideJPanel(List<Car> carList, JPanel carContainer) {
        this.carList = carList;
        this.carContainer = carContainer;
        initComponents();
        filterAvailableCars();
        populate();
    }

    private void filterAvailableCars() {
        availableCarList = new ArrayList<>();
        for(Car car: carList) {
            if(car.isAvailable())
                availableCarList.add(car);
        }
    }
    
    private void populate()
    {
        DefaultTableModel dtm = (DefaultTableModel)tableCars.getModel();
        dtm.setRowCount(0);
        
        for(Car car : availableCarList){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=car;
            row[1]=car.getMin_seats();
            row[2]=car.getMax_seats();
            row[3]=car.getAvailble_city();
            dtm.addRow(row);
        }
    }/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDistance = new javax.swing.JTextField();
        txtDestination = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCars = new javax.swing.JTable();
        btnStartTrip = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Enter the Destination");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Enter the distance (in miles)");

        txtDistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistanceActionPerformed(evt);
            }
        });

        txtDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinationActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Please select an available car nearest to your boarding point from below");

        tableCars.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tableCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Minimum seats", "Maximum Seats", "Current Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCars);
        if (tableCars.getColumnModel().getColumnCount() > 0) {
            tableCars.getColumnModel().getColumn(0).setResizable(false);
            tableCars.getColumnModel().getColumn(1).setResizable(false);
            tableCars.getColumnModel().getColumn(2).setResizable(false);
            tableCars.getColumnModel().getColumn(3).setResizable(false);
        }

        btnStartTrip.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnStartTrip.setText("START MY TRIP");
        btnStartTrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartTripActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnBack.setText("< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel4.setText("BOOK MY RIDE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDistance, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(358, 358, 358)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(538, 538, 538)
                        .addComponent(btnStartTrip, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(380, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(597, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDistance, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStartTrip, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistanceActionPerformed

    private void txtDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinationActionPerformed

    private void btnStartTripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartTripActionPerformed
        // TODO add your handling code here:
        String distance = txtDistance.getText();
        int dist = 0;
        double time = 0.0;
        try 
        {
            Integer.parseInt(distance);
            dist = Integer.parseInt(distance);        
        } 
        catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null,"Please enter the distance in numerals");
        }
        String location = txtDestination.getText();
        
        int selectedRow = tableCars.getSelectedRow();

        if (selectedRow >= 0) {
            Car car = (Car) tableCars.getValueAt(selectedRow, 0);
            for(Car c: availableCarList){
                if(c.equals(car)) {
                    c.setAvailable(false);
                    c.setAvailble_city(location);
                }
            }
            int speed = car.getMiles_per_hour();
            time = (double)dist / (double)speed * 100;
            JOptionPane.showMessageDialog(null, "Your ride has started and will complete in "+time+"hours!");
            filterAvailableCars();
            populate();
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a car before taking the ride!");
        }
    }//GEN-LAST:event_btnStartTripActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        carContainer.remove(this);
        CardLayout layout = (CardLayout) carContainer.getLayout();
        layout.previous(carContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnStartTrip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCars;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtDistance;
    // End of variables declaration//GEN-END:variables
}