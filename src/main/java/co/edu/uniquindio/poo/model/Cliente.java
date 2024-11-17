package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Cliente extends Persona {

    LinkedList<Transaccion> transacciones;

    /**
     * Constructor
     */
    public Cliente(String nombre, String apellido, String correo, String cedula, String telefono, String usuario,
            String constrasena,
            String preguntaSeguridad, String respuesta) {
        super(nombre, apellido, correo, cedula, telefono, usuario, constrasena, preguntaSeguridad, respuesta);
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
     * Método para agregar una transacción al cliente
     */
    public void agregarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
        System.out.println("Transacción agregada al cliente " + nombre + " " + apellido);
    }
}
