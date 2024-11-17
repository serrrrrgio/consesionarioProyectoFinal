package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import javafx.stage.Stage;
import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;

public class InicioViewController {

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnSalir;

    @FXML
    private ImageView backgroundImage;

    @FXML
    private Button btnRegistrarse;

    @FXML
    void handleBtnSalir(ActionEvent event) {
        Stage stage = (Stage) btnSalir.getScene().getWindow();
        stage.close();
    }

    @FXML
    void handleBtnIniciarSesion(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/IniciarSesion.fxml", "IniciarSesion", event, getClass());
    }
    

    @FXML
    void handleBtnRegistrarse(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/RegistrarCliente.fxml", "Registrar cliente", event, getClass());
    }

    @FXML
    public void initialize() {
        // Establecer efectos de hover para los botones
        App.setButtonHoverEffect(btnSalir);
        App.setButtonHoverEffect(btnIniciarSesion);
        App.setButtonHoverEffect(btnRegistrarse);
    }

}