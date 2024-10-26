package co.edu.uniquindio.poo.model;

    /**
     * Se declaran las variables
    */
public class Bus extends Carro {
    private double capacidadMaletero;
    private double camaraReversa;
    private int numeroBolsasAire;
    private int numeroEjes;
    private int numeroSalidasEmergencia;

    /**
     * Variables extras del bus eléctrico
    */
    public double autonomia;
    public double tiempoCarga;

    /**
     * Variables extras del bus híbrido
    */
    public boolean enchufable;
    public boolean hibridoLigero;

    /**
    * Constructor para un bus a diesel o gasolina
    */
    public Bus(String marca, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado,
            double capacidadMaletero, double camaraReversa, int numeroBolsasAire, int numeroEjes,
            int numeroSalidasEmergencia, double autonomia, double tiempoCarga, boolean enchufable,
            boolean hibridoLigero) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible,
                capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado);
        this.capacidadMaletero = capacidadMaletero;
        this.camaraReversa = camaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
        this.autonomia = autonomia;
        this.tiempoCarga = tiempoCarga;
        this.enchufable = enchufable;
        this.hibridoLigero = hibridoLigero;
    }
    /**
    * Constructor para un bus eléctrico
    */
    public Bus(String marca, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible,
            double autonomia, double tiempoCarga, int capacidadPasajeros, int cantidadPuertas, boolean abs,
            boolean aireAcondicionado, double capacidadMaletero, double camaraReversa, int numeroBolsasAire,
            int numeroEjes, int numeroSalidasEmergencia, double autonomia2, double tiempoCarga2, boolean enchufable,
            boolean hibridoLigero) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible,
                autonomia, tiempoCarga, capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado);
        this.capacidadMaletero = capacidadMaletero;
        this.camaraReversa = camaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
        autonomia = autonomia2;
        tiempoCarga = tiempoCarga2;
        this.enchufable = enchufable;
        this.hibridoLigero = hibridoLigero;
    }

/**
 * Constructor para un bus híbrido
*/
    public Bus(String marca, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible,
            boolean enchufable, boolean hibridoLigero, int capacidadPasajeros, int cantidadPuertas, boolean abs,
            boolean aireAcondicionado, double capacidadMaletero, double camaraReversa, int numeroBolsasAire,
            int numeroEjes, int numeroSalidasEmergencia, double autonomia, double tiempoCarga, boolean enchufable2,
            boolean hibridoLigero2) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible,
                enchufable, hibridoLigero, capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado);
        this.capacidadMaletero = capacidadMaletero;
        this.camaraReversa = camaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
        this.autonomia = autonomia;
        this.tiempoCarga = tiempoCarga;
        enchufable = enchufable2;
        hibridoLigero = hibridoLigero2;
    }

/**
 * Getters y setters
*/

public double getCapacidadMaletero() {
    return capacidadMaletero;
}
public void setCapacidadMaletero(double capacidadMaletero) {
    this.capacidadMaletero = capacidadMaletero;
}
public double getCamaraReversa() {
    return camaraReversa;
}
public void setCamaraReversa(double camaraReversa) {
    this.camaraReversa = camaraReversa;
}
public int getNumeroBolsasAire() {
    return numeroBolsasAire;
}
public void setNumeroBolsasAire(int numeroBolsasAire) {
    this.numeroBolsasAire = numeroBolsasAire;
}
public int getNumeroEjes() {
    return numeroEjes;
}
public void setNumeroEjes(int numeroEjes) {
    this.numeroEjes = numeroEjes;
}
public int getNumeroSalidasEmergencia() {
    return numeroSalidasEmergencia;
}
public void setNumeroSalidasEmergencia(int numeroSalidasEmergencia) {
    this.numeroSalidasEmergencia = numeroSalidasEmergencia;
}
public double getAutonomia() {
    return autonomia;
}
public void setAutonomia(double autonomia) {
    this.autonomia = autonomia;
}
public double getTiempoCarga() {
    return tiempoCarga;
}
public void setTiempoCarga(double tiempoCarga) {
    this.tiempoCarga = tiempoCarga;
}
public boolean isEnchufable() {
    return enchufable;
}
public void setEnchufable(boolean enchufable) {
    this.enchufable = enchufable;
}
public boolean isHibridoLigero() {
    return hibridoLigero;
}
public void setHibridoLigero(boolean hibridoLigero) {
    this.hibridoLigero = hibridoLigero;
}

/**
 * toString de Bus
*/
@Override
public String toString() {
    return "Bus" + super.toString() + "[capacidadMaletero=" + capacidadMaletero + ", camaraReversa=" + camaraReversa + ", numeroBolsasAire="
            + numeroBolsasAire + ", numeroEjes=" + numeroEjes + ", numeroSalidasEmergencia=" + numeroSalidasEmergencia
            + ", autonomia=" + autonomia + ", tiempoCarga=" + tiempoCarga + ", enchufable=" + enchufable
            + ", hibridoLigero=" + hibridoLigero + "]";
}







    






    
}