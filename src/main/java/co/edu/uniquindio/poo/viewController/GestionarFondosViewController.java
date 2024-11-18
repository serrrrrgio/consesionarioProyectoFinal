package co.edu.uniquindio.poo.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionarFondosController;
import co.edu.uniquindio.poo.model.Concesionario;

public class GestionarFondosViewController {

    @FXML
    private Button btnRetirarFondos;

    @FXML
    private Button btnRegresar;

    @FXML
    private TextField txtFondosTotales;

    @FXML
    private Button btnDepositarFondos;

    @FXML
    private TextField txtRetirarFondos;

    @FXML
    private TextField txtDepositarFondos;


    GestionarFondosController gestionarFondosController;


    
    @FXML
    void initialize() {
            gestionarFondosController= new GestionarFondosController(App.getConcesionario());
            txtFondosTotales.setText(gestionarFondosController.getConcesionario().obtenerPrecioCadena());
        }

    @FXML
    void handleBtnRegresar(ActionEvent event) {
        // Implementar la lógica para regresar a la vista anterior
    }

    @FXML
    void handleBtnDepositarFondos(ActionEvent event) {
        String input = txtDepositarFondos.getText().trim(); // Obtener el texto y quitar espacios al principio y final

        // Verificar si el campo está vacío
        if (input.isEmpty()) {
            showAlert("Advertencia", "Por favor ingrese una cantidad para depositar.");
            return;
        }

        try {
            double cantidad = Double.parseDouble(input);
            if (cantidad > 0) {
                // Se agregan los fondos
                gestionarFondosController.agregarFondos(cantidad);
                txtFondosTotales.setText(gestionarFondosController.getConcesionario().obtenerPrecioCadena()); // Actualizar los fondos
                txtDepositarFondos.clear(); // Limpiar el campo de texto
            } else {
                showAlert("Advertencia", "La cantidad a depositar debe ser mayor que 0.");
            }
        } catch (NumberFormatException e) {
            showAlert("Error", "Por favor ingrese un número válido.");
            txtDepositarFondos.clear(); // Limpiar el campo de texto
        }
    }

    @FXML
    void handleBtnRetirarFondos(ActionEvent event) {
        String input = txtRetirarFondos.getText().trim(); // Obtener el texto y quitar espacios al principio y final

        // Verificar si el campo está vacío
        if (input.isEmpty()) {
            showAlert("Advertencia", "Por favor ingrese una cantidad para retirar.");
            return;
        }

        try {
            double cantidad = Double.parseDouble(input);
            if (cantidad > 0 && gestionarFondosController.getConcesionario().getFondos() >= cantidad) {
                // Se retiran los fondos
                gestionarFondosController.retirarFondos(cantidad);
                txtFondosTotales.setText(String.valueOf(gestionarFondosController.getConcesionario().getFondos())); // Actualizar los fondos
                txtRetirarFondos.clear(); // Limpiar el campo de texto
            } else if (cantidad <= 0) {
                showAlert("Advertencia", "La cantidad a retirar debe ser mayor que 0.");
            } else {
                showAlert("Error", "Fondos insuficientes para retirar esa cantidad.");
            }
        } catch (NumberFormatException e) {
            showAlert("Error", "Por favor ingrese un número válido.");
            txtRetirarFondos.clear(); // Limpiar el campo de texto
        }
    }

    // Método para mostrar alertas
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
