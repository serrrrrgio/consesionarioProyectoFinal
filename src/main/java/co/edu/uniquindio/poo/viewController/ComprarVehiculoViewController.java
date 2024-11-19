package co.edu.uniquindio.poo.viewController;

import java.time.LocalDate;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.ComprarVehiculoController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Combustible;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.TipoTransaccion;
import co.edu.uniquindio.poo.model.TipoVehiculo;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ComprarVehiculoViewController {

    @FXML
    private TableView<Vehiculo> tblListVehiculosComprar;

    @FXML
    private TableColumn<Vehiculo, String> tbcMarca;

    @FXML
    private Button btnRegresar;

    @FXML
    private TextField txtEmpleado;

    @FXML
    private TableColumn<Vehiculo, String> tbcVehiculo;

    @FXML
    private TableColumn<Vehiculo, Integer> tbcModelo;

    @FXML
    private ChoiceBox<TipoVehiculo> choiceVehiculo;

    @FXML
    private Button btnComprar;

    @FXML
    private TableColumn<Vehiculo, Estado> tbcEstado;

    @FXML
    private TableColumn<Vehiculo, String> tbcPrecio;

    @FXML
    private TableColumn<Vehiculo, Combustible> tbcCombustible;

    @FXML
    private TextField txtVehiculo;

    ComprarVehiculoController comprarVehiculoController;
    Vehiculo vehiculoSeleccionado;
    Transaccion transaccion;
    static Empleado empleado;
    static Cliente cliente;

    @FXML
    void handloBtnComprar(ActionEvent event) {
        if (vehiculoSeleccionado == null) {
            App.mostrarAlerta("Error al comprar un vehículo", "Por favor selecciona el vehiculo que quieras comprar");
            return;
        }

        transaccion = crearTransaccion();
        empleado.agregarTransaccion(transaccion);
        cliente.agregarTransaccion(transaccion);
        comprarVehiculoController.agregarTransaccion(transaccion);
        comprarVehiculoController.setFondos(comprarVehiculoController.getFondos() + transaccion.getPrecio());
        App.mostrarMensaje("Vehículo", "Vehículo vendido", "Usted ha comprado un vehículo");

    }

    @FXML
    void handleBtnRegresar(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/InicioCliente.fxml", "Agregar cliente", event,
                getClass());
    }

    @FXML
    public void initialize() {
        comprarVehiculoController = new ComprarVehiculoController(App.getConcesionario());
        empleado = comprarVehiculoController.obtenerEmpleadoAzar();
        choiceVehiculo.setItems(FXCollections.observableArrayList(TipoVehiculo.values()));
        txtEmpleado.setText(empleado.getNombre());
        setVehiculos();
        inicializarData();
        agregarListener();

        App.setButtonHoverEffect(btnComprar);
    }

    public void agregarListener() {
        tblListVehiculosComprar.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    vehiculoSeleccionado = newValue;
                    txtVehiculo.setText(
                            vehiculoSeleccionado.getClass().getSimpleName() + ": " + vehiculoSeleccionado.getModelo());
                });

    }

    public Transaccion crearTransaccion() {
        return new Transaccion(LocalDate.now(), null,
                vehiculoSeleccionado.getPrecio(), TipoTransaccion.VENTA, empleado, cliente, vehiculoSeleccionado);
    }

    // Método para establecer la lista de motos
    public void setVehiculos() {
        tblListVehiculosComprar.setItems(comprarVehiculoController.obtenerVehiculosVenta());
    }

    public void inicializarData() {
        tbcMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));
        tbcEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));
        tbcModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        tbcPrecio
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().obtenerPrecioCadena()));
        tbcVehiculo.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getClass().getSimpleName()));
        tbcCombustible.setCellValueFactory(new PropertyValueFactory<>("combustible"));

    }

}
