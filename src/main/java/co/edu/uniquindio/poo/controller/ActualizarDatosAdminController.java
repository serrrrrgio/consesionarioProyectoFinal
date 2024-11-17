package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Concesionario;

public class ActualizarDatosAdminController {
    private Concesionario concesionario;

    public ActualizarDatosAdminController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public void actualizarAdmin(Administrador admin, String nombre, String apellido, String correo, String cedula,
            String telefono, String usuario, String constrasena,
            String preguntaSeguridad, String respuesta){
                concesionario.actualizarAdmin(admin, nombre, apellido, correo, cedula, telefono, usuario, constrasena, preguntaSeguridad, respuesta);
            }
}
