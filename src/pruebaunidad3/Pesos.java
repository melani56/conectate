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
public class Pesos {

    private String id_peso;
    private String id_mascota;
    private String fecha;
    private String peso;

    public Pesos(String id_peso, String id_mascota, String fecha, String peso) {
        this.id_peso = id_peso;
        this.id_mascota = id_mascota;
        this.fecha = fecha;
        this.peso = peso;
    }

    public String getId_peso() {
        return id_peso;
    }

    public void setId_peso(String id_peso) {
        this.id_peso = id_peso;
    }

    public String getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(String id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pesos: " + "Id peso=" + id_peso + " Id mascota: " + id_mascota + " Fecha: " + fecha + " Peso: " + peso;
    }
    
    
}
