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
public class ReceptionistPojo {

    public ReceptionistPojo(String ReceptionistId, String ReceptionistName, String gender) {
        this.ReceptionistId = ReceptionistId;
        this.ReceptionistName = ReceptionistName;
        this.gender = gender;
    }
    public ReceptionistPojo(){
    
    }

    public String getReceptionistId() {
        return ReceptionistId;
    }

    public void setReceptionistId(String ReceptionistId) {
        this.ReceptionistId = ReceptionistId;
    }

    public String getReceptionistName() {
        return ReceptionistName;
    }

    public void setReceptionistName(String ReceptionistName) {
        this.ReceptionistName = ReceptionistName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    private String ReceptionistId;
    private String ReceptionistName;
    private String gender;
   
    
}
