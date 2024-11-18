package co.edu.uniquindio.poo.controller;

import java.time.LocalDate;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Vehiculo;

public class AlquilarController {
    private Concesionario concesionario;

    public AlquilarController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public boolean validarFecha(LocalDate fecha1, LocalDate fecha2){
        return concesionario.validarFechaPosterior(fecha1, fecha2);
    }

    public void eliminarVehiculo(Vehiculo vehiculo){
        concesionario.eliminarVehiculo(vehiculo);
    }

    public void agregarTransaccion(Transaccion transaccion){
        concesionario.agregarTransaccion(transaccion);
    }

    public Empleado obtenerEmpleadoAzar(){
        return concesionario.obtenerEmpleadoAleatorio();
    }
}
