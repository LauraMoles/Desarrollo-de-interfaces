package zoo;


import java.io.Serializable;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Laura Martínez Moles
 */
public class Cuidados implements Serializable{

    // Atributos
    private String pelaje;
    private String tipoComida;
    private String habitat;
    private float precioComida;
    private float costeMedio;
    private float cicloComida;
    private ArrayList todosCuidados = new ArrayList();
    private String nombre;
    
    
    //Constructores
//    public Cuidados() {
//    }
    
      public Cuidados(Cuidados copia){
        this.pelaje = copia.pelaje;
        this.tipoComida = copia.tipoComida;
        this.habitat = copia.habitat;
        this.precioComida = copia.precioComida;
        this.costeMedio = copia.costeMedio;
        this.cicloComida = copia.cicloComida;
        this.nombre = copia.nombre;
        this.todosCuidados = copia.todosCuidados;
      }

    public Cuidados(String pelaje, String tipoComida, String habitat, float precioComida, float costeMedio, float cicloComida, String nombre) {
        this.pelaje = pelaje;
        this.tipoComida = tipoComida;
        this.habitat = habitat;
        this.precioComida = precioComida;
        this.costeMedio = costeMedio;
        this.cicloComida = cicloComida;
        this.nombre = nombre;
        
    }

    //Pelaje
    public String getPelaje() {
        return pelaje;
    }
    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    //Tipo comida
    public String getTipoComida() {
        return tipoComida;
    }
    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    //Habitat
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    //Precio comida
    public float getPrecioComida() {
        return precioComida;
    }
    public void setPrecioComida(float precioComida) {
        this.precioComida = precioComida;
    }

    //Coste Medio
    public float getCosteMedio() {
        return costeMedio;
    }
    public void setCosteMedio(float costeMedio) {
        this.costeMedio = costeMedio;
    }

    //Ciclo comida
    public float getCicloComida() {
        return cicloComida;
    }
    public void setCicloComida(float cicloComida) {
        this.cicloComida = cicloComida;
    }
    
    //total cuidados
    public  ArrayList getTodosCuidados(){
        return todosCuidados;
    }
    public  void setTodosCuidados(Cuidados cuidados){
        todosCuidados.add(cuidados);
    }
    
    //nombre 
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuidados{" + "pelaje=" + pelaje + ", tipoComida=" + tipoComida + ", habitat=" + habitat + ", precioComida=" + precioComida + ", costeMedio=" + costeMedio + ", cicloComida=" + cicloComida + ", nombre=" + nombre + '}';
    }
    public String toString2(){
        return "Lista cuidados"+todosCuidados.toString();
    }
    
    
}
