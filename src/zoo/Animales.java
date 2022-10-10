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
public class Animales implements Serializable{
    private String tipo;// "terrestre","aereo","marino"
    
    private String especie;
    private String raza;
    private float peso;
    private int patas;
    private boolean activo;
    private String area;
    private Cuidados cuidado;
    private boolean peligroExtincion;
    
    //Constructores
    public Animales(){
    }

    public Animales(String especie, String raza, float peso, int patas, boolean activo,String tipo,String cuidado, boolean peligroExtincion) {
        this.especie = especie;
        this.raza = raza;
        this.peso = peso;
        this.patas = patas;
        this.activo = activo;
        this.tipo= tipo; 
        //this.cuidado = cuidado;
        
        Datos dato = new Datos(GestionFicheros.loadDatos());
        Iterator < Cuidados > it = dato.getCuidados().iterator(); 
        while (it.hasNext()) {
            Cuidados pac = it.next();
            if(pac.getNombre().equals(cuidado)){
                this.cuidado=pac;
            }
            
        }
        
        
        
        this.peligroExtincion = peligroExtincion;
    }

    
    //Getters
    public String getEspecie (Animales animal){
        return animal.especie;
    }
    public String getRaza (Animales animal){
        return animal.raza;
    }
    public float getPeso (Animales animal){
        return animal.peso;
    }
    public int getPatas (Animales animal){
        return animal.patas;
    }
    public boolean getActivo (Animales animal){
        return animal.activo;
    }
    public Cuidados getCuidado (){
        return cuidado;
    }
    public boolean getpeligroExtincion (Animales animal){
        return animal.peligroExtincion;
    }
    
    //Setters
    public void setEspecie (String dato){
        this.especie = dato;
    }
    public void setRaza (String dato){
        this.raza = dato;
    }
    public void setPeso (float dato){
        this.peso = dato;
    }
    public void setPatas (int dato){
        this.patas = dato;
    }
    public void setActivo (boolean dato){
        this.activo = dato;
    }
    public void setCuidado (Cuidados dato){
        this.cuidado = dato;
    }
    public void setpeligroExtincion (boolean dato){
        this.peligroExtincion = dato;
    }

    @Override
    public String toString() {
        return "\n\ttipo=" + tipo + ", especie=" + especie + ", raza=" + raza + ", peso=" + peso + ", patas=" + patas + ", activo=" + activo + ", area=" + area +  ", peligroExtincion=" + peligroExtincion + ", cuidado=" + cuidado + "\n";
    }
    
    
}
