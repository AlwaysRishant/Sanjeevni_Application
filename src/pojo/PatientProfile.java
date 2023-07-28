/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.pojo;


public class PatientProfile {

    public static String getName() {
        return Name;
    }

    public static void setName(String Name) {
        PatientProfile.Name = Name;
    }

       public static String getOTP() {
        return OTP;
    }

    public static void setOTP(String OTP) {
        PatientProfile.OTP = OTP;
    }

    public static String getContectNo() {
        return ContectNo;
    }

    public static void setContectNo(String ContectNo) {
        PatientProfile.ContectNo = ContectNo;
    }
    private static  String OTP;
    private static String ContectNo;
    private static String Name;
    
    
}
