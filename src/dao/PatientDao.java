/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.PatientPojo;


public class PatientDao {
    
     public static List<PatientPojo> getAllPatientDetails()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select * from Patients order by Patient_id");
    List<PatientPojo>ptList=new ArrayList<>();
    while(rs.next()){
    PatientPojo pt=new PatientPojo();
    pt.setPatientId(rs.getString(1));
    pt.setFirstName(rs.getString(2));
    pt.setLastName(rs.getString(3));
    pt.setAge(rs.getInt(4));
    pt.setGender(rs.getString(5));
    pt.setMarriedStatus(rs.getString(6));
    pt.setAddress(rs.getString(7));
    pt.setCity(rs.getString(8));
    pt.setMno(rs.getString(9));
    pt.setDate(rs.getDate(10));
    pt.setOtp(rs.getInt(11));
    pt.setOpd(rs.getString(12));
    pt.setDoctorId(rs.getString(13));
    pt.setAptStatus(rs.getString(14));
    ptList.add(pt);
    
    }
    return ptList;
} 
     public static String getNextPatientId()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select max(Patient_id) from Patients");
    rs.next();
    String str=rs.getString(1);
    int PtId=101;
    if(str!=null){
        String id=str.substring(2);
        PtId=Integer.parseInt(id);
        PtId++;
    }
    String newId="PT"+PtId;
    return newId;
}
     public static boolean addPatient(PatientPojo pt)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into Patients values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
     ps.setString(1, pt.getPatientId());
     ps.setString(2, pt.getFirstName());
     ps.setString(3, pt.getLastName());
     ps.setInt(4,pt.getAge());
     ps.setString(5, pt.getGender() );
     ps.setString(6, pt.getMarriedStatus());
     ps.setString(7, pt.getAddress());
     ps.setString(8, pt.getCity());
     ps.setString(9, pt.getMno() );
     ps.setDate(10, pt.getDate());
     ps.setInt(11, pt.getOtp());
     ps.setString(12, pt.getOpd() );
     ps.setString(13, pt.getDoctorId() );
     ps.setString(14, pt.getAptStatus());
     return ps.executeUpdate()==1;
}
  public static List<String> getAllPatientId()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select patient_id from patients");
    List<String> patientIdList=new ArrayList<>();
    while(rs.next()){
        patientIdList.add(rs.getString(1));
    }
    return patientIdList;
} 
 public static boolean DeletePatientByID(String patientId)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("delete from patients where patient_id=?");
     ps.setString(1, patientId);
     return ps.executeUpdate()==1; 
 }
 public static PatientPojo getPatientDetailsbyPatId(String patientId)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select * from patients where patient_id=?");
    ps.setString(1,patientId);
    ResultSet rs=ps.executeQuery();
    rs.next();
    PatientPojo pt=new PatientPojo();
     pt.setPatientId(rs.getString(1));
     pt.setFirstName(rs.getString(2));
     pt.setLastName(rs.getString(3));
     pt.setAge(rs.getInt(4));
     pt.setGender(rs.getString(5));
     pt.setMarriedStatus(rs.getString(6));
     pt.setAddress(rs.getString(7));
     pt.setCity(rs.getString(8));
     pt.setMno(rs.getString(9));
     pt.setDate(rs.getDate(10));
     pt.setOtp(rs.getInt(11));
     pt.setOpd(rs.getString(12));
     pt.setDoctorId(rs.getString(13));
     pt.setAptStatus(rs.getString(14));
    return pt;
    
 } 
 public static boolean updatePatient(PatientPojo pt)throws SQLException{
  Connection conn=DBConnection.getConnection();
  PreparedStatement ps=conn.prepareStatement("Update patients set first_name=?,last_name=? ,age=?, gender=? ,m_status =? ,address=? , city=?, mobile_no=? ,p_date=?, opd=?, doctor_id=? where patient_id=?");
  ps.setString(1, pt.getFirstName());
  ps.setString(2, pt.getLastName());
  ps.setInt(3, pt.getAge());
  ps.setString(4, pt.getGender());
  ps.setString(5, pt.getMarriedStatus());
  ps.setString(6, pt.getAddress());
  ps.setString(7, pt.getCity());
  ps.setString(8, pt.getMno());
  ps.setDate(9, pt.getDate());
  ps.setString(10, pt.getOpd());
  ps.setString(11, pt.getDoctorId());
  ps.setString(12, pt.getPatientId());
  return ps.executeUpdate()==1;
  }
   public static List<PatientPojo> getAllPatientsByDoctorId(String doctorId)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select * from patients where doctor_id=? and status='REQUEST' order by patient_id");
    ps.setString(1,doctorId);
    ResultSet rs=ps.executeQuery();
    List<PatientPojo>patList=new ArrayList<>();
    while(rs.next()){
    PatientPojo pat=new PatientPojo();
    pat.setPatientId(rs.getString("patient_id"));
    pat.setFirstName(rs.getString("first_name")+" "+rs.getString("last_name"));
    pat.setDate(rs.getDate("p_date"));
    pat.setOpd(rs.getString("opd"));
    patList.add(pat);   
    
    }
    return patList;
   }
   /* public static List<PatientPojo> getAllPatientDetailsByDocID(String DocId)throws SQLException{
   Connection conn=DBConnection.getConnection();
   PreparedStatement ps=conn.prepareStatement("Select * from Patients Where doctor_id=?");
   ps.setString(1,DocId);
   ResultSet rs=ps.executeQuery();
   List<PatientPojo>ptList=new ArrayList<>();
   while(rs.next()){
   PatientPojo pt=new PatientPojo();
   pt.setPatientId(rs.getString(1));
   pt.setFirstName(rs.getString(2));
   pt.setLastName(rs.getString(3));
   pt.setAge(rs.getInt(4));
   pt.setGender(rs.getString(5));
   pt.setMarriedStatus(rs.getString(6));
   pt.setAddress(rs.getString(7));
   pt.setCity(rs.getString(8));
   pt.setMno(rs.getString(9));
   pt.setDate(rs.getDate(10));
   pt.setOtp(rs.getInt(11));
   pt.setOpd(rs.getString(12));
   pt.setDoctorId(rs.getString(13));
   pt.setAptStatus(rs.getString(14));
   ptList.add(pt);
   
   }
   return ptList;
   } */
   /*public static List<String> getAllPatientIdByDocId(String DocId)throws SQLException{
   Connection conn=DBConnection.getConnection();
   PreparedStatement ps=conn.prepareStatement("Select patient_id from Patients Where doctor_id=?");
   ps.setString(1,DocId);
   ResultSet rs=ps.executeQuery();
   List<String> patientIdList=new ArrayList<>();
   while(rs.next()){
   patientIdList.add(rs.getString(1));
   }
   return patientIdList;
   }*/
 public static boolean updateStatus(String patientId)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update patients set status='CONFIRM' where patient_id=?" );
     ps.setString(1, patientId);
     return ps.executeUpdate()==1;
     
     
 }
 public static String getPatientPdate(String patientId)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select p_date from patients where patient_id=?");
    ps.setString(1, patientId);
    ResultSet rs=ps.executeQuery();
     rs.next();
    String str=rs.getString(1);
    return str;
} 
 public static boolean updateStatusCancle(String patientId)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update patients set status='CANCLE' where patient_id=?" );
     ps.setString(1, patientId);
     return ps.executeUpdate()==1;
     
     
 }
}
