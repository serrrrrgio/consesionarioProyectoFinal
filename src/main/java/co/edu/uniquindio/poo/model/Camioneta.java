package co.edu.uniquindio.poo.model;

public class Camioneta extends Carro {
    /**
    * Se declaran las variables
    */
    private double capacidadMaletero;
    private boolean camaraReversa;
    private double velocidadCrucero;
    private int numeroBolsasAire;
    private boolean sensoresColision;
    private boolean sensorTraficoCruzado;
    private boolean asistentePermanenteCarril;
    private boolean cuatroPorCuatro;

/**
 * Constructor para una camioneta a diesel o gasolina
*/
    public Camioneta(String marca, int modelo, int cambios, double velocidadMaxima, double cilindraje,
        TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible,
        int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado,
        double capacidadMaletero, boolean camaraReversa, double velocidadCrucero, int numeroBolsasAire,
        boolean sensoresColision, boolean sensorTraficoCruzado, boolean asistentePermanenteCarril,
        boolean cuatroPorCuatro) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible,
                capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado);
        this.capacidadMaletero = capacidadMaletero;
        this.camaraReversa = camaraReversa;
        this.velocidadCrucero = velocidadCrucero;
        this.numeroBolsasAire = numeroBolsasAire;
        this.sensoresColision = sensoresColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistentePermanenteCarril = asistentePermanenteCarril;
        this.cuatroPorCuatro = cuatroPorCuatro;
    }

/**
 * Constructor para una camioneta eléctrica
 */
public Camioneta(String marca, int modelo, int cambios, double velocidadMaxima, double cilindraje,
        TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible, double autonomia,
        double tiempoCarga, int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado,
        double capacidadMaletero, boolean camaraReversa, double velocidadCrucero, int numeroBolsasAire,
        boolean sensoresColision, boolean sensorTraficoCruzado, boolean asistentePermanenteCarril,
        boolean cuatroPorCuatro) {
    super(marca, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible,
            autonomia, tiempoCarga, capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado);
    this.capacidadMaletero = capacidadMaletero;
    this.camaraReversa = camaraReversa;
    this.velocidadCrucero = velocidadCrucero;
    this.numeroBolsasAire = numeroBolsasAire;
    this.sensoresColision = sensoresColision;
    this.sensorTraficoCruzado = sensorTraficoCruzado;
    this.asistentePermanenteCarril = asistentePermanenteCarril;
    this.cuatroPorCuatro = cuatroPorCuatro;
}


/**
 * Constructor para una camioneta híbrida
 */
public Camioneta(String marca, int modelo, int cambios, double velocidadMaxima, double cilindraje,
        TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible, boolean enchufable,
        boolean hibridoLigero, int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado,
        double capacidadMaletero, boolean camaraReversa, double velocidadCrucero, int numeroBolsasAire,
        boolean sensoresColision, boolean sensorTraficoCruzado, boolean asistentePermanenteCarril,
        boolean cuatroPorCuatro) {
    super(marca, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado, combustible,
            enchufable, hibridoLigero, capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado);
    this.capacidadMaletero = capacidadMaletero;
    this.camaraReversa = camaraReversa;
    this.velocidadCrucero = velocidadCrucero;
    this.numeroBolsasAire = numeroBolsasAire;
    this.sensoresColision = sensoresColision;
    this.sensorTraficoCruzado = sensorTraficoCruzado;
    this.asistentePermanenteCarril = asistentePermanenteCarril;
    this.cuatroPorCuatro = cuatroPorCuatro;
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

public boolean isCamaraReversa() {
    return camaraReversa;
}

public void setCamaraReversa(boolean camaraReversa) {
    this.camaraReversa = camaraReversa;
}

public double getVelocidadCrucero() {
    return velocidadCrucero;
}

public void setVelocidadCrucero(double velocidadCrucero) {
    this.velocidadCrucero = velocidadCrucero;
}

public int getNumeroBolsasAire() {
    return numeroBolsasAire;
}

public void setNumeroBolsasAire(int numeroBolsasAire) {
    this.numeroBolsasAire = numeroBolsasAire;
}

public boolean isSensoresColision() {
    return sensoresColision;
}

public void setSensoresColision(boolean sensoresColision) {
    this.sensoresColision = sensoresColision;
}

public boolean isSensorTraficoCruzado() {
    return sensorTraficoCruzado;
}

public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
    this.sensorTraficoCruzado = sensorTraficoCruzado;
}

public boolean isAsistentePermanenteCarril() {
    return asistentePermanenteCarril;
}

public void setAsistentePermanenteCarril(boolean asistentePermanenteCarril) {
    this.asistentePermanenteCarril = asistentePermanenteCarril;
}

public boolean isCuatroPorCuatro() {
    return cuatroPorCuatro;
}

public void setCuatroPorCuatro(boolean cuatroPorCuatro) {
    this.cuatroPorCuatro = cuatroPorCuatro;
}

/**
 * toString de Camioneta
*/

@Override
public String toString() {
    return "Camioneta" + super.toString() + "[capacidadMaletero=" + capacidadMaletero + ", camaraReversa=" + camaraReversa
            + ", velocidadCrucero=" + velocidadCrucero + ", numeroBolsasAire=" + numeroBolsasAire
            + ", sensoresColision=" + sensoresColision + ", sensorTraficoCruzado=" + sensorTraficoCruzado
            + ", asistentePermanenteCarril=" + asistentePermanenteCarril + ", cuatroPorCuatro=" + cuatroPorCuatro + "]";
}


}
