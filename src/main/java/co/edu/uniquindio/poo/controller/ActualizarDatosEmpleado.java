package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;

public class ActualizarDatosEmpleado {
    private Concesionario concesionario;

    public ActualizarDatosEmpleado(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public void actualizarEmpleado(Empleado seleccionado, String nombre, String apellido, String correo,
            String cedula, String telefono, String usuario, String contraseña,
            String preguntaSeguridad, String respuesta){
                concesionario.actualizarEmpleado(seleccionado, nombre, apellido, correo, cedula, telefono, usuario, contraseña, preguntaSeguridad, respuesta);
            }
}
