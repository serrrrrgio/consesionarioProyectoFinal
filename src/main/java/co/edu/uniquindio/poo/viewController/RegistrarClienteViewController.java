package co.edu.uniquindio.poo.viewController;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.image.ImageView;

import java.util.Arrays;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.PreguntaSeguridad;

public class RegistrarClienteViewController {

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private ImageView backgroundImage;

    @FXML
    private TextField txtCorreo;

    @FXML
    private Button btnRegistrarse;

    @FXML
    private TextField txtUsuario;

    @FXML
    private TextField txtNombre;

    @FXML
    private Button btnRegresar;

    @FXML
    private ChoiceBox<PreguntaSeguridad> choicePreguntaSeguridad;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtRespuesta;

    @FXML
    private TextField txtApellido;

    @FXML
    private Button btnLimpiarCampos;

    @FXML
    void handleBtnRegresar(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/Inicio.fxml", "Inicio", event, getClass());
    }

    @FXML
    void handleBtnIniciarSesion(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/IniciarSesion.fxml", "Inicio", event, getClass());
    }

    @FXML
    void handleBtnLimpiarCampos(ActionEvent event) {
        txtNombre.clear();
        txtApellido.clear();
        txtCorreo.clear(); 
        txtTelefono.clear();
        txtUsuario.clear();

    }


    @FXML
    void handleBtnRegistrarse(ActionEvent event) {
        if (camposValidos());
    }


    @FXML
    public void initialize() {
        // Establecer efectos de hover para los botones
        App.setButtonHoverEffect(btnRegresar);
        App.setButtonHoverEffect(btnIniciarSesion);
        App.setButtonHoverEffect(btnLimpiarCampos);
        App.setButtonHoverEffect(btnRegistrarse);
        choicePreguntaSeguridad.setItems(FXCollections.observableArrayList(PreguntaSeguridad.values()));
    }


    public boolean camposValidos() {
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String correo = txtCorreo.getText().trim();
        String telefono = txtTelefono.getText().trim();
        String usuario = txtUsuario.getText().trim();
        String contrasena = txtContrasena.getText().trim();
        String respuesta = txtRespuesta.getText().trim();
        PreguntaSeguridad preguntaSeleccionada = choicePreguntaSeguridad.getValue();
    
        // Validar campos vacíos
        if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || telefono.isEmpty() || 
            usuario.isEmpty() || contrasena.isEmpty() || respuesta.isEmpty() || preguntaSeleccionada == null) {
            App.mostrarAlerta("Campos vacíos", "Por favor llena todos los campos obligatorios.");
            return false;
        }
    
        // Validar formato de correo
        if (!correo.contains("@") || correo.startsWith("@") || correo.endsWith("@")) {
            App.mostrarAlerta("Correo inválido", "Por favor ingresa un correo válido.");
            return false;
        }
    
        // Validar formato de teléfono
        if (!telefono.matches("^3\\d{9}$")) {
            App.mostrarAlerta("Teléfono inválido", "El número de teléfono debe empezar con 3 y tener 10 dígitos.");
            return false;
        }
    
        return true;
    }
}

