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
}
