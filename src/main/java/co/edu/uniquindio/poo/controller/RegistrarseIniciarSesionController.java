package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;

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

}
