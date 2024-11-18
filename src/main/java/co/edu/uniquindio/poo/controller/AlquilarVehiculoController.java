package co.edu.uniquindio.poo.controller;

import java.time.LocalDate;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.collections.ObservableList;

public class AlquilarVehiculoController {
        private Concesionario concesionario;

    public AlquilarVehiculoController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public ObservableList<Vehiculo> obtenerVehiculosAlquiler(){
        return concesionario.obtenerVehiculosAlquiler();
    }

    public void agregarTransaccion(Transaccion transaccion){
        concesionario.agregarTransaccion(transaccion);
    }

    public void eliminarVehiculo(Vehiculo vehiculo){
        concesionario.eliminarVehiculo(vehiculo);
    }

    public boolean validarFechaPosterior(LocalDate fecha1, LocalDate fecha2){
        return concesionario.validarFechaPosterior(fecha1, fecha2);
    }
    
    public int calcularDias(LocalDate fecha1, LocalDate fecha2){
        return concesionario.calcularDias(fecha1, fecha2);
    }

    public ObservableList<Vehiculo> obtenerInterseccion(ObservableList<Vehiculo> lista1, ObservableList<Vehiculo> lista2){
        return concesionario.obtenerInterseccion(lista1, lista2);
    }

        public Empleado obtenerEmpleadoAzar(){
        return concesionario.obtenerEmpleadoAleatorio();
    }
    
}