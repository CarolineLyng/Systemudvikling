
package sample;

import java.time.LocalDate;

public class Test {
    private String testID;
    private LocalDate testDate;
    private String result;
    private Mutation mutation;
    private String testType;
    private String place;
    private Sundhedspersonale sundhedspersonale;
    private Patient patient;

    public Test(String testID, LocalDate testDate, String result, Mutation mutation,
                String testType, String place, Sundhedspersonale sundhedspersonale, Patient patient) {
        this.testID = testID;
        this.testDate = testDate;
        this.result = result;
        this.mutation = mutation;
        this.testType = testType;
        this.place = place;
        this.sundhedspersonale = sundhedspersonale;
        this.patient = patient;
    }

    public Mutation getMutation() {
        return mutation;
    }

    public void setMutation(Mutation mutation) {
        this.mutation = mutation;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getTestID() {
        return testID;
    }

    public void setTestID(String testID) {
        this.testID = testID;
    }

    public LocalDate getTestDate() {
        return testDate;
    }

    public void setTestDate(LocalDate testDate) {
        this.testDate = testDate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Mutation getmutation() {
        return mutation;
    }

    public void setmutation(Mutation mutation) {
        this.mutation = mutation;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Sundhedspersonale getSundhedspersonale() {
        return sundhedspersonale;
    }

    public void setSundhedspersonale(Sundhedspersonale sundhedspersonale) {
        this.sundhedspersonale = sundhedspersonale;
    }


    @Override
    public String toString() {
        return "Test{" +
                "testID='" + testID + '\'' +
                ", testDate=" + testDate +
                ", result='" + result + '\'' +
                ", mutation=" + mutation +
                ", testType='" + testType + '\'' +
                ", place='" + place + '\'' +
                ", sundhedspersonale=" + sundhedspersonale +
                ", patient=" + patient +
                '}';
    }
}
