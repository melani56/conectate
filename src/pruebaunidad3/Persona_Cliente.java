/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaunidad3;

/**
 *
 * @author Dell
 */
public class Persona_Cliente {
     private String id_relacilacion; 
      private String id_cliente; 
       private String id_persona; 

    public Persona_Cliente(String id_relacilacion, String id_cliente, String id_persona) {
        this.id_relacilacion = id_relacilacion;
        this.id_cliente = id_cliente;
        this.id_persona = id_persona;
    }

    public String getId_relacilacion() {
        return id_relacilacion;
    }

    public void setId_relacilacion(String id_relacilacion) {
        this.id_relacilacion = id_relacilacion;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    @Override
    public String toString() {
        return "Persona Cliente: " + "Id relacilacion: " + id_relacilacion + " Id cliente=" + id_cliente + " Id persona: " + id_persona ;
    }
       
}
