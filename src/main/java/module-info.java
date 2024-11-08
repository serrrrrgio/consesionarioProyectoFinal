module co.edu.uniquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;

    exports co.edu.uniquindio.poo; // Exporta el paquete principal
    exports co.edu.uniquindio.poo.viewController; // Exporta el paquete del controlador

    opens co.edu.uniquindio.poo.viewController to javafx.fxml; // Abre el paquete para javafx.fxml
}
