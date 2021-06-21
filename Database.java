package sample;

import java.sql.*;
import java.time.LocalDate;

public class Database {

    // Denne metode hiver alle patienterne ud fra databasen og burde vise dem i GUI'en
    public static void getPatients() {
        String url = "jdbc:mysql://127.0.0.1:3306/?user=Corona";
        String password = "";

        String query = "SELECT * FROM CoronaApp.Patient";

        try (Connection con = DriverManager.getConnection(url, null, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt(1);
                String firstName = rs.getString(2);
                String lastName = rs.getString(3);
                String phoneNumber = rs.getString(4);
                String cpr = rs.getString(5);
                int zipCode = rs.getInt(6);
                System.out.println("id: " + id + " | firstName: " + firstName + " | lastName: " + lastName + " | phoneNumber: " + phoneNumber + " | cpr: " + cpr + " | zipCode: " + zipCode);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Denne metode burde vise alle test for en bestemt patient
    public static void getTests(int patientId) {
        String url = "jdbc:mysql://127.0.0.1:3306/?user=Corona";
        String password = "";

        String query = "SELECT * FROM CoronaApp.Test WHERE idPatient = " + patientId;

        try (Connection con = DriverManager.getConnection(url, null, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt(1);
                Date testDate = rs.getDate(2);
                String result = rs.getString(3);
                int idMutation = rs.getInt(4);
                String testType = rs.getString(5);
                String place = rs.getString(6);
                int idPatient = rs.getInt(7);
                System.out.println("id: " + id + " | testDate: " + testDate + " | result: " + result + " | idMutation: " + idMutation + " | testType: " + testType + " | place: " + place + " | idPatient: " + idPatient);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Denne metode burde vise sensordata for en bestemt patient
    public static void getSensordata(int patientId) {
        String url = "jdbc:mysql://127.0.0.1:3306/?user=Corona";
        String password = "";

        String query = "SELECT * FROM CoronaApp.Sensordata WHERE idPatient = " + patientId;

        try (Connection con = DriverManager.getConnection(url, null, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt(1);
                String temperatur = rs.getString(2);
                String hjerterytme = rs.getString(3);
                Date dato = rs.getDate(4);
                int idPatient = rs.getInt(5);
                System.out.println("id: " + id + " | temperatur: " + temperatur + " | hjerterytme: " + hjerterytme + " | dato: " + dato + " | idPatient: " + idPatient);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    // Denne metode burde vise geolokalisering for en bestemt patient
    public static void getGeolokalisering(int patientId) {
        String url = "jdbc:mysql://127.0.0.1:3306/?user=Corona";
        String password = "";

        String query = "SELECT * FROM CoronaApp.Geolokalisering WHERE idPatient = " + patientId;

        try (Connection con = DriverManager.getConnection(url, null, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt(1);
                String zipCode = rs.getString(2);
                Date tidspunkt = rs.getDate(3);
                int idPatient = rs.getInt(4);
                System.out.println("id: " + id + " | zipCode: " + zipCode + " | tidspunkt: " + tidspunkt + " | idPatient: " + idPatient);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
    // Denne metode burde vise det samlede antal smittede
    public static void getAntalSmittede() {
        String url = "jdbc:mysql://127.0.0.1:3306/?user=Corona";
        String password = "";

        String query = "SELECT * FROM CoronaApp.Statistics WHERE antalSmittede = ";

        try (Connection con = DriverManager.getConnection(url, null, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {
                int antalSmittede = rs.getInt(4);
                System.out.println("Antal smittede: " + antalSmittede);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
    // Denne metode burde vise infektionsraten for en bestemt dag
    public static void getInfektionsRate(LocalDate dato) {
        String url = "jdbc:mysql://127.0.0.1:3306/?user=Corona";
        String password = "";

        String query = "SELECT * FROM CoronaApp.Statistics WHERE infektionsRate = " + dato;

        try (Connection con = DriverManager.getConnection(url, null, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {
                float infektionsRate = rs.getFloat(6);
                Date rsdato = rs.getDate(2);
                System.out.println("Infektionsrate: " + infektionsRate + " | Dato: " + dato);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void getIdMutation(int antalSmittede) {
        String url = "jdbc:mysql://127.0.0.1:3306/?user=Corona";
        String password = "";

        String query = "SELECT * FROM CoronaApp.Statistics WHERE idMutation = " + antalSmittede;

        try (Connection con = DriverManager.getConnection(url, null, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {
                int idMutation = rs.getInt(3);
                int smitteAntal = rs.getInt(4);
                System.out.println("Mutation: " + idMutation + " | Antal smittede: " + antalSmittede);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
