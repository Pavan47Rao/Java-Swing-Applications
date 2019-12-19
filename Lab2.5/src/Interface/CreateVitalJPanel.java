/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 123
 */
public class CreateVitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel
     */
    private VitalSignHistory vsh;

    public CreateVitalJPanel(VitalSignHistory vsh) {
        initComponents();
        this.vsh = vsh;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tempLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bloodTextField = new javax.swing.JTextField();
        pulseLabel = new javax.swing.JLabel();
        tempTextField = new javax.swing.JTextField();
        bpLabel = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        pulseTextField = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(650, 800));

        tempLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tempLabel.setText("Temperature: ");

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Vital Sign");

        bloodTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodTextFieldActionPerformed(evt);
            }
        });

        pulseLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        pulseLabel.setText("Pulse:");

        tempTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempTextFieldActionPerformed(evt);
            }
        });

        bpLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        bpLabel.setText("Bloodpressure:");

        dateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextFieldActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        pulseTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulseTextFieldActionPerformed(evt);
            }
        });

        dateLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        dateLabel.setText("Date: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pulseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(pulseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bpLabel)
                                    .addGap(75, 75, 75)
                                    .addComponent(bloodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tempLabel)
                                    .addGap(81, 81, 81)
                                    .addComponent(tempTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateLabel)
                                .addGap(139, 139, 139)
                                .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempLabel))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bpLabel))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pulseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pulseLabel))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLabel))
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bloodTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodTextFieldActionPerformed

    private void tempTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempTextFieldActionPerformed

    private void dateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextFieldActionPerformed

    private void pulseTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulseTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pulseTextFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        VitalSigns v = new VitalSigns();

        //Maintain error log to stack all error messages
        ArrayList<String> messageLog = new ArrayList<>();
        
        //Handle empty, incorrect and correct inputs for temperature 
        String temp = tempTextField.getText();
        if(temp.isEmpty()) {
            messageLog.add("Please enter a valid "+tempLabel.getText());
        }
        else {
            try {
                Double.parseDouble(temp);
                double temperature = Double.parseDouble(temp);
                v.setTemperature(temperature);
            } 
            catch (NumberFormatException e) {
                messageLog.add(temp + " is not a valid number.");
            }
        }
        
        //Handle empty, incorrect and correct inputs for blood pressure
        String blood = bloodTextField.getText();
        if(blood.isEmpty()) {
            messageLog.add("Please enter a valid "+bpLabel.getText());
        }
        else {
            try {
                Double.parseDouble(blood);
                double bloodPressure = Double.parseDouble(blood);
                v.setBloodPressure(bloodPressure);
            } catch (NumberFormatException e) {
                messageLog.add(blood + " is not a valid number.");
            }
        }
        
        //Handle empty, incorrect and correct inputs for pulse
        String p = pulseTextField.getText();
        if(p.isEmpty()) {
            messageLog.add("Please enter a valid "+pulseLabel.getText());
        }
        else {
            try {
                Integer.parseInt(p);
                int pulse = Integer.parseInt(p);
                v.setPulse(pulse);
            } catch (NumberFormatException e) {
                messageLog.add(p + " is not a valid number.");
            }
        }
        
        //Handle empty and correct inputs for date
        String date = dateTextField.getText();
        if(date.isEmpty()) {
            messageLog.add("Please enter a valid "+dateLabel.getText());
        }
        else {
            v.setDate(date);
        }
        
        //Create vital sign only when there are correct inputs
        if(messageLog.isEmpty()){
            vsh.addVital(v);
            JOptionPane.showMessageDialog(null, "Virtual Signs added successfully!");        
            tempTextField.setText("");
            bloodTextField.setText("");
            pulseTextField.setText("");
            dateTextField.setText("");
        }
        else {
            String errorLog="";
            for(String message: messageLog)
            errorLog+=message+"\n";
            JOptionPane.showMessageDialog(null,errorLog);
        }
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloodTextField;
    private javax.swing.JLabel bpLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel pulseLabel;
    private javax.swing.JTextField pulseTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel tempLabel;
    private javax.swing.JTextField tempTextField;
    // End of variables declaration//GEN-END:variables
}