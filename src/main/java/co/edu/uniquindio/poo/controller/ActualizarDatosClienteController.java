package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.PreguntaSeguridad;

public class ActualizarDatosClienteController {
    private Concesionario concesionario;

    public ActualizarDatosClienteController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public boolean actualizarCliente(Cliente seleccionado, String nombre, String apellido, String correo, String cedula,
            String telefono, String usuario, String constrasena,
            PreguntaSeguridad preguntaSeguridad, String respuesta){
                return concesionario.actualizarCliente(seleccionado, nombre, apellido, correo, cedula, telefono, usuario, constrasena, preguntaSeguridad, respuesta);
            }

}

