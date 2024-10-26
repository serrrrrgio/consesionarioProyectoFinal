package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Empleado extends Persona {
    public double salario;
    LinkedList<Transaccion> transacciones;

    /**
     * Constructor
     */
    public Empleado(String nombre, String apellido, String correo, String telefono, String usuario, String contraseña,
            String preguntaSeguridad, String respuesta, double salario) {
        super(nombre, apellido, correo, telefono, usuario, contraseña, preguntaSeguridad, respuesta);
        this.salario = salario;
        this.transacciones = new LinkedList<>();
    }

    /**
     * Getters y Setters
     */
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    /**
     * toString
     */
    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    /**
     * Metodo para agregar Transacciones
     */
    public void agregarTransaccion() {

    }
}
