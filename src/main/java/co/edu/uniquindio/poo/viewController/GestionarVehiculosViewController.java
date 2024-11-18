package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionarVehiculosController;
import co.edu.uniquindio.poo.model.Bus;
import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Combustible;
import co.edu.uniquindio.poo.model.Deportivo;
import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.PickUp;
import co.edu.uniquindio.poo.model.Sedan;
import co.edu.uniquindio.poo.model.TipoCamion;
import co.edu.uniquindio.poo.model.TipoRegistro;
import co.edu.uniquindio.poo.model.TipoVehiculo;
import co.edu.uniquindio.poo.model.Transmision;
import co.edu.uniquindio.poo.model.Van;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

public class GestionarVehiculosViewController {

    @FXML
    private TextField txtModeloVehiculo;

    @FXML
    private RadioButton rdCuatroPorCuatroPickupa;

    @FXML
    private TableColumn<Vehiculo, String> tbcMarca;

    @FXML
    private Button btnRegistrarVehiculo;

    @FXML
    private RadioButton rdCamaraReversaCarro;

    @FXML
    private ChoiceBox<TipoVehiculo> choiceVehiculo;

    @FXML
    private TextField txtCapacidadMaleteroCamioneta;

    @FXML
    private TextField txtPrecio;

    @FXML
    private RadioButton rdHibridoLigero;

    @FXML
    private ChoiceBox<Transmision> choiceTransmisionVehiculo;

    @FXML
    private TextField txtNumeroBolsasAirePickUp;

    @FXML
    private TextField txtTiempoCargaElectrico;

    @FXML
    private TextField txtMarcaVehiculo;

    @FXML
    private TextField txtNumeroBolsasAireDeportivo;

    @FXML
    private TextField txtNumeroBolsasAireCamioneta;

    @FXML
    private TableColumn<Vehiculo, Combustible> tbcTipoCombustible;

    @FXML
    private TableColumn<Vehiculo, String> tbcModelo;

    @FXML
    private Button btnActualizarAdmin;

    @FXML
    private TextField txtNumeroEjesBus;

    @FXML
    private TextField txtAutonomiaElectrico;

    @FXML
    private TextField txtNumeroBolsasAireSedan;

    @FXML
    private RadioButton rdSensorTraficoCruzadoCamioneta;

    @FXML
    private TextField txtCapacidadCajaCargaPickUp;

    @FXML
    private Button btnActualizarVehiculo;

    @FXML
    private RadioButton rdAireAcondicionadoCarro;

    @FXML
    private ChoiceBox<Estado> choiceEstadoVehiculo;

    @FXML
    private ChoiceBox<Combustible> choiceCombustibleVehiculo;

    @FXML
    private RadioButton rdAsistentePermanenciaCarrilCamioneta;

    @FXML
    private TableView<Vehiculo> tblListVehiculos;

    @FXML
    private RadioButton rdVelocidadCruceroCamioneta;

    @FXML
    private RadioButton rdEnchufable;

    @FXML
    private RadioButton rdSensoresColisionCamioneta;

    @FXML
    private TextField txtNumeroCaballosFuerzaDeportivo;

    @FXML
    private TextField txtNumeroBolsasAireVan;

    @FXML
    private RadioButton rdVelocidadCruceroSedan;

    @FXML
    private TextField txtPlacaVehiculo;

    @FXML
    private TableColumn<Vehiculo, String> tbcTipoVehiculo;

    @FXML
    private ImageView backgroundImage;

    @FXML
    private TextField txtCapacidadMaleteroVan;

    @FXML
    private RadioButton rdSensoresColisionSedan;

    @FXML
    private TextField txtNumeroPasajerosCarro;

    @FXML
    private TextField txtCilindrajeVehiculo;

    @FXML
    private RadioButton rdAbsCarro;

    @FXML
    private ToggleGroup hibrido;

    @FXML
    private TextField txtCambiosVehiculo;

    @FXML
    private TextField txtTiempoAlcanzar100kmhDeportivo;

    @FXML
    private Button btnRegresar;

