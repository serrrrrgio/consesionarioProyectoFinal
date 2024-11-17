package co.edu.uniquindio.poo.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;

public class GestionarVehiculosViewController {

    @FXML
    private TextField txtModeloVehiculo;

    @FXML
    private RadioButton rdCuatroPorCuatroPickupa;

    @FXML
    private TableColumn<?, ?> tbcMarca;

    @FXML
    private Button btnRegistrarVehiculo;

    @FXML
    private RadioButton rdCamaraReversaCarro;

    @FXML
    private ChoiceBox<?> choiceVehiculo;

    @FXML
    private TextField txtCapacidadMaleteroCamioneta;

    @FXML
    private RadioButton rdHibrido;

    @FXML
    private ChoiceBox<?> choiceTransmisionVehiculo;

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
    private TableColumn<?, ?> tbcTipoCombustible;

    @FXML
    private TableColumn<?, ?> tbcModelo;

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
    private TextField txtCorreo11311;

    @FXML
    private ChoiceBox<?> choiceEstadoVehiculo;

    @FXML
    private ChoiceBox<?> choiceCombustibleVehiculo;

    @FXML
    private RadioButton rdAsistentePermanenciaCarrilCamioneta;

    @FXML
    private TableView<?> tblListVehiculos;

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
    private TableColumn<?, ?> tbcTipoVehiculo;

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
    private RadioButton rdSensorTraficoCruzadoSedan;

    @FXML
    private TextField txtCapacidadCargaCamion;

    @FXML
    private TextField txtNumeroSaliodasEmergenciaBus;

    @FXML
    private TextField txtNumeroEjesCamion;

    @FXML
    private ChoiceBox<?> choiceTipoCamion;

    @FXML
    private RadioButton rdCuatroPorCuatroCamioneta;

    @FXML
    private Button btnEliminarVehiculo;

    @FXML
    private TableColumn<?, ?> tbPrecio;

    @FXML
    private RadioButton rdFrenosAireCamion;

    @FXML
    private ChoiceBox<?> choiceTipoRegistroVehiculo;

    @FXML
    private TableColumn<?, ?> tbcEstado;

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

}
