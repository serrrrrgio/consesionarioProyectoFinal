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
import co.edu.uniquindio.poo.App;

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

    // Listas para almacenar los usuarios
    private List<Cliente> listaClientes;
    private List<Empleado> listaEmpleados;
    private List<Administrador> listaAdministradores;

    @FXML
    void handleBtnRegresar(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/Inicio.fxml", "Iniciar Sesión", event, getClass());
    }

    @FXML
    void handleBtnLimpiarCampos(ActionEvent event) {
        txtUsuario.clear();
        txtContrasena.clear();
        txtContrasena1.clear();
        txtContrasena2.clear();
    }

    @FXML
    void handleBtnCambiarContrasena(ActionEvent event) {
        String usuario = txtUsuario.getText();
        String nuevaContrasena = txtContrasena.getText();
        String rectificarContrasena = txtContrasena1.getText();

        Persona usuarioEncontrado = buscarUsuario(usuario);
        if (usuarioEncontrado == null) {
            mostrarMensaje("Error", "Usuario no encontrado", AlertType.ERROR);
            return;
        }

        if (!nuevaContrasena.equals(rectificarContrasena)) {
            mostrarMensaje("Error", "Las contraseñas no coinciden", AlertType.ERROR);
            return;
        }

        if (usuarioEncontrado instanceof Cliente) {
            ((Cliente) usuarioEncontrado).setContrasena(nuevaContrasena);
        } else if (usuarioEncontrado instanceof Empleado) {
            ((Empleado) usuarioEncontrado).setContrasena(nuevaContrasena);
        } else if (usuarioEncontrado instanceof Administrador) {
            ((Administrador) usuarioEncontrado).setContrasena(nuevaContrasena);
        }

        mostrarMensaje("Éxito", "Contraseña actualizada correctamente", AlertType.INFORMATION);
        App.cambiarEscena("/co/edu/uniquindio/poo/IniciarSesion.fxml", "Iniciar Sesión", event, getClass());
    }

    private Persona buscarUsuario(String usuario) {
        // Asegúrate de que las listas de usuarios estén correctamente inicializadas antes de la búsqueda
        if (listaClientes != null) {
            for (Cliente cliente : listaClientes) {
                if (cliente.getUsuario().equals(usuario)) {
                    return cliente;
                }
            }
        }
        if (listaEmpleados != null) {
            for (Empleado empleado : listaEmpleados) {
                if (empleado.getUsuario().equals(usuario)) {
                    return empleado;
                }
            }
        }
        if (listaAdministradores != null) {
            for (Administrador administrador : listaAdministradores) {
                if (administrador.getUsuario().equals(usuario)) {
                    return administrador;
                }
            }
        }
        return null;
    }

    private void mostrarMensaje(String titulo, String contenido, AlertType tipo) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(contenido);
        alert.showAndWait();
    }

    // Método para inicializar las listas de usuarios (debe llamarse al cargar la escena)
    public void inicializarListas(List<Cliente> clientes, List<Empleado> empleados, List<Administrador> administradores) {
        this.listaClientes = clientes;
        this.listaEmpleados = empleados;
        this.listaAdministradores = administradores;
    }
}
