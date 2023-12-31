/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.gui;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import sanjeevaniapp.dao.AppointmentDao;
import sanjeevaniapp.dao.DoctorsDao;
import sanjeevaniapp.dao.PatientDao;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.AppointmentPojo;
import sanjeevaniapp.pojo.PatientPojo;

/**
 *
 * @author pc
 */
public class UpdatePatientFrame extends javax.swing.JFrame {

   private String OPD,selDoctorId,PatientID;
   private String LastName,FirstName,Status;
   private String contactNo,City,Date,Address;
    private int OTP,Age;
     java.sql.Date dt;
    public UpdatePatientFrame() {
        initComponents();
        loadPatientsId();
        loadDoctorsId();
        setLocationRelativeTo(null);
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
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jcGender = new javax.swing.JComboBox<>();
        jcDocId = new javax.swing.JComboBox<>();
        txtOPD = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtContactNum = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jcMeritalStatus = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jcPatientId = new javax.swing.JComboBox<>();
        txtCity = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 550, -1));

        jSeparator2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 570, 70));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setText("Sanjeevani Application");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 560, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -60, 1040, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Update Patient Frame");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 230, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient's Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("OPD");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("DoctorID");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Patient ID");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Age");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("City");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("First Name");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Last Name");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Date");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Phone No.");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Marital Status");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Gender");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jcGender.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jcGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHERS" }));
        jPanel3.add(jcGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 200, 30));

        jcDocId.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel3.add(jcDocId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 200, 30));

        txtOPD.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtOPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOPDActionPerformed(evt);
            }
        });
        jPanel3.add(txtOPD, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 200, 30));

        txtFirstName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 200, 30));

        txtLastName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel3.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 200, 30));

        txtContactNum.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtContactNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNumActionPerformed(evt);
            }
        });
        jPanel3.add(txtContactNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 200, 30));

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel3.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 200, 30));

        jcMeritalStatus.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jcMeritalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MARRIED", "UNMARRIED" }));
        jPanel3.add(jcMeritalStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 200, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Address");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 70, 20));

        txtAddress.setColumns(18);
        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, 50));

        jcPatientId.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jcPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPatientIdActionPerformed(evt);
            }
        });
        jPanel3.add(jcPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 200, 30));

        txtCity.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel3.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 200, 30));

        txtAge.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel3.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 200, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 750, 320));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 153, 102));
        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, 210, 30));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 153, 102));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 650, 100, -1));

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 153, 102));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 650, 100, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/images (2).jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, 190, 230));

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(0, 153, 102));
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 340, 140, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 690));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOPDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOPDActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ReceptionistOptionsFrame  RecOptions=new  ReceptionistOptionsFrame();
        RecOptions.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtContactNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNumActionPerformed

    private void jcPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPatientIdActionPerformed
       try{
            PatientID=jcPatientId.getSelectedItem().toString();
            PatientPojo pt=PatientDao.getPatientDetailsbyPatId(PatientID);
            txtAddress.setText(pt.getAddress());
            txtAge.setText(String.valueOf(pt.getAge()));
            txtCity.setText(pt.getCity());
            txtContactNum.setText(pt.getMno());
            txtDate.setText(pt.getDate().toString());
            jcDocId.setSelectedItem(pt.getDoctorId());
            txtFirstName.setText(pt.getFirstName());
            txtLastName.setText(pt.getLastName());
            txtOPD.setText(pt.getOpd());
            jcGender.setSelectedItem(pt.getGender());
            jcMeritalStatus.setSelectedItem(pt.getMarriedStatus());
            OTP=pt.getOtp();
            Status=pt.getAptStatus();
            dt=pt.getDate();
            this.btnUpdate.setEnabled(true);
         } 
        catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error In DB Update patient "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }   
    }//GEN-LAST:event_jcPatientIdActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
      if(validateInputs()==false){
         JOptionPane.showMessageDialog(null, "Please input all the fields");
         return;
        }
      if(isContactNoValid()==false){
         JOptionPane.showMessageDialog(null, "Invalid mobile no");
         return;
        }
     try{
         PatientPojo pat=new PatientPojo();
         pat.setAddress(Address);
         pat.setPatientId(PatientID);
         pat.setAge(Age);
         pat.setCity(City);
         pat.setMno(contactNo);
         pat.setDoctorId(jcDocId.getSelectedItem().toString());
         pat.setFirstName(FirstName);
         pat.setGender(jcGender.getSelectedItem().toString());
         pat.setLastName(LastName);
         pat.setMarriedStatus(jcMeritalStatus.getSelectedItem().toString());
         pat.setOpd(OPD);
         pat.setDate(dt);
         pat.setAptStatus(Status);
         pat.setOtp(OTP);
         boolean result1=PatientDao.updatePatient(pat);
         String DocName=DoctorsDao.getDocNamebyDocId(selDoctorId);
         AppointmentPojo patient=new AppointmentPojo();
         patient.setMobileNo(contactNo);
         patient.setDoctorName(DocName);
         patient.setAppointmentDate(Date);
         patient.setOpd(OPD);
         patient.setPatientId(PatientID);
         patient.setPatientName(FirstName+" "+LastName);
         patient.setStatus(Status);
         boolean result2=AppointmentDao.updatePatient(patient);
         if(result1==true && result2==true){
         JOptionPane.showMessageDialog(null, "Patient update successfully ");
         return;
         }
        JOptionPane.showMessageDialog(null, "Patient update unsuccessful!"); 
        return; 
                 
     }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB update Patient:"+ex);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginFrame Login=new LoginFrame();
        Login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        ReceptionistOptionsFrame  RecOptions=new  ReceptionistOptionsFrame();
        RecOptions.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePatientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> jcDocId;
    private javax.swing.JComboBox<String> jcGender;
    private javax.swing.JComboBox<String> jcMeritalStatus;
    private javax.swing.JComboBox<String> jcPatientId;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactNum;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtOPD;
    // End of variables declaration//GEN-END:variables

   private void loadPatientsId() {
        try{
            List<String>patientIdList=PatientDao.getAllPatientId();
            for(String id:patientIdList){
                jcPatientId.addItem(id);
            }
             }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error In DB update PatientS loadPatientId "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
    }
       private void loadDoctorsId() {
  try{
            List<String>docList=DoctorsDao.getAllDoctorId();
            for(String docId:docList){
                jcDocId.addItem(docId);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DB: Update Patient "+ex.getMessage());
            ex.printStackTrace();
        }
    }
        private boolean validateInputs(){
         Address=txtAddress.getText().trim();
         City=txtCity.getText().trim();
         FirstName=txtFirstName.getText().trim();
         LastName=txtLastName.getText().trim();
         OPD=txtOPD.getText().trim();
         contactNo=txtContactNum.getText().trim();
         selDoctorId=jcDocId.getSelectedItem().toString();
                
      if(Address.isEmpty()||contactNo.isEmpty()||City.isEmpty()||FirstName.isEmpty()||LastName.isEmpty()||OPD.isEmpty())
      {    
           JOptionPane.showMessageDialog(null,"Please fill all the fields");
           return false;
           
       }  
           
    try{
           Age=Integer.parseInt(this.txtAge.getText().trim());
           
       }catch(NumberFormatException ex){
          JOptionPane.showMessageDialog(null,"Invalid age"+ex);
          return false;
       }
    if(!isContactNoValid()){
        JOptionPane.showMessageDialog(null,"Invalid Mobile no");
        return false;
    }
    return true;
   }
          private boolean isContactNoValid(){
      char[]mob=contactNo.toCharArray();
      for(char ch:mob){
          if(Character.isDigit(ch)==false)
              return false;
      }
      if(contactNo.length()==10)
            return true;
      return false;
  }

}
