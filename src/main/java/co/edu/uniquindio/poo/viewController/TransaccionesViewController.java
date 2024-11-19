package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.TransaccionesController;
import co.edu.uniquindio.poo.model.TipoTransaccion;
import co.edu.uniquindio.poo.model.Transaccion;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

public class TransaccionesViewController {

    @FXML
    private TableColumn<Transaccion, String> tbcVehiculo;
    

    @FXML
    private ImageView backgroundImage;

    @FXML
    private DatePicker datePickerFechaFinal;

    @FXML
    private DatePicker datePickerFechaInicial;

    @FXML
    private TableColumn<Transaccion, String> tbcPrecio;

    @FXML
    private Button btnVerTransacciones;

    @FXML
    private TableColumn<Transaccion, String> tbcEmpleado;

    @FXML
    private TableColumn<Transaccion, TipoTransaccion> tbcTransaccion;

    @FXML
    private Button btnActualizarDatos;

    @FXML
    private Button btnRegresar;

    @FXML
    private TableColumn<Transaccion, String> tbcCliente;

    @FXML
    private Button btnRegistrarEmpleado;

    @FXML
    private TableView<Transaccion> tblListTransacciones;

    @FXML
    private Button btnGestionarFondos;

    @FXML
    private Button btnLimpiarCampos;

    TransaccionesController transaccionesController;

    @FXML
    public void initialize() {
        transaccionesController = new TransaccionesController(App.getConcesionario());
        tbcCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCliente().getNombre()));
        tbcEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEmpleado().getNombre()));
        tbcPrecio.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().obtenerPrecioCadena()));
        tbcVehiculo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getVehiculo().getClass().getSimpleName()));
        tbcTransaccion.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getTipoTransaccion()));

        
        setTransacciones();
        App.setButtonHoverEffect(btnActualizarDatos);
        App.setButtonHoverEffect(btnGestionarFondos);
        App.setButtonHoverEffect(btnLimpiarCampos);
        App.setButtonHoverEffect(btnRegistrarEmpleado);
        App.setButtonHoverEffect(btnRegresar);
        App.setButtonHoverEffect(btnVerTransacciones);
    }

    public void setTransaccionesFecha(){
        tblListTransacciones.setItems(transaccionesController.obtenertransaccionesFechas(datePickerFechaInicial.getValue(), datePickerFechaFinal.getValue()));
    }

    public void setTransacciones(){
        tblListTransacciones.setItems(transaccionesController.obtenerTransaccions());
    }

    @FXML
    void handleBtnRegresar(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/InicioAdministrador.fxml", "Inicio", event, getClass());
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
    void handleBtnRegistrarEmpleado(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/RegistrarEmpleado.fxml", "Inicio", event, getClass());
    }

    @FXML
    void handleBtnLimpiarCampos(ActionEvent event) {
        datePickerFechaFinal.setValue(null);
        datePickerFechaInicial.setValue(null);
        
    }

    @FXML
    void handleBtnVerTransacciones(ActionEvent event) {
        if(!transaccionesController.validarFechaPosterior(datePickerFechaFinal.getValue(), datePickerFechaInicial.getValue())){
            App.mostrarAlerta("Error al validar la fecha", "La fecha final debe ser posterior a la fecha inicial");
            return;
        }

        setTransaccionesFecha();

    }

}
