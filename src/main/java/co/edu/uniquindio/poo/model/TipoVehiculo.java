package co.edu.uniquindio.poo.model;

public enum TipoVehiculo {
    BUS("Bus"),
    CAMION("Camión"),
    CAMIONETA("Camioneta"),
    DEPORTIVO("Deportivo"),
    MOTO("Moto"),
    PICK_UP("Pick-Up"),
    SEDAN("Sedán"),
    VAN("Van");

    private final String nombre;

    TipoVehiculo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
