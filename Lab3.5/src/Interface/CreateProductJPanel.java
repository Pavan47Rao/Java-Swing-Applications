/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;
import Business.ProductDirectory;
import Business.Product;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
/**
 *
 * @author info
 */
public class CreateProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAccontJPanel
     */
    private ProductDirectory prodDir;
    private JPanel productContainer;
    
    public CreateProductJPanel(ProductDirectory prodDir, JPanel productContainer) {
        initComponents();
        this.prodDir = prodDir;
        this.productContainer = productContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHead = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        txtProdName = new javax.swing.JTextField();
        txtAvailablity = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        lblHead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHead.setText("Create Product");

        lblProductName.setText("Product Name*");

        lblAvailability.setText("Availability*");

        lblPrice.setText("Price*");

        lblBalance.setText("Description");

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        btnCreate.setText("Create Product");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(lblHead))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProductName)
                                    .addComponent(lblAvailability)
                                    .addComponent(lblPrice)
                                    .addComponent(lblBalance))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAvailablity)
                                    .addComponent(txtPrice)
                                    .addComponent(txtDescription)
                                    .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btnCreate))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnBack)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(lblHead)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName)
                    .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBalance)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreate)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:                 
        Product prod = new Product();    
        ArrayList<String> messageLog = new ArrayList<>();
        
        //Handle empty, incorrect and correct inputs for product name
        String name = txtProdName.getText();
        if(name.isEmpty()) {
            messageLog.add(lblProductName.getText() + " cannot be empty");
        }
        
        //Handle empty, incorrect and correct inputs for product availability
        String avail = txtAvailablity.getText();
        int availability = 0;
        if(avail.isEmpty()) {
            messageLog.add(lblAvailability.getText() + " cannot be empty");
        }
        else {
            try {
                Integer.parseInt(avail);
                availability = Integer.parseInt(avail);
                
            } catch (NumberFormatException e) {
                messageLog.add(avail + " is not a valid number.");
            }
        }
        
        //Handle empty, incorrect and correct inputs for product price
        String price = txtPrice.getText();
        Double prodPrice = 0.0;
        if(price.isEmpty()) {
            messageLog.add(lblPrice.getText() + " cannot be empty");
        }
        else {
            try {
                Double.parseDouble(price);
                prodPrice = Double.parseDouble(price);
            } 
            catch (NumberFormatException e) {
                messageLog.add(price + " is not a valid number.");
            }
        }
        
        //Create vital sign only when there are correct inputs
        if(messageLog.isEmpty()){
            prod.setName(name);
            prod.setAvailNum(availability);
            prod.setPrice(prodPrice);
            prod.setDescription(txtDescription.getText());
            prodDir.addProduct(prod);
            JOptionPane.showMessageDialog(null, "Product added successfully!");
        }
        else {
            String errorLog="";
            for(String message: messageLog)
            errorLog+=message+"\n";
            JOptionPane.showMessageDialog(null,errorLog);
        }
            
            
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        productContainer.remove(this);
        CardLayout layout = (CardLayout) productContainer.getLayout();
        layout.previous(productContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JTextField txtAvailablity;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProdName;
    // End of variables declaration//GEN-END:variables
}
