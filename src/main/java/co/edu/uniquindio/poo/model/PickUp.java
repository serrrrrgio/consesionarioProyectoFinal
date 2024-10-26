package co.edu.uniquindio.poo.model;

public class PickUp extends Carro{

    /**
     * Se declaran las variables
     */
    private int numeroBolsasAire;
    private boolean cuatroPorCuatro;
    private double capacidadCajaCarga;

    /**
     * Constructor para PickUp a gasolina o diesel
     */

    public PickUp(String marca, String placa, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            int numeroBolsasAire, boolean cuatroPorCuatro, double capacidadCajaCarga) {
        super(marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible,
                capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, camaraReversa);
        this.numeroBolsasAire = numeroBolsasAire;
        this.cuatroPorCuatro = cuatroPorCuatro;
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    /**
     * Constructor para PickUp Electrico
     */

    public PickUp(String marca, String placa, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible,
            double autonomia, double tiempoCarga, int capacidadPasajeros, int cantidadPuertas, boolean abs,
            boolean aireAcondicionado, boolean camaraReversa, int numeroBolsasAire, boolean cuatroPorCuatro,
            double capacidadCajaCarga) {
        super(marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible,
                autonomia, tiempoCarga, capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, camaraReversa);
        this.numeroBolsasAire = numeroBolsasAire;
        this.cuatroPorCuatro = cuatroPorCuatro;
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    /**
     * Constructor para PickUP Hibrido
     */

    public PickUp(String marca, String placa, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible,
            boolean enchufable, boolean hibridoLigero, int capacidadPasajeros, int cantidadPuertas, boolean abs,
            boolean aireAcondicionado, boolean camaraReversa, int numeroBolsasAire, boolean cuatroPorCuatro,
            double capacidadCajaCarga) {
        super(marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible,
                enchufable, hibridoLigero, capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, camaraReversa);
        this.numeroBolsasAire = numeroBolsasAire;
        this.cuatroPorCuatro = cuatroPorCuatro;
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    /**
     * Getters y Setters
     */

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }
    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }
    public boolean isCuatroPorCuatro() {
        return cuatroPorCuatro;
    }
    public void setCuatroPorCuatro(boolean cuatroPorCuatro) {
        this.cuatroPorCuatro = cuatroPorCuatro;
    }
    public double getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }
    public void setCapacidadCajaCarga(double capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }


    



    
}
