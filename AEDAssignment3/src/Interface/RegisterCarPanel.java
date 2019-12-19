/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Car;
import Business.CarInformationList;
import java.awt.CardLayout;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author pavanrao
 */
public class RegisterCarPanel extends javax.swing.JPanel {

    private List<Car> carList;
    private JPanel carContainer;
    /**
     * Creates new form RegisterCarPanel
     */
    public RegisterCarPanel(List<Car> carList, JPanel carContainer) {
        initComponents();
        this.carList = carList;
        this.carContainer = carContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelRegister = new javax.swing.JLabel();
        labelBrand = new javax.swing.JLabel();
        labelManufacturedYear = new javax.swing.JLabel();
        labelMinSeats = new javax.swing.JLabel();
        labelMaxSeats = new javax.swing.JLabel();
        labelSerialNo = new javax.swing.JLabel();
        labelModelNo = new javax.swing.JLabel();
        labelAvailableCity = new javax.swing.JLabel();
        labelMaintCertStatus = new javax.swing.JLabel();
        labelAvailable = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        txtManufacturedYear = new javax.swing.JTextField();
        txtMinSeats = new javax.swing.JTextField();
        txtMaxSeats = new javax.swing.JTextField();
        txtSerialNo = new javax.swing.JTextField();
        txtModelNo = new javax.swing.JTextField();
        txtAvailableCity = new javax.swing.JTextField();
        checkYes = new javax.swing.JCheckBox();
        checkExpired = new javax.swing.JCheckBox();
        btnRegister = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        labelMph = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        labelRegister.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        labelRegister.setText("REGISTER A NEW CAR");

        labelBrand.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelBrand.setText("BRAND");

        labelManufacturedYear.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelManufacturedYear.setText("MANUFACTURED YEAR");

        labelMinSeats.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelMinSeats.setText("MINIMUM SEATS");

        labelMaxSeats.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelMaxSeats.setText("MAXIMUM SEATS");

        labelSerialNo.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelSerialNo.setText("SERIAL NUMBER");

        labelModelNo.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelModelNo.setText("MODEL NUMBER");

        labelAvailableCity.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelAvailableCity.setText("AVAILABLE CITY");

        labelMaintCertStatus.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelMaintCertStatus.setText("MAINTENANCE CERTIFICATE STATUS");

        labelAvailable.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelAvailable.setText("AVAILABLE");

        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });

        txtManufacturedYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufacturedYearActionPerformed(evt);
            }
        });

        checkYes.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        checkYes.setText("Yes");

        checkExpired.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        checkExpired.setText("Expired");

        btnRegister.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnRegister.setText("REGISTER");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnBack.setText("< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        labelMph.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelMph.setText("MILES PER HOUR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(labelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(303, 303, 303)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelMaxSeats)
                                        .addComponent(labelMinSeats)))
                                .addComponent(labelSerialNo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(134, 134, 134)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelMaintCertStatus)
                                        .addComponent(labelAvailableCity)
                                        .addComponent(labelAvailable)
                                        .addComponent(labelMph))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelModelNo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelManufacturedYear, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelBrand, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(checkYes)
                                .addComponent(txtAvailableCity, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtModelNo)
                                .addComponent(txtBrand)
                                .addComponent(txtManufacturedYear)
                                .addComponent(txtMinSeats)
                                .addComponent(txtMaxSeats)
                                .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkExpired))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(648, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBrand))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtManufacturedYear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelManufacturedYear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMinSeats))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMaxSeats))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSerialNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelModelNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAvailableCity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAvailableCity))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaintCertStatus)
                    .addComponent(checkExpired))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAvailable)
                    .addComponent(checkYes))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMph)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandActionPerformed

    private void txtManufacturedYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufacturedYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManufacturedYearActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        ArrayList<String> messageLog = new ArrayList<>();
        Boolean available, expired;
        Car car;
        
        String year = txtManufacturedYear.getText();
        int manufacturedYear = 0;
        try 
        {
            Integer.parseInt(year);
            manufacturedYear = Integer.parseInt(year);        
        } 
        catch (NumberFormatException e) 
        {
            messageLog.add(year + " is not a valid number.");
        }
        
        String milesPerHour = jTextField1.getText();
        int milesPrHr = 0;
        try 
        {
            Integer.parseInt(milesPerHour);
            milesPrHr = Integer.parseInt(year);        
        } 
        catch (NumberFormatException e) 
        {
            messageLog.add(milesPerHour + " is not a valid number.");
        }
        
        String minSeats = txtMinSeats.getText();
        int miniSeats = 0;
        try 
        {
            Integer.parseInt(minSeats);
            miniSeats = Integer.parseInt(minSeats);        
        } 
        catch (NumberFormatException e) 
        {
            messageLog.add(minSeats + " is not a valid number.");
        }
        
        String maxSeats = txtMaxSeats.getText();
        int maxiSeats = 0;
        try 
        {
            Integer.parseInt(maxSeats);
            maxiSeats = Integer.parseInt(maxSeats);        
        } 
        catch (NumberFormatException e) 
        {
            messageLog.add(maxSeats + " is not a valid number.");
        }
        
        String serNo = txtSerialNo.getText();
        int serialNo = 0;
        try 
        {
            Integer.parseInt(serNo);
            serialNo = Integer.parseInt(serNo);        
        } 
        catch (NumberFormatException e) 
        {
            messageLog.add(serNo + " is not a valid number.");
        }
        
        String brand = txtBrand.getText();
        String modelNum = txtModelNo.getText();
        String availableCity = txtAvailableCity.getText();

        if(checkYes.isSelected()) {
            available = true;
        }
        else {
            available = false;
        }
        if(checkExpired.isSelected()) {
            expired = true;
        }
        else {
            expired = false;
        }
        
        if(messageLog.isEmpty()){
            car = new Car(available, brand, manufacturedYear, miniSeats, maxiSeats, serialNo, modelNum, availableCity, expired, milesPrHr);
            this.carList.add(car);
            JOptionPane.showMessageDialog(null, "Registered Car successfully!");
        }
        else {
            String errorLog="";
            for(String message: messageLog)
            errorLog+=message+"\n";
            JOptionPane.showMessageDialog(null,errorLog);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        carContainer.remove(this);
        CardLayout layout = (CardLayout) carContainer.getLayout();
        layout.previous(carContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JCheckBox checkExpired;
    private javax.swing.JCheckBox checkYes;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelAvailable;
    private javax.swing.JLabel labelAvailableCity;
    private javax.swing.JLabel labelBrand;
    private javax.swing.JLabel labelMaintCertStatus;
    private javax.swing.JLabel labelManufacturedYear;
    private javax.swing.JLabel labelMaxSeats;
    private javax.swing.JLabel labelMinSeats;
    private javax.swing.JLabel labelModelNo;
    private javax.swing.JLabel labelMph;
    private javax.swing.JLabel labelRegister;
    private javax.swing.JLabel labelSerialNo;
    private javax.swing.JTextField txtAvailableCity;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtManufacturedYear;
    private javax.swing.JTextField txtMaxSeats;
    private javax.swing.JTextField txtMinSeats;
    private javax.swing.JTextField txtModelNo;
    private javax.swing.JTextField txtSerialNo;
    // End of variables declaration//GEN-END:variables
}
