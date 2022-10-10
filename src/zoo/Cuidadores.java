package zoo;

import herramientas.GestionFicheros;
import java.io.Serializable;
import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laura
 */
public class Cuidadores implements Serializable{
    
    //Atributos
    private static int totalCuidadores=0;
    
    private int idCuidador;
    private String nombre;
    private String apellidos;
    private Especialidad especialidad;

    public Cuidadores( String nombre, String apellidos, String especialidad) {
        this.idCuidador = totalCuidadores;
        this.nombre = nombre;
        this.apellidos = apellidos;
        
        
        Datos dato = new Datos(GestionFicheros.loadDatos());
        Iterator < Especialidad > it = dato.getEspecialidades().iterator(); 
        while (it.hasNext()) {
            Especialidad pac = it.next();
            if(pac.getEspecialidad().equals(especialidad)){
                this.especialidad=pac;
            }
        }
        
        totalCuidadores++;
    }

    public int getIdCuidador() {
        return idCuidador;
    }

    public void setIdCuidador(int idCuidador) {
        this.idCuidador = idCuidador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "\n\tidCuidador=" + idCuidador + ", nombre=" + nombre + ", apellidos=" + apellidos + ", especialidad=" + especialidad + "\n";
    }

   
    
    
    
    
}
