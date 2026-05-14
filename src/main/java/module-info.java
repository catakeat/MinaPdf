module com.mycompany.minapdf {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires org.apache.pdfbox; 
    
    
    opens com.mycompany.minapdf to javafx.fxml;
    exports com.mycompany.minapdf;
    
}
