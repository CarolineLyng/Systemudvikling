package sample;

import java.util.ArrayList;

public class PatientRegister {
    // An arraylist that will hold the registered patients
    public ArrayList<Patient> patients;
    // Constructor - EXPLAIN
    public PatientRegister() {
        this.patients = new ArrayList<>();
    }
    // The method should check if the patient already exists in the patients-list. If not, the patient should be added to the list.
    public void addPatient(Patient patient) throws Exception{
        // fill in code here
        boolean contains = false;
        for (Patient patient1 : patients) {
            if (patient1.getCpr().equals(patient.getCpr())) {
                contains = true;
                break;
            }

        }

        if (! contains) {
            this.patients.add(patient);
        } else {
            throw new Exception("Already in list");
        }
    }
    // The method should remove the patientToRemove from the patients list.
    public void removePatient(Patient patient) {
        this.patients.remove(patient);
        // fill in code here
    }
    // The method should first print the current number of patients in the patients-list.
    // Then loop through the patients in the patients-list,
    // and print out their name and cpr.
    public void printPatients() {
        // Fill in code here
        System.out.println("Number of patients: " + this.patients.size());
        for (Patient p : this.patients) {
            System.out.println("Name:" + p.getFirstName() +" "+ p.getLastName() + " - "+
                    "CPR-number: " + p.getCpr() + " - " +
                    "Gender: " + p.getGender() +" - " +
                    "Age: " + p.getAge());
        }
    }

    public String listPatients() {
        // Fill in code here
        String returnString;
        returnString="Number of patients: " + this.patients.size() +"\n\n";
        returnString+="+-------------+--------------------------------+--------+-----+------------------+\n";
        returnString+="| CPR-number  | Name                           | Gender | Age | Phone            |\n";
        returnString+="+=============+================================+========+=====+==================+\n";

        for (Patient p : this.patients) {
            String fullName = p.getFirstName()+" "+p.getLastName();
            //String newLine = String.format("CPR-number: %11s  Name: %-30s  Gender: %6s  Age: %3d  Phone: %16s  Email: %s\n",
            //        p.getCpr(),fullName,p.getGender(),p.getAge(),p.getPhoneNumber(),p.getEmail());
            String newLine = String.format("| %11s | %-30s | %-6s | %3d | %-16s |\n",
                    p.getCpr(),fullName,p.getGender(),p.getAge(),p.getPhoneNumber());
            returnString += newLine;
            returnString+="+-------------+--------------------------------+--------+-----+------------------+\n";


        }
        return returnString;
    }

    @Override
    public String toString() {
        return "PatientRegister{" +
                "patients=" + patients +
                '}';
    }
}
