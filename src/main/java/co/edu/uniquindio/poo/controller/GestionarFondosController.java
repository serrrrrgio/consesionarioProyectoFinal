package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Transaccion;
import javafx.collections.ObservableList;

public class GestionarFondosController {
    private Concesionario concesionario;

    public GestionarFondosController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public ObservableList<Transaccion> obtenerTransacciones() {
        return concesionario.getTransacciones();
    }

    public Concesionario getConcesionario() {
        return concesionario;
    }

    public double obtenerFondos() {
        return concesionario.getFondos();
    }


    public void setConcesionario(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

            // Método para agregar fondos
            public void agregarFondos(double cantidad) {
                if (cantidad > 0) {
                    concesionario.setFondos(concesionario.getFondos()+cantidad) ;
                }
            }
        
            // Método para retirar fondos
            public void retirarFondos(double cantidad) {
                if (cantidad > 0 && concesionario.getFondos() >= cantidad) {
                    concesionario.setFondos(concesionario.getFondos()-cantidad);
                }
            }
    

    
}
