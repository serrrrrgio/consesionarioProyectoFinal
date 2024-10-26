package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Concesionario;

public class ClienteController {
    
    private Concesionario concesionario;

    public ClienteController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    /**
     * Método para crear un nuevo cliente.
     */
    public void crearCliente(String nombre, String apellido, String correo, String cedula, String telefono, String usuario, String contraseña,
                             String preguntaSeguridad, String respuesta) {
        concesionario.crearCliente(nombre, apellido, correo, cedula, telefono, usuario, contraseña, preguntaSeguridad, respuesta);
    }

    /**
     * Método para eliminar un cliente.
     */
    public void eliminarCliente(String usuario) {
        concesionario.eliminarCliente(usuario);
    }

    /**
     * Método para actualizar un cliente.
     */
    public void actualizarCliente(String usuario, String nuevoNombre, String nuevoApellido, String nuevoCorreo, String nuevoTelefono) {
        concesionario.actualizarCliente(usuario, nuevoNombre, nuevoApellido, nuevoCorreo, nuevoTelefono);
    }

    /**
     * Método para verificar la existencia de un cliente.
     */
    public boolean verificarCliente(String usuario) {
        return concesionario.verificarCliente(usuario);
    }
}
