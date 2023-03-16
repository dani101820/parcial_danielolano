package utilidades;

import basededatos.BDRemotaArreglo;
import controlador.ControladorTurnos;
import java.util.ArrayList;
import modelo.GestorTurnos;
import vista.Pantalla;

/**
 *
 * @author Daniel
 */
public class Main {

    public static void main(String[] args) {
        // Crear instancia de la base de datos remota
        BDRemotaArreglo bdRemota = new BDRemotaArreglo() {
            @Override
            public boolean consultarDocumento(String documento) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void agregarDocumento(String documento) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void eliminarDocumento(String documento) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public ArrayList<String> obtenerDocumentos() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };

        // Crear instancia del gestor de turnos
        GestorTurnos gestorTurnos = new GestorTurnos(bdRemota);

        // Crear instancia de la pantalla
        Pantalla pantalla = new Pantalla();

        // Crear instancia del controlador de turnos
        ControladorTurnos controladorTurnos = new ControladorTurnos(gestorTurnos, pantalla);

        // Iniciar la pantalla y el controlador de turnos
        pantalla.iniciar(controladorTurnos);
        controladorTurnos.iniciar();
    }
}
