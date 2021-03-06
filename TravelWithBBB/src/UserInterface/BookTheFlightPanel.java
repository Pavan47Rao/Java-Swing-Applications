/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import javax.swing.table.DefaultTableModel;
import Business.Components.AirlineDirectory;
import Business.Components.Flight;
import Business.Users.Airline;
import Business.BusinessUtils;
import Business.Components.Seat;
import Business.Components.Ticket;
import Business.Users.Customer;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.UIManager;

/**
 *
 * @author apple
 */
public class BookTheFlightPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerBookFlightPanel
     */
    int x = -1, y = -1;
    int rows = 10;
    int columns = 3;
    JFrame frame = new JFrame("JToggleButton Test");
    JPanel panel = new JPanel(new GridLayout(rows, columns));
    
    private AirlineDirectory arlineList;
    private JPanel userProcessContainer;
    private Customer customer;
    private Flight flight;
    private Airline airline;
    
    BookTheFlightPanel(JPanel userProcessContainer, Customer customer,Flight flight,Airline airline) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.customer=customer;
        this.flight = flight;
        this.airline = airline;
        arlineList=BusinessUtils.getAirlineDirectory();
        btnSelectConfirm.setVisible(false);
        btnBookFlight.setVisible(false);
        
        header.setText(header.getText() + airline.getName() );
    }
    
    
    void generateSeatGrid(Seat[][] arr) {

//        Icon res = UIManager.getIcon(
//                "Tree.openIcon"
////                "RadioButton.iconChecked"
//        );
        
        ImageIcon res = new ImageIcon("C:\\Users\\Floyed Pinto\\Desktop\\tick.png");
        
        rows = arr.length;
        columns = arr[0].length;
        panel.removeAll();

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {

                final JToggleButton button = new JToggleButton(row + " - " + column);

                if (x > -1 && y > -1) {
                    if (x == row && y == column) {
                        button.setIcon(res);
                    }
                }

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
                        boolean selected = abstractButton.getModel().isSelected();
                        if (selected) {
                            resetAll();
                            button.setIcon(res);
                            btnSelectConfirm.setVisible(true);
                            btnBookFlight.setVisible(true);
                        } else {
                            button.setIcon(null);
                        }
                    }

                    void resetAll() {
                        for (Component c : panel.getComponents()) {
                            JToggleButton b = (JToggleButton) c;
                            if(b.isEnabled()){
                                b.setSelected(false);
                                b.setIcon(null);
                            } 
                        }
                    }
                });
                
                if(arr[row][column] != null){
                    button.setEnabled(false);
                }
                
                panel.add(button);
            }
        }

        frame = new JFrame("JToggleButton Test");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocation(150, 150);
        frame.setVisible(true);

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnBookFlight = new javax.swing.JButton();
        btnSelect = new javax.swing.JButton();
        txtSelect = new javax.swing.JTextField();
        btnSelectConfirm = new javax.swing.JButton();
        header = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 1500));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnBookFlight.setText("Book Flight");
        btnBookFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookFlightActionPerformed(evt);
            }
        });

        btnSelect.setText("Select Seats");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnSelectConfirm.setText("Select");
        btnSelectConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectConfirmActionPerformed(evt);
            }
        });

        header.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        header.setText("Please Select the seats for ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnBack)
                        .addGap(154, 154, 154)
                        .addComponent(header))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBookFlight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSelectConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSelect)
                            .addComponent(btnSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))))
                .addGap(368, 368, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(header))
                .addGap(45, 45, 45)
                .addComponent(btnSelect)
                .addGap(50, 50, 50)
                .addComponent(txtSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnSelectConfirm)
                .addGap(58, 58, 58)
                .addComponent(btnBookFlight)
                .addContainerGap(1156, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookFlightActionPerformed
        // TODO add your handling code here:
        Ticket ticket=new Ticket();
        Seat seat=new Seat();
        seat.setX(x);
        seat.setY(y);

        if(x==-1 && y==-1){
            JOptionPane.showMessageDialog(null, "Please select the seats!");
            return;
        }else{
            ticket.setFlight(flight);
            ticket.setAirline(airline);
            ticket.setSeat(seat);
            ticket.setCustomer(customer);
            
            flight.getSeats()[x][y] = seat;
            
            BusinessUtils.getTicketDirectory().addTicket(ticket);
            JOptionPane.showMessageDialog(null, "Booking was successfull!");
            
            btnBackActionPerformed(evt);
        }
    }//GEN-LAST:event_btnBookFlightActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:

        generateSeatGrid(flight.getSeats());
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnSelectConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectConfirmActionPerformed
        // TODO add your handling code here:
        
         for (Component c : panel.getComponents()) {
            JToggleButton b = (JToggleButton) c;
            if (b.getIcon() != null) {
                x = Integer.valueOf(b.getText().split(" - ")[0]);
                y = Integer.valueOf(b.getText().split(" - ")[1]);
            }
        }

        txtSelect.setText(x + "-" + y);
        frame.setVisible(false);
        btnSelectConfirm.setVisible(false);

    }//GEN-LAST:event_btnSelectConfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookFlight;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnSelectConfirm;
    private javax.swing.JLabel header;
    private javax.swing.JTextField txtSelect;
    // End of variables declaration//GEN-END:variables
}
