/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package basededatos;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
    public interface IBaseDatosRemota {
    public boolean consultarDocumento(String documento);
    public void agregarDocumento(String documento);
    public void eliminarDocumento(String documento);
    public ArrayList<String> obtenerDocumentos();

    public void registrarTurno(String documento, String numeroTurno, int tiempoEstimado);
}

    
