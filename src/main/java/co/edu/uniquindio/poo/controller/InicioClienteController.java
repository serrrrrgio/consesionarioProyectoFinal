package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Cliente;

public class InicioClienteController {
    
    private Concesionario concesionario;

    public InicioClienteController(Concesionario concesionario) {
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
    public void eliminarCliente(Cliente cliente) {
        concesionario.eliminarCliente(cliente);
    }

    /**
     * Método para actualizar un cliente.
     */
    public boolean actualizarCliente(Cliente seleccionado, String nombre, String apellido, String correo, String cedula, String telefono, String usuario, String contraseña,
    String preguntaSeguridad, String respuesta) {
        return concesionario.actualizarCliente(seleccionado, nombre, apellido, correo, cedula, telefono, usuario, contraseña, preguntaSeguridad, respuesta);
    }
    
    /**
     * Método para agregar un cliente.
     */
     public boolean agragarCliente(Cliente cliente){
        return concesionario.agregarCliente(cliente);
     }
}
