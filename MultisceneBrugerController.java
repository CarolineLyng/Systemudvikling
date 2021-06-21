package sample;

import javafx.event.ActionEvent;
import sample.Main;

public class MultisceneBrugerController {

    public void sensordata(ActionEvent actionEvent) { Main.setGridPaneBruger(0);
    }

    public void geolokalisering(ActionEvent actionEvent) { Main.setGridPaneBruger(1);
    }

    public void luk(ActionEvent actionEvent) { Main.setGridPaneBruger(3);
    }

    public void samtykke(ActionEvent actionEvent) { Main.setGridPaneBruger(2);
    }

    public void antalSmittede(ActionEvent actionEvent) { Main.setGridPaneBruger(0);
    }

    public void fordeling(ActionEvent actionEvent) { Main.setGridPaneBruger(1);
    }

    public void antalDødsfald(ActionEvent actionEvent) { Main.setGridPaneBruger(2);
    }
}
