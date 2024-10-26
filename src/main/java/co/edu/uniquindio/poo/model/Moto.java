package co.edu.uniquindio.poo.model;

public class Moto extends Vehiculo {

    /**
     * Constructor para moto a gasolina o diesel
     */
    public Moto(String marca, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible);
    }

    /**
     * Constructor para moto eléctrica
     */
    public Moto(String marca, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible,
            double autonomia, double tiempoCarga) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible,
                autonomia, tiempoCarga);
    }

    /**
     * Constructor para moto híbrida
     */
    public Moto(String marca, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible,
            boolean enchufable, boolean hibridoLigero) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible,
                enchufable, hibridoLigero);
    }
}
