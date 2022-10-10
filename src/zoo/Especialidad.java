package zoo;

import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laura
 */
public class Especialidad implements Serializable{
    
    //Atributos
    private String especialidad;
    private float salarioMedio;
    private int peligrosidad;
    private int cantAnimales;

    public Especialidad(String especialidad, float salarioMedio, int peligrosidad, int cantAnimales) {
        this.especialidad = especialidad;
        this.salarioMedio = salarioMedio;
        this.peligrosidad = peligrosidad;
        this.cantAnimales = cantAnimales;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public float getSalarioMedio() {
        return salarioMedio;
    }

    public void setSalarioMedio(float salarioMedio) {
        this.salarioMedio = salarioMedio;
    }

    public int getPeligrosidad() {
        return peligrosidad;
    }

    public void setPeligrosidad(int peligrosidad) {
        this.peligrosidad = peligrosidad;
    }

    public int getCantAnimales() {
        return cantAnimales;
    }

    public void setCantAnimales(int cantAnimales) {
        this.cantAnimales = cantAnimales;
    }

    @Override
    public String toString() {
        return "\n\tespecialidad=" + especialidad + ", salarioMedio=" + salarioMedio + ", peligrosidad=" + peligrosidad + ", cantAnimales=" + cantAnimales + "\n";
    }
    
    
    
}
