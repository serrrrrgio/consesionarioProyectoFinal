package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Bus;
import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Carro;
import co.edu.uniquindio.poo.model.Combustible;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Deportivo;
import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.PickUp;
import co.edu.uniquindio.poo.model.Sedan;
import co.edu.uniquindio.poo.model.TipoCamion;
import co.edu.uniquindio.poo.model.TipoRegistro;
import co.edu.uniquindio.poo.model.Transmision;
import co.edu.uniquindio.poo.model.Van;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.collections.ObservableList;

public class GestionarVehiculosController {
    private Concesionario concesionario;

    public GestionarVehiculosController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public ObservableList<Vehiculo> obtenerVehiculos() {
        return concesionario.getVehiculos();
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

    public ObservableList<Carro> obtenerCarros() {
        return concesionario.getCarros();
    }

    public ObservableList<Deportivo> obtenerDeportivos() {
        return concesionario.getDeportivos();
    }

    public ObservableList<Moto> obtenerMotos() {
        return concesionario.getMotos();
    }

    public ObservableList<PickUp> obtenerPickups() {
        return concesionario.getPickUps();
    }

    public ObservableList<Sedan> obtenerSedanes() {
        return concesionario.getSedanes();
    }

    public ObservableList<Van> obtenerVans() {
        return concesionario.getVans();
    }

    public boolean agregarVehiculo(Vehiculo vehiculo) {
        return concesionario.agregarVehiculo(vehiculo);
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        concesionario.eliminarVehiculo(vehiculo);
    }

    public boolean actualizarBus(Bus seleccionada, String marca, String placa, int modelo, int cambios,
            double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            double capacidadMaletero, int numeroBolsasAire, int numeroEjes,
            int numeroSalidasEmergencia, double precio, Combustible combustible, double autonomia, double tiempoCarga,
            boolean enchufable,
            boolean hibridoLigero) {
        return concesionario.actualizarBus(seleccionada, marca, placa, modelo, cambios, velocidadMaxima, cilindraje,
                tipoRegistro, transmision, estado, capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado,
                camaraReversa, capacidadMaletero, numeroBolsasAire, numeroEjes, numeroSalidasEmergencia, precio,
                combustible, autonomia, tiempoCarga, enchufable, hibridoLigero);
    }

    public boolean actualizarCamion(Camion seleccionada, String marca, String placa, int modelo, int cambios,
            double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado,
            double capacidadCarga, boolean frenosAire, int numeroEjes, TipoCamion tipoCamion, double precio,
            Combustible combustible,
            double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {
        return concesionario.actualizarCamion(seleccionada, marca, placa, modelo, cambios, velocidadMaxima, cilindraje,
                tipoRegistro, transmision, estado, capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado,
                capacidadCarga, frenosAire, numeroEjes, tipoCamion, combustible, precio, autonomia, tiempoCarga,
                enchufable, hibridoLigero);
    }

    public boolean actualizarCamioneta(Camioneta seleccionada, String marca, String placa, int modelo, int cambios,
            double velocidadMaxima, double cilindraje, TipoRegistro tipoRegistro, Transmision transmision,
            Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            double capacidadMaletero, boolean velocidadCrucero, int numeroBolsasAire, boolean sensoresColision,
            boolean sensorTraficoCruzado, boolean asistentepermanenciaCarril, boolean cuatroPorCuatro, double precio,
            Combustible combustible, double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {
        return concesionario.actualizarCamioneta(seleccionada, marca, placa, modelo, cambios, velocidadMaxima,
                cilindraje, tipoRegistro, transmision, estado, capacidadPasajeros, cantidadPuertas, abs,
                aireAcondicionado, camaraReversa, capacidadMaletero, velocidadCrucero, numeroBolsasAire,
                sensoresColision, sensorTraficoCruzado, asistentepermanenciaCarril, cuatroPorCuatro, precio,
                combustible, autonomia, tiempoCarga, enchufable, hibridoLigero);
    }

    public boolean actualizarCarro(Carro seleccionada, String marca, String placa, int modelo, int cambios,
            double velocidadMaxima, double cilindraje, TipoRegistro tipoRegistro, Transmision transmision,
            Estado estado, int capacidadPasajeros, int cantidadPuertas, boolean abs,
            boolean aireAcondicionado, boolean camaraReversa, double precio, Combustible combustible,
            double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {
        return concesionario.actualizarCarro(seleccionada, marca, placa, modelo, cambios, velocidadMaxima, cilindraje,
                tipoRegistro, transmision, estado, capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado,
                camaraReversa, precio, combustible, autonomia, tiempoCarga, enchufable, hibridoLigero);
    }

    public boolean actualizarDeportivo(Deportivo seleccionada, String marca, String placa, int modelo, int cambios,
            double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, int numeroCaballosFuerza, int numeroBolsasAire,
            double tiempoAlcanzar100kmh, double precio, Combustible combustible, double autonomia, double tiempoCarga,
            boolean enchufable, boolean hibridoLigero) {
        return concesionario.actualizarDeportivo(seleccionada, marca, placa, modelo, cambios, velocidadMaxima,
                cilindraje, tipoRegistro, transmision, estado, capacidadPasajeros, cantidadPuertas, abs,
                numeroCaballosFuerza, numeroBolsasAire, tiempoAlcanzar100kmh, precio, combustible, autonomia,
                tiempoCarga, enchufable, hibridoLigero);
    }

    public boolean actualizarMoto(Moto seleccionada, String marca, String placa, int modelo, int cambios,
            double velocidadMaxima, double cilindraje, TipoRegistro tipoRegistro, Transmision transmision,
            Estado estado, double precio,
            Combustible combustible, double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {
        return concesionario.actualizarMoto(seleccionada, marca, placa, modelo, cambios, velocidadMaxima, cilindraje,
                tipoRegistro, transmision, estado, precio, combustible, autonomia, tiempoCarga, enchufable,
                hibridoLigero);
    }

    public boolean actualizarPickUp(PickUp seleccionada, String marca, String placa, int modelo, int cambios,
            double velocidadMaxima, double cilindraje, TipoRegistro tipoRegistro, Transmision transmision,
            Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            int numeroBolsasAire, boolean cuatroPorCuatro, double capacidadCajaCarga, double precio,
            Combustible combustible,
            double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {
        return concesionario.actualizarPickUp(seleccionada, marca, placa, modelo, cambios, velocidadMaxima, cilindraje,
                tipoRegistro, transmision, estado, capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado,
                camaraReversa, numeroBolsasAire, cuatroPorCuatro, capacidadCajaCarga, precio, combustible, autonomia,
                tiempoCarga, enchufable, hibridoLigero);
    }

    public boolean actualizarSedan(Sedan seleccionada, String marca, String placa, int modelo, int cambios,
            double velocidadMaxima, double cilindraje, TipoRegistro tipoRegistro, Transmision transmision,
            Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            double capacidadMaletero, boolean velocidadCrucero, int numeroBolsasAire,
            boolean sensoresColision, boolean sensorTraficoCruzado, boolean asistentePermanenciaCarril, double precio,
            Combustible combustible, double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {
        return concesionario.actualizarSedan(seleccionada, marca, placa, modelo, cambios, velocidadMaxima, cilindraje,
                tipoRegistro, transmision, estado, capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado,
                camaraReversa, capacidadMaletero, velocidadCrucero, numeroBolsasAire, sensoresColision,
                sensorTraficoCruzado, asistentePermanenciaCarril, precio, combustible, autonomia, tiempoCarga,
                enchufable, hibridoLigero);
    }

    public boolean actualizarVan(Van seleccionada, String marca, String placa, int modelo, int cambios,
            double velocidadMaxima, double cilindraje, TipoRegistro tipoRegistro, Transmision transmision,
            Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            double capacidadMaletero, int bolsasAire, double precio, Combustible combustible, double autonomia,
            double tiempoCarga,
            boolean enchufable, boolean hibridoLigero) {
        return concesionario.actualizarVan(seleccionada, marca, placa, modelo, cambios, velocidadMaxima, cilindraje,
                tipoRegistro, transmision, estado, capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado,
                camaraReversa, capacidadMaletero, bolsasAire, precio, combustible, autonomia, tiempoCarga, enchufable,
                hibridoLigero);
    }

    public Deportivo crearDeportivo(String marca, String placa, int modelo, int cambios, double velocidadMaxima,
            double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, int numeroCaballosFuerza, int numeroBolsasAire,
            double tiempoAlcanzar100kmh, double precio, Combustible combustible, double autonomia, double tiempoCarga,
            boolean enchufable, boolean hibridoLigero) {

        return new Deportivo(marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision,
                estado, capacidadPasajeros, cantidadPuertas, abs, numeroCaballosFuerza, numeroBolsasAire,
                tiempoAlcanzar100kmh, precio, combustible, autonomia, tiempoCarga, enchufable, hibridoLigero);
    }

    public Sedan crearSedan(String marca, String placa, int modelo, int cambios, double velocidadMaxima,
            double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            double capacidadMaletero, boolean velocidadCrucero, int numeroBolsasAire,
            boolean sensoresColision, boolean sensorTraficoCruzado, boolean asistentePermanenciaCarril, double precio,
            Combustible combustible, double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {

        return new Sedan(marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado,
                capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, camaraReversa, capacidadMaletero,
                velocidadCrucero,
                numeroBolsasAire, sensoresColision, sensorTraficoCruzado, asistentePermanenciaCarril, precio,
                combustible,
                autonomia, tiempoCarga, enchufable, hibridoLigero);
    }

    public PickUp crearPickUp(String marca, String placa, int modelo, int cambios, double velocidadMaxima,
            double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            int numeroBolsasAire, boolean cuatroPorCuatro, double capacidadCajaCarga, double precio,
            Combustible combustible,
            double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {

        return new PickUp(marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado,
                capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, camaraReversa, numeroBolsasAire,
                cuatroPorCuatro,
                capacidadCajaCarga, precio, combustible, autonomia, tiempoCarga, enchufable, hibridoLigero);
    }

    public Van crearVan(String marca, String placa, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            double capacidadMaletero, int bolsasAire, double precio, Combustible combustible, double autonomia,
            double tiempoCarga,
            boolean enchufable, boolean hibridoLigero) {

        return new Van(marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado,
                capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, camaraReversa, capacidadMaletero,
                bolsasAire,
                precio, combustible, autonomia, tiempoCarga, enchufable, hibridoLigero);
    }

    public Camioneta crearCamioneta(String marca, String placa, int modelo, int cambios, double velocidadMaxima,
            double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            double capacidadMaletero, boolean velocidadCrucero, int numeroBolsasAire,
            boolean sensoresColision, boolean sensorTraficoCruzado, boolean asistentepermanenciaCarril,
            boolean cuatroPorCuatro, double precio, Combustible combustible, double autonomia,
            double tiempoCarga, boolean enchufable,
            boolean hibridoLigero) {

        return new Camioneta(marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision,
                estado, capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, camaraReversa, capacidadMaletero,
                velocidadCrucero, numeroBolsasAire, sensoresColision, sensorTraficoCruzado, asistentepermanenciaCarril,
                cuatroPorCuatro, precio, combustible, autonomia, tiempoCarga, enchufable, hibridoLigero);
    }

    public Camion crearCamion(String marca, String placa, int modelo, int cambios, double velocidadMaxima,
            double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado,
            double capacidadCarga, boolean frenosAire, int numeroEjes, TipoCamion tipoCamion, double precio,
            Combustible combustible,
            double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {

        return new Camion(marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado,
                capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, capacidadCarga, frenosAire, numeroEjes,
                tipoCamion, precio, combustible, autonomia, tiempoCarga, enchufable, hibridoLigero);
    }

    public Moto crearMoto(String marca, String placa, int modelo, int cambios, double velocidadMaxima,
            double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, double precio, Combustible combustible,
            double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {

        return new Moto(marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado,
                precio, combustible, autonomia, tiempoCarga, enchufable, hibridoLigero);

    }

    public Bus crearBus(String marca, String placa, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            double capacidadMaletero, int numeroBolsasAire, int numeroEjes,
            int numeroSalidasEmergencia, double precio, Combustible combustible, double autonomia, double tiempoCarga,
            boolean enchufable,
            boolean hibridoLigero) {

        return new Bus(marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado,
                capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, camaraReversa, capacidadMaletero,
                numeroBolsasAire, numeroEjes, numeroSalidasEmergencia, precio, combustible, autonomia, tiempoCarga,
                enchufable, hibridoLigero);
    }
}