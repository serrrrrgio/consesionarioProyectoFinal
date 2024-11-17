package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.CrudEmpleadoAdminController;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.PreguntaSeguridad;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

public class RegistrarEmpleadoViewController {

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private ImageView backgroundImage;

    @FXML
    private TableColumn<Empleado, String> tbcApellido;

    @FXML
    private TextField txtSalario;

    @FXML
    private Button btnVerTransacciones;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtUsuario;

    @FXML
    private TableColumn<Empleado, String> tbcCorreo;

    @FXML
    private TableColumn<Empleado, String> tbcTelefono;

    @FXML
    private TextField txtNombre;

    @FXML
    private Button btnRegresar;

    @FXML
    private Button btnActualizarEmpleado;

    @FXML
    private ChoiceBox<PreguntaSeguridad> choicePreguntaSeguridad;

    @FXML
    private Button btnActualizarAdmin;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtRespuesta;

    @FXML
    private Button btnRegistrarEmpleado;

    @FXML
    private TableColumn<Empleado, String> tbcNombre;

    @FXML
    private TableColumn<Empleado, String> tbcSalario;

    @FXML
    private TextField txtApellido;

    @FXML
    private TableView<Empleado> tblListEmpleado;

    @FXML
    private Button btnGestionarFondos;

    @FXML
    private Button btnLimpiarCampos;

    @FXML
    private Button btnDespedirEmpleado;

    private CrudEmpleadoAdminController crudEmpleadoAdminController;

    Empleado empleadoSeleccionado;

    @FXML
    public void initialize() {
        crudEmpleadoAdminController = new CrudEmpleadoAdminController(App.getConcesionario());

        setEmpleados();

        inicializarData();

        agregarListener();

        App.setButtonHoverEffect(btnActualizarAdmin);
        App.setButtonHoverEffect(btnActualizarEmpleado);
        App.setButtonHoverEffect(btnDespedirEmpleado);
        App.setButtonHoverEffect(btnGestionarFondos);
        App.setButtonHoverEffect(btnLimpiarCampos);
        App.setButtonHoverEffect(btnRegistrarEmpleado);
        App.setButtonHoverEffect(btnRegresar);
        App.setButtonHoverEffect(btnVerTransacciones);
    }

