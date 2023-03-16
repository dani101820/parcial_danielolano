package modelo;

import basededatos.BDRemotaArreglo;
import basededatos.IBaseDatosRemota;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GestorTurnos {
    private static GestorTurnos instance = null;
    private static IBaseDatosRemota bdRemota;

    private int contadorTurnos;

    public GestorTurnos(IBaseDatosRemota bdRemota1) {
        contadorTurnos = 1;
        bdRemota = bdRemota1;
    }
    public ArrayList<String> getTurnosEnEspera() {
    ArrayList<String> turnos = new ArrayList<>();
        Iterable<Turno> turnosEnEspera = null;
    for (Turno turno : turnosEnEspera) {
        turnos.add(turno.toString());
    }
    return turnos;
}


    public static GestorTurnos getInstance(IBaseDatosRemota bdRemota) {
        if (instance == null) {
            instance = new GestorTurnos(bdRemota);
        }
        return instance;
    }

   
    public Turno generarTurno(String tipoUsuario, String numeroDocumento) {
        String letra = "";
        String consecutivo = String.format("%03d", contadorTurnos);
        if (tipoUsuario.equals("Cliente")) {
            letra = "C";
        } else if (tipoUsuario.equals("Paciente")) {
            letra = "P";
        } else if (tipoUsuario.equals("Trabajador")) {
            letra = "T";
        }
        String numeroTurno = letra + consecutivo;
        int tiempoEstimado = 10;
        Turno turno = new Turno(numeroTurno, tiempoEstimado);
        bdRemota.registrarTurno(numeroDocumento, numeroTurno, tiempoEstimado);
        contadorTurnos++;
        return turno;
    }

    public void atenderTurno(Turno turno) {
        // Aquí iría el código para atender el turno
    }

    public void cancelarTurno(Turno turno) {
        // Aquí iría el código para cancelar el turno
    }
    
}
