package co.edu.uniquindio.poo.controller;

import java.time.LocalDate;

import co.edu.uniquindio.poo.model.Bus;
import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Combustible;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Deportivo;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.PickUp;
import co.edu.uniquindio.poo.model.Sedan;
import co.edu.uniquindio.poo.model.TipoCamion;
import co.edu.uniquindio.poo.model.TipoRegistro;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Transmision;
import co.edu.uniquindio.poo.model.Van;
import co.edu.uniquindio.poo.model.Vehiculo;

public class VenderVehiculoController {
    private Concesionario concesionario;

    public VenderVehiculoController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public boolean agregarVehiculo(Vehiculo vehiculo) {
        return concesionario.agregarVehiculo(vehiculo);
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

    public void setFondos(double fondos) {
        concesionario.setFondos(fondos);
    }

    public double getFondos() {
        return concesionario.getFondos();
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

    public Empleado obtenerEmpleadoAzar() {
        return concesionario.obtenerEmpleadoAleatorio();
    }

        public void agregarTransaccion(Transaccion transaccion){
        concesionario.agregarTransaccion(transaccion);
    }

    public void venderVehiculo(Empleado empleado, Cliente cliente, Vehiculo vehiculo, double precio,
            LocalDate fechaEntrega, LocalDate fechaDevolucion){
                concesionario.venderVehiculo(empleado, cliente, vehiculo, precio, fechaEntrega, fechaDevolucion);
            }

}
