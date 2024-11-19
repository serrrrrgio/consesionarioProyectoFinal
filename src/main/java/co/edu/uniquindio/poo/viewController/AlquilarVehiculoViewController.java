package co.edu.uniquindio.poo.viewController;

import java.time.LocalDate;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AlquilarVehiculoController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.TipoTransaccion;
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
    private ChoiceBox<TipoVehiculo> choiceVehiculo;

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
        choiceVehiculo.setItems(FXCollections.observableArrayList(TipoVehiculo.values()));
        agregarListenerChoiceBox();
        agregarListener();
        App.setButtonHoverEffect(btnAlquilar);
        App.setButtonHoverEffect(btnCalcularDias);
        App.setButtonHoverEffect(btnRegresar);
    }

    public void agregarListener() {
        tblListVehiculosAlquiler.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    vehiculoSeleccionado = newValue;
                    txtVehiculo.setText(
                            vehiculoSeleccionado.getClass().getSimpleName() + ": " + vehiculoSeleccionado.getModelo());
                });

    }

    public void agregarListenerChoiceBox() {
        choiceVehiculo.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                ObservableList<Vehiculo> listaFiltrada;

                // Selecciona la lista de vehículos según el tipo seleccionado
                switch (newValue) {
                    case BUS:
                        listaFiltrada = alquilarVehiculoController.obtenerInterseccion(
                                alquilarVehiculoController.obtenerVehiculosAlquiler(),
                                FXCollections.observableArrayList(alquilarVehiculoController.obtenerBuses()));
                        break;
                    case CAMION:
                        listaFiltrada = alquilarVehiculoController.obtenerInterseccion(
                                alquilarVehiculoController.obtenerVehiculosAlquiler(),
                                FXCollections.observableArrayList(alquilarVehiculoController.obtenerCamiones()));
                        break;
                    case CAMIONETA:
                        listaFiltrada = alquilarVehiculoController.obtenerInterseccion(
                                alquilarVehiculoController.obtenerVehiculosAlquiler(),
                                FXCollections.observableArrayList(alquilarVehiculoController.obtenerCamionetas()));
                        break;
                    case DEPORTIVO:
                        listaFiltrada = alquilarVehiculoController.obtenerInterseccion(
                                alquilarVehiculoController.obtenerVehiculosAlquiler(),
                                FXCollections.observableArrayList(alquilarVehiculoController.obtenerDeportivos()));
                        break;
                    case MOTO:
                        listaFiltrada = alquilarVehiculoController.obtenerInterseccion(
                                alquilarVehiculoController.obtenerVehiculosAlquiler(),
                                FXCollections.observableArrayList(alquilarVehiculoController.obtenerMotos()));
                        break;
                    case PICK_UP:
                        listaFiltrada = alquilarVehiculoController.obtenerInterseccion(
                                alquilarVehiculoController.obtenerVehiculosAlquiler(),
                                FXCollections.observableArrayList(alquilarVehiculoController.obtenerPickUps()));
                        break;
                    case SEDAN:
                        listaFiltrada = alquilarVehiculoController.obtenerInterseccion(
                                alquilarVehiculoController.obtenerVehiculosAlquiler(),
                                FXCollections.observableArrayList(alquilarVehiculoController.obtenerSedanes()));
                        break;
                    case VAN:
                        listaFiltrada = alquilarVehiculoController.obtenerInterseccion(
                                alquilarVehiculoController.obtenerVehiculosAlquiler(),
                                FXCollections.observableArrayList(alquilarVehiculoController.obtenerVans()));
                                System.out.println((alquilarVehiculoController.obtenerVans()));
                        break;
                    default:
                        // Si no se selecciona nada, mostrar todos los vehículos en venta
                        listaFiltrada = alquilarVehiculoController.obtenerVehiculosAlquiler();
                }

                // Actualiza los ítems de la tabla con la lista filtrada
                tblListVehiculosAlquiler.setItems(listaFiltrada);
            }
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
        if (vehiculoSeleccionado != null) {
            if (diasValidos() && fechasValidas()) {
                alquilarVehiculoController.alquilarVehiculo(empleado, cliente, vehiculoSeleccionado,
                        datePickerFechaEntrega.getValue(), datePickerFechaDevolucion.getValue());
                setVehiculos();
                tblListVehiculosAlquiler.refresh();
                choiceVehiculo.setValue(null);
                App.mostrarMensaje("Vehiculo alquilado", "", "El vehiculo ha sido alquilado correctamente");
            }
        }

        else {
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
        if (!alquilarVehiculoController.validarFechaPosterior(datePickerFechaEntrega.getValue(), LocalDate.now())) {
            App.mostrarAlerta("Error", "La fecha de entrega del vehiculo no puede ser anterior a hoy");
            return false;
        }
        return true;
    }

    public boolean fechasValidas() {
        if (!alquilarVehiculoController.validarFechaPosterior(datePickerFechaDevolucion.getValue(),
                datePickerFechaEntrega.getValue())) {
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
