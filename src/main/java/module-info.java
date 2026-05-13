module com.mycompany.minapdf {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.minapdf to javafx.fxml;
    exports com.mycompany.minapdf;
}
