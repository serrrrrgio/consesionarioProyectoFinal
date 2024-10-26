package co.edu.uniquindio.poo.model;

public class Carro extends Vehiculo {
    public int capacidadPasajeros;
    public int cantidadPuertas;
    public boolean abs;
    public boolean aireAcondicionado;
    private boolean camaraReversa;

    public Carro(String marca, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado,
            boolean camaraReversa) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible);
        this.capacidadPasajeros = capacidadPasajeros;
        this.cantidadPuertas = cantidadPuertas;
        this.abs = abs;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
    }

    public Carro(String marca, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible,
            double autonomia, double tiempoCarga, int capacidadPasajeros, int cantidadPuertas, boolean abs,
            boolean aireAcondicionado, boolean camaraReversa) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible,
                autonomia, tiempoCarga);
        this.capacidadPasajeros = capacidadPasajeros;
        this.cantidadPuertas = cantidadPuertas;
        this.abs = abs;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
    }

    public Carro(String marca, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible,
            boolean enchufable, boolean hibridoLigero, int capacidadPasajeros, int cantidadPuertas, boolean abs,
            boolean aireAcondicionado, boolean camaraReversa) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible,
                enchufable, hibridoLigero);
        this.capacidadPasajeros = capacidadPasajeros;
        this.cantidadPuertas = cantidadPuertas;
        this.abs = abs;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }
}
