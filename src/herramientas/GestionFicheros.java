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
import java.util.ArrayList;
import java.util.Iterator;
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
    
    
    
    //abrir escribir 
    public void saveCare(Datos datosgeneral, Cuidados cuidado, String nombreFich) throws IOException {
        Datos dato = new Datos(datosgeneral);
        System.out.println(dato + " \n Antes de guardar");
        dato.setCuidados(cuidado);
        System.out.println(dato + " \n Listo para guardar");
        
        fileOut = new FileOutputStream("datos/".concat(nombreFich));
        output = new ObjectOutputStream(fileOut);

        output.writeObject(dato);
        System.out.println(dato.getCuidados().toString() +"Escritos" );
        
        
        output.close();
    }
    public static Datos loadCuidados(String nombreFich){
        Datos datos = new Datos();
        try {
            
            File fichero = new File ("datos/".concat(nombreFich));
            if(fichero.exists()){ 
                fileInput = new FileInputStream("datos/".concat(nombreFich));
                input = new ObjectInputStream(fileInput);
                 datos = new Datos ((Datos)input.readObject());
                
                input.close();
                fileInput.close();
                System.out.println(datos.toString() + "Load");
            }
            //System.out.println(a.getCuidados());
            return datos;
            
        } catch (EOFException eof) {
            return datos;

        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionFicheros.class.getName()).log(Level.SEVERE, null, ex);
            return datos;

        } catch (IOException ex) {
            Logger.getLogger(GestionFicheros.class.getName()).log(Level.SEVERE, null, ex);
            return datos;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionFicheros.class.getName()).log(Level.SEVERE, null, ex);
            return datos;

        }
       
    }
    
}
