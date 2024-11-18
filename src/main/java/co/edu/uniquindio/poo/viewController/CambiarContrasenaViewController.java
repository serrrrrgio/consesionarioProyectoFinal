package co.edu.uniquindio.poo.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert.AlertType;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Persona;
import co.edu.uniquindio.poo.model.PreguntaSeguridad;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.RecuperarContrasenaController;

public class CambiarContrasenaViewController {

    @FXML
    private Button btnRegresar;

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private ImageView backgroundImage;

    @FXML
    private Button btnCambiarContrasena;

    @FXML
    private PasswordField txtContrasena1;

    @FXML
    private PasswordField txtRespuestaSeguridad;

    @FXML
    private TextField txtUsuario;

    @FXML
    private Button btnLimpiarCampos;

    @FXML
    private ChoiceBox<PreguntaSeguridad> choicePreguntaSeguridad; // Nombre corregido

    private RecuperarContrasenaController recuperarController;

    @FXML
    private void initialize() {
        System.out.println("Inicializando CambiarContrasenaViewController...");
        recuperarController = new RecuperarContrasenaController(App.getConcesionario());

        // Ocultar los campos de contraseña al iniciar
        txtContrasena.setVisible(false);
        txtContrasena1.setVisible(false);

        // Verificar si el ChoiceBox es nulo
        if (choicePreguntaSeguridad == null) {
            System.out.println("El ChoiceBox es nulo. Verifique el archivo FXML.");
            return;
        }

        // Agregar las opciones del enum al ChoiceBox
        choicePreguntaSeguridad.getItems().addAll(PreguntaSeguridad.values());
        System.out.println("ChoiceBox inicializado correctamente con las preguntas de seguridad.");
    }

    @FXML
    void handleBtnRegresar(ActionEvent event) {
        System.out.println("Botón 'Regresar' presionado");
        App.cambiarEscena("/co/edu/uniquindio/poo/Inicio.fxml", "Iniciar Sesión", event, getClass());
    }

    @FXML
    void handleBtnLimpiarCampos(ActionEvent event) {
        System.out.println("Limpiando campos de texto...");
        txtUsuario.clear();
        txtContrasena.clear();
        txtContrasena1.clear();
        txtRespuestaSeguridad.clear();
        choicePreguntaSeguridad.getSelectionModel().clearSelection(); // Limpiar selección
    }

    @FXML
    void handleBtnCambiarContrasena(ActionEvent event) {
        System.out.println("Botón 'Cambiar Contraseña' presionado");

        String usuario = txtUsuario.getText();
        String nuevaContrasena = txtContrasena.getText();
        String rectificarContrasena = txtContrasena1.getText();
        String respuesta = txtRespuestaSeguridad.getText();
        PreguntaSeguridad pregunta = choicePreguntaSeguridad.getValue(); // Obtener pregunta seleccionada

        if (pregunta == null) {
            System.out.println("No se ha seleccionado ninguna pregunta de seguridad");
            mostrarMensaje("Error", "Debe seleccionar una pregunta de seguridad", AlertType.ERROR);
            return;
        }

        System.out.println("Usuario ingresado: " + usuario);
        Persona usuarioEncontrado = buscarUsuario(usuario);

        if (usuarioEncontrado == null) {
            System.out.println("Usuario no encontrado");
            mostrarMensaje("Error", "Usuario no encontrado", AlertType.ERROR);
            return;
        }
        System.out.println("Usuario encontrado: " + usuarioEncontrado.getClass().getSimpleName());

        boolean respuestaCorrecta = verificarRespuestaSeguridad(usuarioEncontrado, pregunta, respuesta);

        if (!respuestaCorrecta) {
            System.out.println("Respuesta de seguridad incorrecta");
            mostrarMensaje("Error", "Respuesta de seguridad incorrecta", AlertType.ERROR);
            return;
        }

        if (!nuevaContrasena.equals(rectificarContrasena)) {
            System.out.println("Las contraseñas no coinciden");
            mostrarMensaje("Error", "Las contraseñas no coinciden", AlertType.ERROR);
            return;
        }

        System.out.println("Contraseña cambiada con éxito");
        txtContrasena.setVisible(true);
        txtContrasena1.setVisible(true);

        mostrarMensaje("Éxito", "Contraseña cambiada con éxito", AlertType.INFORMATION);
    }

    private Persona buscarUsuario(String usuario) {
        System.out.println("Buscando usuario: " + usuario);
        Empleado empleado = recuperarController.obtenerEmpleadoUsuario(usuario);
        if (empleado != null) {
            System.out.println("Empleado encontrado");
            return empleado;
        }

        Cliente cliente = recuperarController.obtenerClienteUsuario(usuario);
        if (cliente != null) {
            System.out.println("Cliente encontrado");
            return cliente;
        }

        System.out.println("Usuario no encontrado en el sistema");
        return null;
    }

    private boolean verificarRespuestaSeguridad(Persona usuario, PreguntaSeguridad pregunta, String respuesta) {
        System.out.println("Verificando respuesta de seguridad...");
        if (usuario instanceof Cliente) {
            return ((Cliente) usuario).getPreguntaSeguridad().equals(pregunta)
                    && ((Cliente) usuario).getRespuesta().equals(respuesta);
        } else if (usuario instanceof Empleado) {
            return ((Empleado) usuario).getPreguntaSeguridad().equals(pregunta)
                    && ((Empleado) usuario).getRespuesta().equals(respuesta);
        } else if (usuario instanceof Administrador) {
            return ((Administrador) usuario).getPreguntaSeguridad().equals(pregunta)
                    && ((Administrador) usuario).getRespuesta().equals(respuesta);
        }
        return false;
    }

    private void mostrarMensaje(String titulo, String contenido, AlertType tipo) {
        System.out.println("Mostrando mensaje: " + titulo + " - " + contenido);
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setContentText(contenido);
        alert.show();
    }
}
