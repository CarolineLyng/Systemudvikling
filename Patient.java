package sample;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Patient {

    // An arraylist that will hold geolokalisering and sensordata
    public ArrayList<Geolokalisering> geolokalisering;
    public ArrayList<Sensordata> sensordata;
    public ArrayList<Test> test;
    public ArrayList<PatientRegister> patientRegister;
    // Constructor - EXPLAIN
    public Patient() {
        this.geolokalisering = new ArrayList<Geolokalisering>();
        this.sensordata = new ArrayList<Sensordata>();
        this.test = new ArrayList<Test>();
        this.patientRegister = new ArrayList<PatientRegister>();
    }

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String cpr;
    private Integer zipCode;

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public Patient(String firstName, String lastName, String inputCPR) {
        // assign the inputName to the field storing the patient's name. (replace the ??? with the field your created earlier)
        this.firstName = firstName;
        this.lastName = lastName;

        // assign the inputCPR to the field storing the patient's CPR-number. (replace the ??? with the field your created earlier)
        this.cpr = inputCPR;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public int getAge () {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("ddMMuu");
        LocalDate today = LocalDate.now();
        LocalDate birthdate = LocalDate.parse(cpr.substring(0,6), dateFormatter);
        // If the birthdate is after today, it's probably in the 1900's. Subtract 100 years.
        if (birthdate.isAfter(today)) { birthdate = birthdate.minusYears(100); }
        int age = Period.between(birthdate, today).getYears();
        return age;
    }

    public ArrayList<Geolokalisering> getGeolokalisering() {
        return geolokalisering;
    }

    public ArrayList<PatientRegister> getPatientRegister() {
        return patientRegister;
    }

    public void setPatientRegister(ArrayList<PatientRegister> patientRegister) {
        this.patientRegister = patientRegister;
    }

    public void setGeolokalisering(ArrayList<Geolokalisering> geolokalisering) {
        this.geolokalisering = geolokalisering;
    }

    public ArrayList<Sensordata> getSensordata() {
        return sensordata;
    }

    public void setSensordata(ArrayList<Sensordata> sensordata) {
        this.sensordata = sensordata;
    }

    public ArrayList<Test> getTest() {
        return test;
    }

    public void setTest(ArrayList<Test> test) {
        this.test = test;
    }

    public String getGender() {
        String serial = cpr.substring(7,11);
        if (Integer.parseInt(serial) % 2 == 0) {
            return "female";
        } else {
            return "male";
        }
    }

    @Override
    public String toString() {
        return "Patient{" +
                "geolokalisering=" + geolokalisering +
                ", sensordata=" + sensordata +
                ", test=" + test +
                ", patientRegister=" + patientRegister +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cpr='" + cpr + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
