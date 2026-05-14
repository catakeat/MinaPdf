package com.mycompany.minapdf;

import java.io.IOException;
import javafx.fxml.FXML;
import org.apache.pdfbox.pdmodel.PDDocument;


public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
     @FXML
    private void switchToThird() throws IOException {
        App.setRoot("third");
    }
}