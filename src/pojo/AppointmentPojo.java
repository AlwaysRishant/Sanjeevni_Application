/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.pojo;


public class AppointmentPojo {
    private String patientId;
    private String patientName;
    private String opd;
    private String status;
    private String appointmentDate;
    private String doctorName;
    private String mobileNo;

    public AppointmentPojo() {
    }

    public AppointmentPojo(String patientId, String patientName, String opd, String status, String appointmentDate, String doctorName, String mobileNo) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.opd = opd;
        this.status = status;
        this.appointmentDate = appointmentDate;
        this.doctorName = doctorName;
        this.mobileNo = mobileNo;
    }

    
    public AppointmentPojo(String patientId, String patientName, String opd) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.opd = opd;
    }
    
    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getOpd() {
        return opd;
    }

    public void setOpd(String opd) {
        this.opd = opd;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "AppointmentPojo{" + "patientId=" + patientId + ", patientName=" + patientName + ", opd=" + opd + ", status=" + status + ", appointmentDate=" + appointmentDate + ", doctorName=" + doctorName + ", mobileNo=" + mobileNo + '}';
    }

    
    

    
}
