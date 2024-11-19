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

public class InicioAdministradorViewController {

    @FXML
    private Button btnTransacciones;

    @FXML
    private ImageView backgroundImage;

    @FXML
    private ImageView btnGestionarFondosInicioImage;

    @FXML
    private Button btnGestionarFondosInicio;

    @FXML
    private Button btnTransaccionesInicio;

    @FXML
    private Label lblTransacciones;

    @FXML
    private ImageView btnActualizarDatosInicioImage;

    @FXML
    private Label lblActualizarDatos;

    @FXML
    private Button btnActualizarDatos;

    @FXML
    private Button btnRegresar;

    @FXML
    private ImageView btnRegistrarEmpleadoInicioImage;

    @FXML
    private Button btnActualizarDatosInicio;

    @FXML
    private Button btnRegistrarEmpleado;

    @FXML
    private Label lblRegistrarEmpleado;

    @FXML
    private ImageView btnTransaccionesInicioImage1;

    @FXML
    private ImageView btnRegresarImage;

    @FXML
    private TextField txtNombredmin;

    @FXML
    private Button btnGestionarFondos;

    @FXML
    private Button btnRegistrarEmpleadoInicio;

    @FXML
    private Label lblGestionarFondos;

    private Image originalGestionarFondos;
    private Image originalRegistrarEmpleado;
    private Image originalActualizarDatos;
    private Image originalRegresar;
    private Image originalTransacciones;

    @FXML
    public void initialize() {
        // Cargar imágenes originales y asignarlas
        originalGestionarFondos = cargarImagen("/co/edu/uniquindio/poo/imagenes/sack-dollar.png", btnGestionarFondosInicioImage);
        originalRegistrarEmpleado = cargarImagen("/co/edu/uniquindio/poo/imagenes/user-add (1).png", btnRegistrarEmpleadoInicioImage);
        originalActualizarDatos = cargarImagen("/co/edu/uniquindio/poo/imagenes/apps-add.png", btnActualizarDatosInicioImage);
        originalRegresar = cargarImagen("/co/edu/uniquindio/poo/imagenes/exit (1).png", btnRegresarImage);
        originalTransacciones = cargarImagen("/co/edu/uniquindio/poo/imagenes/document-signed.png", btnTransaccionesInicioImage1);

        // Aplicar efectos hover
        setHoverEffect(btnGestionarFondosInicio, btnGestionarFondosInicioImage, lblGestionarFondos, 
                       "/co/edu/uniquindio/poo/imagenes/sack-dollar (1).png", originalGestionarFondos);
        setHoverEffect(btnRegistrarEmpleadoInicio, btnRegistrarEmpleadoInicioImage, lblRegistrarEmpleado, 
                       "/co/edu/uniquindio/poo/imagenes/user-add (2).png", originalRegistrarEmpleado);
        setHoverEffect(btnActualizarDatosInicio, btnActualizarDatosInicioImage, lblActualizarDatos, 
                       "/co/edu/uniquindio/poo/imagenes/apps-add (2).png", originalActualizarDatos);
        setHoverEffect(btnRegresar, btnRegresarImage, null, 
                       "/co/edu/uniquindio/poo/imagenes/exit (2).png", originalRegresar);
        setHoverEffect(btnTransaccionesInicio, btnTransaccionesInicioImage1, lblTransacciones, 
                       "/co/edu/uniquindio/poo/imagenes/document-signed (1).png", originalTransacciones);
        App.setButtonHoverEffect(btnRegresar);
        App.setButtonHoverEffect(btnActualizarDatos);
        App.setButtonHoverEffect(btnGestionarFondos);
        App.setButtonHoverEffect(btnRegistrarEmpleado);
        App.setButtonHoverEffect(btnTransacciones);        
        
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
    void handleBtnRegistrarEmpleado(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/RegistrarEmpleado.fxml", "Inicio", event, getClass());
    }

    @FXML
    void handleBtnActualizarDatos(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/ActualizarDatos.fxml", "Inicio", event, getClass());
    }

    @FXML
    void handleBtnGestionarFondos(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/GestionarFondos.fxml", "Inicio", event, getClass());
    }

    @FXML
    void handleBtnTransacciones(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/Transacciones.fxml", "Transacciones", event, getClass());
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
