module org.example.aiplab18 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.aiplab18 to javafx.fxml;
    exports org.example.aiplab18;
}