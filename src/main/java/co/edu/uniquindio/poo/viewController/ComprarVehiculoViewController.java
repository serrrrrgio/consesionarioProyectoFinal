package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.ComprarVehiculoController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Combustible;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.TipoVehiculo;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    void handleBtnComprar(ActionEvent event) {
        if (vehiculoSeleccionado == null) {
            App.mostrarAlerta("Error al comprar un vehículo", "Por favor selecciona el vehiculo que quieras comprar");
            return;
        }

        txtVehiculo.clear();
        Vehiculo temporal = vehiculoSeleccionado;
        tblListVehiculosComprar.getSelectionModel().clearSelection(); // Deseleccionar el cliente en la tabla
        vehiculoSeleccionado = null; // Reiniciar la referencia al cliente seleccionado
        tblListVehiculosComprar.getSelectionModel().clearSelection(); // Deseleccionar el cliente en la tabla
        comprarVehiculoController.comprarVehiculo(empleado, cliente, temporal,
                temporal.getPrecio());
        setVehiculos();
        tblListVehiculosComprar.refresh();
        choiceVehiculo.setValue(null);
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
        agregarListenerChoiceBox();
        App.setButtonHoverEffect(btnComprar);
        App.setButtonHoverEffect(btnRegresar);

    }

    public void agregarListenerChoiceBox() {
        choiceVehiculo.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                ObservableList<Vehiculo> listaFiltrada;

                // Selecciona la lista de vehículos según el tipo seleccionado
                switch (newValue) {
                    case BUS:
                        listaFiltrada = comprarVehiculoController.obtenerInterseccion(
                                comprarVehiculoController.obtenerVehiculosVenta(),
                                FXCollections.observableArrayList(comprarVehiculoController.obtenerBuses()));
                        break;
                    case CAMION:
                        listaFiltrada = comprarVehiculoController.obtenerInterseccion(
                                comprarVehiculoController.obtenerVehiculosVenta(),
                                FXCollections.observableArrayList(comprarVehiculoController.obtenerCamiones()));
                        break;
                    case CAMIONETA:
                        listaFiltrada = comprarVehiculoController.obtenerInterseccion(
                                comprarVehiculoController.obtenerVehiculosVenta(),
                                FXCollections.observableArrayList(comprarVehiculoController.obtenerCamionetas()));
                        break;
                    case DEPORTIVO:
                        listaFiltrada = comprarVehiculoController.obtenerInterseccion(
                                comprarVehiculoController.obtenerVehiculosVenta(),
                                FXCollections.observableArrayList(comprarVehiculoController.obtenerDeportivos()));
                        break;
                    case MOTO:
                        listaFiltrada = comprarVehiculoController.obtenerInterseccion(
                                comprarVehiculoController.obtenerVehiculosVenta(),
                                FXCollections.observableArrayList(comprarVehiculoController.obtenerMotos()));
                        break;
                    case PICK_UP:
                        listaFiltrada = comprarVehiculoController.obtenerInterseccion(
                                comprarVehiculoController.obtenerVehiculosVenta(),
                                FXCollections.observableArrayList(comprarVehiculoController.obtenerPickUps()));
                        break;
                    case SEDAN:
                        listaFiltrada = comprarVehiculoController.obtenerInterseccion(
                                comprarVehiculoController.obtenerVehiculosVenta(),
                                FXCollections.observableArrayList(comprarVehiculoController.obtenerSedanes()));
                        break;
                    case VAN:
                        listaFiltrada = comprarVehiculoController.obtenerInterseccion(
                                comprarVehiculoController.obtenerVehiculosVenta(),
                                FXCollections.observableArrayList(comprarVehiculoController.obtenerVans()));
                        System.out.println((comprarVehiculoController.obtenerVans()));
                        break;
                    default:
                        // Si no se selecciona nada, mostrar todos los vehículos en venta
                        listaFiltrada = comprarVehiculoController.obtenerVehiculosVenta();
                }

                // Actualiza los ítems de la tabla con la lista filtrada
                tblListVehiculosComprar.setItems(listaFiltrada);
            }
        });
    }

    public void agregarListener() {
        tblListVehiculosComprar.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    if (newValue != null) {
                        vehiculoSeleccionado = newValue;
                        txtVehiculo.setText(
                                vehiculoSeleccionado.getClass().getSimpleName() + ": "
                                        + vehiculoSeleccionado.getModelo());
                    } else {
                        // Maneja el caso cuando no hay vehículo seleccionado
                        txtVehiculo.clear();
                    }
                });

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
