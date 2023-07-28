
package sanjeevaniapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.ReceptionistPojo;

public class ReceptionistDao {
     public static void updateName(String currName,String newName)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update receptionists set receptionist_name=? where receptionist_name=?");
     ps.setString(1, newName);
     ps.setString(2, currName);
     ps.executeUpdate();
}
   public static boolean DeleteReceptionist(String Recname)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("delete from receptionists where receptionist_name=?");
     ps.setString(1, Recname);
    return ps.executeUpdate()==1; 
 }
   public static String getNewRecId()throws  SQLException{
   Connection conn=DBConnection.getConnection();
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery("Select max(Receptionist_id) from Receptionists");
   rs.next();
   int recId=101;
   String id=rs.getString(1);
   if(id!=null){
       String num=id.substring(3);
       recId=Integer.parseInt(num)+1;
    }
   return "REC"+recId;
   }

  public static boolean addReceptionist(ReceptionistPojo doc)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into Receptionists values(?,?,?)");
     ps.setString(1,doc.getReceptionistId());
     ps.setString(2, doc.getReceptionistName());
     ps.setString(3, doc.getGender());
     return ps.executeUpdate()==1;
   }
  public static List<String> getAllReceptionistId()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select Receptionist_id from Receptionists");
    List<String> ReceptionistIdList=new ArrayList<>();
    while(rs.next()){
        ReceptionistIdList.add(rs.getString(1));
    }
    return ReceptionistIdList;
  }
  public static boolean updateReceptionist(ReceptionistPojo Rec)throws SQLException{
  Connection conn=DBConnection.getConnection();
  PreparedStatement ps=conn.prepareStatement("select Receptionist_name from Receptionists where receptionist_id=?");
  ps.setString(1, Rec.getReceptionistId());
  ResultSet rs=ps.executeQuery();
  rs.next();
  String curname=rs.getString(1);
  ps=conn.prepareStatement("Update receptionists set receptionist_name=?,gender=? where receptionist_id=?");
  ps.setString(1, Rec.getReceptionistName());
  ps.setString(2, Rec.getGender());
  ps.setString(3, Rec.getReceptionistId());
  ps.executeUpdate();
  
  EmpDao.updateNamebycurname(curname, Rec.getReceptionistName());
  return true;
  }
   public static ReceptionistPojo getReceptionistDetailsbyId(String RecId)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select * from receptionists where receptionist_id=?");
    ps.setString(1,RecId);
    ResultSet rs=ps.executeQuery();
    rs.next();
    ReceptionistPojo Rec=new ReceptionistPojo();
    Rec.setReceptionistId(rs.getString(1));
    Rec.setReceptionistName(rs.getString(2));
    Rec.setGender(rs.getString(3));
    return Rec;
    
 } 
  public static boolean deleteReceptionistById(String recId)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Select Receptionist_name from receptionists where receptionist_id=?");
     ps.setString(1, recId);
     ResultSet rs=ps.executeQuery();
     rs.next();
     String recName=rs.getString(1);
     UserDao.DeleteUserByName(recName);
     ps=conn.prepareStatement("Delete from receptionists where receptionist_id=?");
     ps.setString(1, recId);
     return ps.executeUpdate()==1;
     }
  public static List<ReceptionistPojo> getAllReceptionistDetails()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select * from Receptionists order by Receptionist_id");
    List<ReceptionistPojo>recList=new ArrayList<>();
    while(rs.next()){
    ReceptionistPojo rec=new ReceptionistPojo();
    rec.setReceptionistId(rs.getString("Receptionist_id"));
    rec.setReceptionistName(rs.getString("Receptionist_name"));
    rec.setGender(rs.getString("gender"));    
    recList.add(rec);
    }
    return recList;
} 
   public static String getReceptionistNamebyId(String recId)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select receptionist_name from receptionists where receptionist_id=?");
    ps.setString(1,recId);
    ResultSet rs=ps.executeQuery();
    rs.next();
    String str=rs.getString(1);
    return str;
  } 
}
