/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Herramientas.ConfBD;
//import java.beans.Statement; libreria del diablo no volver a poner en la vida >:(
//import com.sun.jdi.connect.spi.Connection; x2 a lo de arriba >:(
import java.sql.*;



/**
 *
 * @author laura
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        //ConfBD ("localhost","3306","zoo","root","").makeconnect();
        ConfBD conexion = new ConfBD ("localhost","3306","zoo","root","");
        Connection bd = conexion.makeConnect();
        
        String consulta= "SELECT * FROM animales";
        
        
        try{
            //Connection conex = (java.sql.Connection) DriverManager.getConnection("jdbc:mariadb://localhost:3306/zoo","root","");
            
            Statement stmt = (Statement) bd.createStatement();

            ResultSet rs=stmt.executeQuery(consulta);
            System.out.println("Imprimiendo ejemplo 1");
            while(rs.next())
            {
                System.out.println( rs.getString(2)); //También podríamos haber usado el nombre de la columna, por ejemplo: rs.getString("nombre");
            }
        } catch (SQLException sqle) { 
          System.out.println("Error en la ejecución:" + sqle.getErrorCode() + " " + sqle.getMessage());    
        }
        
    }
    
}
