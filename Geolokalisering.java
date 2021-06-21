package sample;

import java.time.LocalDate;

public class Geolokalisering {
    private Integer zipCode;
    private LocalDate tidspunkt;
    private Patient patient;

    public Geolokalisering(Integer zipCode, LocalDate tidspunkt, Patient patient) {
        this.zipCode = zipCode;
        this.tidspunkt = tidspunkt;
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public LocalDate getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(LocalDate tidspunkt) {
        this.tidspunkt = tidspunkt;

    }

    @Override
    public String toString() {
        return "Geolokalisering{" +
                "zipCode=" + zipCode +
                ", tidspunkt=" + tidspunkt +
                ", patient=" + patient +
                '}';
    }
}
