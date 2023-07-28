/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.pojo;

import java.sql.Date;


public class PatientPojo {
    private String firstName;
    private String lastName;
    private int age;
    private String patientId;
    private String gender;
    private String marriedStatus;
    private String address;
    private String city;
    private String mno;
    private Date date;
    private String opd;
    private String doctorId;
    private int otp;
    private String aptStatus;

    

    public PatientPojo() {
    }

    public PatientPojo(String firstName, String lastName, int age, String patientId, String gender, String marriedStatus, String address, String city, String mno, Date date, String opd, String doctorId, int otp, String aptStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.patientId = patientId;
        this.gender = gender;
        this.marriedStatus = marriedStatus;
        this.address = address;
        this.city = city;
        this.mno = mno;
        this.date = date;
        this.opd = opd;
        this.doctorId = doctorId;
        this.otp = otp;
        this.aptStatus = aptStatus;
    }

    public String getAptStatus() {
        return aptStatus;
    }

    public void setAptStatus(String aptStatus) {
        this.aptStatus = aptStatus;
    }

    

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarriedStatus() {
        return marriedStatus;
    }

    public void setMarriedStatus(String marriedStatus) {
        this.marriedStatus = marriedStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOpd() {
        return opd;
    }

    public void setOpd(String opd) {
        this.opd = opd;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    @Override
    public String toString() {
        return "PatientPojo{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", patientId=" + patientId + ", gender=" + gender + ", marriedStatus=" + marriedStatus + ", address=" + address + ", city=" + city + ", mno=" + mno + ", date=" + date + ", opd=" + opd + ", doctorId=" + doctorId + ", otp=" + otp + ", aptStatus=" + aptStatus + '}';
    }
    
}
