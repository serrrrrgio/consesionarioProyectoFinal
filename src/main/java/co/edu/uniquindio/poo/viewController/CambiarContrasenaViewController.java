package co.edu.uniquindio.poo.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert.AlertType;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Persona;
import co.edu.uniquindio.poo.model.PreguntaSeguridad;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.RecuperarContrasenaController;

public class CambiarContrasenaViewController {

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private ImageView backgroundImage;

    @FXML
    private PasswordField txtContrasena1;

    @FXML
    private Button btnCambiarContrasena;

    @FXML
    private Button btnRegistrarse;

    @FXML
    private ToggleGroup rol;

    @FXML
    private TextField txtUsuario;

    @FXML
    private Button btnRegresar;

    @FXML
    private ChoiceBox<PreguntaSeguridad> choicePreguntaSeguridad;

    @FXML
    private Button btnAceptar;

    @FXML
    private RadioButton rdEmpleado;

    @FXML
    private Button btnRegistrarse1;

    @FXML
    private PasswordField txtRespuesta;

    @FXML
    private RadioButton rdCliente;

    @FXML
    private RadioButton rdAdministrador;

    @FXML
    private Button btnLimpiarCampos;

    boolean cambioValido;

    static Persona persona;

    @FXML
    void handleBtnRegistrarse(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/RegistrarCliente.fxml", "Registrarse", event, getClass());
    }

    @FXML
    void handleBtnIniciarSesion(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/IniciarSesion", "Registrarse", event, getClass());
    }

    @FXML
    void handleBtnAceptar(ActionEvent event) {
        if (!cambioValido) {
            App.mostrarAlerta("Error al cambiar contraseña", "Por favor llene los demás campos");
            return;
        }
        if (txtContrasena.getText().equals(txtContrasena1.getText())) {
            App.mostrarMensaje("Contraseña", "Contraseña restaurada",
                    "La constraseña ha sido restaurada correctamente");
            persona.setContrasena(txtContrasena.getText());
            App.cambiarEscena("/co/edu/uniquindio/poo/Inicio.fxml", "Inicio", event, getClass());
        }

    }

    private RecuperarContrasenaController recuperarContrasenaController;

    @FXML
    private void initialize() {
        recuperarContrasenaController = new RecuperarContrasenaController(App.getConcesionario());
        cambioValido = false;

        // Ocultar los campos de contraseña al iniciar
        txtContrasena.setVisible(false);
        txtContrasena1.setVisible(false);

        choicePreguntaSeguridad.getItems().addAll(PreguntaSeguridad.values());

        App.setButtonHoverEffect(btnAceptar);
        App.setButtonHoverEffect(btnCambiarContrasena);
        App.setButtonHoverEffect(btnLimpiarCampos);
        App.setButtonHoverEffect(btnRegistrarse);
        App.setButtonHoverEffect(btnRegistrarse1);
        App.setButtonHoverEffect(btnRegresar);

    }

    @FXML
    void handleBtnRegresar(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/Inicio.fxml", "Iniciar Sesión", event, getClass());
    }

    @FXML
    void handleBtnLimpiarCampos(ActionEvent event) {
        txtUsuario.clear();
        txtContrasena.clear();
        txtContrasena1.clear();
        txtRespuesta.clear();
        choicePreguntaSeguridad.getSelectionModel().clearSelection(); // Limpiar selección
    }

    @FXML
    void handleBtnCambiarContrasena(ActionEvent event) {
        if (rdAdministrador.isSelected()) {
            Administrador administrador = recuperarContrasenaController.obtenerAmAdministrador();
            if (txtUsuario.getText().equals(administrador.getUsuario())) {
                if (administrador.getPreguntaSeguridad().equals(choicePreguntaSeguridad.getValue())
                        && administrador.getRespuesta().equals(txtRespuesta.getText())) {
                    txtContrasena.setVisible(true);
                    txtContrasena1.setVisible(true);
                    cambioValido = true;
                    persona = administrador;
                } else {
                    App.mostrarAlerta("Error al intentar cambiar de contraseña", "Pregunta o respuesta incorrecta");
                }
            } else {
                App.mostrarAlerta("Error al intentar cambiar contraseña",
                        "EL administrador " + txtUsuario.getText() + " no existe");
            }
        }

        else if (rdCliente.isSelected()) {
            Cliente cliente = recuperarContrasenaController.obtenerClienteUsuario(txtUsuario.getText());
            if (cliente != null) {
                if (cliente.getPreguntaSeguridad().equals(choicePreguntaSeguridad.getValue())
                        && cliente.getRespuesta().equals(txtRespuesta.getText())) {
                    txtContrasena.setVisible(true);
                    txtContrasena1.setVisible(true);
                    cambioValido = true;
                    persona = cliente;
                } else {
                    App.mostrarAlerta("Error al intentar cambiar de contraseña", "Pregunta o respuesta incorrecta");
                }
            } else {
                App.mostrarAlerta("Error al intentar cambiar contraseña",
                        "EL cliente " + txtUsuario.getText() + " no existe");
            }
        }

        else if (rdEmpleado.isSelected()) {
            Empleado empleado = recuperarContrasenaController.obtenerEmpleadoUsuario(txtUsuario.getText());
            if (empleado != null) {
                if (empleado.getPreguntaSeguridad().equals(choicePreguntaSeguridad.getValue())
                        && empleado.getRespuesta().equals(txtRespuesta.getText())) {
                    txtContrasena.setVisible(true);
                    txtContrasena1.setVisible(true);
                    cambioValido = true;
                    persona = empleado;
                } else {
                    App.mostrarAlerta("Error al intentar cambiar de contraseña", "Pregunta o respuesta incorrecta");
                }
            } else {
                App.mostrarAlerta("Error al intentar cambiar contraseña",
                        "EL empleado " + txtUsuario.getText() + " no existe");
            }
        }

        else {
            App.mostrarAlerta("Error al cambiar contraseña", "Por favor seleccione su rol");
            return;
        }
    }
}
