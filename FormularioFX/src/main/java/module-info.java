module com.mycompany.formulariofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens com.mycompany.formulariofx to javafx.fxml;
    exports com.mycompany.formulariofx;
}
