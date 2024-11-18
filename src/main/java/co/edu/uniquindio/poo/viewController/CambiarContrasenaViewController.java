package co.edu.uniquindio.poo.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert.AlertType;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Persona;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.PreguntaSeguridad;
import co.edu.uniquindio.poo.controller.RecuperarContrasenaController;

import java.util.List;

public class CambiarContrasenaViewController {

    @FXML
    private PasswordField txtContrasena2;

    @FXML
    private Button btnRegresar;

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private ImageView backgroundImage;

    @FXML
    private Button btnRegistrarse1;

    @FXML
    private PasswordField txtContrasena1;

    @FXML
    private Button btnCambiarContrasena;

    @FXML
    private Button btnRegistrarse;

    @FXML
    private TextField txtUsuario;

    @FXML
    private Button btnLimpiarCampos;

    @FXML
    private ChoiceBox<PreguntaSeguridad> choicePreguntaSeguridad;

    @FXML
    private TextField txtRespuestaSeguridad;

    // Listas para almacenar los usuarios
    private List<Cliente> listaClientes;
    private List<Empleado> listaEmpleados;
    private List<Administrador> listaAdministradores;

    // Instancia del controlador para recuperar contraseñas
    private RecuperarContrasenaController recuperarController;

    public CambiarContrasenaViewController() {
        // Aquí debes inicializar el Concesionario correctamente. 
        // Si Concesionario requiere algún parámetro, deberías proporcionarlo.
        Concesionario concesionario = new Concesionario(null, 0, null); // Usa un constructor adecuado según tu diseño.
        this.recuperarController = new RecuperarContrasenaController(concesionario);
    }

    // Método que se ejecuta cuando el controlador es inicializado
    @FXML
    private void initialize() {
        // Aquí puedes hacer cualquier inicialización necesaria, como cargar las listas de preguntas de seguridad
        // También es un buen lugar para asegurarte de que los campos de contraseña estén invisibles al inicio
        txtContrasena.setVisible(false);
        txtContrasena1.setVisible(false);
        txtContrasena2.setVisible(false);
    }

    // Método que maneja el evento de regresar
    @FXML
    void handleBtnRegresar(ActionEvent event) {
        // Cambiar de escena hacia la pantalla de inicio
        App.cambiarEscena("/co/edu/uniquindio/poo/Inicio.fxml", "Iniciar Sesión", event, getClass());
    }

    // Método para limpiar los campos de texto
    @FXML
    void handleBtnLimpiarCampos(ActionEvent event) {
        txtUsuario.clear();
        txtContrasena.clear();
        txtContrasena1.clear();
        txtContrasena2.clear();
        txtRespuestaSeguridad.clear();
    }

    // Método para cambiar la contraseña del usuario
    @FXML
    void handleBtnCambiarContrasena(ActionEvent event) {
        String usuario = txtUsuario.getText();
        String nuevaContrasena = txtContrasena.getText();
        String rectificarContrasena = txtContrasena1.getText();
        String respuesta = txtRespuestaSeguridad.getText();
        PreguntaSeguridad pregunta = choicePreguntaSeguridad.getValue();

        // Buscar al usuario por el nombre de usuario ingresado
        Persona usuarioEncontrado = buscarUsuario(usuario);

        if (usuarioEncontrado == null) {
            mostrarMensaje("Error", "Usuario no encontrado", AlertType.ERROR);
            return;
        }

        // Verificar la respuesta de seguridad
        boolean respuestaCorrecta = false;
        if (usuarioEncontrado instanceof Cliente) {
            respuestaCorrecta = ((Cliente) usuarioEncontrado).getPreguntaSeguridad().equals(pregunta)
                    && ((Cliente) usuarioEncontrado).getRespuesta().equals(respuesta);
        } else if (usuarioEncontrado instanceof Empleado) {
            respuestaCorrecta = ((Empleado) usuarioEncontrado).getPreguntaSeguridad().equals(pregunta)
                    && ((Empleado) usuarioEncontrado).getRespuesta().equals(respuesta);
        } else if (usuarioEncontrado instanceof Administrador) {
            respuestaCorrecta = ((Administrador) usuarioEncontrado).getPreguntaSeguridad().equals(pregunta)
                    && ((Administrador) usuarioEncontrado).getRespuesta().equals(respuesta);
        }

        if (!respuestaCorrecta) {
            mostrarMensaje("Error", "Respuesta de seguridad incorrecta", AlertType.ERROR);
            return;
        }

        // Verificar que la nueva contraseña y la rectificación coincidan
        if (!nuevaContrasena.equals(rectificarContrasena)) {
            mostrarMensaje("Error", "Las contraseñas no coinciden", AlertType.ERROR);
            return;
        }

        // Si todo está correcto, mostrar los campos de la nueva contraseña
        txtContrasena.setVisible(true);
        txtContrasena1.setVisible(true);
        txtContrasena2.setVisible(true);

        // Aquí puedes añadir más lógica para actualizar la contraseña en la base de datos o en el objeto
        mostrarMensaje("Éxito", "Contraseña cambiada con éxito", AlertType.INFORMATION);
    }

    // Método para buscar al usuario por su nombre de usuario usando el controlador RecuperarContrasenaController
    private Persona buscarUsuario(String usuario) {
        Empleado empleado = recuperarController.obtenerEmpleadoUsuario(usuario);
        if (empleado != null) {
            return empleado;
        }

        Cliente cliente = recuperarController.obtenerClienteUsuario(usuario);
        if (cliente != null) {
            return cliente;
        }

        return null;
    }

    // Método para mostrar un mensaje de alerta
    private void mostrarMensaje(String titulo, String contenido, AlertType tipo) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setContentText(contenido);
        alert.show();
    }

    // Método que aplica los efectos de hover sobre el botón de cambiar contraseña
    @FXML
    void aplicarEfectoHover(ActionEvent event) {
        btnCambiarContrasena.setStyle("-fx-background-color: black; -fx-text-fill: white;");
    }

    // Método que restaura el estilo del botón al estado inicial
    @FXML
    void restaurarEstiloBoton(ActionEvent event) {
        btnCambiarContrasena.setStyle("-fx-background-color: transparent; -fx-text-fill: black;");
    }
}
