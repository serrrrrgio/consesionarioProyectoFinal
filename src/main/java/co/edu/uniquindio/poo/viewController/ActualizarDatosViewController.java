package co.edu.uniquindio.poo.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Persona;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.PreguntaSeguridad;

public class ActualizarDatosViewController {

    @FXML
    private TextField txtUsuarioNombre;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtUsuario;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtRespuesta;

    @FXML
    private TextField txtApellido;

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private ChoiceBox<String> choicePreguntaSeguridad;

    @FXML
    private Button btnActualizarDatos;

    @FXML
    private Button btnRegresar;

    static Persona usuarioActivo;

    @FXML
    public void initialize() {
        App.setButtonHoverEffect(btnActualizarDatos);
        App.setButtonHoverEffect(btnRegresar);
        // Inicialización del usuario activo
        if (usuarioActivo instanceof Cliente) {
            cargarDatosCliente((Cliente) usuarioActivo);
        } else if (usuarioActivo instanceof Empleado) {
            cargarDatosEmpleado((Empleado) usuarioActivo);
        } else if (usuarioActivo instanceof Administrador) {
            cargarDatosAdministrador((Administrador) usuarioActivo);
        }
    }

    public void setUsuarioActivo(Persona usuario) {
        this.usuarioActivo = usuario;
        initialize();
    }

    private void cargarDatosCliente(Cliente cliente) {
        txtUsuarioNombre.setText(cliente.getUsuario());
        txtNombre.setText(cliente.getNombre());
        txtApellido.setText(cliente.getApellido());
        txtCorreo.setText(cliente.getCorreo());
        txtTelefono.setText(cliente.getTelefono());
        txtUsuario.setText(cliente.getUsuario());
        txtContrasena.setText(cliente.getContrasena());

        // Cargar todas las opciones de PreguntaSeguridad en el ChoiceBox
        choicePreguntaSeguridad.getItems().clear();
        for (PreguntaSeguridad pregunta : PreguntaSeguridad.values()) {
            choicePreguntaSeguridad.getItems().add(pregunta.getQuestion());
        }

        // Seleccionar la pregunta de seguridad actual del cliente
        if (cliente.getPreguntaSeguridad() != null) {
            choicePreguntaSeguridad.setValue(cliente.getPreguntaSeguridad().getQuestion());
        }

        txtRespuesta.setText(cliente.getRespuesta());
    }

    private void cargarDatosEmpleado(Empleado empleado) {
        txtUsuarioNombre.setText(empleado.getUsuario());
        txtNombre.setText(empleado.getNombre());
        txtApellido.setText(empleado.getApellido());
        txtCorreo.setText(empleado.getCorreo());
        txtTelefono.setText(empleado.getTelefono());
        txtUsuario.setText(empleado.getUsuario());
        txtContrasena.setText(empleado.getContrasena());

        // Cargar todas las opciones de PreguntaSeguridad en el ChoiceBox
        choicePreguntaSeguridad.getItems().clear();
        for (PreguntaSeguridad pregunta : PreguntaSeguridad.values()) {
            choicePreguntaSeguridad.getItems().add(pregunta.getQuestion());
        }

        // Seleccionar la pregunta de seguridad actual del empleado
        if (empleado.getPreguntaSeguridad() != null) {
            choicePreguntaSeguridad.setValue(empleado.getPreguntaSeguridad().getQuestion());
        }

        txtRespuesta.setText(empleado.getRespuesta());
    }

    private void cargarDatosAdministrador(Administrador administrador) {
        txtUsuarioNombre.setText(administrador.getUsuario());
        txtNombre.setText(administrador.getNombre());
        txtApellido.setText(administrador.getApellido());
        txtCorreo.setText(administrador.getCorreo());
        txtTelefono.setText(administrador.getTelefono());
        txtUsuario.setText(administrador.getUsuario());
        txtContrasena.setText(administrador.getContrasena());

        // Cargar todas las opciones de PreguntaSeguridad en el ChoiceBox
        choicePreguntaSeguridad.getItems().clear();
        for (PreguntaSeguridad pregunta : PreguntaSeguridad.values()) {
            choicePreguntaSeguridad.getItems().add(pregunta.getQuestion());
        }

        // Seleccionar la pregunta de seguridad actual del administrador
        if (administrador.getPreguntaSeguridad() != null) {
            choicePreguntaSeguridad.setValue(administrador.getPreguntaSeguridad().getQuestion());
        }

        txtRespuesta.setText(administrador.getRespuesta());
    }

