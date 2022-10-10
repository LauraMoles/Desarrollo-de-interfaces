/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author laura
 */
public class Datos implements Serializable{
    private ArrayList cuidados = new ArrayList();
    private ArrayList cuidadores = new ArrayList();
    private ArrayList animales = new ArrayList();
    private ArrayList especialidades = new ArrayList();
    
    public Datos(){
    }
    public Datos (Datos copia){
        
        for (int i = 0; i < copia.getCuidados().size(); i++) {
            this.cuidados.add(copia.getCuidados().get(i));
        }
        
        for (int i = 0; i < copia.getCuidadores().size(); i++) {
            this.cuidadores.add(copia.getCuidadores().get(i));
        }
        for (int i = 0; i < copia.getAnimales().size(); i++) {
            this.animales.add(copia.getAnimales().get(i));
        }
        for (int i = 0; i < copia.getEspecialidades().size(); i++) {
            this.especialidades.add(copia.getEspecialidades().get(i));
        }
    }

    public ArrayList getCuidados() {
        return cuidados;
    }

    public void setCuidados(Cuidados cuidados) {
        
        this.cuidados.add(cuidados);
    }

    public ArrayList getCuidadores() {
        return cuidadores;
    }

    public void setCuidadores(Cuidadores cuidadores) {
        this.cuidadores.add(cuidadores);
    }

    public ArrayList getAnimales() {
        return animales;
    }

    public void setAnimales(Animales animales) {
        this.animales.add(animales);
    }

    public ArrayList getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidad especialidades) {
        this.especialidades.add(especialidades);
    }

    @Override
    public String toString() {
        return "Datos{" + "\n CUIDADOS=" + cuidados + "\n CUIDADORES=" + cuidadores + "\n ANIMALES=" + animales + "\n ESPECIALIDADES=" + especialidades + '}';
    }
    
    
}
