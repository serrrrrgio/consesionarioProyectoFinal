package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.collections.ObservableList;

public class ComprarVehiculoController {
    private Concesionario concesionario;

    public ComprarVehiculoController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public ObservableList<Vehiculo> obtenerVehiculosVenta(){
        return concesionario.obtenerVehiculosVenta();
    }

    public void agregarTransaccion(Transaccion transaccion){
        concesionario.agregarTransaccion(transaccion);
    }

    public void eliminarVehiculo(Vehiculo vehiculo){
        concesionario.eliminarVehiculo(vehiculo);
    }

    public ObservableList<Vehiculo> obtenerInterseccion(ObservableList<Vehiculo> lista1, ObservableList<Vehiculo> lista2){
        return concesionario.obtenerInterseccion(lista1, lista2);
    }
}
