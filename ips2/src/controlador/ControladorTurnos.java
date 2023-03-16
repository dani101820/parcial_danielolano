/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;



import modelo.GestorTurnos;
import modelo.Turno;
import vista.Pantalla;

public class ControladorTurnos {

    private final GestorTurnos gestorTurnos;
    private final Pantalla pantalla;

    public ControladorTurnos(GestorTurnos gestorTurnos, Pantalla pantalla) {
        this.gestorTurnos = gestorTurnos;
        this.pantalla = pantalla;
    }

    public void generarTurno(String tipoUsuario, String numeroDocumento) {
        Turno turno = gestorTurnos.generarTurno(tipoUsuario, numeroDocumento);
        pantalla.mostrarTurno(turno);
    }

    public void atenderTurno(Turno turno) {
        gestorTurnos.atenderTurno(turno);
        
    }

    public void cancelarTurno(Turno turno) {
        gestorTurnos.cancelarTurno(turno);
       
    }

    public void iniciar() {
        Pantalla pantalla = new Pantalla(this);
    pantalla.iniciar();
    }

    public void generarTurno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



