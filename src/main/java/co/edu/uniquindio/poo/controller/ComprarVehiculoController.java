package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Bus;
import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Deportivo;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.PickUp;
import co.edu.uniquindio.poo.model.Sedan;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Van;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.collections.ObservableList;

public class ComprarVehiculoController {
    private Concesionario concesionario;

    public ComprarVehiculoController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public ObservableList<Vehiculo> obtenerVehiculosVenta() {
        return concesionario.obtenerVehiculosVenta();
    }

    public ObservableList<Bus> obtenerBuses() {
        return concesionario.getBuses();
    }

    public ObservableList<Camion> obtenerCamiones() {
        return concesionario.getCamiones();
    }

    public ObservableList<Camioneta> obtenerCamionetas() {
        return concesionario.getCamionetas();
    }

    public ObservableList<Deportivo> obtenerDeportivos() {
        return concesionario.getDeportivos();
    }

    public ObservableList<Moto> obtenerMotos() {
        return concesionario.getMotos();
    }

    public ObservableList<PickUp> obtenerPickUps() {
        return concesionario.getPickUps();
    }

    public ObservableList<Sedan> obtenerSedanes() {
        return concesionario.getSedanes();
    }

    public ObservableList<Van> obtenerVans() {
        return concesionario.getVans();
    }

    public void agregarTransaccion(Transaccion transaccion) {
        concesionario.agregarTransaccion(transaccion);
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        concesionario.eliminarVehiculo(vehiculo);
    }

    public ObservableList<Vehiculo> obtenerInterseccion(ObservableList<Vehiculo> lista1,
            ObservableList<Vehiculo> lista2) {
        return concesionario.obtenerInterseccion(lista1, lista2);
    }

    public Empleado obtenerEmpleadoAzar() {
        return concesionario.obtenerEmpleadoAleatorio();
    }

    public void setFondos(double fondos) {
        concesionario.setFondos(fondos);
    }

    public double getFondos() {
        return concesionario.getFondos();
    }
}
