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
public class Clientes {

    private String id_cliente;
    private String primer_ape;
    private String cuenta_ban;
    private String telefono;

    public Clientes(String id_cliente, String primer_ape, String cuenta_ban, String telefono) {
        this.id_cliente = id_cliente;
        this.primer_ape = primer_ape;
        this.cuenta_ban = cuenta_ban;
        this.telefono = telefono;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getPrimer_ape() {
        return primer_ape;
    }

    public void setPrimer_ape(String primer_ape) {
        this.primer_ape = primer_ape;
    }

    public String getCuenta_ban() {
        return cuenta_ban;
    }

    public void setCuenta_ban(String cuenta_ban) {
        this.cuenta_ban = cuenta_ban;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Clientes: " + "id cliente=" + id_cliente + " Primer apellido: " + primer_ape + " Cuenta banco " + cuenta_ban + " Telefono: " + telefono;
    }

}
