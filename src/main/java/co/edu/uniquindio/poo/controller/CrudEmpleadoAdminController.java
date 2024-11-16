package co.edu.uniquindio.poo.controller;

import java.time.LocalDate;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Transaccion;
import javafx.collections.ObservableList;

public class CrudEmpleadoAdminController {
    private Concesionario concesionario;

    public CrudEmpleadoAdminController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public ObservableList<Transaccion> verTransaccionesEmpleado(Empleado empleado, LocalDate fecha1, LocalDate fecha2){
        return concesionario.verTransaccionesEmpleado(empleado, fecha1, fecha2);
    }

    public boolean actualizarEmpleado(Empleado seleccionado, String nombre, String apellido, String correo,
            String cedula, String telefono, String usuario, String contraseña,
            String preguntaSeguridad, String respuesta){
            return concesionario.actualizarEmpleado(seleccionado, nombre, apellido, correo, cedula, telefono, usuario, contraseña, preguntaSeguridad, respuesta);
    }

    public void eliminarEmpleado(Empleado empleado){
        concesionario.eliminarEmpleado(empleado);
    }

    public Empleado crearEmpleado(String nombre, String apellido, String correo, String cedula, String telefono,
            String usuario,
            String contraseña,
            String preguntaSeguridad, String respuesta, double salario){
                return concesionario.crearEmpleado(nombre, apellido, correo, cedula, telefono, usuario, contraseña, preguntaSeguridad, respuesta, salario);
            }

    public boolean agregarEmpleado(Empleado empleado){
        return concesionario.agregarEmpleado(empleado);
    }

    public ObservableList<Empleado> obtenerEmpleados(){
        return concesionario.getEmpleados();
    }
}
