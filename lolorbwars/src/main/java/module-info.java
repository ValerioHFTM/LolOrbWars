module com.lolorbwars {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;

    opens com.lolorbwars to javafx.fxml;

    exports com.lolorbwars;
}
