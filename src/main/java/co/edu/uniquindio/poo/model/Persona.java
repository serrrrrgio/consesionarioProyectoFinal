package co.edu.uniquindio.poo.model;

public class Persona {
    public String nombre;
    public String apellido;
    public String correo;
    public String telefono;
    public String usuario;
    public String contraseña;
    public String preguntaSeguridad;
    public String respuesta;

    /**
     * Constructor
     */

    public Persona(String nombre, String apellido, String correo, String telefono, String usuario, String contraseña,
            String preguntaSeguridad, String respuesta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuesta = respuesta;
    }

    /**
     * Getters y Setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", telefono=" + telefono
                + ", usuario=" + usuario + ", contraseña=" + contraseña + ", preguntaSeguridad=" + preguntaSeguridad
                + ", respuesta=" + respuesta + "]";
    }

    /**
     * Metodo para recuperar contraseña
     */
    public void reestablecerContrasena() {

    }

}
