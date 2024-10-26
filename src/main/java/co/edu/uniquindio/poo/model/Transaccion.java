package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Transaccion {
    private LocalDate fecha;
    private double precio;
    private TipoTransaccion tipoTransaccion;
    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaDevolucion;
    public Transaccion(LocalDate fecha, double precio, TipoTransaccion tipoTransaccion, Empleado empleado,
            Cliente cliente, Vehiculo vehiculo, LocalDate fechaDevolucion) {
        this.fecha = fecha;
        this.precio = precio;
        this.tipoTransaccion = tipoTransaccion;
        this.empleado = empleado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaDevolucion = fechaDevolucion;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public TipoTransaccion getTipoTransaccion() {
        return tipoTransaccion;
    }
    public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    

    
    



}
