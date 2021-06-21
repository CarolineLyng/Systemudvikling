package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    static VBox msSundhed;
    static VBox login;
    static VBox msRegering;
    static VBox msBruger;
    static List<GridPane> gridPaneList = new ArrayList<>();
    private static int index_current = 0;
    @Override
    public void start(Stage primaryStage) throws Exception {     // a Stage is the main window for a JavaFX application
        System.out.println("==================");
        System.out.println("lists of patients");
        Database.getPatients();
        System.out.println("==================");
        System.out.println("lists of tests");
        Database.getTests(1);
        System.out.println("==================");
        System.out.println("lists of sensordata");
        Database.getSensordata(1);
        System.out.println("==================");
        System.out.println("lists of geolokalisering");
        Database.getGeolokalisering(1);

        // generate some fake statistics
        Mutation mutation = new Mutation();
        mutation.setId(1);
        mutation.setNavn("B.1.1.7");
        String dateString = "2021-05-26";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dato = LocalDate.parse(dateString, dateFormatter);
        System.out.println("======================");
        System.out.println(dato);
        Statistics statistics = new Statistics(dato,mutation,20,1202, (float) 0.8);
        XML.statisticsToXML("/Users/opsaet/Desktop/statistics.xml", statistics);

        login = FXMLLoader.load(getClass().getResource("Login1.fxml"));
        msSundhed = FXMLLoader.load(getClass().getResource("MultisceneSundhedspersonale.fxml"));
        msRegering = FXMLLoader.load(getClass().getResource("MultisceneRegering.fxml"));

        gridPaneList.add(FXMLLoader.load(getClass().getResource("TilføjPatient.fxml")));
        gridPaneList.add(FXMLLoader.load(getClass().getResource("KonsulterPatient.fxml")));
        gridPaneList.add(FXMLLoader.load(getClass().getResource("Smitteoversigt.fxml")));

        //root.getChildren().add(gridPanePatients);
        primaryStage.setTitle("CoronaNet");
        Scene scene = new Scene(login, 1200, 500); // create a scene window 1200 x 500 pixels

        primaryStage.setScene(scene);                   // add the scene to the stage / application window
        primaryStage.show();                 // display the stage - important! otherwise nothing happens :-)

    }
    public static void main(String[] args) {
        launch(args);
    }

    public static void setGridPaneSundhed (int index) {
        msSundhed.getChildren().remove(gridPaneList.get(index_current));
        msSundhed.getChildren().add(gridPaneList.get(index));
        index_current=index;
    }
    public static void setGridPaneRegering (int index) {
        msRegering.getChildren().remove(gridPaneList.get(index_current));
        msRegering.getChildren().add(gridPaneList.get(index));
        index_current=index;

    }
    public static void setGridPaneBruger (int index) {
        msBruger.getChildren().remove(gridPaneList.get(index_current));
        msBruger.getChildren().add(gridPaneList.get(index));
        index_current=index;

    }
}
