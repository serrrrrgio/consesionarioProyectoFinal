package co.edu.uniquindio.poo.model;

public class Administrador extends Persona{
        
    /**
    * Constructor
    */

    public Administrador (String nombre, String apellido, String correo, String telefono, String usuario, String contraseña,
    String preguntaSeguridad, String respuesta){
        super(nombre, apellido, correo, telefono, usuario, contraseña, preguntaSeguridad, respuesta);
    }

    /**
    * toString
    */

    @Override
    public String toString() {
        return "Administrador: " + super.toString();
    }
    
}
