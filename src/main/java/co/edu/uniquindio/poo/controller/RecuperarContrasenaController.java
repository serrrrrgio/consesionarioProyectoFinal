package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;

public class RecuperarContrasenaController {
    private Concesionario concesionario;

    public RecuperarContrasenaController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public Empleado obtenerEmpleadoUsuario(String usuario){
        return concesionario.obtenerEmpleadoUsuario(usuario);
    }

    public Cliente obtenerClienteUsuario(String usuario){
        return concesionario.obtenerClienteUsuario(usuario);
    }


}
