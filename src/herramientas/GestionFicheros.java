/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientas;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import zoo.Cuidados;
import zoo.Datos;

/**
 *
 * @author laura
 */
public class GestionFicheros implements Serializable{
    
    public GestionFicheros(){}
    
    private FileOutputStream fileOut;
    private ObjectOutputStream output;
    
    private static ObjectInputStream input;
    private static FileInputStream fileInput;
    
    //private Cuidados cuidadoGeneral;
    
    
    
    //abrir Guardar los datos 
    public void saveCare(Datos datosgeneral, Cuidados cuidado, String nombreFich) throws IOException {
        Datos dato = new Datos(datosgeneral); // Se hace una copia de los datos que hay actualmente en el fichero 
        dato.setCuidados(cuidado); // se le añaden los nuevos cuidados
        
        fileOut = new FileOutputStream("datos/".concat(nombreFich)); // Se dice donde se van a guardar los datos
        output = new ObjectOutputStream(fileOut); // Se selecciona

        output.writeObject(dato); // Se escriben los datos
        output.close(); // Se cierra la conexion con el fichero
    }
    
    // Carga los datos que hay en el fichero
    public static Datos loadCuidados(String nombreFich){
        Datos datos = new Datos(); // se crea la variable para guardar los datos
        try {
            
            File fichero = new File ("datos/".concat(nombreFich)); // se elige el fichero
            if(fichero.exists()){ // Si el fichero esta creado
                fileInput = new FileInputStream("datos/".concat(nombreFich)); // Selecciono el archivo del que quiero extraer datos
                input = new ObjectInputStream(fileInput); // Los extraigo
                 datos = new Datos ((Datos)input.readObject()); // Clono el objeto almacenado al objeto anterior (esta parte puede sobrar)
                
                input.close(); // Cierro la conexion con el archivo
                fileInput.close(); // X2
            }
            return datos; // Se devuelve el objeto vacio 
            
        } catch (EOFException eof) {
            return datos; // Se devuelve el objeto vacio 

        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionFicheros.class.getName()).log(Level.SEVERE, null, ex);
            return datos; // Se devuelve el objeto vacio 

        } catch (IOException ex) {
            Logger.getLogger(GestionFicheros.class.getName()).log(Level.SEVERE, null, ex);
            return datos; // Se devuelve el objeto vacio 

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionFicheros.class.getName()).log(Level.SEVERE, null, ex);
            return datos; // Se devuelve el objeto vacio 

        }
       
    }
    
}
