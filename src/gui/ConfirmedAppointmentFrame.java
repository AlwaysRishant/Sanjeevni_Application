/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.gui;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import sanjeevaniapp.dao.AppointmentDao;
import sanjeevaniapp.pojo.AppointmentPojo;
import sanjeevaniapp.pojo.UserProfile;
import sanjeevaniapp.utility.Sender;
import sanjeevaniapp.utility.SmsSender;

/**
 *
 * @author pc
 */
public class ConfirmedAppointmentFrame extends javax.swing.JFrame {

    /**
     * Creates new form ConfoemAppointmentFrame
     */
    private AppointmentPojo app;
    public ConfirmedAppointmentFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
     public ConfirmedAppointmentFrame(AppointmentPojo app){
        this();
        this.app=app;
        txtPatientId.setText(app.getPatientId());
        txtPatientName.setText(app.getPatientName());
        txtOPD.setText(app.getOpd());
        txtAppointmentDate.setText(app.getAppointmentDate());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtOPD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAppointmentDate = new javax.swing.JTextField();
        txtPatientId = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        btnCancle = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        dateSpinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setText("Sanjeevani Application");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 560, 60));

        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 68, 550, -1));

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 570, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -190, 1050, 710));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 370));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Appointment Confirmation");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 30));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 17))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Patient ID");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        txtPatientName.setEditable(false);
        txtPatientName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });
        jPanel4.add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 290, -1));

        txtOPD.setEditable(false);
        txtOPD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtOPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOPDActionPerformed(evt);
            }
        });
        jPanel4.add(txtOPD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 270, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Patient Name");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("OPD");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Appointment Date");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        txtAppointmentDate.setEditable(false);
        txtAppointmentDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(txtAppointmentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 290, 30));

        txtPatientId.setEditable(false);
        txtPatientId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(txtPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 270, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 970, 130));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 153, 102));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 110, -1));

        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(0, 153, 102));
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        jPanel3.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 360, -1));

        btnCancle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancle.setForeground(new java.awt.Color(0, 153, 102));
        btnCancle.setText("Cancel");
        btnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancle, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, 150, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Appointment Scheduled");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, 220, 30));

        dateSpinner.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dateSpinner.setModel(new javax.swing.SpinnerDateModel());
        dateSpinner.setAutoscrolls(true);
        dateSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(dateSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 190, 760, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 1030, 280));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        DoctorsOptionsFrame DocOption=new DoctorsOptionsFrame();
        DocOption.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        String dateStr=dateSpinner.getValue().toString();
        System.out.println(dateStr);
      DateTimeFormatter dtf=DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss z yyyy");
      LocalDateTime appDateTime=LocalDateTime.parse(dateStr,dtf);
      LocalDateTime currDateTime=LocalDateTime.now();
        int ans=appDateTime.compareTo(currDateTime);
      if(ans>0)
      {
           DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss a");
           String appDateTimeStr=appDateTime.format(dtf2);
           app.setAppointmentDate(appDateTimeStr);
           app.setStatus("CONFIRM");
           try{
               boolean result=AppointmentDao.updateStatus(app);
               if(result){
                   Sender obj=new SmsSender();
                   String msg="Hello "+app.getPatientName()+"\nYour appointment is fixed at "+appDateTimeStr+" with Dr. " +UserProfile.getUserName();
                   boolean smsResult=obj.send(app.getMobileNo(), msg);
                   System.out.println("smsResult:"+smsResult);
                   if(smsResult){
                       System.out.println("in if smsResult:"+smsResult);
                       JOptionPane.showMessageDialog(null, "Message Sent");
                       DoctorsOptionsFrame fr=new DoctorsOptionsFrame();
                       fr.setVisible(true);
                       this.dispose();
                   }else{
                       JOptionPane.showMessageDialog(null, "Message Sending Failed");
                   }
                   
               }
               
          
      }
           catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error in DB Update Status");
                ex.printStackTrace();
           }
               
           catch(Exception ex2){
                    JOptionPane.showMessageDialog(null, "Error In Sending SMS");
                    ex2.printStackTrace();
                   }
      }else{
          JOptionPane.showMessageDialog(null, "Appointment should be after current time");
      }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
       String AppDateTime =txtAppointmentDate.toString();
       
           app.setStatus("CANCLE");
           try{
               boolean result=AppointmentDao.updateStatusAppCancle(app);
               if(result){
                   Sender obj=new SmsSender();
                   String msg="Hello "+app.getPatientName()+"\nYour  fixed appointment "+AppDateTime+" is cancled by Dr. " +UserProfile.getUserName();
                   boolean smsResult=obj.send(app.getMobileNo(), msg);
                   System.out.println("smsResult:"+smsResult);
                   if(smsResult){
                       System.out.println("in if smsResult:"+smsResult);
                       JOptionPane.showMessageDialog(null, "Message Sent");
                   }else{
                       JOptionPane.showMessageDialog(null, "Message Sending Failed");
                   }
                   
               }
               
          
      }
           catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error in DB Update Status");
                ex.printStackTrace();
           }
               
           catch(Exception ex2){
                    JOptionPane.showMessageDialog(null, "Error In Sending SMS");
                    ex2.printStackTrace();
                   }
     
    }//GEN-LAST:event_btnCancleActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void txtOPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOPDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOPDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConfirmedAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmedAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmedAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmedAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmedAppointmentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JSpinner dateSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtAppointmentDate;
    private javax.swing.JTextField txtOPD;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
   
}
