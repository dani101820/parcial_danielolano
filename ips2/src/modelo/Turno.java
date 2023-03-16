/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDateTime;

/**
 *
 * @author Daniel
 */
public class Turno {
   private String numero;
   private String tipoUsuario;
   private String numeroDocumento;
   private int tiempoAtencion;

   public Turno(String numero, String tipoUsuario, String numeroDocumento, int tiempoAtencion) {
      this.numero = numero;
      this.tipoUsuario = tipoUsuario;
      this.numeroDocumento = numeroDocumento;
      this.tiempoAtencion = tiempoAtencion;
   }

    Turno(String numeroTurno, int tiempoEstimado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   public String getNumero() {
      return numero;
   }

   public String getTipoUsuario() {
      return tipoUsuario;
   }

   public String getNumeroDocumento() {
      return numeroDocumento;
   }

   public int getTiempoAtencion() {
      return tiempoAtencion;
   }
}
