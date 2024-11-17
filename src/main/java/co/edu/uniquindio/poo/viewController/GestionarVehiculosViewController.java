package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.model.Combustible;
import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.TipoCamion;
import co.edu.uniquindio.poo.model.TipoRegistro;
import co.edu.uniquindio.poo.model.TipoVehiculo;
import co.edu.uniquindio.poo.model.Transmision;
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
    private RadioButton rdHibrido;

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

    @FXML
    void handleBtnRegresar(ActionEvent event) {

    }

    @FXML
    void handleBtnActualizarAdmin(ActionEvent event) {

    }

    @FXML
    void handleBtnLimpiarCampos(ActionEvent event) {

    }

    @FXML
    void handleBtnRegistrarEmpleado(ActionEvent event) {

    }

    @FXML
    void handleBtnActualizarVehiculo(ActionEvent event) {

    }

    @FXML
    void handleBtnEliminarVehiculo(ActionEvent event) {

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
        });

    }

    // Método para cargar los datos del vehiculoseleccionada en los campos de texto
    private void mostrarInformacionVehiculo(Vehiculo vehiculo) {

    }

    @FXML
    private void ocultarElementosNoGenerales() {
        // Ocultar todos los TextFields irrelevantes
        txtTiempoCargaElectrico.setVisible(false);
        txtNumeroBolsasAirePickUp.setVisible(false);
        txtNumeroBolsasAireDeportivo.setVisible(false);
        txtNumeroBolsasAireCamioneta.setVisible(false);
        txtNumeroBolsasAireSedan.setVisible(false);
        txtNumeroBolsasAireVan.setVisible(false);
        txtCapacidadMaleteroCamioneta.setVisible(false);
        txtCapacidadMaleteroVan.setVisible(false);
        txtCapacidadMaleteroSedan.setVisible(false);
        txtNumeroCaballosFuerzaDeportivo.setVisible(false);
        txtNumeroEjesBus.setVisible(false);
        txtAutonomiaElectrico.setVisible(false);
        txtTiempoAlcanzar100kmhDeportivo.setVisible(false);
        txtNumeroBolsasAireBus.setVisible(false);
        txtCapacidadMaleteroBus.setVisible(false);
        txtCapacidadCajaCargaPickUp.setVisible(false);
        txtCapacidadCargaCamion.setVisible(false);
        txtNumeroSaliodasEmergenciaBus.setVisible(false);
        txtNumeroEjesCamion.setVisible(false);

        // Ocultar todos los RadioButtons irrelevantes
        rdCuatroPorCuatroPickupa.setVisible(false);
        rdCamaraReversaCarro.setVisible(false);
        rdSensorTraficoCruzadoCamioneta.setVisible(false);
        rdAsistentePermanenciaCarrilCamioneta.setVisible(false);
        rdVelocidadCruceroCamioneta.setVisible(false);
        rdSensoresColisionCamioneta.setVisible(false);
        rdAireAcondicionadoCarro.setVisible(false);
        rdAbsCarro.setVisible(false);
        rdHibrido.setVisible(false);
        rdEnchufable.setVisible(false);
        rdVelocidadCruceroSedan.setVisible(false);
        rdSensoresColisionSedan.setVisible(false);
        rdAsistentePermanenteSedan.setVisible(false);
        rdSensorTraficoCruzadoSedan.setVisible(false);
        rdFrenosAireCamion.setVisible(false);

        // Ocultar ChoiceBoxes irrelevantes
        choiceTipoCamion.setVisible(false);
        choiceTipoRegistroVehiculo.setVisible(false);

        // Los elementos que deben permanecer visibles no necesitan ajustes
    }

    private void mostrarElementosBus() {
        // Mostrar solo los campos relacionados con Bus y Carro
        txtMarcaVehiculo.setVisible(true);
        txtPlacaVehiculo.setVisible(true);
        txtModeloVehiculo.setVisible(true);
        txtCambiosVehiculo.setVisible(true);
        txtVelocidadMaximaVehiculo.setVisible(true);
        txtCilindrajeVehiculo.setVisible(true);
        choiceTipoRegistroVehiculo.setVisible(true);
        choiceTransmisionVehiculo.setVisible(true);
        choiceEstadoVehiculo.setVisible(true);
        txtNumeroPasajerosCarro.setVisible(true);
        txtNumeroPuertasCarro.setVisible(true);
        rdAbsCarro.setVisible(true);
        rdAireAcondicionadoCarro.setVisible(true);
        rdCamaraReversaCarro.setVisible(true);
        txtPrecio.setVisible(true);
        choiceCombustibleVehiculo.setVisible(true);

        // Campos específicos de Bus
        txtCapacidadMaleteroBus.setVisible(true);
        txtNumeroBolsasAireBus.setVisible(true);
        txtNumeroEjesBus.setVisible(true);
        txtNumeroSaliodasEmergenciaBus.setVisible(true);

        // Ocultar los demás campos
        txtTiempoCargaElectrico.setVisible(false);
        txtAutonomiaElectrico.setVisible(false);
        txtNumeroBolsasAirePickUp.setVisible(false);
        txtNumeroBolsasAireDeportivo.setVisible(false);
        txtNumeroBolsasAireCamioneta.setVisible(false);
        txtNumeroBolsasAireSedan.setVisible(false);
        txtNumeroBolsasAireVan.setVisible(false);
        txtCapacidadMaleteroCamioneta.setVisible(false);
        txtCapacidadMaleteroVan.setVisible(false);
        txtCapacidadMaleteroSedan.setVisible(false);
        txtCapacidadCajaCargaPickUp.setVisible(false);
        txtCapacidadCargaCamion.setVisible(false);
        txtNumeroCaballosFuerzaDeportivo.setVisible(false);
        txtTiempoAlcanzar100kmhDeportivo.setVisible(false);
        txtNumeroEjesCamion.setVisible(false);
        rdCuatroPorCuatroPickupa.setVisible(false);
        rdCuatroPorCuatroCamioneta.setVisible(false);
        rdSensorTraficoCruzadoCamioneta.setVisible(false);
        rdAsistentePermanenciaCarrilCamioneta.setVisible(false);
        rdVelocidadCruceroCamioneta.setVisible(false);
        rdSensoresColisionCamioneta.setVisible(false);
        rdHibrido.setVisible(false);
        rdEnchufable.setVisible(false);
        rdVelocidadCruceroSedan.setVisible(false);
        rdSensoresColisionSedan.setVisible(false);
        rdAsistentePermanenteSedan.setVisible(false);
        rdSensorTraficoCruzadoSedan.setVisible(false);
        rdFrenosAireCamion.setVisible(false);
        choiceTipoCamion.setVisible(false);
    }

    private void mostrarElementosCamion() {
        // Mostrar solo los campos relacionados con Camión y Carro
        txtMarcaVehiculo.setVisible(true);
        txtPlacaVehiculo.setVisible(true);
        txtModeloVehiculo.setVisible(true);
        txtCambiosVehiculo.setVisible(true);
        txtVelocidadMaximaVehiculo.setVisible(true);
        txtCilindrajeVehiculo.setVisible(true);
        choiceTipoRegistroVehiculo.setVisible(true);
        choiceTransmisionVehiculo.setVisible(true);
        choiceEstadoVehiculo.setVisible(true);
        txtNumeroPasajerosCarro.setVisible(true);
        txtNumeroPuertasCarro.setVisible(true);
        rdAbsCarro.setVisible(true);
        rdAireAcondicionadoCarro.setVisible(true);
        txtPrecio.setVisible(true);
        choiceCombustibleVehiculo.setVisible(true);

        // Campos específicos de Camión
        txtCapacidadCargaCamion.setVisible(true);
        rdFrenosAireCamion.setVisible(true);
        txtNumeroEjesCamion.setVisible(true);
        choiceTipoCamion.setVisible(true);

        // Ocultar los demás campos
        txtTiempoCargaElectrico.setVisible(false);
        txtAutonomiaElectrico.setVisible(false);
        txtNumeroBolsasAirePickUp.setVisible(false);
        txtNumeroBolsasAireDeportivo.setVisible(false);
        txtNumeroBolsasAireCamioneta.setVisible(false);
        txtNumeroBolsasAireSedan.setVisible(false);
        txtNumeroBolsasAireVan.setVisible(false);
        txtCapacidadMaleteroCamioneta.setVisible(false);
        txtCapacidadMaleteroVan.setVisible(false);
        txtCapacidadMaleteroSedan.setVisible(false);
        txtCapacidadCajaCargaPickUp.setVisible(false);
        txtCapacidadMaleteroBus.setVisible(false);
        txtNumeroBolsasAireBus.setVisible(false);
        txtNumeroEjesBus.setVisible(false);
        txtNumeroSaliodasEmergenciaBus.setVisible(false);
        txtNumeroCaballosFuerzaDeportivo.setVisible(false);
        txtTiempoAlcanzar100kmhDeportivo.setVisible(false);
        rdCuatroPorCuatroPickupa.setVisible(false);
        rdCuatroPorCuatroCamioneta.setVisible(false);
        rdSensorTraficoCruzadoCamioneta.setVisible(false);
        rdAsistentePermanenciaCarrilCamioneta.setVisible(false);
        rdVelocidadCruceroCamioneta.setVisible(false);
        rdSensoresColisionCamioneta.setVisible(false);
        rdHibrido.setVisible(false);
        rdEnchufable.setVisible(false);
        rdVelocidadCruceroSedan.setVisible(false);
        rdSensoresColisionSedan.setVisible(false);
        rdAsistentePermanenteSedan.setVisible(false);
        rdSensorTraficoCruzadoSedan.setVisible(false);
    }

    private void mostrarElementosCamioneta() {
        // Mostrar solo los campos relacionados con Camioneta y Carro
        txtMarcaVehiculo.setVisible(true);
        txtPlacaVehiculo.setVisible(true);
        txtModeloVehiculo.setVisible(true);
        txtCambiosVehiculo.setVisible(true);
        txtVelocidadMaximaVehiculo.setVisible(true);
        txtCilindrajeVehiculo.setVisible(true);
        choiceTipoRegistroVehiculo.setVisible(true);
        choiceTransmisionVehiculo.setVisible(true);
        choiceEstadoVehiculo.setVisible(true);
        txtNumeroPasajerosCarro.setVisible(true);
        txtNumeroPuertasCarro.setVisible(true);
        rdAbsCarro.setVisible(true);
        rdAireAcondicionadoCarro.setVisible(true);
        rdCamaraReversaCarro.setVisible(true);
        txtPrecio.setVisible(true);
        choiceCombustibleVehiculo.setVisible(true);

        // Campos específicos de Camioneta
        txtCapacidadMaleteroCamioneta.setVisible(true);
        rdVelocidadCruceroCamioneta.setVisible(true);
        txtNumeroBolsasAireCamioneta.setVisible(true);
        rdSensoresColisionCamioneta.setVisible(true);
        rdSensorTraficoCruzadoCamioneta.setVisible(true);
        rdAsistentePermanenciaCarrilCamioneta.setVisible(true);
        rdCuatroPorCuatroCamioneta.setVisible(true);

        // Ocultar los demás campos
        txtTiempoCargaElectrico.setVisible(false);
        txtAutonomiaElectrico.setVisible(false);
        txtNumeroBolsasAirePickUp.setVisible(false);
        txtNumeroBolsasAireDeportivo.setVisible(false);
        txtNumeroBolsasAireSedan.setVisible(false);
        txtNumeroBolsasAireVan.setVisible(false);
        txtCapacidadMaleteroVan.setVisible(false);
        txtCapacidadMaleteroSedan.setVisible(false);
        txtCapacidadCajaCargaPickUp.setVisible(false);
        txtCapacidadMaleteroBus.setVisible(false);
        txtNumeroBolsasAireBus.setVisible(false);
        txtNumeroEjesBus.setVisible(false);
        txtNumeroSaliodasEmergenciaBus.setVisible(false);
        txtNumeroCaballosFuerzaDeportivo.setVisible(false);
        txtTiempoAlcanzar100kmhDeportivo.setVisible(false);
        rdCuatroPorCuatroPickupa.setVisible(false);
        txtCapacidadCargaCamion.setVisible(false);
        txtNumeroEjesCamion.setVisible(false);
        rdFrenosAireCamion.setVisible(false);
        choiceTipoCamion.setVisible(false);
        rdHibrido.setVisible(false);
        rdEnchufable.setVisible(false);
        rdVelocidadCruceroSedan.setVisible(false);
        rdSensoresColisionSedan.setVisible(false);
        rdAsistentePermanenteSedan.setVisible(false);
        rdSensorTraficoCruzadoSedan.setVisible(false);
    }

    private void mostrarElementosDeportivo() {
        // Mostrar solo los campos relacionados con Carro y Deportivo
        txtMarcaVehiculo.setVisible(true);
        txtPlacaVehiculo.setVisible(true);
        txtModeloVehiculo.setVisible(true);
        txtCambiosVehiculo.setVisible(true);
        txtVelocidadMaximaVehiculo.setVisible(true);
        txtCilindrajeVehiculo.setVisible(true);
        choiceTipoRegistroVehiculo.setVisible(true);
        choiceTransmisionVehiculo.setVisible(true);
        choiceEstadoVehiculo.setVisible(true);
        txtNumeroPasajerosCarro.setVisible(true);
        txtNumeroPuertasCarro.setVisible(true);
        rdAbsCarro.setVisible(true);
        rdAireAcondicionadoCarro.setVisible(true);
        rdCamaraReversaCarro.setVisible(true);
        txtPrecio.setVisible(true);
        choiceCombustibleVehiculo.setVisible(true);

        // Campos específicos de Deportivo
        txtNumeroCaballosFuerzaDeportivo.setVisible(true);
        txtTiempoAlcanzar100kmhDeportivo.setVisible(true);
        txtNumeroBolsasAireDeportivo.setVisible(true);

        // Ocultar los demás campos
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
        rdHibrido.setVisible(false);
        rdEnchufable.setVisible(false);
        rdVelocidadCruceroSedan.setVisible(false);
        rdSensoresColisionSedan.setVisible(false);
        rdAsistentePermanenteSedan.setVisible(false);
        rdSensorTraficoCruzadoSedan.setVisible(false);
    }

    private void mostrarElementosMoto() {
        // Mostrar solo los campos básicos de Vehiculo
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

        // Ocultar campos que no pertenecen a Moto
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
        rdHibrido.setVisible(false);
        rdEnchufable.setVisible(false);
        rdVelocidadCruceroSedan.setVisible(false);
        rdSensoresColisionSedan.setVisible(false);
        rdAsistentePermanenteSedan.setVisible(false);
        rdSensorTraficoCruzadoSedan.setVisible(false);
        txtNumeroCaballosFuerzaDeportivo.setVisible(false);
        txtTiempoAlcanzar100kmhDeportivo.setVisible(false);
        txtNumeroBolsasAireDeportivo.setVisible(false);
    }


    private void mostrarElementosPickUp() {
        // Mostrar los campos básicos de Vehiculo
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

        // Mostrar campos específicos de PickUp
        txtNumeroBolsasAirePickUp.setVisible(true);
        txtCapacidadCajaCargaPickUp.setVisible(true);
        rdCuatroPorCuatroPickupa.setVisible(true);

        // Ocultar campos que no pertenecen a PickUp
        txtTiempoCargaElectrico.setVisible(false);
        txtAutonomiaElectrico.setVisible(false);
        txtNumeroBolsasAireSedan.setVisible(false);
        txtNumeroBolsasAireVan.setVisible(false);
        txtCapacidadMaleteroVan.setVisible(false);
        txtCapacidadMaleteroSedan.setVisible(false);
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
        rdHibrido.setVisible(false);
        rdEnchufable.setVisible(false);
        rdVelocidadCruceroSedan.setVisible(false);
        rdSensoresColisionSedan.setVisible(false);
        rdAsistentePermanenteSedan.setVisible(false);
        rdSensorTraficoCruzadoSedan.setVisible(false);
        txtNumeroCaballosFuerzaDeportivo.setVisible(false);
        txtTiempoAlcanzar100kmhDeportivo.setVisible(false);
        txtNumeroBolsasAireDeportivo.setVisible(false);
    }

    private void mostrarElementosSedan() {
        // Mostrar los campos básicos de Vehiculo
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

        // Mostrar campos específicos de Sedan
        txtCapacidadMaleteroSedan.setVisible(true);
        rdVelocidadCruceroSedan.setVisible(true);
        txtNumeroBolsasAireSedan.setVisible(true);
        rdSensoresColisionSedan.setVisible(true);
        rdSensorTraficoCruzadoSedan.setVisible(true);
        rdAsistentePermanenteSedan.setVisible(true);

        // Ocultar campos que no pertenecen a Sedan
        txtTiempoCargaElectrico.setVisible(false);
        txtAutonomiaElectrico.setVisible(false);
        txtNumeroBolsasAireBus.setVisible(false);
        txtNumeroEjesBus.setVisible(false);
        txtNumeroSaliodasEmergenciaBus.setVisible(false);
        txtCapacidadCargaCamion.setVisible(false);
        txtNumeroEjesCamion.setVisible(false);
        rdFrenosAireCamion.setVisible(false);
        choiceTipoCamion.setVisible(false);
        txtCapacidadMaleteroBus.setVisible(false);
        rdVelocidadCruceroCamioneta.setVisible(false);
        rdSensoresColisionCamioneta.setVisible(false);
        rdSensorTraficoCruzadoCamioneta.setVisible(false);
        rdAsistentePermanenciaCarrilCamioneta.setVisible(false);
        rdCuatroPorCuatroCamioneta.setVisible(false);
        txtNumeroCaballosFuerzaDeportivo.setVisible(false);
        txtTiempoAlcanzar100kmhDeportivo.setVisible(false);
        txtNumeroBolsasAireDeportivo.setVisible(false);
        txtCapacidadCajaCargaPickUp.setVisible(false);
        rdCuatroPorCuatroPickupa.setVisible(false);
        txtNumeroBolsasAirePickUp.setVisible(false);
    }


    private void mostrarElementosVan() {
        // Mostrar los campos básicos de Vehiculo
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

        // Mostrar campos específicos de Van
        txtCapacidadMaleteroVan.setVisible(true);
        txtNumeroBolsasAireVan.setVisible(true);

        // Ocultar campos que no pertenecen a Van
        txtTiempoCargaElectrico.setVisible(false);
        txtAutonomiaElectrico.setVisible(false);
        txtNumeroBolsasAireBus.setVisible(false);
        txtNumeroEjesBus.setVisible(false);
        txtNumeroSaliodasEmergenciaBus.setVisible(false);
        txtCapacidadCargaCamion.setVisible(false);
        txtNumeroEjesCamion.setVisible(false);
        rdFrenosAireCamion.setVisible(false);
        choiceTipoCamion.setVisible(false);
        txtCapacidadMaleteroBus.setVisible(false);
        rdVelocidadCruceroCamioneta.setVisible(false);
        rdSensoresColisionCamioneta.setVisible(false);
        rdSensorTraficoCruzadoCamioneta.setVisible(false);
        rdAsistentePermanenciaCarrilCamioneta.setVisible(false);
        rdCuatroPorCuatroCamioneta.setVisible(false);
        txtNumeroCaballosFuerzaDeportivo.setVisible(false);
        txtTiempoAlcanzar100kmhDeportivo.setVisible(false);
        txtNumeroBolsasAireDeportivo.setVisible(false);
        txtCapacidadCajaCargaPickUp.setVisible(false);
        rdCuatroPorCuatroPickupa.setVisible(false);
        txtNumeroBolsasAirePickUp.setVisible(false);
    }

}