    @FXML
    private TextField txtVelocidadMaximaVehiculo;

    @FXML
    private TextField txtNumeroPuertasCarro;

    @FXML
    private TextField txtNumeroBolsasAireBus;

    @FXML
    private TextField txtCapacidadMaleteroBus;

    @FXML
    private RadioButton rdAsistentePermanenteSedan;

    @FXML
    private Button btnLimpiarCampos;

    @FXML
    private TextField txtCapacidadMaleteroSedan;

    @FXML
    private RadioButton rdSensorTraficoCruzadoSedan;

    @FXML
    private TextField txtCapacidadCargaCamion;

    @FXML
    private TextField txtNumeroSaliodasEmergenciaBus;

    @FXML
    private TextField txtNumeroEjesCamion;

    @FXML
    private ChoiceBox<TipoCamion> choiceTipoCamion;

    @FXML
    private RadioButton rdCuatroPorCuatroCamioneta;

    @FXML
    private Button btnEliminarVehiculo;

    @FXML
    private TableColumn<Vehiculo, String> tbPrecio;

    @FXML
    private RadioButton rdFrenosAireCamion;

    @FXML
    private ChoiceBox<TipoRegistro> choiceTipoRegistroVehiculo;

    @FXML
    private TableColumn<Vehiculo, Estado> tbcEstado;

    private Vehiculo vehiculoSeleccionado;

    GestionarVehiculosController gestionarVehiculosController;

    @FXML
    void handleBtnRegresar(ActionEvent event) {
        System.out.println();
    }

    @FXML
    void handleBtnActualizarAdmin(ActionEvent event) {
        System.out.println();
    }

    @FXML
    void handleBtnLimpiarCampos(ActionEvent event) {
        System.out.println();
    }

    @FXML
    void handleBtnRegistrarEmpleado(ActionEvent event) {
        System.out.println();
    }

    @FXML
    void handleBtnActualizarVehiculo(ActionEvent event) {
        System.out.println();
    }

    @FXML
    void handleBtnEliminarVehiculo(ActionEvent event) {
        System.out.println();
    }

    @FXML
    public void initialize() {
        gestionarVehiculosController = new GestionarVehiculosController(App.getConcesionario());
        ocultarCamposIrrelevantes();
        mostrarCamposGenerales();

        inicializarData();

        agregarListener();

        setVehiculos();

        choiceVehiculo.setItems(FXCollections.observableArrayList(TipoVehiculo.values()));
        choiceTransmisionVehiculo.setItems(FXCollections.observableArrayList(Transmision.values()));
        choiceEstadoVehiculo.setItems(FXCollections.observableArrayList(Estado.values()));
        choiceCombustibleVehiculo.setItems(FXCollections.observableArrayList(Combustible.values()));
        choiceTipoCamion.setItems(FXCollections.observableArrayList(TipoCamion.values()));
        choiceTipoRegistroVehiculo.setItems(FXCollections.observableArrayList(TipoRegistro.values()));

    }

