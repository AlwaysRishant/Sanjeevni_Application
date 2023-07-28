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
import java.util.ArrayList;
import java.util.List;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.AppointmentPojo;


public class AppointmentDao {
     public static boolean addAppointment(AppointmentPojo appt)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into appointments values(?,?,?,?,?,?,?)");
     ps.setString(1,appt.getPatientId());
     ps.setString(2, appt.getPatientName());
     ps.setString(3,appt.getStatus());
     ps.setString(4, appt.getOpd());
     ps.setString(5, appt.getAppointmentDate());
     ps.setString(6,appt.getDoctorName());
     ps.setString(7,appt.getMobileNo());
     
     return ps.executeUpdate()==1;
}
   public static boolean DeletePatientByID(String patientId)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("delete from Appointments where patient_id=?");
     ps.setString(1, patientId);
     return ps.executeUpdate()==1; 
 }
  public static boolean updatePatient(AppointmentPojo pt)throws SQLException{
  Connection conn=DBConnection.getConnection();
  PreparedStatement ps=conn.prepareStatement("Update Appointments set patient_name=?, opd=?, mobile_no=?  where patient_id=?");
  ps.setString(1, pt.getPatientName());
  ps.setString(2, pt.getOpd());
  ps.setString(3, pt.getMobileNo());
  ps.setString(4, pt.getPatientId());
  return ps.executeUpdate()==1;
  }
  
   public static List<AppointmentPojo> getAllAppointmentsByDoctorName(String doctorName)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select * from appointments where doctor_name=? and status='REQUEST' order by patient_id");
    ps.setString(1,doctorName);
    ResultSet rs=ps.executeQuery();
    List<AppointmentPojo>appList=new ArrayList<>();
    while(rs.next()){
    AppointmentPojo app=new AppointmentPojo();
    app.setPatientId(rs.getString("patient_id"));
    app.setPatientName(rs.getString("patient_name"));
    app.setOpd(rs.getString("opd"));
    app.setMobileNo(rs.getString("mobile_no"));
    app.setAppointmentDate(rs.getString("date_time"));
    app.setStatus(rs.getString("status"));
    appList.add(app);   
    
    }
    return appList;
} 
 public static boolean updateStatus(AppointmentPojo app)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update appointments set status=?,date_time=? where patient_id=?" );
     ps.setString(1, app.getStatus());
     ps.setString(2, app.getAppointmentDate());
     ps.setString(3, app.getPatientId());
     boolean result1= ps.executeUpdate()==1;
     boolean result2=PatientDao.updateStatus(app.getPatientId());
     if(result1 && result2)
        return true;
    return false;
 }
  public static List<AppointmentPojo> getAllConfirmAppointmentsByDoctorName(String doctorName)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select * from appointments where doctor_name=? and status='CONFIRM' order by patient_id");
    ps.setString(1,doctorName);
    ResultSet rs=ps.executeQuery();
    List<AppointmentPojo>appList=new ArrayList<>();
    while(rs.next()){
    AppointmentPojo app=new AppointmentPojo();
    app.setPatientId(rs.getString("patient_id"));
    app.setPatientName(rs.getString("patient_name"));
    app.setOpd(rs.getString("opd"));
    app.setAppointmentDate(rs.getString("date_time"));
    app.setStatus(rs.getString("status"));
    app.setMobileNo(rs.getString("mobile_no"));
    appList.add(app);   
    
    }
    return appList;
} 
   public static boolean updateStatusAppCancle(AppointmentPojo app)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update appointments set status=? where patient_id=?" );
     ps.setString(1, app.getStatus());
     ps.setString(2, app.getPatientId());
     boolean result1= ps.executeUpdate()==1;
     boolean result2=PatientDao.updateStatusCancle(app.getPatientId());
     if(result1 && result2)
        return true;
    return false;
}
}
