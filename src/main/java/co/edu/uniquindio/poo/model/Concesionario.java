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
    private LinkedList<Bus> buses;
    private LinkedList<Camion> camiones;
    private LinkedList<Camioneta> camionetas;
    private LinkedList<Carro> carros;
    private LinkedList<Deportivo> deportivos;
    private LinkedList<Moto> motos;
    private LinkedList<PickUp> pickUps;
    private LinkedList<Sedan> sedanes;
    private LinkedList<Van> vans;
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
        this.buses = new LinkedList<>();
        this.camiones = new LinkedList<>();
        this.carros = new LinkedList<>();
        this.deportivos = new LinkedList<>();
        this.motos = new LinkedList<>();
        this.pickUps = new LinkedList<>();
        this.sedanes = new LinkedList<>();
        this.vans = new LinkedList<>();
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

    public LinkedList<Bus> getBuses() {
        return buses;
    }

    public void setBuses(LinkedList<Bus> buses) {
        this.buses = buses;
    }

    public LinkedList<Camion> getCamiones() {
        return camiones;
    }

    public void setCamiones(LinkedList<Camion> camiones) {
        this.camiones = camiones;
    }

    public LinkedList<Camioneta> getCamionetas() {
        return camionetas;
    }

    public void setCamionetas(LinkedList<Camioneta> camionetas) {
        this.camionetas = camionetas;
    }

    public LinkedList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(LinkedList<Carro> carros) {
        this.carros = carros;
    }

    public LinkedList<Deportivo> getDeportivos() {
        return deportivos;
    }

    public void setDeportivos(LinkedList<Deportivo> deportivos) {
        this.deportivos = deportivos;
    }

    public LinkedList<Moto> getMotos() {
        return motos;
    }

    public void setMotos(LinkedList<Moto> motos) {
        this.motos = motos;
    }

    public LinkedList<PickUp> getPickUps() {
        return pickUps;
    }

    public void setPickUps(LinkedList<PickUp> pickUps) {
        this.pickUps = pickUps;
    }

    public LinkedList<Sedan> getSedanes() {
        return sedanes;
    }

    public void setSedanes(LinkedList<Sedan> sedanes) {
        this.sedanes = sedanes;
    }

    public LinkedList<Van> getVans() {
        return vans;
    }

    public void setVans(LinkedList<Van> vans) {
        this.vans = vans;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    /**
     * Método para agregar transacción
     */
    public void agregarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
    }

    /**
     * Método para agregar empleado
     */
    public boolean agregarEmpleado(Empleado empleado) {
        boolean agregado = false;
        if (!empleadoExistente(empleado.getUsuario())) {
            empleados.add(empleado);
            agregado = true;
        }
        return agregado;
    }

    /**
     * Método para verificar la existencia de un empleado con su usuario.
     */
    public boolean empleadoExistente(String usuario) {
        boolean existente = false;
        for (Empleado empleado : empleados) {
            if (empleado.getUsuario().equals(usuario)) {
                existente = true;
                break;
            }
        }
        return existente;
    }

    /**
     * Método para eliminar un empleado.
     */
    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    /**
     * Método para actualizar un empleado. Duda de si al actualizarlo también se le
     * pueda actualizar el usuario y contraseña(El que lo acualiza es el
     * administrador)
     */
    public boolean actualizarEmpleado(Empleado seleccionado, String nombre, String apellido, String correo,
            String cedula, String telefono, String usuario, String contraseña,
            String preguntaSeguridad, String respuesta, double salario) {
        boolean actualizado = true;
        for (Empleado empleado : empleados) {
            if (empleado != seleccionado && empleado.getUsuario().equals(usuario)) {
                actualizado = false;
                return actualizado;
            }
        }
        seleccionado.setUsuario(usuario);
        seleccionado.setNombre(nombre);
        seleccionado.setApellido(apellido);
        seleccionado.setCorreo(correo);
        seleccionado.setCedula(cedula);
        seleccionado.setTelefono(telefono);
        seleccionado.setUsuario(usuario);
        seleccionado.setContraseña(contraseña);
        return actualizado;
    }

    /**
     * Método para agregar vehículo
     */
    public boolean agregarVehiculo(Vehiculo vehiculo) {
        boolean agregado = false;
        if (!vehiculoExistente(vehiculo.getPlaca())) {
            if (vehiculo instanceof Bus) {
                buses.add((Bus) vehiculo);
            } else if (vehiculo instanceof Camion) {
                camiones.add((Camion) vehiculo);
            } else if (vehiculo instanceof Camioneta) {
                camionetas.add((Camioneta) vehiculo);
            } else if (vehiculo instanceof Carro) {
                carros.add((Carro) vehiculo);
            } else if (vehiculo instanceof Deportivo) {
                deportivos.add((Deportivo) vehiculo);
            } else if (vehiculo instanceof Moto) {
                motos.add((Moto) vehiculo);
            } else if (vehiculo instanceof PickUp) {
                pickUps.add((PickUp) vehiculo);
            } else if (vehiculo instanceof Sedan) {
                sedanes.add((Sedan) vehiculo);
            } else if (vehiculo instanceof Van) {
                vans.add((Van) vehiculo);
            }
            vehiculos.add(vehiculo);
            agregado = true;
        }
        return agregado;
    }

    /**
     * Método para eliminar un vehículo
     */
    public void eliminarVehiculo(Vehiculo vehiculo) {
        if (vehiculo instanceof Bus) {
            buses.remove((Bus) vehiculo);
        } else if (vehiculo instanceof Camion) {
            camiones.remove((Camion) vehiculo);
        } else if (vehiculo instanceof Camioneta) {
            camionetas.remove((Camioneta) vehiculo);
        } else if (vehiculo instanceof Carro) {
            carros.remove((Carro) vehiculo);
        } else if (vehiculo instanceof Deportivo) {
            deportivos.remove((Deportivo) vehiculo);
        } else if (vehiculo instanceof Moto) {
            motos.remove((Moto) vehiculo);
        } else if (vehiculo instanceof PickUp) {
            pickUps.remove((PickUp) vehiculo);
        } else if (vehiculo instanceof Sedan) {
            sedanes.remove((Sedan) vehiculo);
        } else if (vehiculo instanceof Van) {
            vans.remove((Van) vehiculo);
        }
        vehiculos.remove(vehiculo);
    }

    /**
     * Método verificar si un vehículo ya existe por su placa
     */
    public boolean vehiculoExistente(String placa) {
        boolean existente = false;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                existente = true;
            }
        }
        return existente;
    }

    /**
     * Método para registrar una compra de vehículo
     */
    public void comprarVehiculo(LocalDate fechaEntrega, LocalDate fechaDevolucion, Empleado empleado, Cliente cliente,
            Vehiculo vehiculo, double precio) {
        Transaccion transaccion = new Transaccion(fechaEntrega, fechaDevolucion, precio, TipoTransaccion.COMPRA,
                empleado, cliente,
                vehiculo);

        // Agregar transacción de forma independiente al concesionario y al cliente
        agregarTransaccion(transaccion);
        cliente.agregarTransaccion(transaccion);

        // Actualizar lista de vehículos y fondos
        vehiculos.remove(vehiculo);
        fondos -= precio;
        mostrarMensaje("Compra de vehículo registrada.");
    }

    /**
     * Método para registrar una venta de vehículo
     */
    public void venderVehiculo(Empleado empleado, Cliente cliente, Vehiculo vehiculo, double precio,
            LocalDate fechaEntrega, LocalDate fechaDevolucion) {
        Transaccion transaccion = new Transaccion(fechaEntrega, fechaDevolucion, precio, TipoTransaccion.VENTA,
                empleado, cliente,
                vehiculo);

        // Agregar transacción de forma independiente al concesionario y al cliente
        agregarTransaccion(transaccion);
        cliente.agregarTransaccion(transaccion);

        // Actualizar lista de vehículos y fondos
        vehiculos.remove(vehiculo);
        fondos += precio;
        mostrarMensaje("Venta de vehículo registrada.");
    }

    /**
     * Método para registrar un alquiler de vehículo
     */
    public void alquilarVehiculo(Empleado empleado, Cliente cliente, Vehiculo vehiculo, double precio,
            LocalDate fechaEntrega,
            LocalDate fechaEntregaDevolucion) {
        Transaccion transaccion = new Transaccion(fechaEntrega, fechaEntregaDevolucion, precio,
                TipoTransaccion.ALQUILER, empleado, cliente,
                vehiculo);

        // Agregar transacción de forma independiente al concesionario y al cliente
        agregarTransaccion(transaccion);
        cliente.agregarTransaccion(transaccion);

        // Actualizar los fondos en caso de alquiler
        fondos += precio;
        mostrarMensaje("Alquiler de vehículo registrado.");
    }

    /**
     * Método para mostrar mensaje
     */
    public static void mostrarMensaje(String mensaje) {
        System.out.println();
    }

    /**
     * Método para crear un nuevo cliente.
     */
    public Cliente crearCliente(String nombre, String apellido, String correo, String cedula, String telefono,
            String usuario, String contraseña,
            String preguntaSeguridad, String respuesta) {
        return new Cliente(nombre, apellido, correo, cedula, telefono, usuario, contraseña, preguntaSeguridad,
                respuesta);
    }

    /**
     * Método para agregar cliente
     */
    public boolean agregarCliente(Cliente cliente) {
        boolean agregado = false;
        if (!clienteExistente(cliente.getUsuario())) {
            clientes.add(cliente);
            agregado = true;
        }
        return agregado;
    }

    /**
     * Método para eliminar un cliente.
     */
    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    /**
     * Método para actualizar un cliente. Duda de si al actualizarlo también se le
     * pueda actualizar el usuario y contraseña(El que lo acualiza es el
     * administrador)
     */
    public boolean actualizarCliente(Cliente seleccionado, String nombre, String apellido, String correo, String cedula,
            String telefono, String usuario, String contraseña,
            String preguntaSeguridad, String respuesta) {
        boolean actualizado = true;
        for (Cliente cliente : clientes) {
            if (cliente != seleccionado && cliente.getUsuario().equals(usuario)) {
                actualizado = false;
                return actualizado;
            }
        }
        seleccionado.setUsuario(usuario);
        seleccionado.setNombre(nombre);
        seleccionado.setApellido(apellido);
        seleccionado.setCorreo(correo);
        seleccionado.setCedula(cedula);
        seleccionado.setTelefono(telefono);
        seleccionado.setUsuario(usuario);
        seleccionado.setContraseña(contraseña);
        return actualizado;
    }

    /**
     * Método para verificar la existencia de un cliente con su usuario.
     */
    public boolean clienteExistente(String usuario) {
        boolean existente = false;
        for (Cliente cliente : clientes) {
            if (cliente.getUsuario().equals(usuario)) {
                existente = true;
                break;
            }
        }
        return existente;
    }
}