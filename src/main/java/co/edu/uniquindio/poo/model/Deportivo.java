package co.edu.uniquindio.poo.model;

public class Deportivo extends Carro {
    private int numeroCaballosFuerza;
    private int numeroBolsasAire;
    private double tiempoAlcanzar100kmh;

    /**
     * Constructor Combustible o Diesel
     */

    public Deportivo(String marca, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, int numeroCaballosFuerza, int numeroBolsasAire, double tiempoAlcanzar100kmh) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible,
                capacidadPasajeros, cantidadPuertas, abs, false, false);
        this.numeroCaballosFuerza = numeroCaballosFuerza;
        this.numeroBolsasAire = numeroBolsasAire;
        this.tiempoAlcanzar100kmh = tiempoAlcanzar100kmh;
    }

    /**
     * Constructor Electrico
     */

    public Deportivo(String marca, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible,
            double autonomia, double tiempoCarga, int capacidadPasajeros, int cantidadPuertas, boolean abs, int numeroCaballosFuerza, int numeroBolsasAire,
            double tiempoAlcanzar100kmh) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible,
                autonomia, tiempoCarga, capacidadPasajeros, cantidadPuertas, abs, false, false);
        this.numeroCaballosFuerza = numeroCaballosFuerza;
        this.numeroBolsasAire = numeroBolsasAire;
        this.tiempoAlcanzar100kmh = tiempoAlcanzar100kmh;
    }

    /**
     * Constructor Hibrido
     */

    public Deportivo(String marca, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible,
            boolean enchufable, boolean hibridoLigero, int capacidadPasajeros, int cantidadPuertas, boolean abs, int numeroCaballosFuerza, int numeroBolsasAire,
            double tiempoAlcanzar100kmh) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible,
                enchufable, hibridoLigero, capacidadPasajeros, cantidadPuertas, abs, false, false);
        this.numeroCaballosFuerza = numeroCaballosFuerza;
        this.numeroBolsasAire = numeroBolsasAire;
        this.tiempoAlcanzar100kmh = tiempoAlcanzar100kmh;
    }

    /**
     * Getters y Setters
     */

    public int getNumeroCaballosFuerza() {
        return numeroCaballosFuerza;
    }

    public void setNumeroCaballosFuerza(int numeroCaballosFuerza) {
        this.numeroCaballosFuerza = numeroCaballosFuerza;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public double getTiempoAlcanzar100kmh() {
        return tiempoAlcanzar100kmh;
    }

    public void setTiempoAlcanzar100kmh(double tiempoAlcanzar100kmh) {
        this.tiempoAlcanzar100kmh = tiempoAlcanzar100kmh;
    }

    /**
     * toString
     */

    @Override
    public String toString() {
        return "Deportivo: " + super.toString() + " Numero caballos Fuerza: " + numeroCaballosFuerza
                + ", numeroBolsasAire=" + numeroBolsasAire + ", tiempoAlcanzar100kmh=" + tiempoAlcanzar100kmh + "]";
    }

}
