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
public class Vacuna {
     private String id_vacunas,id_mascota,fecha,enfermedad,fecha_proxima; 

    public Vacuna(String id_vacunas,String id_mascota,String fecha, String enfermedad, String fecha_proxima) {
       this.id_mascota = id_mascota;
        this.id_vacunas = id_vacunas;
        this.fecha = fecha;
        this.enfermedad = enfermedad;
        this.fecha_proxima = fecha_proxima;
    }

    public String getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(String id_mascota) {
        this.id_mascota = id_mascota;
    }
     

    public String getId_vacunas() {
        return id_vacunas;
    }

    public void setId_vacunas(String id_vacunas) {
        this.id_vacunas = id_vacunas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getFecha_proxima() {
        return fecha_proxima;
    }

    public void setFecha_proxima(String fecha_proxima) {
        this.fecha_proxima = fecha_proxima;
    }
    

 

    @Override
    public String toString() {
        return "Vacunas: " + "Id vacunas=" + id_vacunas + " Id_mascota: "+id_mascota+" Fecha: " + fecha + " Enfermedad: " + enfermedad + " Fecha proxima: " + fecha_proxima;
    }
      
    
}
