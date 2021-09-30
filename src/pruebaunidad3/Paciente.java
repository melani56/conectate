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
public class Paciente {

    private String id_mascota;
    private String id_Cliente;
    private String alismas;
    private String especie;
    private String raza;
    private String color_pelo;
    private String fecha_naci;
    private int vacunaciones;

    public Paciente(String id_mascota, String id_Cliente, String alismas, String especie, String raza, String color_pelo, String fecha_naci, int vacunaciones) {
        this.id_mascota = id_mascota;
        this.id_Cliente = id_Cliente;
        this.alismas = alismas;
        this.especie = especie;
        this.raza = raza;
        this.color_pelo = color_pelo;
        this.fecha_naci = fecha_naci;
        this.vacunaciones = vacunaciones;
    }

    public String getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(String id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(String id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getAlismas() {
        return alismas;
    }

    public void setAlismas(String alismas) {
        this.alismas = alismas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor_pelo() {
        return color_pelo;
    }

    public void setColor_pelo(String color_pelo) {
        this.color_pelo = color_pelo;
    }

    public String getFecha_naci() {
        return fecha_naci;
    }

    public void setFecha_naci(String fecha_naci) {
        this.fecha_naci = fecha_naci;
    }

    public int getVacunaciones() {
        return vacunaciones;
    }

    public void setVacunaciones(int vacunaciones) {
        this.vacunaciones = vacunaciones;
    }

    @Override
    public String toString() {
        return "Paciente: " + " id_mascota: " + id_mascota + " id_Cliente: " + id_Cliente + " Alias mascota: " + alismas + " Especie: " + especie + ", raza=" + raza + " Color pelo: " + color_pelo + " Fecha nacimiento: " + fecha_naci + " Vacunaciones: " + vacunaciones ;
    }
    
    

}
