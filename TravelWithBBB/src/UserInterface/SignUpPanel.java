/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Users.Airline;
import Business.Users.Customer;
import Business.Users.TravelAgent;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author pavanrao
 */
public class SignUpPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUp
     */
    JPanel userProcessContainer;
    public SignUpPanel(JPanel userProcessContainer) {
        this.userProcessContainer = userProcessContainer;
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtReenteredPwd = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        comboUser = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(750, 700));

        jLabel1.setText("Sign Up");

        jLabel2.setText("User Name");

        jLabel3.setText("Password");

        jLabel4.setText("Re-enter Password");

        txtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtReenteredPwd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRegister.setText("REGISTER");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        comboUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select the type of User", "Customer", "Travel Agent", "Airline" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(btnRegister))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserName)
                            .addComponent(txtPassword)
                            .addComponent(txtReenteredPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtReenteredPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnRegister)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        txtPassword.setBorder(new LineBorder(Color.BLACK));
        txtUserName.setBorder(new LineBorder(Color.BLACK));
        txtReenteredPwd.setBorder(new LineBorder(Color.BLACK));
        String p1 = txtPassword.getText();
        String p2 = txtReenteredPwd.getText();
        String username = txtUserName.getText();
        ArrayList<String> messageLog = new ArrayList<>();
        
        String role=(String) comboUser.getSelectedItem();
        if(role.equals(("Select the type of User"))) {
            messageLog.add("Please select a role");
        }
        if(username == null || username.equals("")) {
            messageLog.add("Username can't be empty");
            txtUserName.setBorder(new LineBorder(Color.RED, 2));
        }
        if(!userNamePatternCorrect()) {
            messageLog.add("Username should be of the form xxx_xxx@xxx.com");
            txtUserName.setBorder(new LineBorder(Color.RED, 2));
        }
        if(p1 == null || p1.equals("")) {
            messageLog.add("Password can't be empty");
            txtPassword.setBorder(new LineBorder(Color.RED, 2));
        }
        if(!passwordPatternCorrect()) {
            messageLog.add("Password should be at least 6 digits and a "
            + "combination of number, upper case, lower case and "
            + "special characters $,*,# or &");
            txtPassword.setBorder(new LineBorder(Color.RED, 2));
        }
        if(p1!=null && p2!=null && !p1.equals(p2)) {
            messageLog.add("Passwords do not match");
            txtPassword.setBorder(new LineBorder(Color.RED, 2));
            txtReenteredPwd.setBorder(new LineBorder(Color.RED, 2));
        }
        if(messageLog.isEmpty() && role.equals("Customer")) {
            Customer cust = new Customer(username,p1);  
            JOptionPane.showMessageDialog(null, "Customer created successfully");
            Business.BusinessUtils.getCustomerDirectory().addCustomer(cust);
            System.out.println(Business.BusinessUtils.getCustomerDirectory().getCustomerList().size());
            toMainScreen();
            return;
        }
        if(messageLog.isEmpty() && role.equals("Airline")) {
            Airline airline = new Airline(username,p1);  
            JOptionPane.showMessageDialog(null, "Airlines created successfully");
            Business.BusinessUtils.getAirlineDirectory().addAirline(airline);
            toMainScreen();
            return;
        }
        if(messageLog.isEmpty() && role.equals("Travel Agent")) {
            TravelAgent travelAgent = new TravelAgent(username,p1);  
            JOptionPane.showMessageDialog(null, "Travel Agent created successfully");
            Business.BusinessUtils.getTravelAgentDirectory().addTravelAgent(travelAgent);
            toMainScreen();
            return;
        }
        if(!messageLog.isEmpty()) {
            String errorLog="";
            for(String message: messageLog)
            errorLog+=message+"\n";
            JOptionPane.showMessageDialog(null,errorLog);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void toMainScreen() {
        CardLayout layout =(CardLayout) this.userProcessContainer.getLayout();
        this.userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }
    private boolean passwordPatternCorrect() {
        //implement
        Pattern p = Pattern.compile("[a-zA-Z0-9#$&*]{6,60}");
        Matcher m = p.matcher(txtPassword.getText());
        boolean b = m.matches();
        return b;
    }
    
    private boolean userNamePatternCorrect() {
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m = p.matcher(txtUserName.getText());
        boolean b = m.matches();
        return b;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> comboUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtReenteredPwd;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