    // Agregar listener para detectar selección de cliente
    private void agregarListener() {

        tblListEmpleado.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            empleadoSeleccionado = newValue;
            mostrarInformacionEmpleado(empleadoSeleccionado);
        });
    }

    // Inicializar los datos de las columnas de la tabla
    private void inicializarData() {
        tbcNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        tbcApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        tbcCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        tbcTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        tbcSalario
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().obtenerSalarioCadena()));
        choicePreguntaSeguridad.setItems(FXCollections.observableArrayList(PreguntaSeguridad.values()));
    }

    // Mostrar la información del empleado seleccionado
    private void mostrarInformacionEmpleado(Empleado empleado) {
        if (empleado != null) {
            txtNombre.setText(empleado.getNombre());
            txtApellido.setText(empleado.getApellido());
            txtCorreo.setText(empleado.getCorreo());
            txtCedula.setText(empleado.getCedula());
            txtTelefono.setText(empleado.getTelefono());
            choicePreguntaSeguridad.setValue(empleado.getPreguntaSeguridad());
            txtContrasena.setText(empleado.getContrasena());
            txtRespuesta.setText(empleado.getRespuesta());
            txtSalario.setText(empleado.obtenerSalarioCadena());
            txtUsuario.setText(empleado.getUsuario());
        } else {
            // Limpiar campos si no hay empleado seleccionado
            handleBtnLimpiarCampos();
        }
    }

    // Establece la tabla para mostrar la lista de clientes
    public void setEmpleados() {
        tblListEmpleado.setItems(crudEmpleadoAdminController.obtenerEmpleados());
    }

    public boolean validarCampos(String nombre, String apellido, String correo, String telefono,
            String usuario, String contrasena, String cedula, PreguntaSeguridad preguntaSeguridad,
            String respuesta, String salario) {

        // Validar campos vacíos
        if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || telefono.isEmpty() ||
                usuario.isEmpty() || cedula.isEmpty() || contrasena.isEmpty() || respuesta.isEmpty()
                || preguntaSeguridad == null ||
                salario.isEmpty()) {
            App.mostrarAlerta("Campos vacíos", "Por favor llena todos los campos obligatorios.");
            return false;
        }

        // Validar formato de correo
        if (!correo.contains("@") || correo.startsWith("@") || correo.endsWith("@")) {
            App.mostrarAlerta("Correo inválido", "Por favor ingresa un correo válido.");
            return false;
        }

        // Validar formato de teléfono
        if (!telefono.matches("^3\\d{9}$")) {
            App.mostrarAlerta("Teléfono inválido", "El número de teléfono debe empezar con 3 y tener 10 dígitos.");
            System.out.println(telefono);
            return false;
        }

        // Validar formato de salario (debe ser un número positivo)
        try {
            double salarioDouble = Double.parseDouble(salario);
            if (salarioDouble <= 0) {
                App.mostrarAlerta("Salario inválido", "El salario debe ser un valor positivo.");
                return false;
            }
        } catch (NumberFormatException e) {
            App.mostrarAlerta("Salario inválido", "Por favor ingresa un salario válido.");
            return false;
        }

        return true;
    }

    @FXML
    void handleBtnRegresar(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/InicioAdministrador.fxml", "Inicio", event, getClass());
    }

    @FXML
    void handleBtnActualizarAdmin(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/ActualizarAdministrador.fxml", "Inicio", event, getClass());
    }

    @FXML
    void handleBtnGestionarFondos(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/GestionarFondos.fxml", "Inicio", event, getClass());
    }

    @FXML
    void handleBtnLimpiarCampos() {
        txtNombre.clear();
        txtApellido.clear();
        txtCorreo.clear();
        txtTelefono.clear();
        txtCedula.clear();
        txtUsuario.clear();
        txtContrasena.clear();
        txtRespuesta.clear();
        txtSalario.clear();
        choicePreguntaSeguridad.setValue(null);
        limpiarSeleccion();
    }

    @FXML
    void handleBtnRegistrarEmpleado(ActionEvent event) {
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String correo = txtCorreo.getText();
        String cedula = txtCedula.getText();
        String telefono = txtTelefono.getText();
        String usuario = txtUsuario.getText();
        String contrasena = txtContrasena.getText();
        String respuesta = txtRespuesta.getText();
        PreguntaSeguridad preguntaSeleccionada = choicePreguntaSeguridad.getValue();
        String salarioCadena = txtSalario.getText();

        if (validarCampos(nombre, apellido, correo, telefono, usuario, contrasena, cedula, preguntaSeleccionada,
                respuesta,
                salarioCadena)) {
            Empleado nuevoEmpleado = crudEmpleadoAdminController.crearEmpleado(nombre, apellido, correo, cedula,
                    telefono,
                    usuario, contrasena, preguntaSeleccionada,
                    respuesta, Double.parseDouble(salarioCadena));
            if (crudEmpleadoAdminController.agregarEmpleado(nuevoEmpleado)) {
                setEmpleados(); // Refrescar la lista de empleados
                tblListEmpleado.refresh();
                handleBtnLimpiarCampos();
            } else {
                App.mostrarAlerta("Error al registrar empleado", "Ya existe un empleado con el mismo usuario.");
            }
        }
    }

    @FXML
    void handleBtnActualizarEmpleado(ActionEvent event) {
        if (empleadoSeleccionado != null) {
            String nombre = txtNombre.getText().trim();
            String apellido = txtApellido.getText().trim();
            String correo = txtCorreo.getText().trim();
            String cedula = txtCedula.getText().trim(); 
            String telefono = txtTelefono.getText().trim();
            String usuario = txtUsuario.getText().trim();
            String contrasena = txtContrasena.getText().trim();
            String respuesta = txtRespuesta.getText().trim();
            PreguntaSeguridad preguntaSeleccionada = choicePreguntaSeguridad.getValue();
            String salarioCadena = txtSalario.getText().trim();
    
            if (validarCampos(nombre, apellido, correo, telefono, usuario, contrasena, cedula, preguntaSeleccionada, respuesta, salarioCadena)) {
                empleadoSeleccionado.setNombre(nombre);
                empleadoSeleccionado.setApellido(apellido);
                empleadoSeleccionado.setCorreo(correo);
                empleadoSeleccionado.setCedula(cedula);
                empleadoSeleccionado.setTelefono(telefono);
                empleadoSeleccionado.setUsuario(usuario);
                empleadoSeleccionado.setContrasena(contrasena);
                empleadoSeleccionado.setPreguntaSeguridad(preguntaSeleccionada);
                empleadoSeleccionado.setRespuesta(respuesta);
                empleadoSeleccionado.setSalario(Double.parseDouble(salarioCadena));
    
                if (crudEmpleadoAdminController.actualizarEmpleado(empleadoSeleccionado, nombre, apellido, correo, cedula, telefono, usuario, contrasena, preguntaSeleccionada, respuesta)) {
                    tblListEmpleado.refresh();
                    setEmpleados();
                    handleBtnLimpiarCampos();
                } else {
                    App.mostrarAlerta("Error al actualizar empleado", "Ya existe un empleado con el usuario " + usuario);
                }
            }
        } else {
            App.mostrarAlerta("Seleccionar empleado", "Por favor selecciona un empleado de la lista.");
        }
    }
    
    @FXML
    void handleBtnDespedirEmpleado(ActionEvent event) {
        if (empleadoSeleccionado == null) {
            App.mostrarAlerta("No hay un empleado seleccionada", "Por favor, selecciona un empleado para eliminar.");
            return;
        }

        // Se remueve la camioneta de la lista
        crudEmpleadoAdminController.eliminarEmpleado(empleadoSeleccionado);

        // Se limpian los campos
        handleBtnLimpiarCampos();
    }

    @FXML
    void handleBtnVerTransacciones(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/VerTransacciones.fxml", "Inicio", event, getClass());
    }

    private void limpiarSeleccion() {
        tblListEmpleado.getSelectionModel().clearSelection(); // Deseleccionar el cliente en la tabla
        empleadoSeleccionado = null; // Reiniciar la referencia al cliente seleccionado
    }
}
