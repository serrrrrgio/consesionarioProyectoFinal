package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.PreguntaSeguridad;

public class ActualizarDatosEmpleado {
    private Concesionario concesionario;

    public ActualizarDatosEmpleado(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public void actualizarEmpleado(Empleado seleccionado, String nombre, String apellido, String correo,
            String cedula, String telefono, String usuario, String contrasena,
            PreguntaSeguridad preguntaSeguridad, String respuesta){
                concesionario.actualizarEmpleado(seleccionado, nombre, apellido, correo, cedula, telefono, usuario, contrasena, preguntaSeguridad, respuesta);
            }
}
