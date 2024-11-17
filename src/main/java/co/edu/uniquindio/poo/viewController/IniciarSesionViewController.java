package co.edu.uniquindio.poo.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
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
        // Establecer efectos de hover para los botones
        registrarseIniciarSesionController = new RegistrarseIniciarSesionController(App.getConcesionario());
        App.setButtonHoverEffect(btnRegistrarse);
        App.setButtonHoverEffect(btnRegresar);
        App.setButtonHoverEffect(btnIniciarSesion);
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
    void handleBtnIniciarSesion(ActionEvent event) {
        if(rdAdministrador.isSelected()){
            if(registrarseIniciarSesionController.validarAdministrador(txtUsuario.getText(), txtContrasena.getText())){
                App.mostrarMensaje("Inicio de sesión", "Se ha iniciado sesión correctamente como administrador", "Bienvenido " + txtUsuario.getText());
                App.cambiarEscena("/co/edu/uniquindio/poo/InicioUsuario.fxml", "Inicio admin", event, getClass());
            }
            else{
                App.mostrarAlerta("Error al iniciar sesión", "Esos no son lo datos del administrador");
            }

        }
        else if(rdCliente.isSelected()){
            Cliente cliente = registrarseIniciarSesionController.obtenerCliente(txtUsuario.getText(), txtContrasena.getText());
            if(cliente != null){
                App.mostrarMensaje("Inicio de sesión", "Se ha iniciado sesión correctamente", "Bienvenido " + txtUsuario.getText());
                App.cambiarEscena("/co/edu/uniquindio/poo/InicioCliente.fxml", "Inicio cliente", event, getClass());
            }
            else{
                App.mostrarAlerta("Error al iniciar sesión", "No existe un cliente con ese usuario y contraseña");
            }
        }

        else if(rdEmpleado.isSelected()){
            Empleado empleado = registrarseIniciarSesionController.obtenerEmpleado(txtUsuario.getText(), txtContrasena.getText());
                if(empleado != null){
                    App.mostrarMensaje("Inicio de sesión", "Se ha iniciado sesión correctamente", "Bienvenido " + txtUsuario.getText());
                    App.cambiarEscena("/co/edu/uniquindio/poo/InicioEmpleado.fxml", "Iniciar cliente", event, getClass());
                }

                else{
                    App.mostrarAlerta("Error al iniciar sesión", "No existe un empleado con ese usuario y contraseña");
                }
            }
        
        else{
            App.mostrarAlerta("Error al inciar sesión", "Por favor seleccione un rol");
        }

        }

        
}



