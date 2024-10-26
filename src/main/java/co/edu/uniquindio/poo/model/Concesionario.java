package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Concesionario {

    /**
     * Se declaran las variables
     */
    private String nombre;
    private double fondos;
    private LinkedList<Transaccion> transacciones;
    private LinkedList<Empleado> empleados;
    private LinkedList<Cliente> clientes;
    private LinkedList<Vehiculo> vechiculos;
    private Administrador administrador;



    /**
     * Constructor
     */
    public Concesionario(String nombre, double fondos, Administrador administrador) {
        this.nombre = nombre;
        this.fondos = fondos;
        this.administrador = administrador;
        this.transacciones = new LinkedList<>();
        this.empleados = new LinkedList<>();
        this.clientes = new LinkedList<>();
        this.vechiculos = new LinkedList<>();
    }

    /**
     * Getters y setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getFondos() {
        return fondos;
    }

    public void setFondos(double fondos) {
        this.fondos = fondos;
    }

    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(LinkedList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public LinkedList<Vehiculo> getVechiculos() {
        return vechiculos;
    }

    public void setVechiculos(LinkedList<Vehiculo> vechiculos) {
        this.vechiculos = vechiculos;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }   
}
