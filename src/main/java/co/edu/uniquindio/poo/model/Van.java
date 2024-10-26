package co.edu.uniquindio.poo.model;

public class Van extends Carro {
    private double capacidadMaletero;
    private boolean camaraReversa;
    private int bolsasAire;

    /**
     * Constructor Combustible o Diesel
     */

    public Van(String marca, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado,
            double capacidadMaletero, boolean camaraReversa, int bolsasAire) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible,
                capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado);
        this.capacidadMaletero = capacidadMaletero;
        this.camaraReversa = camaraReversa;
        this.bolsasAire = bolsasAire;
    }

    /**
     * Constructor Electrico
     */

    public Van(String marca, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible,
            double autonomia, double tiempoCarga, int capacidadPasajeros, int cantidadPuertas, boolean abs,
            boolean aireAcondicionado, double capacidadMaletero, boolean camaraReversa, int bolsasAire) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible,
                autonomia, tiempoCarga, capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado);
        this.capacidadMaletero = capacidadMaletero;
        this.camaraReversa = camaraReversa;
        this.bolsasAire = bolsasAire;
    }

    /**
     * Constructor Hibrido
     */

    public Van(String marca, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible,
            boolean enchufable, boolean hibridoLigero, int capacidadPasajeros, int cantidadPuertas, boolean abs,
            boolean aireAcondicionado, double capacidadMaletero, boolean camaraReversa, int bolsasAire) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible,
                enchufable, hibridoLigero, capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado);
        this.capacidadMaletero = capacidadMaletero;
        this.camaraReversa = camaraReversa;
        this.bolsasAire = bolsasAire;
    }

    /**
     * Constructor getters y Setters
     */

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public int getBolsasAire() {
        return bolsasAire;
    }

    public void setBolsasAire(int bolsasAire) {
        this.bolsasAire = bolsasAire;
    }

    /**
     * toString
     */

    @Override
    public String toString() {
        return "Van: " + super.toString() + "capacidad Maletero: " + capacidadMaletero + ", camaraReversa="
                + camaraReversa + ", bolsasAire="
                + bolsasAire + "]";
    }

}
