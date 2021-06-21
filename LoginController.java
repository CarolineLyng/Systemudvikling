package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginController {
    public Label VelkommenLabel;
    public Label BrugernavnLabel;
    public TextField BrugernavnText;
    public TabPane BrugernavnTabpane;
    public Label AdgangskodeLabel;
    public TextField AdgangskodeText;
    public TabPane AdgangskodeTabpane;
    public Button LoginButton;

    @FXML
    private GridPane grid;

    private void clearTextFields(GridPane grid) {
        for (Node node : grid.getChildren()) {
            if (node instanceof TextField) {
                // clear
                ((TextField) node).setText("");
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
    public void onLoginButtonSundhed(ActionEvent actionEvent) {
        String BrugernavnInput = BrugernavnText.getText();
        String AdgangskodeInput = AdgangskodeText.getText();
        System.out.println("Login pressed");
        // check username and password against database here ???
        try {
            ((Node)actionEvent.getSource()).getScene().getWindow().hide();
            Scene scene = new Scene(Main.msSundhed,1200,500);
            Stage primaryStage = new Stage();
            primaryStage.setTitle("CoronaNet - Sundhedspersonale");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void onLoginButtonRegering(ActionEvent actionEvent) {
        String BrugernavnInput = BrugernavnText.getText();
        String AdgangskodeInput = AdgangskodeText.getText();
        System.out.println("Login pressed");
        // check username and password against database here ???
        try {
            ((Node)actionEvent.getSource()).getScene().getWindow().hide();
            Scene scene = new Scene(Main.msRegering,1200,500);
            Stage primaryStage = new Stage();
            primaryStage.setTitle("CoronaNet - Regering");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
