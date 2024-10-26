package co.edu.uniquindio.poo.model;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

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
     * Método para agregar transacción
     */
    public void agregarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
    }

    /**
     * Método para agregar empleado
     */
    public void agregarEmpleado(Empleado transaccion) {
        empleados.add(transaccion);
    }

    /**
     * Método para agregar cliente
     */
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    /**
     * Método para agregar vehículo
     */
    public void agregarVehiculo(Vehiculo vechiculo) {
        vehiculos.add(vechiculo);
    }

    /**
     * Método para registrar una compra de vehículo
     */
    public void comprarVehiculo(Empleado empleado, Cliente cliente, Vehiculo vehiculo, double precio) {
        Transaccion transaccion = new Transaccion(LocalDate.now(), precio, TipoTransaccion.COMPRA, empleado, cliente,
                vehiculo, null);

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
    public void venderVehiculo(Empleado empleado, Cliente cliente, Vehiculo vehiculo, double precio) {
        Transaccion transaccion = new Transaccion(LocalDate.now(), precio, TipoTransaccion.VENTA, empleado, cliente,
                vehiculo, null);

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
            LocalDate fechaDevolucion) {
        Transaccion transaccion = new Transaccion(LocalDate.now(), precio, TipoTransaccion.ALQUILER, empleado, cliente,
                vehiculo, fechaDevolucion);

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
     * Método para mostrar mensaje
     */
    public static void mostrarMensajeSeguido(String mensaje) {
        System.out.print(mensaje);
    }

    /**
     * Método para ingresar ingresar entero
     */
    public static int ingresarEntero(String solicitud) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        boolean repetir = true;
        while (repetir) {
            mostrarMensajeSeguido(solicitud);
            try {
                numero = scanner.nextInt();
                repetir = false;
            }

            catch (InputMismatchException e) {
                mostrarMensaje("Error: No ingresaste un número.");
                scanner.next();
            }
        }
        return numero;
    }

    /**
     * Método para ingresar ingresar un real
     */
    public static double ingresarReal(String solicitud) {
        Scanner scanner = new Scanner(System.in);
        double numero = 0;

        boolean repetir = true;
        while (repetir) {
            mostrarMensajeSeguido(solicitud);
            try {
                numero = scanner.nextDouble();
                repetir = false;
            }

            catch (InputMismatchException e) {
                mostrarMensaje("Error: No ingresaste un real.");
                scanner.next();
            }
        }
        return numero;
    }

    /**
     * Método para ingresar ingresar texto
     */
    public static String ingresarTexto(String solicitud) {
        Scanner scanner = new Scanner(System.in);
        mostrarMensajeSeguido(solicitud);
        String texto = scanner.nextLine();
        return texto;
    }

    /**
     * Método para ingresar una fecha
     */
    public static LocalDate ingresarFecha(String solicitud) {
        LocalDate fecha = null;
        int ano = 0;
        int mes = 0;
        int dia = 0;

        boolean repetir = true;
        while (repetir) {
            mostrarMensaje(solicitud);
            try {
                ano = ingresarEntero("Año: ");
                mes = ingresarEntero("Mes: ");
                dia = ingresarEntero("Día: ");

                fecha = LocalDate.of(ano, mes, dia);
                repetir = false;
            }

            catch (DateTimeException e) {
                mostrarMensaje("Error: No ingresaste una fecha válida.");
            }
        }
        return fecha;
    }

    /**
     * Método para ingresar una fecha posterior a otra
     */
    public static LocalDate ingresarFechaPosterior(String solicitud, LocalDate fecha) {
        LocalDate fechaPosterior = null;
        boolean repetir = true;

        while (repetir) {
            fechaPosterior = ingresarFecha(solicitud);
            if (fechaPosterior.isAfter(fecha)) {
                repetir = false;
            } else {
                mostrarMensaje("Error: La nueva fecha no es posterior a la anterior, por favor ingresela nuevamente");
            }
        }
        return fechaPosterior;
    }

    /**
     * Método para crear un nuevo cliente.
     */
    public void crearCliente(String nombre, String apellido, String correo, String cedula, String telefono, String usuario, String contraseña,
                             String preguntaSeguridad, String respuesta) {
        Cliente nuevoCliente = new Cliente(nombre, apellido, correo, cedula, telefono, usuario, contraseña, preguntaSeguridad, respuesta);
        clientes.add(nuevoCliente);
        System.out.println("Cliente creado: " + nombre + " " + apellido);
    }

    /**
     * Método para eliminar un cliente.
     */
    public void eliminarCliente(String cedula) {
        Cliente clienteAEliminar = null;

        for (Cliente cliente : clientes) {
            if (cliente.getUsuario().equals(cedula)) {
                clienteAEliminar = cliente;
                break;
            }
        }

        if (clienteAEliminar != null) {
            clientes.remove(clienteAEliminar);
            System.out.println("Cliente eliminado: " + clienteAEliminar.getNombre() + " " + clienteAEliminar.getApellido());
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    /**
     * Método para actualizar un cliente.
     */
    public void actualizarCliente(String usuario, String nuevoNombre, String nuevoApellido, String nuevoCorreo, String nuevoTelefono) {
        for (Cliente cliente : clientes) {
            if (cliente.getUsuario().equals(usuario)) {
                cliente.setNombre(nuevoNombre);
                cliente.setApellido(nuevoApellido);
                cliente.setCorreo(nuevoCorreo);
                cliente.setTelefono(nuevoTelefono);
                System.out.println("Cliente actualizado: " + nuevoNombre + " " + nuevoApellido);
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }

    /**
     * Método para verificar la existencia de un cliente.
     */
    public boolean verificarCliente(String usuario) {
        for (Cliente cliente : clientes) {
            if (cliente.getUsuario().equals(usuario)) {
                System.out.println("Cliente verificado: " + cliente.getNombre() + " " + cliente.getApellido());
                return true;
            }
        }
        System.out.println("Cliente no encontrado.");
        return false;
    }
}