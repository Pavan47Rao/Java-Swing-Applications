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
public class EnhancedSearchPanel extends javax.swing.JPanel {

    /**
     * Creates new form EnhancedSearchPanel
     */
    private JPanel carContainer;
    private List<Car> carList;
    private DefaultTableModel newDtm;

    EnhancedSearchPanel(JPanel carContainer, List<Car> carList) {
        this.carContainer = carContainer;
        this.carList = carList;
        initComponents();
        populate();
    }

    public void populate(){
        DefaultTableModel dtm = (DefaultTableModel)tableCarFleet1.getModel();
        dtm.setRowCount(0);
        
        for(Car car : carList){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=car;
            row[1]=car.getManufactured_year();
            row[2]=car.getMin_seats();
            row[3]=car.getMax_seats();
            row[4]=car.getSerial_num();
            row[5]=car.getModel_num();
            row[6]=car.getAvailble_city();
            if(car.isMaintenance_certificate()){
                row[7]="Active";
            }
            else
                row[7]="Expired";
            if(car.isAvailable()) {
                row[8] = "yes";
            }
            else
                row[8] ="no";
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tableCarFleet1 = new javax.swing.JTable();
        btnBrand = new javax.swing.JButton();
        btnYear = new javax.swing.JButton();
        btnSerialNo = new javax.swing.JButton();
        txtBrand = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtSeats = new javax.swing.JTextField();
        btnModelNo = new javax.swing.JButton();
        btnLocation = new javax.swing.JButton();
        btnCert = new javax.swing.JButton();
        txtModelNo = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        chkCert = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnMinSeats = new javax.swing.JButton();
        btnMaxSeats = new javax.swing.JButton();
        btnAvailability = new javax.swing.JButton();
        txtMini = new javax.swing.JTextField();
        txtMax = new javax.swing.JTextField();
        chkAvail = new javax.swing.JCheckBox();
        btnClear = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        tableCarFleet1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Brand", "Manufactured Year", "Min Seats", "Max Seats", "Serial No", "Model No", "Available Location", "Maintenance Certificate Expired", "Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableCarFleet1);

        btnBrand.setText("Search by Brand");
        btnBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandActionPerformed(evt);
            }
        });

        btnYear.setText("Search by Manufactured year");
        btnYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYearActionPerformed(evt);
            }
        });

        btnSerialNo.setText("Search by Serial Number");
        btnSerialNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerialNoActionPerformed(evt);
            }
        });

        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });

        btnModelNo.setText("Search by Model Number");
        btnModelNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelNoActionPerformed(evt);
            }
        });

        btnLocation.setText("Search by Location");
        btnLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocationActionPerformed(evt);
            }
        });

        btnCert.setText("Search by Maintenance Certificate Status");
        btnCert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertActionPerformed(evt);
            }
        });

        chkCert.setText("Expired");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Advance Car Search Fleet");

        btnBack.setText("< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnMinSeats.setText("Search by Min Seats");
        btnMinSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinSeatsActionPerformed(evt);
            }
        });

        btnMaxSeats.setText("Search by Max Seats");
        btnMaxSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxSeatsActionPerformed(evt);
            }
        });

        btnAvailability.setText("Search by Availability");
        btnAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailabilityActionPerformed(evt);
            }
        });

        chkAvail.setText("Available");

        btnClear.setText("CLEAR FILTER");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnYear)
                    .addComponent(btnBrand)
                    .addComponent(btnSerialNo))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtYear)
                    .addComponent(txtBrand)
                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLocation, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnModelNo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCert)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAvailability)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnMinSeats)
                        .addComponent(btnMaxSeats)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(chkAvail)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMax, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtMini))
                        .addGap(38, 38, 38))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1233, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBrand)
                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnYear)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSerialNo)
                            .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModelNo)
                            .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMinSeats)
                            .addComponent(txtMini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLocation)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMaxSeats)
                            .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCert)
                                    .addComponent(chkCert)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAvailability)
                                    .addComponent(chkAvail))))))
                .addContainerGap(341, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(265, 265, 265)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

        private void resetCarTable(DefaultTableModel dtm, Car car) {
        Object[] row = new Object[dtm.getColumnCount()];
            row[0]=car;
            row[1]=car.getManufactured_year();
            row[2]=car.getMin_seats();
            row[3]=car.getMax_seats();
            row[4]=car.getSerial_num();
            row[5]=car.getModel_num();
            row[6]=car.getAvailble_city();
            if(car.isMaintenance_certificate()){
                row[7]="Active";
            }
            else
                row[7]="Expired";
            if(car.isAvailable()) {
                row[8] = "yes";
            }
            dtm.addRow(row);    
    }
    
    private void btnBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandActionPerformed
        // TODO add your handling code here:
        String brand = txtBrand.getText();
        List<Car> brandCars = new ArrayList<>();
        if(brand.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter valid text and then search");
        }
        else {
            for(Car c: carList) {
                if(c.getBrand().equals(brand)) {
                    brandCars.add(c);
                }
            }
            DefaultTableModel dtm = (DefaultTableModel)tableCarFleet1.getModel();
            dtm.setRowCount(0);
            for(Car car: brandCars) {
                resetCarTable(dtm, car);
            }
            if(brandCars.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Sorry, we did not find any car for the given input");
            }
        }
    }//GEN-LAST:event_btnBrandActionPerformed

    private void btnYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYearActionPerformed
        // TODO add your handling code here:
        String year = txtYear.getText();
        int yr=0;
        List<Car> brandCars = new ArrayList<>();
        if(year.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter valid year and then search");

        }
        else {
            try{
                Integer.parseInt(year);
                yr= Integer.parseInt(year);
                for(Car c: carList) {
                    if(c.getManufactured_year() == yr) {
                        brandCars.add(c);
                    }
                }
                DefaultTableModel dtm = (DefaultTableModel)tableCarFleet1.getModel();
                dtm.setRowCount(0);
                for(Car car: brandCars) {
                    resetCarTable(dtm, car);
                }
                if(brandCars.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Sorry, we did not find any car for the given input");
                }
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter valid numeral for year");
            }
            
        }
    }//GEN-LAST:event_btnYearActionPerformed

    private void btnSerialNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerialNoActionPerformed
        // TODO add your handling code here:
        String serialNo = txtSeats.getText();
        int slNo=0;
        List<Car> brandCars = new ArrayList<>();
        if(serialNo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter valid Serial Number and then search");

        }
        else {
            try{
                Integer.parseInt(serialNo);
                slNo= Integer.parseInt(serialNo);
                for(Car c: carList) {
                    if(c.getSerial_num()== slNo) {
                        brandCars.add(c);
                    }
                }
                DefaultTableModel dtm = (DefaultTableModel)tableCarFleet1.getModel();
                dtm.setRowCount(0);
                for(Car car: brandCars) {
                    resetCarTable(dtm, car);
                }
                if(brandCars.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Sorry, we did not find any car for the given input");
                }
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter valid numeral for Serial Number");
            }
            
        }
    }//GEN-LAST:event_btnSerialNoActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandActionPerformed

    private void btnModelNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelNoActionPerformed
        // TODO add your handling code here:
        String brand = txtModelNo.getText();
        List<Car> brandCars = new ArrayList<>();
        if(brand.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter valid model number and then search");
        }
        else {
            for(Car c: carList) {
                if(c.getModel_num().equals(brand)) {
                    brandCars.add(c);
                }
            }
            DefaultTableModel dtm = (DefaultTableModel)tableCarFleet1.getModel();
            dtm.setRowCount(0);
            for(Car car: brandCars) {
                resetCarTable(dtm, car);
            }
            if(brandCars.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Sorry, we did not find any car for the given input");
            }
        }
    }//GEN-LAST:event_btnModelNoActionPerformed

    private void btnLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocationActionPerformed
        // TODO add your handling code here:
        String brand = txtLocation.getText();
        List<Car> brandCars = new ArrayList<>();
        if(brand.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter valid location and then search");
        }
        else {
            for(Car c: carList) {
                if(c.getAvailble_city().equals(brand)) {
                    brandCars.add(c);
                }
            }
            DefaultTableModel dtm = (DefaultTableModel)tableCarFleet1.getModel();
            dtm.setRowCount(0);
            for(Car car: brandCars) {
                resetCarTable(dtm, car);
            }
            if(brandCars.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Sorry, we did not find any car for the given input");
            }
        }
    }//GEN-LAST:event_btnLocationActionPerformed

    private void btnCertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertActionPerformed
        // TODO add your handling code here:
        Boolean certified =false;
        if(chkCert.isSelected()) {
            certified = true;
        }
        List<Car> brandCars = new ArrayList<>();

        for(Car c: carList) {
            if(c.isMaintenance_certificate() == certified) {
                brandCars.add(c);
            }
        }
        DefaultTableModel dtm = (DefaultTableModel)tableCarFleet1.getModel();
        dtm.setRowCount(0);
        for(Car car: brandCars) {
            resetCarTable(dtm, car);
        }
        if(brandCars.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Sorry, we did not find any car for the given input");
            }

    }//GEN-LAST:event_btnCertActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        carContainer.remove(this);
        CardLayout layout = (CardLayout) carContainer.getLayout();
        layout.previous(carContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnMaxSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxSeatsActionPerformed
        // TODO add your handling code here:
       String txtMaxi = txtMax.getText();
        int slNo=0;
        List<Car> brandCars = new ArrayList<>();
        if(txtMaxi.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter valid number of seats and then search");

        }
        else {
            try{
                Integer.parseInt(txtMaxi);
                slNo= Integer.parseInt(txtMaxi);
                for(Car c: carList) {
                    if(c.getMax_seats()== slNo) {
                        brandCars.add(c);
                    }
                }
                DefaultTableModel dtm = (DefaultTableModel)tableCarFleet1.getModel();
                dtm.setRowCount(0);
                for(Car car: brandCars) {
                    resetCarTable(dtm, car);
                }
                if(brandCars.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Sorry, we did not find any car for the given input");
                }
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter valid numeral for max seat");
            }
            
        }
    }//GEN-LAST:event_btnMaxSeatsActionPerformed

    private void btnMinSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinSeatsActionPerformed
        // TODO add your handling code here:
               String txtMin = txtMini.getText();
        int slNo=0;
        List<Car> brandCars = new ArrayList<>();
        if(txtMin.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter valid number of seats and then search");

        }
        else {
            try{
                Integer.parseInt(txtMin);
                slNo= Integer.parseInt(txtMin);
                for(Car c: carList) {
                    if(c.getMin_seats()== slNo) {
                        brandCars.add(c);
                    }
                }
                DefaultTableModel dtm = (DefaultTableModel)tableCarFleet1.getModel();
                dtm.setRowCount(0);
                for(Car car: brandCars) {
                    resetCarTable(dtm, car);
                }
                if(brandCars.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Sorry, we did not find any car for the given input");
                }
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter valid numeral for min seat");
            }
            
        }
    }//GEN-LAST:event_btnMinSeatsActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtLocation.setText("");
        txtModelNo.setText("");
        txtSeats.setText("");
        txtYear.setText("");
        txtBrand.setText("");
        txtMini.setText("");
        txtMax.setText("");
        chkAvail.setSelected(false);
        chkCert.setSelected(false);
        populate();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailabilityActionPerformed
        // TODO add your handling code here:
         Boolean available =false;
        if(chkAvail.isSelected()) {
            available = true;
        }
        List<Car> brandCars = new ArrayList<>();

        for(Car c: carList) {
            if(c.isAvailable() == available) {
                brandCars.add(c);
            }
        }
        DefaultTableModel dtm = (DefaultTableModel)tableCarFleet1.getModel();
        dtm.setRowCount(0);
        for(Car car: brandCars) {
            resetCarTable(dtm, car);
        }
        if(brandCars.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Sorry, we did not find any car for the given input");
            }
    }//GEN-LAST:event_btnAvailabilityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvailability;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBrand;
    private javax.swing.JButton btnCert;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLocation;
    private javax.swing.JButton btnMaxSeats;
    private javax.swing.JButton btnMinSeats;
    private javax.swing.JButton btnModelNo;
    private javax.swing.JButton btnSerialNo;
    private javax.swing.JButton btnYear;
    private javax.swing.JCheckBox chkAvail;
    private javax.swing.JCheckBox chkCert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableCarFleet1;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMini;
    private javax.swing.JTextField txtModelNo;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
