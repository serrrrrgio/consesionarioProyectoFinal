package co.edu.uniquindio.poo.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionarFondosController;

public class GestionarFondosViewController {

    @FXML
    private Button btnRetirarFondos;

    @FXML
    private Button btnRegresar;

    @FXML
    private TextField txtFondosTotales;

    @FXML
    private ImageView backgroundImage;

    @FXML
    private Button btnActualizarAdmin;

    @FXML
    private Button btnRegistrarEmpleado;

    @FXML
    private TextField txtRetirarFondos;

    @FXML
    private Button btnVerTransacciones;

    @FXML
    private TextField txtDepositarFondos;

    @FXML
    private Button btnDepositarFondos;



    @FXML
    void handleBtnActualizarDatos(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/ActualizarDatos.fxml", "Actualizar Datos", event,
        getClass());
    }

    @FXML
    void handleBtnVerTransacciones(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/Transacciones.fxml", "Transacciones", event,
        getClass());
    }

    @FXML
    void handleBtnRegistrarEmpleado(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/RegistrarEmpleado.fxml", "Registrar empleado", event,
        getClass());
    }


    GestionarFondosController gestionarFondosController;

    @FXML
    void initialize() {
        gestionarFondosController = new GestionarFondosController(App.getConcesionario());
        txtFondosTotales.setText(gestionarFondosController.getConcesionario().obtenerPrecioCadena());
        App.setButtonHoverEffect(btnDepositarFondos);
        App.setButtonHoverEffect(btnRegresar);
        App.setButtonHoverEffect(btnRetirarFondos);
        App.setButtonHoverEffect(btnActualizarAdmin);
        App.setButtonHoverEffect(btnVerTransacciones);

    }

    @FXML
    void handleBtnRegresar(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/InicioAdministrador.fxml", "Inicio administrador", event, getClass());
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
                txtFondosTotales.setText(gestionarFondosController.getConcesionario().obtenerPrecioCadena()); // Actualizar
                                                                                                              // los
                                                                                                              // fondos
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
                txtFondosTotales.setText(gestionarFondosController.getConcesionario().obtenerPrecioCadena()); // Actualizar
                                                                                                                    // los
                                                                                                                    // fondos
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