    @FXML
    void handleBtnActualizarDatos(ActionEvent event) {
        if (usuarioActivo instanceof Cliente) {
            actualizarDatosCliente((Cliente) usuarioActivo);
        } else if (usuarioActivo instanceof Empleado) {
            actualizarDatosEmpleado((Empleado) usuarioActivo);
        } else if (usuarioActivo instanceof Administrador) {
            actualizarDatosAdministrador((Administrador) usuarioActivo);
        }

        txtUsuarioNombre.setText(usuarioActivo.getUsuario());


        mostrarMensaje("Datos actualizados con éxito.");
    }

    private void actualizarDatosCliente(Cliente cliente) {
        cliente.setNombre(txtNombre.getText());
        cliente.setApellido(txtApellido.getText());
        cliente.setCorreo(txtCorreo.getText());
        cliente.setTelefono(txtTelefono.getText());
        cliente.setUsuario(txtUsuario.getText());
        cliente.setContrasena(txtContrasena.getText());

        String preguntaSeleccionada = choicePreguntaSeguridad.getValue();
        if (preguntaSeleccionada != null) {
            for (PreguntaSeguridad pregunta : PreguntaSeguridad.values()) {
                if (pregunta.getQuestion().equals(preguntaSeleccionada)) {
                    cliente.setPreguntaSeguridad(pregunta);
                    break;
                }
            }
        }

        cliente.setRespuesta(txtRespuesta.getText());
    }

    private void actualizarDatosEmpleado(Empleado empleado) {
        empleado.setNombre(txtNombre.getText());
        empleado.setApellido(txtApellido.getText());
        empleado.setCorreo(txtCorreo.getText());
        empleado.setTelefono(txtTelefono.getText());
        empleado.setUsuario(txtUsuario.getText());
        empleado.setContrasena(txtContrasena.getText());

        String preguntaSeleccionada = choicePreguntaSeguridad.getValue();
        if (preguntaSeleccionada != null) {
            for (PreguntaSeguridad pregunta : PreguntaSeguridad.values()) {
                if (pregunta.getQuestion().equals(preguntaSeleccionada)) {
                    empleado.setPreguntaSeguridad(pregunta);
                    break;
                }
            }
        }

        empleado.setRespuesta(txtRespuesta.getText());
    }

    private void actualizarDatosAdministrador(Administrador administrador) {
        administrador.setNombre(txtNombre.getText());
        administrador.setApellido(txtApellido.getText());
        administrador.setCorreo(txtCorreo.getText());
        administrador.setTelefono(txtTelefono.getText());
        administrador.setUsuario(txtUsuario.getText());
        administrador.setContrasena(txtContrasena.getText());

        String preguntaSeleccionada = choicePreguntaSeguridad.getValue();
        if (preguntaSeleccionada != null) {
            for (PreguntaSeguridad pregunta : PreguntaSeguridad.values()) {
                if (pregunta.getQuestion().equals(preguntaSeleccionada)) {
                    administrador.setPreguntaSeguridad(pregunta);
                    break;
                }
            }
        }

        administrador.setRespuesta(txtRespuesta.getText());
    }

    private void mostrarMensaje(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    @FXML
    void handleBtnRegresar(ActionEvent event) {
        if (usuarioActivo instanceof Cliente) {
            App.cambiarEscena("/co/edu/uniquindio/poo/InicioCliente.fxml", "Menú Principal", event, getClass());
        } else if (usuarioActivo instanceof Empleado) {
            App.cambiarEscena("/co/edu/uniquindio/poo/InicioEmpleado.fxml", "Menú Principal", event, getClass());
        } else if (usuarioActivo instanceof Administrador) {
            App.cambiarEscena("/co/edu/uniquindio/poo/InicioAdministrador.fxml", "Menú Principal", event, getClass());
        }
        
    }
}
