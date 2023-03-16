/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basededatos;

/**
 *
 * @author Daniel
 */

import java.util.Arrays;
import java.util.List;

public abstract class BDRemotaArreglo implements IBaseDatosRemota {
    private String[] documentos = {"123456789", "987654321", "246813579"};

    public List<String> consultarTurnosAtendidos(String documento) {
        // En este caso, como no se están registrando los turnos atendidos, simplemente se devuelve una lista vacía
        return Arrays.asList();
    }

    public void registrarTurno(String documento, String numeroTurno, int tiempoEstimado) {
        // En este caso, no se está registrando el turno en la base de datos, sino que se muestra en pantalla
        System.out.println("Turno registrado en BD Remota: ");
        System.out.println("Documento: " + documento);
        System.out.println("Número de turno: " + numeroTurno);
        System.out.println("Tiempo estimado: " + tiempoEstimado + " minutos");
    }
}
