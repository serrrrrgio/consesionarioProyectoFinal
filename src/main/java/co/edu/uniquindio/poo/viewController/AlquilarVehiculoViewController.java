package co.edu.uniquindio.poo.viewController;

import java.time.LocalDate;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AlquilarVehiculoController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.TipoTransaccion;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AlquilarVehiculoViewController {

    @FXML
    private Button btnAlquilar;

    @FXML
    private TableColumn<Vehiculo, String> tbcMarca;

    @FXML
    private TableView<Vehiculo> tblListVehiculosAlquiler;

    @FXML
    private TableColumn<Vehiculo, String> tbcVehiculo;

    @FXML
    private Button btnCalcularDias;

    @FXML
    private TableColumn<Vehiculo, String> tbcPrecio;

    @FXML
    private TextField txtVehiculo;

    @FXML
    private TextField txtCliente;

    @FXML
    private Button btnRegresar;

    @FXML
    private TableColumn<Vehiculo, Integer> tbcModelo;

    @FXML
    private DatePicker datePickerFechaDevolucion;

    @FXML
    private TableColumn<Vehiculo, String> tbcEstado;

    @FXML
    private TextField txtDias;

    @FXML
    private TextField txtEmpleado;

    @FXML
    private DatePicker datePickerFechaEntrega;

    Vehiculo vehiculoSeleccionado;
    static Empleado empleado;
    static Cliente cliente;


    AlquilarVehiculoController alquilarVehiculoController;

    @FXML
    public void initialize() {
        alquilarVehiculoController = new AlquilarVehiculoController(App.getConcesionario());
        empleado = alquilarVehiculoController.obtenerEmpleadoAzar();
        txtEmpleado.setText(empleado.getNombre());
        setVehiculos();
        inicializarData();
        agregarListener();
    }

    public void agregarListener() {
        tblListVehiculosAlquiler.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    vehiculoSeleccionado = newValue;
                    txtVehiculo.setText(
                            vehiculoSeleccionado.getClass().getSimpleName() + ": " + vehiculoSeleccionado.getModelo());
                });

    }

    public void inicializarData() {
        tbcMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));
        tbcEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));
        tbcModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        tbcPrecio
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().obtenerPrecioCadena()));
        tbcVehiculo.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getClass().getSimpleName()));
    }

    @FXML
    public void handloBtnAlquilar(ActionEvent event) {
        if(vehiculoSeleccionado != null){
            if (diasValidos()) {
                Transaccion transaccion = crearTransaccion();
                cliente.agregarTransaccion(transaccion);
                alquilarVehiculoController.eliminarVehiculo(vehiculoSeleccionado);
                alquilarVehiculoController.agregarTransaccion(transaccion);
                empleado.agregarTransaccion(transaccion);
                App.mostrarMensaje("Vehiuclo alquilado", "", "El vehiculo se ha alquilado correctamente");
            }
        }

        else{
            App.mostrarAlerta("Error", "Seleccione un vehiculo");
        }
        

    }

    public Transaccion crearTransaccion() {
        return new Transaccion(datePickerFechaEntrega.getValue(), datePickerFechaDevolucion.getValue(),
                vehiculoSeleccionado.getPrecio(), TipoTransaccion.ALQUILER, empleado, cliente, vehiculoSeleccionado);
    }

    // Método para establecer la lista de motos
    public void setVehiculos() {
        tblListVehiculosAlquiler.setItems(alquilarVehiculoController.obtenerVehiculosAlquiler());
    }

    public boolean diasValidos() {
        if (!alquilarVehiculoController.validarFechaPosterior(datePickerFechaEntrega.getValue(),
                LocalDate.now())) {
            App.mostrarAlerta("Error", "La fecha de entrega del vehiculo no puede ser anterior a hoy");
            return false;
        }
        return true;
    }

    @FXML
    public void calcularDias() {
        if (diasValidos()) {
            txtDias.setText(
                alquilarVehiculoController.calcularDias(datePickerFechaEntrega.getValue(),
                            datePickerFechaDevolucion.getValue())
                            + "");
        }
    }

    @FXML
    public void regresar(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/InicioCliente.fxml", "Agregar cliente", event,
                getClass());
    }

}
