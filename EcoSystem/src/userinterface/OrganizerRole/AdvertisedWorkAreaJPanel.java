/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.OrganizerRole;

import Business.Application.Application;
import Business.Application.SplitVolunteerRequest;
import Business.EcoSystem;
import Business.Employee.Employee;
import userinterface.DigitalMarketingRole.*;
import Business.Enterprise.Enterprise;
import Business.Organization.FundRaiserOrganization;
import Business.Organization.Organization;
import Business.UserAccount.OrganizerAccount;
import Business.UserAccount.UserAccount;
import Business.UserAccount.VolunteerAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Utils.BusinessStatus;
import Business.Utils.BusinessUtils;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import userinterface.LabAssistantRole.EnvironmentalistWorkAreaJPanel;
import userinterface.MainJFrame;

/**
 * jcommon-1.0.23.jar jfreechart-1.0.19-experimental.jar jfreechart-1.0.19.jar
 *
 * @author raunak
 */
public class AdvertisedWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private WorkRequest workRequest;
    private FundRaiserOrganization fundRaiserOrg;
    private EcoSystem business;

    private int toSplitCountInt;
    private double targetAmountDouble;
    private double targetPerVolDouble;
    
    final Logger logger = Logger.getLogger(MainJFrame.class);

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public AdvertisedWorkAreaJPanel(JPanel userProcessContainer,
            WorkRequest workRequest, UserAccount userAccount,
            FundRaiserOrganization fundRaiserOrg, 
            Enterprise enterprise,
            EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = userAccount;

        this.workRequest = workRequest;
        this.fundRaiserOrg = fundRaiserOrg;
        this.enterprise = enterprise;

        if (userAccount instanceof OrganizerAccount) {
            this.toSplitCountInt = ((OrganizerAccount) userAccount).getVolunteerList().size();
            numVolUnderMe.setText(String.valueOf(toSplitCountInt));
        }

        if (workRequest instanceof Application) {
            targetAmountDouble = ((Application) workRequest).getAmountRequested();
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            deadline.setText(dateFormat.format(((Application) workRequest).getRequiredBy()).toString());

        }

        this.targetAmount.setText(String.valueOf(targetAmountDouble));

        if (toSplitCountInt != 0) {
            targetPerVolDouble = targetAmountDouble / toSplitCountInt;
            targetPerVol.setText(String.valueOf(targetPerVolDouble));
        }
        
        this.postAvailabilityButton.setVisible(false);
        
        if(this.workRequest.getStatus().equals(BusinessStatus.Advertised.getValue())){
            this.postAvailabilityButton.setVisible(true);
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

        postAvailabilityButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numVolUnderMe = new javax.swing.JLabel();
        targetAmount = new javax.swing.JLabel();
        targetPerVol = new javax.swing.JLabel();
        deadline = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setLayout(null);

        postAvailabilityButton.setText("Post Availability of task to dashboard");
        postAvailabilityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postAvailabilityButtonActionPerformed(evt);
            }
        });
        add(postAvailabilityButton);
        postAvailabilityButton.setBounds(451, 388, 280, 29);

        jLabel1.setText("No of Volunteers under me");
        add(jLabel1);
        jLabel1.setBounds(96, 70, 169, 16);

        jLabel2.setText("Target Amount");
        add(jLabel2);
        jLabel2.setBounds(171, 118, 94, 16);

        jLabel3.setText("Target Amount per Volunteer");
        add(jLabel3);
        jLabel3.setBounds(83, 176, 182, 16);

        jLabel4.setText("Deadline");
        add(jLabel4);
        jLabel4.setBounds(210, 233, 55, 16);

        numVolUnderMe.setText("jLabel5");
        add(numVolUnderMe);
        numVolUnderMe.setBounds(399, 70, 170, 16);

        targetAmount.setText("jLabel6");
        add(targetAmount);
        targetAmount.setBounds(399, 118, 140, 16);

        targetPerVol.setText("jLabel7");
        add(targetPerVol);
        targetPerVol.setBounds(399, 176, 160, 16);

        deadline.setText("jLabel8");
        add(deadline);
        deadline.setBounds(399, 233, 420, 16);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(52, 388, 75, 29);

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/apple/Downloads/images-for-fr/volvol.jpeg")); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(0, 0, 1760, 1100);
    }// </editor-fold>//GEN-END:initComponents

    private void postAvailabilityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postAvailabilityButtonActionPerformed

        Application ref = (Application) workRequest;
        
        for (int i = 0; i < toSplitCountInt; i++) {

            SplitVolunteerRequest svr = new SplitVolunteerRequest();

            svr.setCause(ref.getCause());
            svr.setAmountRequested(targetPerVolDouble);
            svr.setDescription(ref.getDescription());
            svr.setMessage(ref.getMessage());
            svr.setSender(ref.getSender());
            svr.setRequiredBy(ref.getRequiredBy());
            svr.setTaskStatus(BusinessStatus.ReadyToPick.getValue());
            svr.setStatus(BusinessStatus.InProgress.getValue());
            
            //sending the email
//            if(BusinessUtils.sendEmail(((Application)workRequest).getPayeeEmail()
//                ,"Your application's background check for "+((Application)workRequest).getCause()+
//                        " cause is in progress!","Information regarding your new Fund Request").equals("unsuccessful")){
//                return;
//            } 
            
            svr.setAmountRequested(ref.getAmountRequested());
            svr.setSplitAmountRequired(svr.getSplitAmount());

            svr.setParentWorkRequest(ref);
            svr.setSplitAmount(svr.getAmountRequested()/toSplitCountInt);

            this.fundRaiserOrg.getWorkQueue().addWorkRequest(svr);

            ref.addChild(svr);
            
        }

        List<String> li = new ArrayList<>();
        for(VolunteerAccount email : ((OrganizerAccount)userAccount).getVolunteerList()){
            
            li.add(email.getUsername());
            
        }
        
        String content = "New Fundraiser posted by \n"
                + "User:" + ref.getSender()+"\n";
        content += "Total Amount: "+ref.getAmountRequired() + "\n";
        content += "Due date: "+ref.getResolveDate()+"\n";
        content += "Cause: "+ref.getCause()+"\n";
        content += "Description: "+ref.getDescription() + "\n";
        
        if(ref.getChildren().size() > 0 ){
            content += "Amount per Volunteer task: "+ref.getChildren().get(0).getSplitAmount()+ "\n";
        }
        
        
        BusinessUtils.sendMultipleEmails(li, content, "New Fund Raising Post available on Dashboard!");
        logger.info(content);
        
        this.workRequest.setStatus(BusinessStatus.InProgress.getValue());

        BusinessUtils.addToNextQueue(null, Organization.Type.Payer,
                workRequest, this.business, this.enterprise);

        JOptionPane.showMessageDialog(null, "Fund Raising task split to " + toSplitCountInt + " Volunteer tasks!");
        logger.info("Fund Raising task split to " + toSplitCountInt + " Volunteer tasks!");

//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
////        userProcessContainer.add("DigitalMarketingWorkAreaRequestDetailsJPanel", 
////                new DigitalMarketingWorkAreaRequestDetailsJPanel(userProcessContainer, 
////                        userAccount, enterprise));
//        layout.next(userProcessContainer);
        
        
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        OrganizerWorkAreaJPanel orgPanel = (OrganizerWorkAreaJPanel) component;
        orgPanel.refreshPage();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_postAvailabilityButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
//        EnvironmentalistWorkAreaJPanel dwjp = (EnvironmentalistWorkAreaJPanel) component;
//        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel deadline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel numVolUnderMe;
    private javax.swing.JButton postAvailabilityButton;
    private javax.swing.JLabel targetAmount;
    private javax.swing.JLabel targetPerVol;
    // End of variables declaration//GEN-END:variables
}
