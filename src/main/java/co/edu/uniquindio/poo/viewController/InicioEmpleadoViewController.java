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
import java.net.URL;

public class InicioEmpleadoViewController {

    @FXML
    private Button btnActualizarDatos;

    @FXML
    private Button btnGestionarVehiculos;

    @FXML
    private Button btnRegresar;

    @FXML
    private Button btnGestionarVehiculosInicio;

    @FXML
    private ImageView backgroundImage;

    @FXML
    private Button btnActualizarDatosInicio;

    @FXML
    private ImageView btnGestionarVehiculosInicioImage;

    @FXML
    private ImageView btnRegresarImage;

    @FXML
    private TextField txtNombredmin;

    @FXML
    private ImageView btnActualizarDatosInicioImage;

    @FXML
    private Label lblActualizarDatos;

    @FXML
    private Label lblGestionarVehiculos;

    private Image originalActualizarDatos;
    private Image originalGestionarVehiculos;
    private Image originalRegresar;

    @FXML
    public void initialize() {
        // Cargar imágenes originales y asignarlas
        originalActualizarDatos = cargarImagen("/co/edu/uniquindio/poo/imagenes/apps-add.png",
                btnActualizarDatosInicioImage);
        originalGestionarVehiculos = cargarImagen("/co/edu/uniquindio/poo/imagenes/car-garage.png",
                btnGestionarVehiculosInicioImage);
        originalRegresar = cargarImagen("/co/edu/uniquindio/poo/imagenes/exit (1).png", btnRegresarImage);

        // Aplicar efectos hover
        setHoverEffect(btnActualizarDatosInicio, btnActualizarDatosInicioImage, lblActualizarDatos,
                "/co/edu/uniquindio/poo/imagenes/apps-add (2).png", originalActualizarDatos);
        setHoverEffect(btnGestionarVehiculosInicio, btnGestionarVehiculosInicioImage, lblGestionarVehiculos,
                "/co/edu/uniquindio/poo/imagenes/car-garage (1).png", originalGestionarVehiculos);
        setHoverEffect(btnRegresar, btnRegresarImage, null,
                "/co/edu/uniquindio/poo/imagenes/exit (2).png", originalRegresar);
    }

    private Image cargarImagen(String imageUrl, ImageView imageView) {
        URL imageResource = getClass().getResource(imageUrl);
        if (imageResource != null) {
            Image image = new Image(imageResource.toExternalForm());
            imageView.setImage(image);
            return image;
        } else {
            System.out.println("Imagen no encontrada: " + imageUrl);
            return null;
        }
    }

    @FXML
    void handleBtnRegresar(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/IniciarSesion.fxml", "Inicio", event, getClass());
    }

    @FXML
    void handleBtnActualizarDatos(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/ActualizarDatosEmpleado.fxml", "Inicio", event, getClass());
    }

    @FXML
    void handleBtnGestionarVehiculos(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/GestionarVehiculos.fxml", "Inicio", event, getClass());
    }

    private void setHoverEffect(Button button, ImageView imageView, Label label, String hoverImagePath,
            Image originalImage) {
        button.setOnMouseEntered((MouseEvent event) -> {
            cargarImagen(hoverImagePath, imageView);
            button.setStyle("-fx-background-color: black;");

            if (label != null) {
                label.setStyle("-fx-text-fill: white; -fx-background-color: black;");
            }
        });

        button.setOnMouseExited((MouseEvent event) -> {
            imageView.setImage(originalImage); // Restaurar la imagen original
            button.setStyle("-fx-background-color: transparent;");

            if (label != null) {
                label.setStyle("-fx-text-fill: black; -fx-background-color: transparent;");
            }
        });
    }
}
