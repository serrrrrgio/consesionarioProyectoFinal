package co.edu.uniquindio.poo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.time.LocalDate;

import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Bus;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Combustible;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.PreguntaSeguridad;
import co.edu.uniquindio.poo.model.TipoRegistro;
import co.edu.uniquindio.poo.model.Transmision;
import co.edu.uniquindio.poo.model.Van;

/**
 * JavaFX App
 */
public class App {

    private static Concesionario concesionario;
    private static Administrador administrador;

    public static void main(String[] args) {
        // Llamar a la función launchApp en el hilo de JavaFX
        Platform.startup(() -> launchApp());
    }

    public static void launchApp() {
        Empleado empleadoPrueba = new Empleado(
                "Joab", // Nombre
                "Suarez", // Apellido
                "joab@gmail.com", // Correo
                "1", // Cédula
                "3014750404", // Teléfono
                "JoabS", // Usuario
                "1", // Contraseña
                PreguntaSeguridad.FAVORITE_COLOR, // Pregunta de seguridad
                "Negro", // Respuesta a la pregunta de seguridad
                2500.0 // Salario
        );

        Empleado empleado2 = new Empleado(
                "Ana", // Nombre
                "Gómez", // Apellido
                "ana.gomez@gmail.com", // Correo
                "2", // Cédula
                "3123456789", // Teléfono
                "AnaG", // Usuario
                "2", // Contraseña
                PreguntaSeguridad.CHILDHOOD_NICKNAME, // Pregunta de seguridad
                "Ani", // Respuesta a la pregunta de seguridad
                3000.0 // Salario
        );

        Empleado empleado3 = new Empleado(
                "Carlos", // Nombre
                "Martínez", // Apellido
                "carlos.martinez@gmail.com", // Correo
                "3", // Cédula
                "3145678901", // Teléfono
                "CarlosM", // Usuario
                "3", // Contraseña
                PreguntaSeguridad.PET_NAME, // Pregunta de seguridad
                "Rex", // Respuesta a la pregunta de seguridad
                2800.0 // Salario
        );

        Empleado empleado4 = new Empleado(
                "Lucía", // Nombre
                "Hernández", // Apellido
                "lucia.hernandez@gmail.com", // Correo
                "4", // Cédula
                "3009876543", // Teléfono
                "LuciaH", // Usuario
                "4", // Contraseña
                PreguntaSeguridad.BEST_FRIEND, // Pregunta de seguridad
                "Sofia", // Respuesta a la pregunta de seguridad
                3200.0 // Salario
        );

        Empleado empleado5 = new Empleado(
                "Luisa", // Nombre
                "Londoño", // Apellido
                "luisal@gmail.com", // Correo
                "5", // Cédula
                "3156784321", // Teléfono
                "Luisal", // Usuario
                "5", // Contraseña
                PreguntaSeguridad.PET_NAME, // Pregunta de seguridad
                "Milu", // Respuesta a la pregunta de seguridad
                2700.0 // Salario
        );

        Cliente cliente = new Cliente("Sergio", // Nombre
                "Posada", // Apellido
                "Sergio@gmail.com", // Correo
                "1", // Cédula
                "3014750404", // Teléfono
                "Sergi", // Usuario
                "1", // Contraseña
                PreguntaSeguridad.FAVORITE_COLOR, // Pregunta de seguridad
                "Negro" // Respuesta a la pregunta de seguridad
        );

        Cliente cliente2 = new Cliente(
                "María", // Nombre
                "López", // Apellido
                "maria.lopez@gmail.com", // Correo
                "2", // Cédula
                "3123456789", // Teléfono
                "MariaL", // Usuario
                "2", // Contraseña
                PreguntaSeguridad.PET_NAME, // Pregunta de seguridad
                "Firulais" // Respuesta a la pregunta de seguridad
        );

        Cliente cliente3 = new Cliente(
                "Jorge", // Nombre
                "Pérez", // Apellido
                "jorge.perez@gmail.com", // Correo
                "3", // Cédula
                "3145678901", // Teléfono
                "JorgeP", // Usuario
                "3", // Contraseña
                PreguntaSeguridad.FAVORITE_FOOD, // Pregunta de seguridad
                "Tacos" // Respuesta a la pregunta de seguridad
        );

        // Bus eléctrico
        Bus busElectrico = new Bus(
                "Tesla", // Marca
                "TES123", // Placa
                2023, // Modelo
                1, // Cambios (transmisión automática)
                120.0, // Velocidad Máxima (km/h)
                0.0, // Cilindraje (no aplica para vehículos eléctricos)
                TipoRegistro.ALQUILER, // Tipo de registro
                Transmision.AUTOMATICA, // Transmisión
                Estado.NUEVO, // Estado
                50, // Capacidad de pasajeros
                2, // Cantidad de puertas
                true, // ABS
                true, // Aire acondicionado
                true, // Cámara de reversa
                15.0, // Capacidad del maletero (m³)
                6, // Número de bolsas de aire
                2, // Número de ejes
                4, // Número de salidas de emergencia
                300000.0, // Precio
                Combustible.ELECTRICO, // Combustible
                500.0, // Autonomía (km)
                1.5, // Tiempo de carga (horas)
                true, // Enchufable
                false // Híbrido ligero
        );

        // Bus diésel
        Bus busDiesel = new Bus(
                "Mercedes-Benz", // Marca
                "MBZ456", // Placa
                2022, // Modelo
                6, // Cambios
                100.0, // Velocidad Máxima (km/h)
                4500.0, // Cilindraje
                TipoRegistro.VENTA, // Tipo de registro
                Transmision.MANUAL, // Transmisión
                Estado.USADO, // Estado
                60, // Capacidad de pasajeros
                3, // Cantidad de puertas
                true, // ABS
                true, // Aire acondicionado
                false, // Cámara de reversa
                10.0, // Capacidad del maletero (m³)
                4, // Número de bolsas de aire
                2, // Número de ejes
                3, // Número de salidas de emergencia
                200000.0, // Precio
                Combustible.DIESEL, // Combustible
                13, // Autonomía (no aplica a diésel en este contexto)
                14, // Tiempo de carga (no aplica a diésel)
                false, // Enchufable
                false // Híbrido ligero
        );

        // Camioneta eléctrica
        Camioneta camionetaElectrica = new Camioneta(
                "Tesla", // Marca
                "TESLA123", // Placa
                2023, // Modelo
                1, // Cambios (transmisión automática)
                200.0, // Velocidad Máxima (km/h)
                9, // Cilindraje (no aplica para vehículos eléctricos)
                TipoRegistro.ALQUILER, // Tipo de registro
                Transmision.AUTOMATICA, // Transmisión
                Estado.NUEVO, // Estado
                5, // Capacidad de pasajeros
                5, // Cantidad de puertas
                true, // ABS
                true, // Aire acondicionado
                true, // Cámara de reversa
                500.0, // Capacidad del maletero (litros)
                true, // Velocidad crucero
                6, // Número de bolsas de aire
                true, // Sensores de colisión
                true, // Sensor de tráfico cruzado
                true, // Asistente de permanencia en el carril
                true, // Cuatro por cuatro
                75000.0, // Precio
                Combustible.ELECTRICO, // Combustible
                600.0, // Autonomía (km)
                1.5, // Tiempo de carga (horas)
                false, // Enchufable
                false // Híbrido ligero
        );

        // Camioneta a gasolina
        Camioneta camionetaGasolina = new Camioneta(
                "Toyota", // Marca
                "TOYOTA456", // Placa
                2021, // Modelo
                6, // Cambios
                180.0, // Velocidad Máxima (km/h)
                3500.0, // Cilindraje
                TipoRegistro.VENTA, // Tipo de registro
                Transmision.MANUAL, // Transmisión
                Estado.USADO, // Estado
                7, // Capacidad de pasajeros
                5, // Cantidad de puertas
                true, // ABS
                true, // Aire acondicionado
                false, // Cámara de reversa
                700.0, // Capacidad del maletero (litros)
                false, // Velocidad crucero
                4, // Número de bolsas de aire
                false, // Sensores de colisión
                false, // Sensor de tráfico cruzado
                false, // Asistente de permanencia en el carril
                true, // Cuatro por cuatro
                50000.0, // Precio
                Combustible.GASOLINA, // Combustible
                12, // Autonomía (no aplica para gasolina)
                9, // Tiempo de carga (no aplica para gasolina)
                false, // Enchufable
                false // Híbrido ligero
        );

        // Moto híbrida
        Moto motoHibrida = new Moto(
                "Yamaha", // Marca
                "HYB123", // Placa
                2023, // Modelo
                6, // Cambios
                180.0, // Velocidad Máxima (km/h)
                500.0, // Cilindraje
                TipoRegistro.VENTA, // Tipo de registro
                Transmision.MANUAL, // Transmisión
                Estado.NUEVO, // Estado
                30000.0, // Precio
                Combustible.HIBRIDO, // Combustible
                9, // Autonomía (km)
                12, // Tiempo de carga (horas)
                false, // Enchufable
                true // Híbrido ligero
        );

        // Moto a gasolina
        Moto motoGasolina = new Moto(
                "Kawasaki", // Marca
                "GAS456", // Placa
                2021, // Modelo
                5, // Cambios
                220.0, // Velocidad Máxima (km/h)
                650.0, // Cilindraje
                TipoRegistro.VENTA, // Tipo de registro
                Transmision.MANUAL, // Transmisión
                Estado.USADO, // Estado
                25000.0, // Precio
                Combustible.GASOLINA, // Combustible
                6, // Autonomía (no aplica para gasolina)
                12, // Tiempo de carga (no aplica para gasolina)
                false, // Enchufable
                false // Híbrido ligero
        );

        // Van eléctrica
        Van vanElectrica = new Van(
                "Tesla", // Marca
                "VAN123", // Placa
                2023, // Modelo
                1, // Cambios (transmisión automática)
                150.0, // Velocidad Máxima (km/h)
                133, // Cilindraje (no aplica para vehículos eléctricos)
                TipoRegistro.VENTA, // Tipo de registro
                Transmision.AUTOMATICA, // Transmisión
                Estado.NUEVO, // Estado
                8, // Capacidad de pasajeros
                4, // Cantidad de puertas
                true, // ABS
                true, // Aire acondicionado
                true, // Cámara de reversa
                1000.0, // Capacidad del maletero (litros)
                6, // Número de bolsas de aire
                120000.0, // Precio
                Combustible.ELECTRICO, // Combustible
                400.0, // Autonomía (km)
                2.0, // Tiempo de carga (horas)
                false, // Enchufable
                false // Híbrido ligero
        );

        // Van híbrida
        Van vanHibrida = new Van(
                "Toyota", // Marca
                "HYB789", // Placa
                2022, // Modelo
                6, // Cambios
                140.0, // Velocidad Máxima (km/h)
                2500.0, // Cilindraje
                TipoRegistro.ALQUILER, // Tipo de registro
                Transmision.MANUAL, // Transmisión
                Estado.NUEVO, // Estado
                12, // Capacidad de pasajeros
                4, // Cantidad de puertas
                true, // ABS
                true, // Aire acondicionado
                true, // Cámara de reversa
                1500.0, // Capacidad del maletero (litros)
                8, // Número de bolsas de aire
                90000.0, // Precio
                Combustible.HIBRIDO, // Combustible
                9, // Autonomía (km)
                12, // Tiempo de carga (horas)
                true, // Enchufable
                true // Híbrido ligero
        );

        // Van a diésel
        Van vanDiesel = new Van(
                "Mercedes-Benz", // Marca
                "DIE456", // Placa
                2021, // Modelo
                6, // Cambios
                130.0, // Velocidad Máxima (km/h)
                3000.0, // Cilindraje
                TipoRegistro.VENTA, // Tipo de registro
                Transmision.MANUAL, // Transmisión
                Estado.USADO, // Estado
                15, // Capacidad de pasajeros
                4, // Cantidad de puertas
                true, // ABS
                true, // Aire acondicionado
                false, // Cámara de reversa
                2000.0, // Capacidad del maletero (litros)
                6, // Número de bolsas de aire
                80000.0, // Precio
                Combustible.DIESEL, // Combustible
                6, // Autonomía (no aplica para diésel)
                12, // Tiempo de carga (no aplica para diésel)
                false, // Enchufable
                false // Híbrido ligero
        );

        administrador = new Administrador("Maicol", "Alvarez", "michael@gmail.com", "1", "310", "maicol", "12345",
                PreguntaSeguridad.BEST_FRIEND, "Victoria");

        concesionario = new Concesionario("Chevrolet", 130909002, administrador);
        concesionario.agregarEmpleado(empleadoPrueba);
        concesionario.agregarCliente(cliente);
        // Agregar más empleados al concesionario
        concesionario.agregarEmpleado(empleado2);
        concesionario.agregarEmpleado(empleado3);
        concesionario.agregarEmpleado(empleado4);
        concesionario.agregarEmpleado(empleado5);

        // Agregar más clientes al concesionario
        concesionario.agregarCliente(cliente2);
        concesionario.agregarCliente(cliente3);

        // Agregar buses al concesionario
        concesionario.agregarVehiculo(busElectrico);
        concesionario.agregarVehiculo(busDiesel);

        // Agregar camionetas al concesionario
        concesionario.agregarVehiculo(camionetaElectrica);
        concesionario.agregarVehiculo(camionetaGasolina);

        // Agregar motos al concesionario
        concesionario.agregarVehiculo(motoHibrida);
        concesionario.agregarVehiculo(motoGasolina);

        // Agregar vans al concesionario
        concesionario.agregarVehiculo(vanElectrica);


        // Alquilar vehículos para las primeras fechas
        concesionario.alquilarVehiculo(empleado2, cliente, camionetaGasolina, LocalDate.of(2024, 11, 20), LocalDate.of(2024, 11, 25));
        concesionario.alquilarVehiculo(empleado3, cliente2, busDiesel, LocalDate.of(2024, 11, 21), LocalDate.of(2024, 11, 26));

        // Alquilar vehículos para las segundas fechas
        concesionario.alquilarVehiculo(empleado4, cliente3, vanElectrica, LocalDate.of(2024, 12, 1), LocalDate.of(2024, 12, 5));
        concesionario.alquilarVehiculo(empleado5, cliente2, motoHibrida, LocalDate.of(2024, 12, 2), LocalDate.of(2024, 12, 6));

        concesionario.venderVehiculo(empleado5, cliente3, vanDiesel, vanDiesel.getPrecio(), LocalDate.now(), null);
        concesionario.venderVehiculo(empleado5, cliente3, vanHibrida, vanDiesel.getPrecio(), LocalDate.now(), null);

        try {
            // Cargar el archivo FXML
            Parent root = FXMLLoader.load(App.class.getResource("Inicio.fxml"));
            Scene scene = new Scene(root);

            // Crear Stage y configurar propiedades
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Mi Aplicación");

            // Centrar la ventana en la pantalla
            stage.centerOnScreen();

            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Concesionario getConcesionario() {
        return concesionario;
    }

    public static void setConcesionario(Concesionario nuevoConcesionario) {
        concesionario = nuevoConcesionario;
    }

    public static void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    public static void mostrarMensaje(String titulo, String header, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(header);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    public static void cambiarEscena(String fxml, String titulo, ActionEvent event, Class<?> clase) {
        try {
            FXMLLoader loader = new FXMLLoader(clase.getResource(fxml));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle(titulo);
            stage.setScene(new Scene(root));
            stage.centerOnScreen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setButtonHoverEffect(Button button) {
        button.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        button.addEventHandler(MouseEvent.MOUSE_ENTERED, e -> {
            button.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        });
        button.addEventHandler(MouseEvent.MOUSE_EXITED, e -> {
            button.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        });
    }

}