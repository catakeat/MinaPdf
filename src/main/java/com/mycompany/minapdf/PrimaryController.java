package com.mycompany.minapdf;

import com.mycompany.minapdf.utile.Utile;
import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        Utile obj = new Utile();
        obj.createOnePageDocument();
        App.setRoot("secondary");
    }
    @FXML
    private void switchToThird() throws IOException {
        App.setRoot("third");
    }
}
