package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionarVehiculosController;
import co.edu.uniquindio.poo.model.Bus;
import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Carro;
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
        App.cambiarEscena("/co/edu/uniquindio/poo/InicioEmpleado.fxml", "Inicio Empleado", event, getClass());
    }

    @FXML
    void handleBtnActualizarDatos(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/ActualizarDatos.fxml", "Actualizar Empleado", event, getClass());
    }

    @FXML
    void handleBtnLimpiarCampos(ActionEvent event) {
        limpiarCampos();
    }

    @FXML
    public void handleBtnRegistrarVehiculo(ActionEvent event) {
        // Obtener los datos generales del vehículo
        String marca = txtMarcaVehiculo.getText();
        String placa = txtPlacaVehiculo.getText();
        String modeloCadena = txtModeloVehiculo.getText();
        String cambiosCadena = txtCambiosVehiculo.getText();
        String velocidadMaximaCadena = txtVelocidadMaximaVehiculo.getText();
        String cilindrajeCadena = txtCilindrajeVehiculo.getText();
        TipoRegistro tipoRegistro = choiceTipoRegistroVehiculo.getValue();
        Transmision transmision = choiceTransmisionVehiculo.getValue();
        Estado estado = choiceEstadoVehiculo.getValue();
        String precioCadena = txtPrecio.getText();
        Combustible combustible = choiceCombustibleVehiculo.getValue();
        TipoVehiculo tipoVehiculo = choiceVehiculo.getValue();
        boolean enchufable = rdEnchufable.isSelected();
        boolean hibridoLigero = rdHibridoLigero.isSelected();
        String autonomiaCadena = txtAutonomiaElectrico.getText();
        String tiempoCargaCadena = txtTiempoCargaElectrico.getText();

        // Validar campos generales
        if (camposValidosVehiculo(marca, placa, modeloCadena, cambiosCadena, velocidadMaximaCadena, cilindrajeCadena,
                tipoRegistro, transmision, estado, precioCadena, combustible, autonomiaCadena, tiempoCargaCadena,
                enchufable, hibridoLigero)) {
            // Convertir los campos numéricos a sus respectivos tipos
            int modelo = Integer.parseInt(modeloCadena);
            int cambios = Integer.parseInt(cambiosCadena);
            double velocidadMaxima = Double.parseDouble(velocidadMaximaCadena);
            double cilindraje = Double.parseDouble(cilindrajeCadena);
            double precio = Double.parseDouble(precioCadena);
            double autonomia;
            double tiempoCarga;

            if (combustible.equals(Combustible.ELECTRICO)) {
                autonomia = Double.parseDouble(txtAutonomiaElectrico.getText());
                tiempoCarga = Double.parseDouble(txtTiempoCargaElectrico.getText());
            } else {
                autonomia = 0;
                tiempoCarga = 0;
            }

            if (tipoVehiculo != TipoVehiculo.MOTO) {
                // Obtener atributos específicos de Carro
                String capacidadPasajerosCadena = txtNumeroPasajerosCarro.getText();
                String cantidadPuertasCadena = txtNumeroPuertasCarro.getText();
                boolean abs = rdAbsCarro.isSelected();
                boolean aireAcondicionado = rdAireAcondicionadoCarro.isSelected();
                boolean camaraReversa = rdCamaraReversaCarro.isSelected();

                // Validar los campos específicos de Carro
                if (validarCamposCarro(capacidadPasajerosCadena, cantidadPuertasCadena)) {
                    int capacidadPasajeros = Integer.parseInt(txtNumeroPasajerosCarro.getText());
                    int cantidadPuertas = Integer.parseInt(txtNumeroPuertasCarro.getText());
                    if (tipoVehiculo == TipoVehiculo.BUS) {
                        String capacidadMaleteroCadena = txtCapacidadMaleteroBus.getText();
                        String numeroBolsasAireCadena = txtNumeroBolsasAireBus.getText();
                        String numeroEjesCadena = txtNumeroEjesBus.getText();
                        String numeroSalidasEmergenciaCadena = txtNumeroSaliodasEmergenciaBus.getText();

                        if (camposValidosBus(capacidadMaleteroCadena, numeroBolsasAireCadena, numeroEjesCadena,
                                numeroSalidasEmergenciaCadena)) {
                            Double capacidadMaletero = Double.parseDouble(txtCapacidadMaleteroBus.getText());
                            int numeroBolsasAire = Integer.parseInt(txtNumeroBolsasAireBus.getText());
                            int numeroEjes = Integer.parseInt(txtNumeroEjesBus.getText());
                            int numeroSalidasEmergencia = Integer.parseInt(txtNumeroSaliodasEmergenciaBus.getText());
                            Bus bus = gestionarVehiculosController.crearBus(marca, placa, modelo, cambios,
                                    velocidadMaxima, cilindraje, tipoRegistro, transmision, estado,
                                    capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, camaraReversa,
                                    capacidadMaletero,
                                    numeroBolsasAire, numeroEjes, numeroSalidasEmergencia, precio, combustible,
                                    autonomia, tiempoCarga,
                                    enchufable, hibridoLigero);

                            if (gestionarVehiculosController.agregarVehiculo(bus)) {
                                // Actualiza la tabla
                                setVehiculos();

                                // Limpiar campos después de agregar
                                limpiarCampos();

                                return;
                            } else {
                                App.mostrarAlerta("Error", "Ya existe una bus con el número de matrícula " + placa);
                            }
                        }
                    }

                    else if (tipoVehiculo == TipoVehiculo.CAMIONETA) {
                        boolean velocidadCrucero = rdVelocidadCruceroCamioneta.isSelected();
                        boolean sensoresColision = rdSensoresColisionCamioneta.isSelected();
                        boolean sensorTraficoCruzado = rdSensorTraficoCruzadoCamioneta.isSelected();
                        boolean asistentePermanenciaCarril = rdAsistentePermanenciaCarrilCamioneta.isSelected();
                        boolean cuatroPorCuatro = rdCuatroPorCuatroCamioneta.isSelected();
                        String numeroBolsasAireCadena = txtNumeroBolsasAireBus.getText();
                        String capacidadMaleteroCadena = txtCapacidadMaleteroCamioneta.getText();

                        if (camposValidosCamioneta(tiempoCargaCadena, numeroBolsasAireCadena)) {
                            int numeroBolsasAire = Integer.parseInt(numeroBolsasAireCadena);
                            Double capacidadMaletero = Double.parseDouble(capacidadMaleteroCadena);
                            Camioneta camioneta = gestionarVehiculosController.crearCamioneta(marca, placa, modelo,
                                    cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision,
                                    estado, capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, camaraReversa,
                                    capacidadMaletero,
                                    velocidadCrucero, numeroBolsasAire, sensoresColision, sensorTraficoCruzado,
                                    asistentePermanenciaCarril,
                                    cuatroPorCuatro, precio, combustible, autonomia, tiempoCarga, enchufable,
                                    hibridoLigero);

                            if (gestionarVehiculosController.agregarVehiculo(camioneta)) {
                                // Actualiza la tabla
                                setVehiculos();

                                // Limpiar campos después de agregar
                                limpiarCampos();

                                return;
                            } else {
                                App.mostrarAlerta("Error",
                                        "Ya existe una camioneta con el número de matrícula " + placa);
                            }
                        }
                    }

                    else if (tipoVehiculo == TipoVehiculo.CAMION) {
                        String capacidadCargaCadena = txtCapacidadCargaCamion.getText();
                        boolean frenosAire = rdFrenosAireCamion.isSelected();
                        String numeroEjesCadena = txtNumeroEjesCamion.getText();
                        TipoCamion tipoCamion = choiceTipoCamion.getValue();

                        if (camposValidosCamion(capacidadCargaCadena, numeroEjesCadena, tipoCamion)) {
                            double capacidadCarga = Double.parseDouble(capacidadCargaCadena);
                            int numeroEjes = Integer.parseInt(numeroEjesCadena);
                            Camion camion = gestionarVehiculosController.crearCamion(marca, placa, modelo, cambios,
                                    velocidadMaxima, cilindraje, tipoRegistro, transmision, estado,
                                    capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, capacidadCarga,
                                    frenosAire, numeroEjes,
                                    tipoCamion, precio, combustible, autonomia, tiempoCarga, enchufable, hibridoLigero);

                            if (gestionarVehiculosController.agregarVehiculo(camion)) {
                                // Actualiza la tabla
                                setVehiculos();

                                // Limpiar campos después de agregar
                                limpiarCampos();

                                return;
                            } else {
                                App.mostrarAlerta("Error", "Ya existe un camión  con el número de matrícula " + placa);
                            }
                        }
                    } else if (tipoVehiculo == TipoVehiculo.DEPORTIVO) {
                        String numeroCaballosFuerzaCadena = txtNumeroCaballosFuerzaDeportivo.getText();
                        String numeroBolsasAireCadena = txtNumeroBolsasAireDeportivo.getText();
                        String tiemepoAlcanzar100kmhCadena = txtTiempoAlcanzar100kmhDeportivo.getText();

                        if (camposValidosDeportivo(numeroCaballosFuerzaCadena, numeroBolsasAireCadena,
                                tiemepoAlcanzar100kmhCadena)) {
                            int numeroCaballosFuerza = Integer.parseInt(numeroCaballosFuerzaCadena);
                            int numeroBolsasAire = Integer.parseInt(numeroBolsasAireCadena);
                            Double tiempoAlcanzar100kmh = Double.parseDouble(tiemepoAlcanzar100kmhCadena);
                            Deportivo deportivo = gestionarVehiculosController.crearDeportivo(marca, placa, modelo,
                                    cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision,
                                    estado, capacidadPasajeros, cantidadPuertas, abs, numeroCaballosFuerza,
                                    numeroBolsasAire,
                                    tiempoAlcanzar100kmh, precio, combustible, autonomia, tiempoCarga, enchufable,
                                    hibridoLigero);

                            if (gestionarVehiculosController.agregarVehiculo(deportivo)) {
                                // Actualiza la tabla
                                setVehiculos();

                                // Limpiar campos después de agregar
                                limpiarCampos();

                                return;
                            } else {
                                App.mostrarAlerta("Error",
                                        "Ya existe un auto deportivo con el número de matrícula " + placa);
                            }
                        }
                    }

                    else if (tipoVehiculo == TipoVehiculo.PICK_UP) {
                        String numeroBolsasAireCadena = txtNumeroBolsasAireDeportivo.getText();
                        String capacidadCajaCargaCadena = txtCapacidadCajaCargaPickUp.getText();
                        boolean cuatroPorCuatro = rdCuatroPorCuatroPickupa.isSelected();

                        if (camposValidosPickUp(numeroBolsasAireCadena, capacidadCajaCargaCadena)) {
                            int numeroBolsasAire = Integer.parseInt(numeroBolsasAireCadena);
                            Double capacidadCajaCarga = Double.parseDouble(capacidadCajaCargaCadena);
                            PickUp pickUp = gestionarVehiculosController.crearPickUp(marca, placa, modelo, cambios,
                                    velocidadMaxima, cilindraje, tipoRegistro, transmision, estado,
                                    capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, camaraReversa,
                                    numeroBolsasAire,
                                    cuatroPorCuatro,
                                    capacidadCajaCarga, precio, combustible, autonomia, tiempoCarga, enchufable,
                                    hibridoLigero);

                            if (gestionarVehiculosController.agregarVehiculo(pickUp)) {
                                // Actualiza la tabla
                                setVehiculos();

                                // Limpiar campos después de agregar
                                limpiarCampos();

                                return;
                            } else {
                                App.mostrarAlerta("Error",
                                        "Ya existe un pick up con el número de matrícula " + placa);
                            }
                        }

                    }

                    else if (tipoVehiculo == TipoVehiculo.SEDAN) {
                        String numeroBolsasAireCadena = txtNumeroBolsasAireDeportivo.getText();
                        String capacidadMaleteroCadena = txtCapacidadMaleteroVan.getText();
                        boolean velocidadCrucero = rdVelocidadCruceroSedan.isSelected();
                        boolean sensoresColision = rdSensoresColisionSedan.isSelected();
                        boolean sensorTraficoCruzado = rdSensorTraficoCruzadoSedan.isSelected();
                        boolean asistentePermanenciaCarril = rdAsistentePermanenteSedan.isSelected();

                        if (camposValidosSedan(capacidadMaleteroCadena, numeroBolsasAireCadena)) {
                            int numeroBolsasAire = Integer.parseInt(numeroBolsasAireCadena);
                            Double capacidadMaletero = Double.parseDouble(capacidadMaleteroCadena);
                            Sedan sedan = gestionarVehiculosController.crearSedan(marca, placa, modelo, cambios,
                                    velocidadMaxima, cilindraje, tipoRegistro, transmision, estado,
                                    capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, camaraReversa,
                                    capacidadMaletero,
                                    velocidadCrucero,
                                    numeroBolsasAire, sensoresColision, sensorTraficoCruzado,
                                    asistentePermanenciaCarril, precio,
                                    combustible,
                                    autonomia, tiempoCarga, enchufable, hibridoLigero);

                            if (gestionarVehiculosController.agregarVehiculo(sedan)) {
                                // Actualiza la tabla
                                setVehiculos();

                                // Limpiar campos después de agregar
                                limpiarCampos();

                                return;
                            } else {
                                App.mostrarAlerta("Error",
                                        "Ya existe un sedan con el número de matrícula " + placa);
                            }
                        }

                    }

                    else if (tipoVehiculo == TipoVehiculo.VAN) {
                        String capacidadMaleteroCadena = txtCapacidadMaleteroVan.getText();
                        String numeroBolsasAireCadena = txtNumeroBolsasAireVan.getText();

                        if (camposValidosVan(capacidadMaleteroCadena, numeroBolsasAireCadena)) {
                            int numeroBolsasAire = Integer.parseInt(numeroBolsasAireCadena);
                            Double capacidadMaletero = Double.parseDouble(capacidadMaleteroCadena);
                            Van van = gestionarVehiculosController.crearVan(marca, placa, modelo, cambios,
                                    velocidadMaxima, cilindraje, tipoRegistro, transmision, estado,
                                    capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, camaraReversa,
                                    capacidadMaletero,
                                    numeroBolsasAire,
                                    precio, combustible, autonomia, tiempoCarga, enchufable, hibridoLigero);

                            if (gestionarVehiculosController.agregarVehiculo(van)) {
                                // Actualiza la tabla
                                setVehiculos();

                                // Limpiar campos después de agregar
                                limpiarCampos();

                                return;
                            } else {
                                App.mostrarAlerta("Error",
                                        "Ya existe una van con el número de matrícula " + placa);
                            }
                        }

                    }

                } else if(tipoVehiculo.equals(TipoVehiculo.MOTO)){
                    Moto moto = gestionarVehiculosController.crearMoto(marca, placa, modelo, cambios, velocidadMaxima,
                            cilindraje, tipoRegistro, transmision, estado,
                            precio, combustible, autonomia, tiempoCarga, enchufable, hibridoLigero);

                    if (gestionarVehiculosController.agregarVehiculo(moto)) {
                        // Actualiza la tabla
                        setVehiculos();

                        // Limpiar campos después de agregar
                        limpiarCampos();

                        return;
                    } else {
                        App.mostrarAlerta("Error",
                                "Ya existe una moto con el número de matrícula " + placa);
                    }
                }
            }
        }
    }

    @FXML
    public void handleBtnActualizarVehiculo(ActionEvent event) {

        if (vehiculoSeleccionado == null) {
            App.mostrarAlerta("No hay vehiculo seleccionada", "Por favor, selecciona un vehiculo para actualizar.");
            return;
        }

        // Obtener los datos generales del vehículo
        String marca = txtMarcaVehiculo.getText();
        String placa = txtPlacaVehiculo.getText();
        String modeloCadena = txtModeloVehiculo.getText();
        String cambiosCadena = txtCambiosVehiculo.getText();
        String velocidadMaximaCadena = txtVelocidadMaximaVehiculo.getText();
        String cilindrajeCadena = txtCilindrajeVehiculo.getText();
        TipoRegistro tipoRegistro = choiceTipoRegistroVehiculo.getValue();
        Transmision transmision = choiceTransmisionVehiculo.getValue();
        Estado estado = choiceEstadoVehiculo.getValue();
        String precioCadena = txtPrecio.getText();
        Combustible combustible = choiceCombustibleVehiculo.getValue();
        TipoVehiculo tipoVehiculo = choiceVehiculo.getValue();
        boolean enchufable = rdEnchufable.isSelected();
        boolean hibridoLigero = rdHibridoLigero.isSelected();
        String autonomiaCadena = txtAutonomiaElectrico.getText();
        String tiempoCargaCadena = txtTiempoCargaElectrico.getText();

        // Validar campos generales
        if (camposValidosVehiculo(marca, placa, modeloCadena, cambiosCadena, velocidadMaximaCadena, cilindrajeCadena,
                tipoRegistro, transmision, estado, precioCadena, combustible, autonomiaCadena, tiempoCargaCadena,
                enchufable, hibridoLigero)) {
            // Convertir los campos numéricos a sus respectivos tipos
            int modelo = Integer.parseInt(modeloCadena);
            int cambios = Integer.parseInt(cambiosCadena);
            double velocidadMaxima = Double.parseDouble(velocidadMaximaCadena);
            double cilindraje = Double.parseDouble(cilindrajeCadena);
            double precio = Double.parseDouble(precioCadena);
            double autonomia;
            double tiempoCarga;

            if (combustible.equals(Combustible.ELECTRICO)) {
                autonomia = Double.parseDouble(txtAutonomiaElectrico.getText());
                tiempoCarga = Double.parseDouble(txtTiempoCargaElectrico.getText());
            } else {
                autonomia = 0;
                tiempoCarga = 0;
            }

            if (tipoVehiculo != TipoVehiculo.MOTO) {
                // Obtener atributos específicos de Carro
                String capacidadPasajerosCadena = txtNumeroPasajerosCarro.getText();
                String cantidadPuertasCadena = txtNumeroPuertasCarro.getText();
                boolean abs = rdAbsCarro.isSelected();
                boolean aireAcondicionado = rdAireAcondicionadoCarro.isSelected();
                boolean camaraReversa = rdCamaraReversaCarro.isSelected();

                // Validar los campos específicos de Carro
                if (validarCamposCarro(capacidadPasajerosCadena, cantidadPuertasCadena)) {
                    int capacidadPasajeros = Integer.parseInt(txtNumeroPasajerosCarro.getText());
                    int cantidadPuertas = Integer.parseInt(txtNumeroPuertasCarro.getText());
                    if (tipoVehiculo == TipoVehiculo.BUS) {
                        String capacidadMaleteroCadena = txtCapacidadMaleteroBus.getText();
                        String numeroBolsasAireCadena = txtNumeroBolsasAireBus.getText();
                        String numeroEjesCadena = txtNumeroEjesBus.getText();
                        String numeroSalidasEmergenciaCadena = txtNumeroSaliodasEmergenciaBus.getText();

                        if (camposValidosBus(capacidadMaleteroCadena, numeroBolsasAireCadena, numeroEjesCadena,
                                numeroSalidasEmergenciaCadena)) {
                            Double capacidadMaletero = Double.parseDouble(txtCapacidadMaleteroBus.getText());
                            int numeroBolsasAire = Integer.parseInt(txtNumeroBolsasAireBus.getText());
                            int numeroEjes = Integer.parseInt(txtNumeroEjesBus.getText());
                            int numeroSalidasEmergencia = Integer.parseInt(txtNumeroSaliodasEmergenciaBus.getText());
                            if (gestionarVehiculosController.actualizarBus((Bus) vehiculoSeleccionado, marca, placa,
                                    modelo, cambios, velocidadMaxima, cilindraje,
                                    tipoRegistro, transmision, estado, capacidadPasajeros, cantidadPuertas, abs,
                                    aireAcondicionado,
                                    camaraReversa, capacidadMaletero, numeroBolsasAire, numeroEjes,
                                    numeroSalidasEmergencia, precio,
                                    combustible, autonomia, tiempoCarga, enchufable, hibridoLigero)) {
                                // Actualiza la tabla
                                setVehiculos();

                                // Limpiar campos después de agregar
                                limpiarCampos();

                                tblListVehiculos.refresh();

                                return;
                            } else {
                                App.mostrarAlerta("Error", "Ya existe una bus con el número de matrícula " + placa);
                            }
                        }
                    }

                    else if (tipoVehiculo == TipoVehiculo.CAMIONETA) {
                        boolean velocidadCrucero = rdVelocidadCruceroCamioneta.isSelected();
                        boolean sensoresColision = rdSensoresColisionCamioneta.isSelected();
                        boolean sensorTraficoCruzado = rdSensorTraficoCruzadoCamioneta.isSelected();
                        boolean asistentePermanenciaCarril = rdAsistentePermanenciaCarrilCamioneta.isSelected();
                        boolean cuatroPorCuatro = rdCuatroPorCuatroCamioneta.isSelected();
                        String numeroBolsasAireCadena = txtNumeroBolsasAireBus.getText();
                        String capacidadMaleteroCadena = txtCapacidadMaleteroCamioneta.getText();

                        if (camposValidosCamioneta(tiempoCargaCadena, numeroBolsasAireCadena)) {
                            int numeroBolsasAire = Integer.parseInt(numeroBolsasAireCadena);
                            Double capacidadMaletero = Double.parseDouble(capacidadMaleteroCadena);
                            if (gestionarVehiculosController.actualizarCamioneta((Camioneta) vehiculoSeleccionado,
                                    marca, placa, modelo, cambios, velocidadMaxima,
                                    cilindraje, tipoRegistro, transmision, estado, capacidadPasajeros, cantidadPuertas,
                                    abs,
                                    aireAcondicionado, camaraReversa, capacidadMaletero, velocidadCrucero,
                                    numeroBolsasAire,
                                    sensoresColision, sensorTraficoCruzado, asistentePermanenciaCarril, cuatroPorCuatro,
                                    precio,
                                    combustible, autonomia, tiempoCarga, enchufable, hibridoLigero)) {
                                // Actualiza la tabla
                                setVehiculos();

                                // Limpiar campos después de agregar
                                limpiarCampos();

                                tblListVehiculos.refresh();

                                return;
                            } else {
                                App.mostrarAlerta("Error",
                                        "Ya existe una camioneta con el número de matrícula " + placa);
                            }
                        }
                    }

                    else if (tipoVehiculo == TipoVehiculo.CAMION) {
                        String capacidadCargaCadena = txtCapacidadCargaCamion.getText();
                        boolean frenosAire = rdFrenosAireCamion.isSelected();
                        String numeroEjesCadena = txtNumeroEjesCamion.getText();
                        TipoCamion tipoCamion = choiceTipoCamion.getValue();

                        if (camposValidosCamion(capacidadCargaCadena, numeroEjesCadena, tipoCamion)) {
                            double capacidadCarga = Double.parseDouble(capacidadCargaCadena);
                            int numeroEjes = Integer.parseInt(numeroEjesCadena);
                            if (gestionarVehiculosController.actualizarCamion((Camion) vehiculoSeleccionado, marca,
                                    placa, modelo, cambios, velocidadMaxima, cilindraje,
                                    tipoRegistro, transmision, estado, capacidadPasajeros, cantidadPuertas, abs,
                                    aireAcondicionado,
                                    capacidadCarga, frenosAire, numeroEjes, tipoCamion, precio, combustible, autonomia,
                                    tiempoCarga,
                                    enchufable, hibridoLigero)) {
                                // Actualiza la tabla
                                setVehiculos();

                                // Limpiar campos después de agregar
                                limpiarCampos();

                                tblListVehiculos.refresh();

                                return;
                            } else {
                                App.mostrarAlerta("Error", "Ya existe un camión  con el número de matrícula " + placa);
                            }
                        }
                    } else if (tipoVehiculo == TipoVehiculo.DEPORTIVO) {
                        String numeroCaballosFuerzaCadena = txtNumeroCaballosFuerzaDeportivo.getText();
                        String numeroBolsasAireCadena = txtNumeroBolsasAireDeportivo.getText();
                        String tiemepoAlcanzar100kmhCadena = txtTiempoAlcanzar100kmhDeportivo.getText();

                        if (camposValidosDeportivo(numeroCaballosFuerzaCadena, numeroBolsasAireCadena,
                                tiemepoAlcanzar100kmhCadena)) {
                            int numeroCaballosFuerza = Integer.parseInt(numeroCaballosFuerzaCadena);
                            int numeroBolsasAire = Integer.parseInt(numeroBolsasAireCadena);
                            Double tiempoAlcanzar100kmh = Double.parseDouble(tiemepoAlcanzar100kmhCadena);
                            if (gestionarVehiculosController.actualizarDeportivo((Deportivo) vehiculoSeleccionado,
                                    marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro,
                                    transmision, estado, capacidadPasajeros, cantidadPuertas, abs, numeroCaballosFuerza,
                                    numeroBolsasAire, tiempoAlcanzar100kmh, precio, combustible, autonomia, tiempoCarga,
                                    enchufable, hibridoLigero)) {
                                // Actualiza la tabla
                                setVehiculos();

                                // Limpiar campos después de agregar
                                limpiarCampos();

                                tblListVehiculos.refresh();

                                return;
                            } else {
                                App.mostrarAlerta("Error",
                                        "Ya existe un auto deportivo con el número de matrícula " + placa);
                            }
                        }
                    }

                    else if (tipoVehiculo == TipoVehiculo.PICK_UP) {
                        String numeroBolsasAireCadena = txtNumeroBolsasAireDeportivo.getText();
                        String capacidadCajaCargaCadena = txtCapacidadCajaCargaPickUp.getText();
                        boolean cuatroPorCuatro = rdCuatroPorCuatroPickupa.isSelected();

                        if (camposValidosPickUp(numeroBolsasAireCadena, capacidadCajaCargaCadena)) {
                            int numeroBolsasAire = Integer.parseInt(numeroBolsasAireCadena);
                            Double capacidadCajaCarga = Double.parseDouble(capacidadCajaCargaCadena);
                            if (gestionarVehiculosController.actualizarPickUp((PickUp) vehiculoSeleccionado, marca,
                                    placa, modelo, cambios, velocidadMaxima, cilindraje,
                                    tipoRegistro, transmision, estado, capacidadPasajeros, cantidadPuertas, abs,
                                    aireAcondicionado,
                                    camaraReversa, numeroBolsasAire, cuatroPorCuatro, capacidadCajaCarga, precio,
                                    combustible, autonomia,
                                    tiempoCarga, enchufable, hibridoLigero)) {
                                // Actualiza la tabla
                                setVehiculos();

                                // Limpiar campos después de agregar
                                limpiarCampos();

                                tblListVehiculos.refresh();

                                return;
                            } else {
                                App.mostrarAlerta("Error",
                                        "Ya existe un pick up con el número de matrícula " + placa);
                            }
                        }

                    }

                    else if (tipoVehiculo == TipoVehiculo.SEDAN) {
                        String numeroBolsasAireCadena = txtNumeroBolsasAireDeportivo.getText();
                        String capacidadMaleteroCadena = txtCapacidadMaleteroVan.getText();
                        boolean velocidadCrucero = rdVelocidadCruceroSedan.isSelected();
                        boolean sensoresColision = rdSensoresColisionSedan.isSelected();
                        boolean sensorTraficoCruzado = rdSensorTraficoCruzadoSedan.isSelected();
                        boolean asistentePermanenciaCarril = rdAsistentePermanenteSedan.isSelected();

                        if (camposValidosSedan(capacidadMaleteroCadena, numeroBolsasAireCadena)) {
                            int numeroBolsasAire = Integer.parseInt(numeroBolsasAireCadena);
                            Double capacidadMaletero = Double.parseDouble(capacidadMaleteroCadena);
                            if (gestionarVehiculosController.actualizarSedan((Sedan) vehiculoSeleccionado, marca, placa,
                                    modelo, cambios, velocidadMaxima, cilindraje,
                                    tipoRegistro, transmision, estado, capacidadPasajeros, cantidadPuertas, abs,
                                    aireAcondicionado,
                                    camaraReversa, capacidadMaletero, velocidadCrucero, numeroBolsasAire,
                                    sensoresColision,
                                    sensorTraficoCruzado, asistentePermanenciaCarril, precio, combustible, autonomia,
                                    tiempoCarga,
                                    enchufable, hibridoLigero)) {
                                // Actualiza la tabla
                                setVehiculos();

                                // Limpiar campos después de agregar
                                limpiarCampos();

                                tblListVehiculos.refresh();

                                return;
                            } else {
                                App.mostrarAlerta("Error",
                                        "Ya existe un sedan con el número de matrícula " + placa);
                            }
                        }

                    }

                    else if (tipoVehiculo == TipoVehiculo.VAN) {
                        String capacidadMaleteroCadena = txtCapacidadMaleteroVan.getText();
                        String numeroBolsasAireCadena = txtNumeroBolsasAireVan.getText();

                        if (camposValidosVan(capacidadMaleteroCadena, numeroBolsasAireCadena)) {
                            int numeroBolsasAire = Integer.parseInt(numeroBolsasAireCadena);
                            Double capacidadMaletero = Double.parseDouble(capacidadMaleteroCadena);
                            if (gestionarVehiculosController.actualizarVan((Van) vehiculoSeleccionado, marca, placa,
                                    modelo, cambios, velocidadMaxima, cilindraje,
                                    tipoRegistro, transmision, estado, capacidadPasajeros, cantidadPuertas, abs,
                                    aireAcondicionado,
                                    camaraReversa, capacidadMaletero, numeroBolsasAire, precio, combustible, autonomia,
                                    tiempoCarga, enchufable,
                                    hibridoLigero)) {
                                // Actualiza la tabla
                                setVehiculos();

                                // Limpiar campos después de agregar
                                limpiarCampos();

                                tblListVehiculos.refresh();

                                return;
                            } else {
                                App.mostrarAlerta("Error",
                                        "Ya existe una van con el número de matrícula " + placa);
                            }
                        }

                    }

                } else if (gestionarVehiculosController.actualizarMoto((Moto) vehiculoSeleccionado, marca, placa,
                        modelo, cambios, velocidadMaxima,
                        cilindraje, tipoRegistro, transmision, estado, precio, combustible, autonomia, tiempoCarga,
                        enchufable, hibridoLigero)) {
                    // Actualiza la tabla
                    setVehiculos();

                    // Limpiar campos después de agregar
                    limpiarCampos();

                    return;
                } else {
                    App.mostrarAlerta("Error",
                            "Ya existe una moto con el número de matrícula " + placa);
                }
            }
        }
    }

    // Método para eliminar una moto seleccionada
    @FXML
    public void handleBtnEliminarVehiculo(ActionEvent event) {
        if (vehiculoSeleccionado == null) {
            App.mostrarAlerta("No hay un vehículo seleccionada", "Por favor, selecciona un vehículo para eliminar.");
            return;
        }

        // Se remueve la moto de la lista
        gestionarVehiculosController.eliminarVehiculo(vehiculoSeleccionado);

        // Se limpian los campos
        limpiarCampos();
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

                mostrarCamposSegunTipoVehiculo(newValue);
                limpiarCamposEspecificos();

            }
        });

        choiceCombustibleVehiculo.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    if (newValue != null) {

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
                mostrarCamposVan();
                break;
            default:
                ocultarCamposIrrelevantes();
                break;
        }
    }

    private void mostrarCamposSegunCombustible(Combustible combustible) {
        switch (combustible) {
            case ELECTRICO:
                mostrarCamposElectrico();
                break;
            case HIBRIDO:
                mostrarCamposHibrido();
                break;
            default:
                ocultarCamposCombustibleEspecificos();
                break;
        }
    }

    public boolean camposValidosVehiculo(String marca, String placa, String modeloCadena, String cambiosCadena,
            String velocidadMaximaCadena, String cilindrajeCadena, TipoRegistro tipoRegistro, Transmision transmision,
            Estado estado, String precioCadena, Combustible combustible, String autonomiaCadena,
            String tiempoCargaCadena,
            boolean enchufable, boolean hibridoLigero) {

        // Validar campos vacíos básicos
        if (marca == null || marca.isEmpty() || placa == null || placa.isEmpty() || modeloCadena == null
                || modeloCadena.isEmpty() || cambiosCadena == null || cambiosCadena.isEmpty()
                || velocidadMaximaCadena == null || velocidadMaximaCadena.isEmpty()
                || cilindrajeCadena == null || cilindrajeCadena.isEmpty()
                || tipoRegistro == null || transmision == null || estado == null || precioCadena == null
                || precioCadena.isEmpty() || combustible == null) {

            App.mostrarAlerta("Campos vacíos", "Por favor complete todos los campos obligatorios.");
            return false;
        }

        // Validar campos numéricos básicos
        try {
            int modelo = Integer.parseInt(modeloCadena);
            int cambios = Integer.parseInt(cambiosCadena);
            double velocidadMaxima = Double.parseDouble(velocidadMaximaCadena);
            double cilindraje = Double.parseDouble(cilindrajeCadena);
            double precio = Double.parseDouble(precioCadena);

            if (modelo <= 0 || cambios <= 0 || velocidadMaxima <= 0 || cilindraje <= 0 || precio <= 0) {
                App.mostrarAlerta("Valores inválidos", "Asegúrese de que los valores numéricos sean mayores a 0.");
                return false;
            }
        } catch (NumberFormatException e) {
            App.mostrarAlerta("Formato inválido",
                    "Por favor ingrese valores numéricos válidos en los campos correspondientes.");
            return false;
        }

        // Validar coherencia de campos según el combustible
        if (combustible.equals(Combustible.ELECTRICO)) {
            // Validar autonomía y tiempo de carga
            try {
                double autonomia = Double.parseDouble(autonomiaCadena);
                double tiempoCarga = Double.parseDouble(tiempoCargaCadena);

                if (autonomia <= 0 || tiempoCarga <= 0) {
                    App.mostrarAlerta("Valores eléctricos inválidos",
                            "Autonomía y tiempo de carga deben ser mayores a 0.");
                    return false;
                }
            } catch (NumberFormatException e) {
                App.mostrarAlerta("Formato inválido",
                        "Por favor ingrese valores numéricos válidos para autonomía y tiempo de carga.");
                return false;
            }
        } else if (combustible.equals(Combustible.HIBRIDO)) {
            // Validar que sea enchufable o híbrido ligero
            if (!enchufable && !hibridoLigero) {
                App.mostrarAlerta("Configuración híbrida inválida",
                        "Un vehículo híbrido debe ser enchufable o híbrido ligero.");
                return false;
            }
        }

        return true;
    }

    public boolean validarCamposCarro(String capacidadPasajeros, String cantidadPuertas) {
        // Verificar si la capacidad de pasajeros se puede convertir a un número entero
        int capacidadPasajerosInt = 0;
        try {
            capacidadPasajerosInt = Integer.parseInt(capacidadPasajeros);
        } catch (NumberFormatException e) {
            App.mostrarAlerta("Error", "La capacidad de pasajeros debe ser un número válido.");
            return false; // Si no se puede convertir a número, retornar false
        }

        // Validar que la capacidad de pasajeros sea mayor que 0
        if (capacidadPasajerosInt <= 0) {
            App.mostrarAlerta("Error", "La capacidad de pasajeros debe ser mayor que 0.");
            return false;
        }

        // Verificar si la cantidad de puertas se puede convertir a un número entero
        int cantidadPuertasInt = 0;
        try {
            cantidadPuertasInt = Integer.parseInt(cantidadPuertas);
        } catch (NumberFormatException e) {
            App.mostrarAlerta("Error", "La cantidad de puertas debe ser un número válido.");
            return false; // Si no se puede convertir a número, retornar false
        }

        // Validar que la cantidad de puertas sea mayor que 0
        if (cantidadPuertasInt <= 0) {
            App.mostrarAlerta("Error", "La cantidad de puertas debe ser mayor que 0.");
            return false;
        }

        return true; // Si todo es válido, retornar true
    }

    public boolean camposValidosBus(String capacidadMaleteroCadena, String numeroBolsasAireCadena,
            String numeroEjesCadena, String numeroSalidasEmergenciaCadena) {

        // Validar campos vacíos específicos de Bus
        if (capacidadMaleteroCadena == null || capacidadMaleteroCadena.isEmpty()
                || numeroBolsasAireCadena == null || numeroBolsasAireCadena.isEmpty()
                || numeroEjesCadena == null || numeroEjesCadena.isEmpty()
                || numeroSalidasEmergenciaCadena == null || numeroSalidasEmergenciaCadena.isEmpty()) {

            App.mostrarAlerta("Campos vacíos", "Por favor complete todos los campos específicos del bus.");
            return false;
        }

        // Validar que los campos específicos sean numéricos y mayores a 0
        try {
            double capacidadMaletero = Double.parseDouble(capacidadMaleteroCadena);
            int numeroBolsasAire = Integer.parseInt(numeroBolsasAireCadena);
            int numeroEjes = Integer.parseInt(numeroEjesCadena);
            int numeroSalidasEmergencia = Integer.parseInt(numeroSalidasEmergenciaCadena);

            if (capacidadMaletero <= 0 || numeroBolsasAire <= 0 || numeroEjes <= 0 || numeroSalidasEmergencia <= 0) {
                App.mostrarAlerta("Valores inválidos", "Asegúrese de que todos los valores sean mayores a 0.");
                return false;
            }
        } catch (NumberFormatException e) {
            App.mostrarAlerta("Formato inválido",
                    "Por favor ingrese valores numéricos válidos en los campos específicos del bus.");
            return false;
        }

        return true;
    }

    public boolean camposValidosCamion(String capacidadCargaCadena, String numeroEjesCadena, TipoCamion tipoCamion) {

        // Validar campos vacíos específicos de Camión
        if (capacidadCargaCadena == null || capacidadCargaCadena.isEmpty()
                || numeroEjesCadena == null || numeroEjesCadena.isEmpty()
                || tipoCamion == null) {
            App.mostrarAlerta("Campos vacíos", "Por favor complete todos los campos específicos del camión.");
            return false;
        }

        try {
            double capacidadCarga = Double.parseDouble(capacidadCargaCadena);
            int numeroEjes = Integer.parseInt(numeroEjesCadena);

            if (capacidadCarga <= 0 || numeroEjes <= 0) {
                App.mostrarAlerta("Valores inválidos",
                        "La capacidad de carga y el número de ejes deben ser mayores a 0.");
                return false;
            }
        } catch (NumberFormatException e) {
            App.mostrarAlerta("Formato inválido",
                    "Por favor ingrese valores numéricos válidos en capacidad de carga y número de ejes.");
            return false;
        }

        return true;
    }

    public boolean camposValidosCamioneta(String capacidadMaleteroCadena, String numeroBolsasAireCadena) {

        // Validar campos vacíos específicos de Camioneta
        if (capacidadMaleteroCadena == null || capacidadMaleteroCadena.isEmpty()
                || numeroBolsasAireCadena == null || numeroBolsasAireCadena.isEmpty()) {
            App.mostrarAlerta("Campos vacíos", "Por favor complete todos los campos específicos de la camioneta.");
            return false;
        }

        try {
            double capacidadMaletero = Double.parseDouble(capacidadMaleteroCadena);
            int numeroBolsasAire = Integer.parseInt(numeroBolsasAireCadena);

            if (capacidadMaletero <= 0) {
                App.mostrarAlerta("Valor inválido", "La capacidad del maletero debe ser mayor a 0.");
                return false;
            }

            if (numeroBolsasAire < 0) {
                App.mostrarAlerta("Valor inválido", "El número de bolsas de aire no puede ser negativo.");
                return false;
            }
        } catch (NumberFormatException e) {
            App.mostrarAlerta("Formato inválido",
                    "Por favor ingrese valores numéricos válidos en los campos de capacidad del maletero y número de bolsas de aire.");
            return false;
        }

        return true;
    }

    public boolean camposValidosDeportivo(String numeroCaballosFuerzaCadena, String numeroBolsasAireCadena,
            String tiempoAlcanzar100kmhCadena) {
        System.out.println(numeroBolsasAireCadena);
        System.out.println(numeroCaballosFuerzaCadena);
        System.out.println(tiempoAlcanzar100kmhCadena);

        // Validar campos vacíos específicos de Deportivo
        if (numeroCaballosFuerzaCadena == null || numeroCaballosFuerzaCadena.isEmpty()
                || numeroBolsasAireCadena == null || numeroBolsasAireCadena.isEmpty()
                || tiempoAlcanzar100kmhCadena == null || tiempoAlcanzar100kmhCadena.isEmpty()) {
            App.mostrarAlerta("Campos vacíos", "Por favor complete todos los campos específicos del deportivo.");
            return false;
        }

        try {
            int numeroCaballosFuerza = Integer.parseInt(numeroCaballosFuerzaCadena);
            int numeroBolsasAire = Integer.parseInt(numeroBolsasAireCadena);
            double tiempoAlcanzar100kmh = Double.parseDouble(tiempoAlcanzar100kmhCadena);

            if (numeroCaballosFuerza <= 0) {
                App.mostrarAlerta("Valor inválido", "El número de caballos de fuerza debe ser mayor a 0.");
                return false;
            }

            if (numeroBolsasAire < 0) {
                App.mostrarAlerta("Valor inválido", "El número de bolsas de aire no puede ser negativo.");
                return false;
            }

            if (tiempoAlcanzar100kmh <= 0) {
                App.mostrarAlerta("Valor inválido", "El tiempo para alcanzar 100 km/h debe ser mayor a 0.");
                return false;
            }
        } catch (NumberFormatException e) {
            App.mostrarAlerta("Formato inválido",
                    "Por favor ingrese valores numéricos válidos en los campos de caballos de fuerza, número de bolsas de aire y tiempo para alcanzar 100 km/h.");
            return false;
        }

        return true;
    }

    public boolean camposValidosPickUp(String numeroBolsasAireCadena, String capacidadCajaCargaCadena) {

        // Validar campos vacíos específicos de PickUp
        if (numeroBolsasAireCadena == null || numeroBolsasAireCadena.isEmpty()
                || capacidadCajaCargaCadena == null || capacidadCajaCargaCadena.isEmpty()) {
            App.mostrarAlerta("Campos vacíos", "Por favor complete todos los campos específicos de la PickUp.");
            return false;
        }

        try {
            // Validar que los valores sean numéricos válidos
            int numeroBolsasAire = Integer.parseInt(numeroBolsasAireCadena);
            double capacidadCajaCarga = Double.parseDouble(capacidadCajaCargaCadena);

            // Validar los valores numéricos
            if (numeroBolsasAire < 0) {
                App.mostrarAlerta("Valor inválido", "El número de bolsas de aire no puede ser negativo.");
                return false;
            }

            if (capacidadCajaCarga <= 0) {
                App.mostrarAlerta("Valor inválido", "La capacidad de la caja de carga debe ser mayor a 0.");
                return false;
            }
        } catch (NumberFormatException e) {
            App.mostrarAlerta("Formato inválido",
                    "Por favor ingrese valores numéricos válidos en los campos de número de bolsas de aire y capacidad de la caja de carga.");
            return false;
        }

        return true;
    }

    public boolean camposValidosSedan(String capacidadMaleteroCadena, String numeroBolsasAireCadena) {

        // Validar si los campos obligatorios de tipo String son nulos o están vacíos
        if (capacidadMaleteroCadena == null || capacidadMaleteroCadena.isEmpty()
                || numeroBolsasAireCadena == null || numeroBolsasAireCadena.isEmpty()) {
            App.mostrarAlerta("Campos vacíos", "Por favor complete todos los campos específicos del Sedan.");
            return false;
        }

        try {
            // Intentar convertir a Double para validar la capacidad del maletero
            Double.parseDouble(capacidadMaleteroCadena);
            Integer.parseInt(numeroBolsasAireCadena);
        } catch (NumberFormatException e) {
            // Mostrar alerta si los valores no son números válidos
            App.mostrarAlerta("Formato inválido",
                    "Por favor ingrese valores numéricos válidos en los campos de capacidad del maletero y número de bolsas de aire.");
            return false;
        }

        return true;
    }

    public boolean camposValidosVan(String capacidadMaleteroCadena, String bolsasAireCadena) {

        System.out.println(capacidadMaleteroCadena);
        System.out.println(bolsasAireCadena);

        // Validar si los campos obligatorios de tipo String son nulos o están vacíos
        if (capacidadMaleteroCadena == null || capacidadMaleteroCadena.isEmpty()
                || bolsasAireCadena == null || bolsasAireCadena.isEmpty()) {
            App.mostrarAlerta("Campos vacíos", "Por favor complete todos los campos específicos de la Van.");
            return false;
        }

        try {
            // Intentar convertir a Double para validar si los campos numéricos son válidos
            Double.parseDouble(capacidadMaleteroCadena);
            Integer.parseInt(bolsasAireCadena);
        } catch (NumberFormatException e) {
            // Mostrar alerta si los valores no son números válidos
            App.mostrarAlerta("Formato inválido",
                    "Por favor ingrese valores numéricos válidos en los campos de capacidad y bolsas de aire.");
            return false;
        }

        return true;
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
                System.out.println("bus");
                Bus bus = (Bus) vehiculo;
                choiceVehiculo.setValue(TipoVehiculo.BUS);
                txtCapacidadMaleteroBus.setText(String.valueOf(bus.getCapacidadMaletero()));
                txtNumeroBolsasAireBus.setText(String.valueOf(bus.getNumeroBolsasAire()));
                txtNumeroEjesBus.setText(String.valueOf(bus.getNumeroEjes()));
                txtNumeroSaliodasEmergenciaBus.setText(String.valueOf(bus.getNumeroSalidasEmergencia()));
            } else if (vehiculo instanceof Camion) {
                System.out.println("camion");
                Camion camion = (Camion) vehiculo;
                choiceVehiculo.setValue(TipoVehiculo.CAMION);
                txtCapacidadCargaCamion.setText(String.valueOf(camion.getCapacidadCarga()));
                txtNumeroEjesCamion.setText(String.valueOf(camion.getNumeroEjes()));
                choiceTipoCamion.setValue(camion.getTipoCamion());
                rdFrenosAireCamion.setSelected(camion.isFrenosAire());
            } else if (vehiculo instanceof Camioneta) {
                System.out.println("camioneta");
                Camioneta camioneta = (Camioneta) vehiculo;
                choiceVehiculo.setValue(TipoVehiculo.CAMIONETA);
                txtCapacidadMaleteroCamioneta.setText(String.valueOf(camioneta.getCapacidadMaletero()));
                rdVelocidadCruceroCamioneta.setSelected(camioneta.getVelocidadCrucero());
                txtNumeroBolsasAireCamioneta.setText(String.valueOf(camioneta.getNumeroBolsasAire()));
                rdSensoresColisionCamioneta.setSelected(camioneta.isSensoresColision());
                rdSensorTraficoCruzadoCamioneta.setSelected(camioneta.isSensorTraficoCruzado());
                rdAsistentePermanenciaCarrilCamioneta.setSelected(camioneta.isAsistentepermanenciaCarril());
                rdCuatroPorCuatroCamioneta.setSelected(camioneta.isCuatroPorCuatro());
            } else if (vehiculo instanceof Deportivo) {
                System.out.println("deportivo");
                Deportivo deportivo = (Deportivo) vehiculo;
                choiceVehiculo.setValue(TipoVehiculo.DEPORTIVO);
                txtNumeroCaballosFuerzaDeportivo.setText(String.valueOf(deportivo.getNumeroCaballosFuerza()));
                txtNumeroBolsasAireDeportivo.setText(String.valueOf(deportivo.getNumeroBolsasAire()));
                txtTiempoAlcanzar100kmhDeportivo.setText(String.valueOf(deportivo.getTiempoAlcanzar100kmh()));
            } else if (vehiculo instanceof Moto) {
                choiceVehiculo.setValue(TipoVehiculo.MOTO);
                System.out.println("moto");

            } else if (vehiculo instanceof PickUp) {
                System.out.println("pickup");
                PickUp pickUp = (PickUp) vehiculo;
                choiceVehiculo.setValue(TipoVehiculo.PICK_UP);
                txtNumeroBolsasAirePickUp.setText(String.valueOf(pickUp.getNumeroBolsasAire()));
                rdCuatroPorCuatroPickupa.setSelected(pickUp.isCuatroPorCuatro());
                txtCapacidadCajaCargaPickUp.setText(String.valueOf(pickUp.getCapacidadCajaCarga()));
            } else if (vehiculo instanceof Sedan) {
                System.out.println("sedan");
                Sedan sedan = (Sedan) vehiculo;
                choiceVehiculo.setValue(TipoVehiculo.SEDAN);
                txtCapacidadMaleteroSedan.setText(String.valueOf(sedan.getCapacidadMaletero()));
                rdVelocidadCruceroSedan.setSelected(sedan.getVelocidadCrucero());
                txtNumeroBolsasAireSedan.setText(String.valueOf(sedan.getNumeroBolsasAire()));
                rdSensoresColisionSedan.setSelected(sedan.isSensoresColision());
                rdSensorTraficoCruzadoSedan.setSelected(sedan.isSensorTraficoCruzado());
                rdAsistentePermanenteSedan.setSelected(sedan.isAsistentePermanenciaCarril());
            } else if (vehiculo instanceof Van) {
                System.out.println("van");
                Van van = (Van) vehiculo;
                choiceVehiculo.setValue(TipoVehiculo.VAN);
                txtCapacidadMaleteroVan.setText(String.valueOf(van.getCapacidadMaletero()));
                txtNumeroBolsasAireVan.setText(String.valueOf(van.getBolsasAire()));
            }

            if (vehiculo instanceof Carro) {
                Carro carro = (Carro) vehiculo;
                txtNumeroPasajerosCarro.setText("" + carro.getCapacidadPasajeros());
                txtNumeroPuertasCarro.setText("" + carro.getCantidadPuertas());
                rdAbsCarro.setSelected(carro.isAbs());
                rdAireAcondicionadoCarro.setSelected(carro.isAireAcondicionado());
                rdCamaraReversaCarro.setSelected(carro.isCamaraReversa());
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
        txtNumeroBolsasAireCamioneta.setVisible(false);
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
        rdCuatroPorCuatroPickupa.setVisible(false);
        rdHibridoLigero.setVisible(false);
        rdEnchufable.setVisible(false);
        rdVelocidadCruceroSedan.setVisible(false);
        rdSensoresColisionSedan.setVisible(false);
        rdAsistentePermanenteSedan.setVisible(false);
        rdSensorTraficoCruzadoSedan.setVisible(false);
        txtNumeroCaballosFuerzaDeportivo.setVisible(false);
        txtTiempoAlcanzar100kmhDeportivo.setVisible(false);
        txtNumeroBolsasAireDeportivo.setVisible(false);
        txtCapacidadMaleteroCamioneta.setVisible(false);
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
        rdCamaraReversaCarro.setVisible(false);
        rdAireAcondicionadoCarro.setVisible(false);

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
        txtNumeroBolsasAireBus.clear();

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
