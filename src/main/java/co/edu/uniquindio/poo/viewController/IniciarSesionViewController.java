package co.edu.uniquindio.poo.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.RegistrarseIniciarSesionController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;

public class IniciarSesionViewController {

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnRegresar;

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private RadioButton rdEmpleado;

    @FXML
    private Button btnCambiarContrasena;

    @FXML
    private ImageView backgroundImage;

    @FXML
    private RadioButton rdCliente;

    @FXML
    private RadioButton rdAdministrador;

    @FXML
    private Button btnRegistrarse;

    @FXML
    private ToggleGroup rol;

    @FXML
    private TextField txtUsuario;

    @FXML
    private Button btnLimpiarCampos;

    static RegistrarseIniciarSesionController registrarseIniciarSesionController;

    @FXML
    public void initialize() {
        // Verificar si el controlador es null
        if (registrarseIniciarSesionController == null) {
            registrarseIniciarSesionController = new RegistrarseIniciarSesionController(App.getConcesionario());
        }

        // Establecer efectos de hover para los botones
        if (btnRegistrarse != null) {
            App.setButtonHoverEffect(btnRegistrarse);
        }
        if (btnRegresar != null) {
            App.setButtonHoverEffect(btnRegresar);
        }
        if (btnIniciarSesion != null) {
            App.setButtonHoverEffect(btnIniciarSesion);
        }
        if (btnCambiarContrasena != null) {
            App.setButtonHoverEffect(btnCambiarContrasena);
        }
    }

    @FXML
    void handleBtnRegresar(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/Inicio.fxml", "Inicio", event, getClass());
    }

    @FXML
    void handleBtnRegistrarse(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/RegistrarCliente.fxml", "Registrarse", event, getClass());
    }

    @FXML
    void handleBtnLimpiarCampos(ActionEvent event) {
        txtUsuario.clear();
        txtContrasena.clear();
    }

    @FXML
    void rdObtenerRol(ActionEvent event) {
    }

    @FXML
    void handleBtnCambiarContrasena(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/CambiarContrasena.fxml", "Cambiar Contraseña", event, getClass());
    }

    @FXML
    void handleBtnIniciarSesion(ActionEvent event) {
        if (rdAdministrador.isSelected()) {
            if (registrarseIniciarSesionController.validarAdministrador(txtUsuario.getText(), txtContrasena.getText())) {
                App.mostrarMensaje("Inicio de sesión", "Se ha iniciado sesión correctamente como administrador", "Bienvenido " + txtUsuario.getText());
                ActualizarDatosViewController.usuarioActivo = App.getConcesionario().getAdministrador();
                App.cambiarEscena("/co/edu/uniquindio/poo/InicioAdministrador.fxml", "Inicio admin", event, getClass());
            } else {
                App.mostrarAlerta("Error al iniciar sesión", "Esos no son los datos del administrador");
            }
        } else if (rdCliente.isSelected()) {
            Cliente cliente = registrarseIniciarSesionController.obtenerCliente(txtUsuario.getText(), txtContrasena.getText());
            if (cliente != null) {
                App.mostrarMensaje("Inicio de sesión", "Se ha iniciado sesión correctamente", "Bienvenido " + txtUsuario.getText());
                ActualizarDatosViewController.usuarioActivo = cliente;
                App.cambiarEscena("/co/edu/uniquindio/poo/InicioCliente.fxml", "Inicio cliente", event, getClass());
            } else {
                App.mostrarAlerta("Error al iniciar sesión", "No existe un cliente con ese usuario y contraseña");
            }
        } else if (rdEmpleado.isSelected()) {
            Empleado empleado = registrarseIniciarSesionController.obtenerEmpleado(txtUsuario.getText(), txtContrasena.getText());
            if (empleado != null) {
                App.mostrarMensaje("Inicio de sesión", "Se ha iniciado sesión correctamente", "Bienvenido " + txtUsuario.getText());
                ActualizarDatosViewController.usuarioActivo = empleado;
                App.cambiarEscena("/co/edu/uniquindio/poo/InicioEmpleado.fxml", "Inicio empleado", event, getClass());
            } else {
                App.mostrarAlerta("Error al iniciar sesión", "No existe un empleado con ese usuario y contraseña");
            }
        } else {
            App.mostrarAlerta("Error al iniciar sesión", "Por favor seleccione un rol");
        }
    }
}