    private void inicializarData() {
        tbcEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));
        tbcMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));
        tbcTipoCombustible.setCellValueFactory(new PropertyValueFactory<>("combustible"));
        tbPrecio.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().obtenerPrecioCadena()));
        tbcModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        tbcTipoVehiculo.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getClass().getSimpleName()));
    }

    public void agregarListener() {
        tblListVehiculos.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            vehiculoSeleccionado = newValue;
            mostrarInformacionVehiculo(newValue);
            mostrarCamposVehiculo(newValue);
        });

        choiceVehiculo.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                // Based on selected vehicle type, show or hide fields
                mostrarCamposSegunTipoVehiculo(newValue);
                limpiarCamposEspecificos();

            }
        });

        // Add listener to the choiceCombustibleVehiculo
        choiceCombustibleVehiculo.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    if (newValue != null) {
                        // Based on selected fuel type, show or hide fields
                        mostrarCamposSegunCombustible(newValue);
                    }
                });
    }

    // Método para establecer la lista de camionetas
    public void setVehiculos() {
        tblListVehiculos.setItems(gestionarVehiculosController.obtenerVehiculos());
    }

    // Método para cargar los datos del vehiculoseleccionada en los campos de texto
    private void mostrarCamposVehiculo(Vehiculo vehiculo) {
        if (vehiculo instanceof Bus) {
            mostrarCamposBus();
        } else if (vehiculo instanceof Camion) {
            mostrarCamposCamion();
        } else if (vehiculo instanceof Camioneta) {
            mostrarCamposCamioneta();
        } else if (vehiculo instanceof Deportivo) {
            mostrarCamposDeportivo();
        } else if (vehiculo instanceof Moto) {
            mostrarCamposMoto();
        } else if (vehiculo instanceof PickUp) {
            mostrarCamposPickUp();
        } else if (vehiculo instanceof Sedan) {
            mostrarCamposSedan();
        } else if (vehiculo instanceof Van) {
            mostrarCamposVan();
        }
    }

    private void mostrarCamposSegunTipoVehiculo(TipoVehiculo tipoVehiculo) {
        switch (tipoVehiculo) {
            case BUS:
                mostrarCamposBus();
                break;
            case CAMION:
                mostrarCamposCamion();
                break;
            case CAMIONETA:
                mostrarCamposCamioneta();
                break;
            case DEPORTIVO:
                mostrarCamposDeportivo();
                break;
            case MOTO:
                mostrarCamposMoto();
                break;
            case PICK_UP:
                mostrarCamposPickUp();
                break;
            case SEDAN:
                mostrarCamposSedan();
                break;
            case VAN:
                mostrarCamposSedan();
                break;
            default:
                ocultarCamposIrrelevantes();
                break;
        }
    }

    private void mostrarCamposSegunCombustible(Combustible combustible) {
        switch (combustible) {
            case ELECTRICO:
                mostrarCamposElectrico(); // Show fields specific to electric vehicles
                break;
            case HIBRIDO:
                mostrarCamposHibrido(); // Show fields specific to hybrid vehicles
                break;
            default:
                ocultarCamposCombustibleEspecificos(); // Hide fields for other fuel types
                break;
        }
    }

    private void mostrarCamposElectrico() {
        txtAutonomiaElectrico.setVisible(true);
        txtTiempoCargaElectrico.setVisible(true);
        rdEnchufable.setVisible(false);
        rdHibridoLigero.setVisible(false);
    }

    private void mostrarCamposHibrido() {
        txtAutonomiaElectrico.setVisible(false);
        txtTiempoCargaElectrico.setVisible(false);
        rdEnchufable.setVisible(true);
        rdHibridoLigero.setVisible(true);
    }

    private void ocultarCamposCombustibleEspecificos() {
        txtAutonomiaElectrico.setVisible(false);
        txtTiempoCargaElectrico.setVisible(false);
        rdEnchufable.setVisible(false);
        rdHibridoLigero.setVisible(false);
    }

    public void mostrarInformacionVehiculo(Vehiculo vehiculo) {
        if (vehiculo != null) {
            // Set common vehiculo fields
            txtMarcaVehiculo.setText(vehiculo.getMarca());
            txtPlacaVehiculo.setText(vehiculo.getPlaca());
            txtModeloVehiculo.setText(String.valueOf(vehiculo.getModelo()));
            txtCambiosVehiculo.setText(String.valueOf(vehiculo.getCambios()));
            txtVelocidadMaximaVehiculo.setText(String.valueOf(vehiculo.getVelocidadMaxima()));
            txtCilindrajeVehiculo.setText(String.valueOf(vehiculo.getCilindraje()));
            choiceTipoRegistroVehiculo.setValue(vehiculo.getTipoRegistro());
            choiceTransmisionVehiculo.setValue(vehiculo.getTransmision());
            choiceEstadoVehiculo.setValue(vehiculo.getEstado());
            choiceCombustibleVehiculo.setValue(vehiculo.getCombustible());
            txtPrecio.setText(String.valueOf(vehiculo.getPrecio()));
            txtAutonomiaElectrico.setText(String.valueOf(vehiculo.getAutonomia()));
            txtTiempoCargaElectrico.setText(String.valueOf(vehiculo.getTiempoCarga()));
            rdEnchufable.setSelected(vehiculo.isEnchufable());
            rdHibridoLigero.setSelected(vehiculo.isHibridoLigero());

            // Additional specific fields depending on the vehiculo type
            if (vehiculo instanceof Bus) {
                Bus bus = (Bus) vehiculo;
                txtCapacidadMaleteroBus.setText(String.valueOf(bus.getCapacidadMaletero()));
                txtNumeroBolsasAireBus.setText(String.valueOf(bus.getNumeroBolsasAire()));
                txtNumeroEjesBus.setText(String.valueOf(bus.getNumeroEjes()));
                txtNumeroSaliodasEmergenciaBus.setText(String.valueOf(bus.getNumeroSalidasEmergencia()));
            } else if (vehiculo instanceof Camion) {
                Camion camion = (Camion) vehiculo;
                txtCapacidadCargaCamion.setText(String.valueOf(camion.getCapacidadCarga()));
                txtNumeroEjesCamion.setText(String.valueOf(camion.getNumeroEjes()));
                choiceTipoCamion.setValue(camion.getTipoCamion());
                rdFrenosAireCamion.setSelected(camion.isFrenosAire());
            } else if (vehiculo instanceof Camioneta) {
                Camioneta camioneta = (Camioneta) vehiculo;
                txtCapacidadMaleteroCamioneta.setText(String.valueOf(camioneta.getCapacidadMaletero()));
                rdVelocidadCruceroCamioneta.setSelected(camioneta.getVelocidadCrucero());
                txtNumeroBolsasAireCamioneta.setText(String.valueOf(camioneta.getNumeroBolsasAire()));
                rdSensoresColisionCamioneta.setSelected(camioneta.isSensoresColision());
                rdSensorTraficoCruzadoCamioneta.setSelected(camioneta.isSensorTraficoCruzado());
                rdAsistentePermanenciaCarrilCamioneta.setSelected(camioneta.isAsistentepermanenciaCarril());
                rdCuatroPorCuatroCamioneta.setSelected(camioneta.isCuatroPorCuatro());
            } else if (vehiculo instanceof Deportivo) {
                Deportivo deportivo = (Deportivo) vehiculo;
                txtNumeroCaballosFuerzaDeportivo.setText(String.valueOf(deportivo.getNumeroCaballosFuerza()));
                txtNumeroBolsasAireDeportivo.setText(String.valueOf(deportivo.getNumeroBolsasAire()));
                txtTiempoAlcanzar100kmhDeportivo.setText(String.valueOf(deportivo.getTiempoAlcanzar100kmh()));
            } else if (vehiculo instanceof Moto) {

            } else if (vehiculo instanceof PickUp) {
                PickUp pickUp = (PickUp) vehiculo;
                txtNumeroBolsasAirePickUp.setText(String.valueOf(pickUp.getNumeroBolsasAire()));
                rdCuatroPorCuatroPickupa.setSelected(pickUp.isCuatroPorCuatro());
                txtCapacidadCajaCargaPickUp.setText(String.valueOf(pickUp.getCapacidadCajaCarga()));
            } else if (vehiculo instanceof Sedan) {
                Sedan sedan = (Sedan) vehiculo;
                txtCapacidadMaleteroSedan.setText(String.valueOf(sedan.getCapacidadMaletero()));
                rdVelocidadCruceroSedan.setSelected(sedan.getVelocidadCrucero());
                txtNumeroBolsasAireSedan.setText(String.valueOf(sedan.getNumeroBolsasAire()));
                rdSensoresColisionSedan.setSelected(sedan.isSensoresColision());
                rdSensorTraficoCruzadoSedan.setSelected(sedan.isSensorTraficoCruzado());
                rdAsistentePermanenteSedan.setSelected(sedan.isAsistentePermanenciaCarril());
            } else if (vehiculo instanceof Van) {
                Van van = (Van) vehiculo;
                txtCapacidadMaleteroVan.setText(String.valueOf(van.getCapacidadMaletero()));
                txtNumeroBolsasAireVan.setText(String.valueOf(van.getBolsasAire()));
            }
        } else {
            limpiarCampos(); // Llamar a la función limpiarCampos si el vehículo es null
        }
    }

    private void ocultarCamposIrrelevantes() {
        txtTiempoCargaElectrico.setVisible(false);
        txtAutonomiaElectrico.setVisible(false);
        txtNumeroBolsasAirePickUp.setVisible(false);
        txtNumeroBolsasAireSedan.setVisible(false);
        txtNumeroBolsasAireVan.setVisible(false);
        txtCapacidadMaleteroVan.setVisible(false);
        txtCapacidadMaleteroSedan.setVisible(false);
        txtCapacidadCajaCargaPickUp.setVisible(false);
        txtCapacidadMaleteroBus.setVisible(false);
        txtNumeroBolsasAireBus.setVisible(false);
        txtNumeroEjesBus.setVisible(false);
        txtNumeroSaliodasEmergenciaBus.setVisible(false);
        txtCapacidadCargaCamion.setVisible(false);
        txtNumeroEjesCamion.setVisible(false);
        rdFrenosAireCamion.setVisible(false);
        choiceTipoCamion.setVisible(false);
        rdVelocidadCruceroCamioneta.setVisible(false);
        rdSensoresColisionCamioneta.setVisible(false);
        rdSensorTraficoCruzadoCamioneta.setVisible(false);
        rdAsistentePermanenciaCarrilCamioneta.setVisible(false);
        rdCuatroPorCuatroCamioneta.setVisible(false);
        rdHibridoLigero.setVisible(false);
        rdEnchufable.setVisible(false);
        rdVelocidadCruceroSedan.setVisible(false);
        rdSensoresColisionSedan.setVisible(false);
        rdAsistentePermanenteSedan.setVisible(false);
        rdSensorTraficoCruzadoSedan.setVisible(false);
        txtNumeroCaballosFuerzaDeportivo.setVisible(false);
        txtTiempoAlcanzar100kmhDeportivo.setVisible(false);
        txtNumeroBolsasAireDeportivo.setVisible(false);
    }

    private void mostrarCamposGenerales() {
        txtMarcaVehiculo.setVisible(true);
        txtPlacaVehiculo.setVisible(true);
        txtModeloVehiculo.setVisible(true);
        txtCambiosVehiculo.setVisible(true);
        txtVelocidadMaximaVehiculo.setVisible(true);
        txtCilindrajeVehiculo.setVisible(true);
        choiceTipoRegistroVehiculo.setVisible(true);
        choiceTransmisionVehiculo.setVisible(true);
        choiceEstadoVehiculo.setVisible(true);
        txtPrecio.setVisible(true);
        choiceCombustibleVehiculo.setVisible(true);
        txtNumeroPasajerosCarro.setVisible(true);
        txtNumeroPuertasCarro.setVisible(true);
        rdAbsCarro.setVisible(true);
        rdAireAcondicionadoCarro.setVisible(true);
        rdCamaraReversaCarro.setVisible(true);
    }

    private void mostrarCamposBus() {
        ocultarCamposIrrelevantes();
        mostrarCamposGenerales();

        // Campos específicos de Bus
        txtCapacidadMaleteroBus.setVisible(true);
        txtNumeroBolsasAireBus.setVisible(true);
        txtNumeroEjesBus.setVisible(true);
        txtNumeroSaliodasEmergenciaBus.setVisible(true);

    }

    private void mostrarCamposCamion() {
        ocultarCamposIrrelevantes();
        mostrarCamposGenerales();

        // Campos específicos de Camión
        txtCapacidadCargaCamion.setVisible(true);
        rdFrenosAireCamion.setVisible(true);
        txtNumeroEjesCamion.setVisible(true);
        choiceTipoCamion.setVisible(true);

    }

    private void mostrarCamposCamioneta() {
        ocultarCamposIrrelevantes();
        mostrarCamposGenerales();

        // Campos específicos de Camioneta
        txtCapacidadMaleteroCamioneta.setVisible(true);
        rdVelocidadCruceroCamioneta.setVisible(true);
        txtNumeroBolsasAireCamioneta.setVisible(true);
        rdSensoresColisionCamioneta.setVisible(true);
        rdSensorTraficoCruzadoCamioneta.setVisible(true);
        rdAsistentePermanenciaCarrilCamioneta.setVisible(true);
        rdCuatroPorCuatroCamioneta.setVisible(true);

    }

    private void mostrarCamposDeportivo() {
        ocultarCamposIrrelevantes();
        mostrarCamposGenerales();

        // Campos específicos de Deportivo
        txtNumeroCaballosFuerzaDeportivo.setVisible(true);
        txtTiempoAlcanzar100kmhDeportivo.setVisible(true);
        txtNumeroBolsasAireDeportivo.setVisible(true);

    }

    private void mostrarCamposMoto() {
        ocultarCamposIrrelevantes();
        mostrarCamposGenerales();

        // Ocultar campos de carro
        txtNumeroPasajerosCarro.setVisible(false);
        txtNumeroPuertasCarro.setVisible(false);
        rdAbsCarro.setVisible(false);
        rdAireAcondicionadoCarro.setVisible(false);
        rdCamaraReversaCarro.setVisible(false);
    }

    private void mostrarCamposPickUp() {
        ocultarCamposIrrelevantes();
        mostrarCamposGenerales();

        // Mostrar campos específicos de PickUp
        txtNumeroBolsasAirePickUp.setVisible(true);
        txtCapacidadCajaCargaPickUp.setVisible(true);
        rdCuatroPorCuatroPickupa.setVisible(true);
    }

    private void mostrarCamposSedan() {
        ocultarCamposIrrelevantes();
        mostrarCamposGenerales();

        // Mostrar campos específicos de Sedan
        txtCapacidadMaleteroSedan.setVisible(true);
        rdVelocidadCruceroSedan.setVisible(true);
        txtNumeroBolsasAireSedan.setVisible(true);
        rdSensoresColisionSedan.setVisible(true);
        rdSensorTraficoCruzadoSedan.setVisible(true);
        rdAsistentePermanenteSedan.setVisible(true);

    }

    private void mostrarCamposVan() {
        ocultarCamposIrrelevantes();
        mostrarCamposGenerales();

        // Mostrar campos específicos de Van
        txtCapacidadMaleteroVan.setVisible(true);
        txtNumeroBolsasAireVan.setVisible(true);

    }

    // Método auxiliar para limpiar los campos de entrada
    private void limpiarCampos() {
        txtPlacaVehiculo.clear();
        txtMarcaVehiculo.clear();
        txtModeloVehiculo.clear();
        txtPlacaVehiculo.clear();
        txtCambiosVehiculo.clear();
        txtVelocidadMaximaVehiculo.clear();
        txtCilindrajeVehiculo.clear();
        txtNumeroPasajerosCarro.clear();
        txtNumeroPuertasCarro.clear();
        txtCapacidadMaleteroCamioneta.clear();
        txtNumeroBolsasAirePickUp.clear();
        txtCapacidadCajaCargaPickUp.clear();
        txtNumeroBolsasAireDeportivo.clear();
        txtNumeroBolsasAireCamioneta.clear();
        txtCapacidadCargaCamion.clear();
        txtNumeroEjesCamion.clear();
        txtNumeroCaballosFuerzaDeportivo.clear();
        txtTiempoAlcanzar100kmhDeportivo.clear();
        txtNumeroBolsasAireVan.clear();
        txtCapacidadMaleteroVan.clear();
        txtNumeroBolsasAireSedan.clear();
        txtCapacidadMaleteroSedan.clear();
        txtNumeroEjesBus.clear();
        txtCapacidadMaleteroBus.clear();
        txtNumeroSaliodasEmergenciaBus.clear();
        txtAutonomiaElectrico.clear();
        txtTiempoCargaElectrico.clear();
        txtPrecio.clear();

        // Limpiar las selecciones en ChoiceBox
        choiceVehiculo.getSelectionModel().clearSelection();
        choiceTransmisionVehiculo.getSelectionModel().clearSelection();
        choiceEstadoVehiculo.getSelectionModel().clearSelection();
        choiceCombustibleVehiculo.getSelectionModel().clearSelection();
        choiceTipoCamion.getSelectionModel().clearSelection();
        choiceTipoRegistroVehiculo.getSelectionModel().clearSelection();

        // Limpiar los RadioButtons (RadioButton)
        rdCuatroPorCuatroPickupa.setSelected(false);
        rdCamaraReversaCarro.setSelected(false);
        rdHibridoLigero.setSelected(false);
        rdSensorTraficoCruzadoCamioneta.setSelected(false);
        rdAsistentePermanenciaCarrilCamioneta.setSelected(false);
        rdVelocidadCruceroCamioneta.setSelected(false);
        rdSensoresColisionCamioneta.setSelected(false);
        rdCuatroPorCuatroCamioneta.setSelected(false);
        rdFrenosAireCamion.setSelected(false);
        rdVelocidadCruceroSedan.setSelected(false);
        rdSensoresColisionSedan.setSelected(false);
        rdSensorTraficoCruzadoSedan.setSelected(false);
        rdAsistentePermanenteSedan.setSelected(false);
        rdAbsCarro.setSelected(false);
        rdAireAcondicionadoCarro.setSelected(false);
        rdEnchufable.setSelected(false);

        limpiarSeleccion();
        mostrarCamposVehiculo(vehiculoSeleccionado);
    }

    // Método auxiliar para limpiar los campos específicos de los vehículos
    private void limpiarCamposEspecificos() {
        // Limpiar los campos de texto
        txtTiempoCargaElectrico.clear();
        txtAutonomiaElectrico.clear();
        txtNumeroBolsasAirePickUp.clear();
        txtNumeroBolsasAireSedan.clear();
        txtNumeroBolsasAireVan.clear();
        txtCapacidadMaleteroVan.clear();
        txtCapacidadMaleteroSedan.clear();
        txtCapacidadCajaCargaPickUp.clear();
        txtCapacidadMaleteroBus.clear();
        txtNumeroBolsasAireBus.clear();
        txtNumeroEjesBus.clear();
        txtNumeroSaliodasEmergenciaBus.clear();
        txtCapacidadCargaCamion.clear();
        txtNumeroEjesCamion.clear();
        txtNumeroCaballosFuerzaDeportivo.clear();
        txtTiempoAlcanzar100kmhDeportivo.clear();
        txtNumeroBolsasAireDeportivo.clear();

        // Limpiar las selecciones en ChoiceBox
        choiceTipoCamion.getSelectionModel().clearSelection();
        choiceCombustibleVehiculo.getSelectionModel().clearSelection();
        choiceEstadoVehiculo.getSelectionModel().clearSelection();
        choiceTipoRegistroVehiculo.getSelectionModel().clearSelection();
        

        // Limpiar los RadioButtons
        rdFrenosAireCamion.setSelected(false);
        rdVelocidadCruceroCamioneta.setSelected(false);
        rdSensoresColisionCamioneta.setSelected(false);
        rdSensorTraficoCruzadoCamioneta.setSelected(false);
        rdAsistentePermanenciaCarrilCamioneta.setSelected(false);
        rdCuatroPorCuatroCamioneta.setSelected(false);
        rdHibridoLigero.setSelected(false);
        rdVelocidadCruceroSedan.setSelected(false);
        rdSensoresColisionSedan.setSelected(false);
        rdSensorTraficoCruzadoSedan.setSelected(false);
        rdAsistentePermanenteSedan.setSelected(false);
        rdAbsCarro.setSelected(false);
        rdAireAcondicionadoCarro.setSelected(false);
        rdEnchufable.setSelected(false);

        limpiarSeleccion();
    }

    private void limpiarSeleccion() {
        tblListVehiculos.getSelectionModel().clearSelection(); // Deseleccionar el cliente en la tabla
        vehiculoSeleccionado = null; // Reiniciar la referencia al cliente seleccionado
    }
}
