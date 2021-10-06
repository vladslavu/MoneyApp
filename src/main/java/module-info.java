module com.example.moneyapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires eu.hansolo.tilesfx;
    requires java.mail;

    opens com.example.moneyapp to javafx.fxml;
    exports com.example.moneyapp;
}