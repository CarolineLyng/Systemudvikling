package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;


public class KonsulterPatientController {
    public TextField cpr2Text;
    public TabPane KonsulterTabpane;
    public Tab TestTab;
    public TableView TestTable;
    public TableColumn testDateKolonne;
    public TableColumn resultKolonne;
    public TableColumn mutationKolonne;
    public TableColumn testTypeKolonne;
    public TableColumn placeKolonne;
    public Tab SensorTab;
    public TableView SensorTable;
    public TableColumn SensorDatoKolonne;
    public TableColumn HjerteRytmeKolonne;
    public TableColumn TemperaturKolonne;
    public Tab GeolokaliseringTab;
    public Tab KontaktTab;
    public TextArea KontaktText;
    public Button SendBesked;
    public Label labelcpr2;
    public Button Søg;

    public void SendButton(ActionEvent actionEvent) {
    }

    public void SøgButton(ActionEvent actionEvent) {
    }
}
