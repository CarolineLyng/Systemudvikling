package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class TilføjPatientController {
    public Label labelCpr;
    public TextField cprText;
    public Label labelFirstName;
    public TextField firstNameText;
    public Label labelLastName;
    public TextField lastNameText;
    public Label labelPhone;
    public TextField phoneText;
    public TextArea patientListTextArea;
    public Button buttonAdd;
    public Button buttonClearAll;

    @FXML
    private GridPane grid;


    private PatientRegister patientRegister= new PatientRegister();

    private void clearTextFields(GridPane grid) {
        // Simple method to clear the text fields in a grid
        for (Node node : grid.getChildren()) {
            if (node instanceof TextField) {
                // clear
                ((TextField)node).setText("");
                node.setStyle(null);
            }
        }
    }

    private void resetTextFields(GridPane grid) {
        // Simple method to reset the style on text fields in a grid which have a style set
        // and don't touch the other fields
        // We use it to clear the fields we turned yellow
        for (Node node : grid.getChildren()) {
            if (node instanceof TextField) {
                System.out.println(node.getStyle());
                // clear
                if (node.getStyle() != null && !node.getStyle().equals("")) {
                    ((TextField) node).setText("");
                    node.setStyle(null);
                }
            }
        }
    }
    public static String capitalize(String str) {
        // Method to make names appear with capital first letter
        // also turn uppercase letters not in first position into lowercase
        // sorry McDonald!
        if(str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public void initialize() {

        Patient p1 = new Patient("Hans","Hansen","010101-0101");
        Patient p2 = new Patient("Karen","Mortensen","020202-0202");
        p1.setPhoneNumber("+45 10203040");

        System.out.println(p1);

        // Set som more attributes for p2;
        p2.setPhoneNumber("+45 20304050");

        System.out.println(p2);

        //PatientRegister patientRegister = new PatientRegister();
        try {
            patientRegister.addPatient(p1);
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println(e);
        }
        try {
            patientRegister.addPatient(p2);
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println(e);
        }

        patientRegister.printPatients();
        System.out.println(patientRegister);

        for (Node node : grid.getChildren()) {
            if (node instanceof TextField) {
                ((TextField)node).setFont(Font.font ("Courier New", 11));
            }
        }

        for (Node node : grid.getChildren()) {
            if (node instanceof Label) {
                node.setStyle("-fx-border-color:white; -fx-background-color: white; -fx-padding:4px");
            }
        }

        patientListTextArea.setText(patientRegister.listPatients());

    }

    public void onAddPatient(ActionEvent actionEvent) {
        String cprInput= cprText.getText();
        String firstNameInput= capitalize(firstNameText.getText());
        String lastNameInput= capitalize(lastNameText.getText());
        String phoneInput = phoneText.getText();
        boolean validInput= true;

        // validate the user input

        if (!DataValidator.isValidCPR(cprInput)){
            // we need a CPR number in order to register a user
            // highlight the CPR input field if content is invalid
            cprText.setStyle("-fx-background-color: yellow");
            validInput = false;

        }

        if (!phoneInput.isEmpty()  && ! DataValidator.isValidPhone(phoneInput)){
            // phone is optional - but if it is there it needs to be valid
            phoneText.setStyle("-fx-background-color: yellow");
        }

        if (firstNameInput.isEmpty() || ! DataValidator.isValidFirstName(firstNameInput)){
            // We need a valid first name
            firstNameText.setStyle("-fx-background-color: yellow");
            validInput = false;
        }

        if (lastNameInput.isEmpty() || ! DataValidator.isValidLastName(lastNameInput)){
            // We need a valid last name
            lastNameText.setStyle("-fx-background-color: yellow");
            validInput = false;
        }

        // Now register the patient in the patient register
        // alert the user if the patient is already there


        if (validInput) {
            Patient p = new Patient(firstNameInput,lastNameInput,cprInput);
            p.setPhoneNumber(phoneInput);
            try {
                patientRegister.addPatient(p);
                clearTextFields(grid);
                resetTextFields(grid);
            } catch (Exception e) {

                // The patient is already there
                e.printStackTrace();

                cprText.setStyle("-fx-background-color: yellow");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                //alert.setTitle("Error Dialog");
                alert.setHeaderText("Registration problem");
                alert.setContentText("CPR-number " + cprInput +" already found in register");

                alert.showAndWait();
                clearTextFields(grid);
                resetTextFields(grid);
            }

        } else {
            // Something is wrong in one or more input fields
            // Tell the user to correct input

            Alert alert = new Alert(Alert.AlertType.ERROR);
            //alert.setTitle("Error Dialog");
            alert.setHeaderText("Registration problem");
            alert.setContentText("Correct highlighted fields");


            alert.showAndWait();
            resetTextFields(grid);
        }
        // list the patients
        patientListTextArea.setText(patientRegister.listPatients());

    }

    public void onClearAll(ActionEvent actionEvent) {
        clearTextFields(grid);
    }
}
