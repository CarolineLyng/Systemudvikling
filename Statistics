package sample;

import java.time.LocalDate;
// følgende bibliotek er til XML:
import jakarta.xml.bind.annotation.*;
@XmlRootElement

public class Statistics {
    private LocalDate dato;
    private Mutation mutation;
    private Integer antalSmittede;
    private Integer zipCode;
    private float infektionsRate;

    public Statistics(LocalDate date, Mutation mutation, Integer antalSmittede,
                      Integer zipCode, float infektionsRate) {
        this.dato = date;
        this.mutation = mutation;
        this.antalSmittede = antalSmittede;
        this.zipCode = zipCode;
        this.infektionsRate = infektionsRate;
    }
// no argument default constructor for XML
    public Statistics (){
        this.dato = null;
        this.mutation = null;
        this.antalSmittede = null;
        this.zipCode = null;
        this.infektionsRate = Float.parseFloat(null);
    }
    public float getInfektionsRate() {
        return infektionsRate;
    }

    public void setInfektionsRate(float infektionsRate) {
        this.infektionsRate = infektionsRate;
    }

    public LocalDate getDato() {
        return dato;
    }

    public void setDato(LocalDate dato) {
        this.dato = dato;
    }

    public Mutation getMutation() {
        return mutation;
    }

    public void setMutation(Mutation mutation) {
        this.mutation = mutation;
    }

    public Integer getAntalSmittede() {
        return antalSmittede;
    }

    public void setAntalSmittede(Integer antalSmittede) {
        this.antalSmittede = antalSmittede;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }


    @Override
    public String toString() {
        return "Statistics{" +
                "dato=" + dato +
                ", mutation=" + mutation +
                ", antalSmittede=" + antalSmittede +
                ", zipCode=" + zipCode +
                ", infektionsRate=" + infektionsRate +
                '}';
    }
}

