package co.edu.uniquindio.poo.controller;

import java.time.LocalDate;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Transaccion;
import javafx.collections.ObservableList;

public class TransaccionesController {
    private Concesionario concesionario;

   public TransaccionesController(Concesionario concesionario) {
       this.concesionario = concesionario;
   }

   public boolean validarFechaPosterior(LocalDate fecha1, LocalDate fecha2){
    return concesionario.validarFechaPosterior(fecha1, fecha2);
   }

   public int calcularDias(LocalDate fecha1, LocalDate fecha2){
    return concesionario.calcularDias(fecha1, fecha2);
   }

   public ObservableList<Transaccion> obtenertransaccionesFechas(LocalDate fecha1, LocalDate fecha2){
    return concesionario.obtenerTransaccionesFechas(fecha1, fecha2);
   }

   public ObservableList<Transaccion> obtenerTransaccions(){
    return concesionario.getTransacciones();
   }
}