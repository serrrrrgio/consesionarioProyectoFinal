package co.edu.uniquindio.poo.model;

public class Moto extends Vehiculo {

    /**
     * Constructor para moto a gasolina o diesel
     */
    public Moto(String marca, String placa, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, double precio, Combustible combustible,
            double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {
        super(marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, precio, combustible, autonomia, tiempoCarga, enchufable, hibridoLigero);
    }
}
