
package sanjeevaniapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.DoctorPojo;

public class DoctorsDao {
public static void updateName(String currName,String newName)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update doctors set doctor_name=? where doctor_name=?");
     ps.setString(1, newName);
     ps.setString(2, currName);
     ps.executeUpdate();
}
public static boolean addDoctor(DoctorPojo doc)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into doctors values(?,?,?,?,?,?,?)");
     ps.setString(1,doc.getDoctorId());
     ps.setString(2, doc.getDoctorName());
     ps.setString(3,doc.getEmailId());
     ps.setString(4, doc.getContactNo());
     ps.setString(5, doc.getQualification());
     ps.setString(7, doc.getSpecialist());
     ps.setString(6, doc.getGender());
     return ps.executeUpdate()==1;
}
public static String getNewDocId()throws  SQLException{
   Connection conn=DBConnection.getConnection();
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery("Select max(doctor_id) from doctors");
   rs.next();
   int docId=101;
   String id=rs.getString(1);
   if(id!=null){
       String num=id.substring(3);
       docId=Integer.parseInt(num)+1;
    }
   return "DOC"+docId;
}  
     public static boolean DeleteDoctorByName(String name)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("delete from doctors where doctor_name=?");
     ps.setString(1,name);
     return ps.executeUpdate()==1; 
 }
public static List<String> getAllDoctorId()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select doctor_id from doctors");
    List<String>doctorList=new ArrayList<>();
    while(rs.next())
    {
        doctorList.add(rs.getString(1));
    }
    return doctorList;
}
     public static boolean deleteDoctorById(String docId)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Select doctor_name from doctors where doctor_id=?");
     ps.setString(1, docId);
     ResultSet rs=ps.executeQuery();
     rs.next();
     String docName=rs.getString(1);
     UserDao.DeleteUserByName(docName);
     ps=conn.prepareStatement("Delete from doctors where doctor_id=?");
     ps.setString(1, docId);
     return ps.executeUpdate()==1;
     }

    public static List<DoctorPojo> getAllDoctorDetails()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select * from doctors order by doctor_id");
    List<DoctorPojo>docList=new ArrayList<>();
    while(rs.next()){
    DoctorPojo doc=new DoctorPojo();
    doc.setDoctorName(rs.getString("doctor_name"));
    doc.setContactNo(rs.getString("contact_no"));
    doc.setDoctorId(rs.getString("doctor_id"));
    doc.setEmailId(rs.getString("email_id"));
    doc.setQualification(rs.getString("qualification"));
    doc.setGender(rs.getString("gender"));
    doc.setSpecialist(rs.getString("specialist"));
    docList.add(doc);
    
    }
    return docList;
}
    public static String getDocNamebyDocId(String DocId)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select doctor_name from doctors where doctor_id=?");
    ps.setString(1,DocId);
    ResultSet rs=ps.executeQuery();
    rs.next();
    String str=rs.getString(1);
    return str;
    } 
    public static String getDocIdbyDocName(String Docname)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select doctor_id from doctors where doctor_name=?");
    ps.setString(1,Docname);
    ResultSet rs=ps.executeQuery();
    rs.next();
    String str=rs.getString(1);
    return str;
  } 
}
