package sample;

import javafx.event.ActionEvent;

public class MultisceneSundhedspersonaleController {

    public void tilføjPatient(ActionEvent actionEvent) { Main.setGridPaneSundhed(0);
    }

    public void patientKonsultation(ActionEvent actionEvent) { Main.setGridPaneSundhed(1);
    }

    public void smitteOversigt(ActionEvent actionEvent) { Main.setGridPaneSundhed(2);
    }
}
