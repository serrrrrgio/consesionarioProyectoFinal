package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.PreguntaSeguridad;

public class RegistrarseIniciarSesionController {
     private Concesionario concesionario;

    public RegistrarseIniciarSesionController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public Cliente obtenerCliente(String usuario, String contrasena){
        return concesionario.obtenerCliente(usuario, contrasena);
    }

    public Empleado obtenerEmpleado(String usuario, String contrasena){
        return concesionario.obtenerEmpleado(usuario, contrasena);
    }

    public boolean validarAdministrador(String usuario, String contrasena){
        return concesionario.validarAdministrador(usuario, contrasena);
    }

    public boolean agregarCliente(Cliente cliente){
        return concesionario.agregarCliente(cliente);
    }

    public Cliente crearCliente(String nombre, String apellido, String correo, String cedula, String telefono, String usuario, String contrasena,
                             PreguntaSeguridad preguntaSeguridad, String respuesta) {
        return concesionario.crearCliente(nombre, apellido, correo, cedula, telefono, usuario, contrasena, preguntaSeguridad, respuesta);
    }

}
