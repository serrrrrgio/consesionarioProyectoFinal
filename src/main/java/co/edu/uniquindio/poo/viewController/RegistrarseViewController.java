package co.edu.uniquindio.poo.viewController;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.image.ImageView;

public class RegistrarseViewController {

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private RadioButton rdbtnEmpleado;

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private ImageView backgroundImage;

    @FXML
    private RadioButton rdbtnCliente;

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
    private ChoiceBox<?> choicePreguntaSeguridad;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtRespuesta;

    @FXML
    private TextField txtApellido;

    @FXML
    private Button btnLimpiarCampos;

    @FXML
    void handleBtnSalir(ActionEvent event) {

    }

    @FXML
    void handleBtnIniciarSesion(ActionEvent event) {

    }


    @FXML
    public void initialize() {


        // Establecer efectos de hover para los botones
        setButtonHoverEffect(btnRegresar);
        setButtonHoverEffect(btnIniciarSesion);
    }

    private void setButtonHoverEffect(Button button) {
        button.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        button.addEventHandler(MouseEvent.MOUSE_ENTERED, e -> {
            button.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        });
        button.addEventHandler(MouseEvent.MOUSE_EXITED, e -> {
            button.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        });
    }

}

