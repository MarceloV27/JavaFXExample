module com.marcelov.example.javafxexample {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.marcelov.example.javafxexample to javafx.fxml;
    exports com.marcelov.example.javafxexample;
}