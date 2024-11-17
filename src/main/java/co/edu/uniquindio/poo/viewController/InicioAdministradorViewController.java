package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

public class InicioAdministradorViewController {

    @FXML
    private Button btnRegresar;

    @FXML
    private ImageView backgroundImage;

    @FXML
    private Button btnActualizarDatosInicio;

    @FXML
    private Button btnRegistrarEmpleado;

    @FXML
    private Button btnGestionarFondosInicio;

    @FXML
    private Label lblRegistrarEmpleado;

    @FXML
    private TextField txtNombredmin;

    @FXML
    private Button btnActualizarDatos;

    @FXML
    private Button btnGestionarFondos;

    @FXML
    private Button btnRegistrarEmpleadoInicio;

    @FXML
    private Label lblGestionarFondos;

    @FXML
    private Label lblActualizarDatos;

    @FXML
    void handleBtnRegresar(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/IniciarSesion.fxml", "Inicio", event, getClass());
    }

    @FXML
    void handleBtnRegistrarEmpleado(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/RegistrarEmpleado.fxml", "Inicio", event, getClass());
    }

    @FXML
    void handleBtnActualizarDatos(ActionEvent event) {
        System.out.println();
    }

    @FXML
    void handleBtnGestionarFondos(ActionEvent event) {
        System.out.println();
    }

    @FXML
    private ImageView imgGestionarFondosInicio;

    @FXML
    private ImageView imgRegistrarEmpleadoInicio;

    @FXML
    private ImageView imgActualizarDatosInicio;
    
    @FXML
    public void initialize() {
        // Establecer efectos de hover para los botones principales
        App.setButtonHoverEffect(btnRegresar);
        App.setButtonHoverEffect(btnRegistrarEmpleado);
        App.setButtonHoverEffect(btnGestionarFondos);
        App.setButtonHoverEffect(btnActualizarDatos);

        // Agregar efectos de hover a los botones de inicio y etiquetas
        setHoverEffect(btnGestionarFondosInicio, imgGestionarFondosInicio, lblGestionarFondos, "imagenes/sack-dollar-white.png", "imagenes/sack-dollar.png");
        setHoverEffect(btnRegistrarEmpleadoInicio, imgRegistrarEmpleadoInicio, lblRegistrarEmpleado, "imagenes/user-add-white.png", "imagenes/user-add.png");
        setHoverEffect(btnActualizarDatosInicio, imgActualizarDatosInicio, lblActualizarDatos, "imagenes/apps-add-white.png", "imagenes/apps-add.png");

        // Efecto hover para el botón de regresar
        setHoverEffect(btnRegresar, null, null, "imagenes/exit%20(1)-white.png", "imagenes/exit%20(1).png");
    }

    private void setHoverEffect(Button button, ImageView imageView, Label label, String hoverImageUrl, String defaultImageUrl) {
        button.setOnMouseEntered((MouseEvent event) -> {
            if (imageView != null) {
                imageView.setImage(new Image(hoverImageUrl));
            }
            button.setStyle("-fx-background-color: black;"); // Cambiar fondo a negro
            if (label != null) {
                label.setStyle("-fx-text-fill: white; -fx-background-color: black;"); // Cambiar texto a blanco y fondo a negro
            }
        });
        button.setOnMouseExited((MouseEvent event) -> {
            if (imageView != null) {
                imageView.setImage(new Image(defaultImageUrl));
            }
            button.setStyle("-fx-background-color: white;"); // Restaurar fondo blanco
            if (label != null) {
                label.setStyle("-fx-text-fill: black; -fx-background-color: transparent;"); // Restaurar texto a negro y fondo transparente
            }
        });
    }
}
