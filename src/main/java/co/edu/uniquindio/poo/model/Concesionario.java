package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
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
    private LinkedList<Vehiculo> vehiculos;
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
        this.vehiculos = new LinkedList<>();
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

    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    

    /**
     * Método para mostrar mensaje
     */
    public static void mostrarMensaje(String mensaje){
        System.out.println();
    }

    /**
     * Método para agregar transacción
     */
    public void agregarTransaccion(Transaccion transaccion){
        transacciones.add(transaccion);
    }

    /**
     * Método para agregar empleado
     */
    public void agregarEmpleado(Empleado transaccion){
        empleados.add(transaccion);
    }

    /**
     * Método para agregar cliente
     */
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    /**
     * Método para agregar vehículo
     */
    public void agregarVehiculo(Vehiculo vechiculo){
        vehiculos.add(vechiculo);
    }

    /**
     * Método para registrar una compra de vehículo
     */
    public void comprarVehiculo(Empleado empleado, Cliente cliente, Vehiculo vehiculo, double precio) {
        Transaccion transaccion = new Transaccion(LocalDate.now(), precio, TipoTransaccion.COMPRA, empleado, cliente, vehiculo, null);
        
        // Agregar transacción de forma independiente al concesionario y al cliente
        this.agregarTransaccion(transaccion);
        cliente.agregarTransaccion(transaccion);

        // Actualizar lista de vehículos y fondos
        vehiculos.remove(vehiculo);
        fondos -= precio;
        System.out.println("Compra de vehículo registrada.");
    }

    /**
     * Método para registrar una venta de vehículo
     */
    public void venderVehiculo(Empleado empleado, Cliente cliente, Vehiculo vehiculo, double precio) {
        Transaccion transaccion = new Transaccion(LocalDate.now(), precio, TipoTransaccion.VENTA, empleado, cliente, vehiculo, null);
        
        // Agregar transacción de forma independiente al concesionario y al cliente
        this.agregarTransaccion(transaccion);
        cliente.agregarTransaccion(transaccion);

        // Actualizar lista de vehículos y fondos
        vehiculos.remove(vehiculo);
        fondos += precio;
        System.out.println("Venta de vehículo registrada.");
    }

    /**
     * Método para registrar un alquiler de vehículo
     */
    public void alquilarVehiculo(Empleado empleado, Cliente cliente, Vehiculo vehiculo, double precio, LocalDate fechaDevolucion) {
        Transaccion transaccion = new Transaccion(LocalDate.now(), precio, TipoTransaccion.ALQUILER, empleado, cliente, vehiculo, fechaDevolucion);
        
        // Agregar transacción de forma independiente al concesionario y al cliente
        this.agregarTransaccion(transaccion);
        cliente.agregarTransaccion(transaccion);

        // Actualizar los fondos en caso de alquiler
        fondos += precio;
        System.out.println("Alquiler de vehículo registrado.");
    }
}