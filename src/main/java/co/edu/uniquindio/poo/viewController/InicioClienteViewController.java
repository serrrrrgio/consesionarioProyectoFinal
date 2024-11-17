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

public class InicioClienteViewController {

 
    @FXML
    private Label lblComprarVehiculo;

    @FXML
    private Button btnAlquilarVehiculo;

    @FXML
    private ImageView backgroundImage;

    @FXML
    private Label lblVenderVehiculo;

    @FXML
    private ImageView btnAlquilarVehiculoInicioImage1;

    @FXML
    private Button btnAlquilarVehiculoInicio;

    @FXML
    private ImageView btnActualizarDatosInicioImage;

    @FXML
    private Label lblAlquilarVehiculo;

    @FXML
    private Label lblActualizarDatos;

    @FXML
    private Button btnActualizarDatos;

    @FXML
    private Button btnVenderVehiculo;

    @FXML
    private ImageView btnVenderVehiculoInicioImage;

    @FXML
    private Button btnRegresar;

    @FXML
    private Button btnComprarVehiculoInicio;

    @FXML
    private Button btnVenderVehiculoInicio;

    @FXML
    private Button btnActualizarDatosInicio;

    @FXML
    private Button btnComprarVehiculo;

    @FXML
    private ImageView btnRegresarImage;

    @FXML
    private ImageView btnComprarVehiculoInicioImage;

    @FXML
    private TextField txtNombredmin;

    private Image originalActualizarDatos;
    private Image originalComprarVehiculo;
    private Image originalVenderVehiculo;
    private Image originalAlquilarVehiculo;
    private Image originalRegresar;

    @FXML
    public void initialize() {
        // Cargar imágenes originales y asignarlas
        originalActualizarDatos = cargarImagen("/co/edu/uniquindio/poo/imagenes/apps-add.png", btnActualizarDatosInicioImage);
        originalComprarVehiculo = cargarImagen("/co/edu/uniquindio/poo/imagenes/coins.png", btnComprarVehiculoInicioImage);
        originalVenderVehiculo = cargarImagen("/co/edu/uniquindio/poo/imagenes/selling.png", btnVenderVehiculoInicioImage);
        originalAlquilarVehiculo = cargarImagen("/co/edu/uniquindio/poo/imagenes/handshake.png", btnAlquilarVehiculoInicioImage1);
        originalRegresar = cargarImagen("/co/edu/uniquindio/poo/imagenes/exit (1).png", btnRegresarImage);

        // Aplicar efectos hover
        setHoverEffect(btnActualizarDatosInicio, btnActualizarDatosInicioImage, lblActualizarDatos, 
                       "/co/edu/uniquindio/poo/imagenes/apps-add (2).png", originalActualizarDatos);
        setHoverEffect(btnComprarVehiculoInicio, btnComprarVehiculoInicioImage, lblComprarVehiculo, 
                       "/co/edu/uniquindio/poo/imagenes/coins (1).png", originalComprarVehiculo);
        setHoverEffect(btnVenderVehiculoInicio, btnVenderVehiculoInicioImage, lblVenderVehiculo, 
                       "/co/edu/uniquindio/poo/imagenes/selling (1).png", originalVenderVehiculo);
        setHoverEffect(btnAlquilarVehiculoInicio, btnAlquilarVehiculoInicioImage1, lblAlquilarVehiculo, 
                       "/co/edu/uniquindio/poo/imagenes/handshake (1).png", originalAlquilarVehiculo);
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
    void handleBtnComprarVehiculo(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/ComprarVehiculo.fxml", "Inicio", event, getClass());
    }

    @FXML
    void handleBtnVenderVehiculo(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/VenderVehiculo.fxml", "Inicio", event, getClass());
    }

    @FXML
    void handleBtnActualizarDatos(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/ActualizarDatosCliente.fxml", "Inicio", event, getClass());
    }

    @FXML
    void handleBtnAlquilarVehiculo(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/AlquilarVehiculo.fxml", "Inicio", event, getClass());
    }

    private void setHoverEffect(Button button, ImageView imageView, Label label, String hoverImagePath, Image originalImage) {
        button.setOnMouseEntered((MouseEvent event) -> {
            cargarImagen(hoverImagePath, imageView);
            button.setStyle("-fx-background-color: black;");

            if (label != null) {
                label.setStyle("-fx-text-fill: white; -fx-background-color: black;");
            }
        });

        button.setOnMouseExited((MouseEvent event) -> {
            imageView.setImage(originalImage);  // Restaurar la imagen original
            button.setStyle("-fx-background-color: transparent;");

            if (label != null) {
                label.setStyle("-fx-text-fill: black; -fx-background-color: transparent;");
            }
        });
    }
}
