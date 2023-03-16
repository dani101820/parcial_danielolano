/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorTurnos;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import modelo.GestorTurnos;
import modelo.Turno;

/**
 *
 * @author Daniel
 */
public class Pantalla {
    private ControladorTurnos controlador;

    public Pantalla(controlador.ControladorTurnos aThis) {
         this.controlador = controlador;
    }

    public Pantalla() {
    this.controlador = controlador;
    }

    

   
    public void setControlador(ControladorTurnos controlador) {
        this.controlador = controlador;
    }

    public void mostrarMenu() {
        System.out.println("Bienvenido al sistema de gestión de turnos IPS");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Generar turno");
        System.out.println("2. Consultar turno");
        System.out.println("3. Salir");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarTurno(String tipoUsuario, int numeroTurno, int tiempoEstimado) {
        String turno = tipoUsuario + String.format("%03d", numeroTurno);
        System.out.println("Su turno es: " + turno);
        System.out.println("Tiempo estimado de atención: " + tiempoEstimado + " minutos");
        System.out.println("Por favor espere su turno.");
    }

    public void mostrarTurnoConsultado(String tipoUsuario, int numeroTurno, int tiempoEstimado, String profesional) {
        String turno = tipoUsuario + String.format("%03d", numeroTurno);
        System.out.println("El turno consultado es: " + turno);
        System.out.println("Tiempo estimado de atención: " + tiempoEstimado + " minutos");
        System.out.println("El profesional que atenderá el turno es: " + profesional);
    }

  


    private void GenerarTurno() {
        controlador.generarTurno();
    }

    

    public void iniciar(ControladorTurnos controladorTurnos) {
      // Configurar la ventana y mostrarla
    JFrame ventana = new JFrame("Gestor de Turnos");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(600, 400);
    ventana.setVisible(true);

    // Mostrar la lista de turnos actuales
   
   

    // Agregar un botón para generar un nuevo turno
    JButton botonGenerarTurno = new JButton("Generar Turno");
    botonGenerarTurno.addActionListener(e -> GenerarTurno());
    ventana.getContentPane().add(botonGenerarTurno, BorderLayout.SOUTH);
    }

    public void iniciar() {
    JFrame ventana = new JFrame("Gestor de Turnos");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(600, 400);
    ventana.setVisible(true);
    }

    public void mostrarTurno(Turno turno) {
   
        System.out.println("Su turno es: " + turno);
        System.out.println("Tiempo estimado de atención: " + turno+ " minutos");
        System.out.println("Por favor espere su turno.");
    }
    

  



 
}

