/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.pojo;

/**
 *
 * @author pc
 */
public class DoctorProfile {

    public DoctorProfile() {
    }

    public static String getDocId() {
        return DocId;
    }

    public static void setDocId(String DocId) {
        DoctorProfile.DocId = DocId;
    }
    private static  String DocId;
    
}
