/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaunidad3;
import com.db4o.*;
/**
 *
 * @author Usuario
 */
public class vacunas {
    public static void main(String[] args) {
         ObjectContainer base=Db4o.openFile("C:\\Users\\Usuario\\Desktop\\Mela\\Vacunas.yap");
         CrearCliente(base,"Cli-001","Melanie","0150611234","0967549150");
         CrearPacientes(base, "123 ","Cli-001","morfeo", "mamifero","angora", "negro con blanco", "20/03/2019", 3);
         CrearVacuna(base,"1256","123","20/03/2019","inflamacion en la piernita", "12/06/2020");
       
        MostrarClientes(base);
        MostrarPaciente(base);
        MostrarVacuna(base);
        
    }
    public static void Cerrar_BD(ObjectContainer base) {
        base.close();
    }
    //CLIENTES
    public static void CrearCliente(ObjectContainer base, String id_cliente, String primer_ape, String cuenta_ban, String telefono) {
        if (ConsultarCliente(base, id_cliente) == 0) {
            Clientes cl = new Clientes(id_cliente, primer_ape, cuenta_ban, telefono);
            base.set(cl);
            System.out.println("Registro Guardado");
        } else {
            System.out.println("Registro ya existente ");
        }
    }
    public static int ConsultarCliente(ObjectContainer base, String id_cliente) {
        Clientes c = new Clientes(id_cliente, null, null, null);
        ObjectSet result = base.get(c);
        return result.size();
    }
    public static void MostrarClientes(ObjectContainer base) {
        Clientes cll = new Clientes(null, null, null, null);
        ObjectSet result = base.get(cll);
        System.out.println("Existen: " + result.size() + " clientes");
        while (result.hasNext()) {
            System.out.println(result.next());
        }
    }

    public static void ModificarCliente(ObjectContainer base, String id_cliente, String cuenta_ban) {
        Clientes n = new Clientes(id_cliente, null, null, null);
        ObjectSet res = base.get(n);
        if (res.size() != 0) {
            Clientes Am = (Clientes) res.next();
            Am.setCuenta_ban(cuenta_ban);
            base.set(Am);
        } else {
            System.out.println("No existe este registro");
        }
    }
    //PACIENTES-MASCOTAS
    public static void CrearPacientes(ObjectContainer base, String id_mascota, String id_Cliente, String alismas, String especie, String raza, String color_pelo, String fecha_naci, int vacunaciones) {
        if (ConsultarPaciente(base, id_mascota) == 0) {
            Paciente pa = new Paciente(id_mascota, id_Cliente, alismas, especie, raza, color_pelo, fecha_naci, vacunaciones);
            base.set(pa);
            System.out.println("Registro Guardado");
        } else {
            System.out.println("Registro ya existente ");
        }
    }

    public static int ConsultarPaciente(ObjectContainer base, String id_paciente) {
        Paciente pp = new Paciente(id_paciente, null, null, null, null, null, null, 0);
        ObjectSet result = base.get(pp);
        return result.size();
    }

    public static void MostrarPaciente(ObjectContainer base) {
        Paciente pe = new Paciente(null, null, null, null, null, null, null, 0);
        ObjectSet result = base.get(pe);
        System.out.println("Existen: " + result.size() + " pacientes");
        while (result.hasNext()) {
            System.out.println(result.next());
        }
    }

    public static void ModificarPaciente(ObjectContainer base, String id_paciente, String alismas) {
        Paciente pp = new Paciente(id_paciente, null, null, null, null, null, null, 0);
        ObjectSet res = base.get(pp);
        if (res.size() != 0) {
            Paciente Am = (Paciente) res.next();
            Am.setAlismas(alismas);
            base.set(Am);
        } else {
            System.out.println("No existe este registro");
        }
    }
    //VACUNAS
    public static void CrearVacuna(ObjectContainer base, String id_vacunas, String id_mascota, String fecha, String enfermedad, String fecha_proxima) {
        if (ConsultarPaciente(base, id_mascota) != 0) {
            if (ConsultarVacuna(base, id_vacunas) == 0) {
                Vacuna vv = new Vacuna(id_vacunas, id_mascota, fecha, enfermedad, fecha_proxima);
                base.set(vv);
                System.out.println("Registro Guardado");
            } else {
                System.out.println("Registro ya existente ");
            }
        } else {
            System.out.println("El id de Mascota no existe ");
        }
    }

    public static int ConsultarVacuna(ObjectContainer base, String id_vacuna) {
        Vacuna ve = new Vacuna(id_vacuna, null, null, null, null);
        ObjectSet result = base.get(ve);
        return result.size();
    }

    public static void MostrarVacuna(ObjectContainer base) {
        Vacuna vq = new Vacuna(null, null, null, null, null);
        ObjectSet result = base.get(vq);
        System.out.println("Existen: " + result.size() + " vacunas");
        while (result.hasNext()) {
            System.out.println(result.next());
        }
    }

    public static void ModificarVacuna(ObjectContainer base, String id_vacuna, String enfermedad) {
        Vacuna q = new Vacuna(id_vacuna, null, null, null, null);
        ObjectSet res = base.get(q);
        if (res.size() != 0) {
            Vacuna Am = (Vacuna) res.next();
            Am.setEnfermedad(enfermedad);
            base.set(Am);
        } else {
            System.out.println("No existe este registro");
        }
    }
}

