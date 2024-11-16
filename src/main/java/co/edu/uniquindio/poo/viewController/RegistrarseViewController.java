package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

public class RegistrarseViewController {

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnRegresar;

    @FXML
    private ImageView backgroundImage;

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
