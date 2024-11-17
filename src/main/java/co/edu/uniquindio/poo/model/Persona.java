package co.edu.uniquindio.poo.model;

public class Persona {
    public String nombre;
    public String apellido;
    public String correo;
    public String cedula;
    public String telefono;
    public String usuario;
    public String constrasena;
    public String preguntaSeguridad;
    public String respuesta;

    /**
     * Constructor
     */

    public Persona(String nombre, String apellido, String correo, String cedula, String telefono, String usuario,
            String constrasena,
            String preguntaSeguridad, String respuesta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.cedula = cedula;
        this.telefono = telefono;
        this.usuario = usuario;
        this.constrasena = constrasena;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getconstrasena() {
        return constrasena;
    }

    public void setconstrasena(String constrasena) {
        this.constrasena = constrasena;
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
     * Método para verificar la respuesta de seguridad
     */
    public boolean verificarRespuestaSeguridad(String respuestaUsuario) {
        return respuesta.equalsIgnoreCase(respuestaUsuario);
    }

    /**
     * Método para cambiar la constrasena
     */
    public boolean cambiarContrasena(String respuestaUsuario, String nuevaContrasena) {
        if (verificarRespuestaSeguridad(respuestaUsuario)) {
            this.constrasena = nuevaContrasena;
            return true;
        }
        return false;
    }
}
