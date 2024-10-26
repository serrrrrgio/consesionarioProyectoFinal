package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Cliente extends Persona {

    LinkedList<Transaccion> transacciones;

    /**
     * Constructor
     */
    public Cliente(String nombre, String apellido, String correo, String telefono, String usuario, String contraseña,
            String preguntaSeguridad, String respuesta) {
        super(nombre, apellido, correo, telefono, usuario, contraseña, preguntaSeguridad, respuesta);
        this.transacciones = new LinkedList<>();
    }

    /**
     * Getters y setters
     */
    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    /**
     * Metodo para comprar vehiculos
     */

    public void comprarVehiculo() {

    }

    /**
     * Metodo para alquilar vehiculo
     */

    public void alquilarVehiculo() {

    }

    /**
     * Metodo para vender vehiculo
     */

    public void venderVehiculo() {

    }

    /**
     * toString
     */

    @Override
    public String toString() {
        return "Cliente: " + super.toString();
    }

}
