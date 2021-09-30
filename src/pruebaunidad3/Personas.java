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
public class Personas {
     private String id_persona,nombre,apellido,genero,direccion; 

    public Personas(String id_persona, String nombre, String apellido, String genero, String direccion) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.direccion = direccion;
    }

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Personas: " + " Id persona: " + id_persona + " Nombre: " + nombre + " Apellido: " + apellido + " Genero: " + genero + " Direccion: " + direccion + '}';
    }
     
     
}
