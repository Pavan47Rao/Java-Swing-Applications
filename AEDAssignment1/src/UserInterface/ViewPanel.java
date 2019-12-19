/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;
import BusinessModel.Car;
import static com.sun.javafx.css.SizeUnits.PT;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author pavanrao
 */
public class ViewPanel extends javax.swing.JPanel {

    Car newCar = new Car();
    /**
     * Creates new form ViewCar
     * @param car
     */

    public ViewPanel(Car car) {
        initComponents();
        displayCar(car);
    }

    private void displayCar(Car car) {
        colorTextField1.setText(car.getColor());
        companyTextField1.setText(car.getCompany());
        curbWeightTextField1.setText(car.getCurbWeight());
        engineLtrsTextField1.setText(car.getEngineLitres());
        lwhTextField1.setText(car.getExteriorLWH());
        fuelTankCapacityTextField2.setText(car.getFuelTankCapacity());
        engineHPTextField1.setText(car.getHorsepower());
        modelTextField1.setText(car.getModel());
        startingPriceTextField1.setText(car.getStartingPrice());
        tireDimensionTextField2.setText(car.getTireDimension());
        tireTypeTextField2.setText(car.getTireType());
        topSpeedTextField2.setText(car.getTopSpeed());
        engineTorqueTextField1.setText(car.getTorque());
        transmissionTypeTextField1.setText(car.getTransmissionType());
        wheelDimensionTextField2.setText(car.getWheelDimension());
        //Display the image only when uploaded, else notify the user
        if((car.getImage() != null))
        {
            Image carImg = car.getImage().getScaledInstance(450, 300, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(carImg));
        }
        else {
            imageLabel.setText("You can see the car's image here when uploaded!");
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

        topSpeedTextField = new javax.swing.JTextField();
        fuelTankCapacityTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tireTypeTextField = new javax.swing.JTextField();
        wheelDimensionTextField = new javax.swing.JTextField();
        tireDimensionTextField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        headRoomTextField = new javax.swing.JTextField();
        legRoomTextField = new javax.swing.JTextField();
        viewCarLabel = new javax.swing.JLabel();
        engineTorqueLabel = new javax.swing.JLabel();
        transmissionTypeLabel = new javax.swing.JLabel();
        topSpeedLabel = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tireTypeLabel = new javax.swing.JLabel();
        wheelDimensionLabel = new javax.swing.JLabel();
        tireDimensionLabel = new javax.swing.JLabel();
        lwhLabel = new javax.swing.JLabel();
        curbWeightLabel = new javax.swing.JLabel();
        wheelDimensionTextField2 = new javax.swing.JTextField();
        tireTypeTextField2 = new javax.swing.JTextField();
        fuelTankCapacityTextField2 = new javax.swing.JTextField();
        topSpeedTextField2 = new javax.swing.JTextField();
        transmissionTypeTextField1 = new javax.swing.JTextField();
        engineTorqueTextField1 = new javax.swing.JTextField();
        engineHPTextField1 = new javax.swing.JTextField();
        engineLtrsTextField1 = new javax.swing.JTextField();
        companyLabel = new javax.swing.JLabel();
        companyTextField1 = new javax.swing.JTextField();
        modelLabel = new javax.swing.JLabel();
        colorLabel = new javax.swing.JLabel();
        startingPriceLabel = new javax.swing.JLabel();
        engineLitresLabel = new javax.swing.JLabel();
        startingPriceTextField1 = new javax.swing.JTextField();
        colorTextField1 = new javax.swing.JTextField();
        engineHorsePowerLabel = new javax.swing.JLabel();
        modelTextField1 = new javax.swing.JTextField();
        curbWeightTextField1 = new javax.swing.JTextField();
        lwhTextField1 = new javax.swing.JTextField();
        tireDimensionTextField2 = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();

        jLabel13.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        jLabel13.setText("TIRE TYPE");

        jLabel14.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        jLabel14.setText("WHEEL DIMENSION (in)");

        jLabel15.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        jLabel15.setText("TIRE DIMENSION (mm)");

        jLabel22.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        jLabel22.setText("HEADROOM (in)");

        jLabel23.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        jLabel23.setText("LEGROOM FRONT/REAR (in)");

        setBackground(new java.awt.Color(204, 204, 204));
        setToolTipText("");

        viewCarLabel.setFont(new java.awt.Font("Chalkboard", 1, 24)); // NOI18N
        viewCarLabel.setText("VIEW THE CAR DETAILS");

        engineTorqueLabel.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        engineTorqueLabel.setText("ENGINE TORQUE (lb-ft @ rpm)");

        transmissionTypeLabel.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        transmissionTypeLabel.setText("TRANSMISSION TYPE");

        topSpeedLabel.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        topSpeedLabel.setText("TOP SPEED (mph)");

        jLabel26.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        jLabel26.setText("FUEL TANK CAPACITY (gallons)");

        tireTypeLabel.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        tireTypeLabel.setText("TIRE TYPE");

        wheelDimensionLabel.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        wheelDimensionLabel.setText("WHEEL DIMENSION (in)");

        tireDimensionLabel.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        tireDimensionLabel.setText("TIRE DIMENSION (mm)");

        lwhLabel.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        lwhLabel.setText("EXTERIOR LENGTH, WIDTH, HEIGHT (in)");

        curbWeightLabel.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        curbWeightLabel.setText("CURB WEIGHT (lbs)");

        transmissionTypeTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transmissionTypeTextField1ActionPerformed(evt);
            }
        });

        engineTorqueTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                engineTorqueTextField1ActionPerformed(evt);
            }
        });

        companyLabel.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        companyLabel.setText("COMPANY");

        companyTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyTextField1ActionPerformed(evt);
            }
        });

        modelLabel.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        modelLabel.setText("MODEL");

        colorLabel.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        colorLabel.setText("COLOR");

        startingPriceLabel.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        startingPriceLabel.setText("STARTING PRICE");

        engineLitresLabel.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        engineLitresLabel.setText("ENGINE LITRES");

        colorTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorTextField1ActionPerformed(evt);
            }
        });

        engineHorsePowerLabel.setFont(new java.awt.Font("PT Serif Caption", 0, 13)); // NOI18N
        engineHorsePowerLabel.setText("ENGINE HORSEPOWER (bhp)");

        modelTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelTextField1ActionPerformed(evt);
            }
        });

        curbWeightTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curbWeightTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(viewCarLabel)
                        .addGap(333, 333, 333))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(companyLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(modelLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(colorLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(startingPriceLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(engineLitresLabel))
                            .addComponent(engineTorqueLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(engineHorsePowerLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(transmissionTypeLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(engineHPTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transmissionTypeTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(companyTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modelTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(colorTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startingPriceTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(engineLtrsTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(engineTorqueTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lwhLabel)
                                        .addGap(7, 7, 7)
                                        .addComponent(lwhTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(141, 141, 141)
                                                .addComponent(tireTypeLabel))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(wheelDimensionLabel))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addComponent(tireDimensionLabel)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tireDimensionTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tireTypeTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(wheelDimensionTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(146, 146, 146)
                                            .addComponent(curbWeightLabel)
                                            .addGap(6, 6, 6)
                                            .addComponent(curbWeightTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(91, 91, 91)
                                                    .addComponent(topSpeedLabel))
                                                .addComponent(jLabel26))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(topSpeedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fuelTankCapacityTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewCarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(companyTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(modelTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(colorTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(startingPriceTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(engineLtrsTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tireTypeTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(wheelDimensionTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tireTypeLabel)
                                        .addGap(14, 14, 14)
                                        .addComponent(wheelDimensionLabel)
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tireDimensionLabel)
                                            .addComponent(tireDimensionTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(lwhLabel))
                                    .addComponent(lwhTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(curbWeightLabel))
                                    .addComponent(curbWeightTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(engineTorqueTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(engineHPTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(transmissionTypeTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(topSpeedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(fuelTankCapacityTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(topSpeedLabel)
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel26)
                                        .addGap(4, 4, 4))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(companyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(modelLabel)
                        .addGap(14, 14, 14)
                        .addComponent(colorLabel)
                        .addGap(13, 13, 13)
                        .addComponent(startingPriceLabel)
                        .addGap(39, 39, 39)
                        .addComponent(engineLitresLabel)
                        .addGap(14, 14, 14)
                        .addComponent(engineTorqueLabel)
                        .addGap(20, 20, 20)
                        .addComponent(engineHorsePowerLabel)
                        .addGap(11, 11, 11)
                        .addComponent(transmissionTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void transmissionTypeTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transmissionTypeTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transmissionTypeTextField1ActionPerformed

    private void engineTorqueTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_engineTorqueTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_engineTorqueTextField1ActionPerformed

    private void companyTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyTextField1ActionPerformed

    private void colorTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorTextField1ActionPerformed

    private void modelTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelTextField1ActionPerformed

    private void curbWeightTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curbWeightTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_curbWeightTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel colorLabel;
    private javax.swing.JTextField colorTextField1;
    private javax.swing.JLabel companyLabel;
    private javax.swing.JTextField companyTextField1;
    private javax.swing.JLabel curbWeightLabel;
    private javax.swing.JTextField curbWeightTextField1;
    private javax.swing.JTextField engineHPTextField1;
    private javax.swing.JLabel engineHorsePowerLabel;
    private javax.swing.JLabel engineLitresLabel;
    private javax.swing.JTextField engineLtrsTextField1;
    private javax.swing.JLabel engineTorqueLabel;
    private javax.swing.JTextField engineTorqueTextField1;
    private javax.swing.JTextField fuelTankCapacityTextField;
    private javax.swing.JTextField fuelTankCapacityTextField2;
    private javax.swing.JTextField headRoomTextField;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JTextField legRoomTextField;
    private javax.swing.JLabel lwhLabel;
    private javax.swing.JTextField lwhTextField1;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField modelTextField1;
    private javax.swing.JLabel startingPriceLabel;
    private javax.swing.JTextField startingPriceTextField1;
    private javax.swing.JLabel tireDimensionLabel;
    private javax.swing.JTextField tireDimensionTextField;
    private javax.swing.JTextField tireDimensionTextField2;
    private javax.swing.JLabel tireTypeLabel;
    private javax.swing.JTextField tireTypeTextField;
    private javax.swing.JTextField tireTypeTextField2;
    private javax.swing.JLabel topSpeedLabel;
    private javax.swing.JTextField topSpeedTextField;
    private javax.swing.JTextField topSpeedTextField2;
    private javax.swing.JLabel transmissionTypeLabel;
    private javax.swing.JTextField transmissionTypeTextField1;
    private javax.swing.JLabel viewCarLabel;
    private javax.swing.JLabel wheelDimensionLabel;
    private javax.swing.JTextField wheelDimensionTextField;
    private javax.swing.JTextField wheelDimensionTextField2;
    // End of variables declaration//GEN-END:variables
}
