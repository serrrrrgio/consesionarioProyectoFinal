package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Transaccion {
    private LocalDate fecha;
    private double precio;
    private TipoTransaccion tipoTransaccion;
    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo vechiulo;

    /**
     * Constructor
     */
    public Transaccion(LocalDate fecha, double precio) {
        this.fecha = fecha;
        this.precio = precio;
    }

    /**
     * Getters y setters
     */
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

    public Vehiculo getVechiulo() {
        return vechiulo;
    }

    public void setVechiulo(Vehiculo vechiulo) {
        this.vechiulo = vechiulo;
    }

    /**
     * ToString
     */
    @Override
    public String toString() {
        return "Transaccion [fecha=" + fecha + ", precio=" + precio + ", tipoTransaccion=" + tipoTransaccion
                + ", empleado=" + empleado + ", cliente=" + cliente + ", vechiulo=" + vechiulo + "]";
    }

}
