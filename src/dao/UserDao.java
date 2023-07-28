
package sanjeevaniapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.User;
import sanjeevaniapp.pojo.UserPojo;

public class UserDao {
     public static String validateUser(User user) throws SQLException{
         Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("Select user_name from users where login_id=? and password=? and user_type=?");
         ps.setString(1, user.getLoginId());
         ps.setString(2,user.getPassword());
         ps.setString(3, user.getUserType());
         ResultSet rs=ps.executeQuery();
         String name=null;
         if(rs.next()){
             name=rs.getString("user_name");
         }
         return name;
   }
     public static void updateName(String currName,String newName)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update users set user_name=? where user_name=?");
     ps.setString(1, newName);
     ps.setString(2, currName);
     ps.executeUpdate();
}
      public static boolean addUser(UserPojo user)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into users values(?,?,?,?)");
     ps.setString(1,user.getLoginId());
     ps.setString(2,user.getUserName());
     ps.setString(3,user.getPassword());
     ps.setString(4, user.getUserType().toUpperCase());
     return ps.executeUpdate()==1;
}
    public static String getUserNameByEmpName(String empname)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select user_name from users where user_name=?");
    ps.setString(1,empname);
    ResultSet rs=ps.executeQuery();
    String name=null;
         if(rs.next()){
             name=rs.getString("user_name");
         }
    return name;
  } 
      public static boolean DeleteUserByName(String name)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("delete from users where user_name=?");
     ps.setString(1, name);
     return ps.executeUpdate()==1;
 }
    public static String getUserDprtByUserName(String username)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select user_type from users where user_name=?");
    ps.setString(1,username);
    ResultSet rs=ps.executeQuery();
    rs.next();
    String str=rs.getString(1);
    return str;
    } 
    public static boolean updateUser(UserPojo user,String curName)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update users set login_id=?, user_name=?,password=? where user_name=?");
     ps.setString(1, user.getLoginId());
     ps.setString(2, user.getUserName());
     ps.setString(3, user.getPassword());
     ps.setString(4, curName);
     return ps.executeUpdate()==1;
 }
     public static String getUserLoginIdbyName(String name)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select login_id from users where user_name=?");
    ps.setString(1, name);
    ResultSet rs=ps.executeQuery();
    rs.next();
    String str=rs.getString(1);
    return str;
   } 
}    

