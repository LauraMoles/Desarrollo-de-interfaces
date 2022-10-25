/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;
import java.sql.*;

/**
 *
 * @author laura Martínes Moles
 */
public class ConfBD {
    private String host;
    private String puerto;
    private String dbName;
    private String user;
    private String pass;

    public ConfBD(String host, String puerto, String dbName, String user, String pass) {
        this.host = host;
        this.puerto = puerto;
        this.dbName = dbName;
        this.user = user;
        this.pass = pass;
    }
    public Connection makeConnect(){
        try{
            String url="jdbc:mariadb://"+this.host+":"+this.puerto+"/"+this.dbName;
            Connection conex = (Connection) DriverManager.getConnection(url, this.user, this.pass);
            return conex;
        }catch(SQLException ex){
            System.out.println("Error al establecer la conexion "+ex.getMessage());
            return null;
        }
        
    }
//    public void closeConnect(ConfBD con){
//        try {
//            // Cerramos posibles conexiones abiertas
//            if (con!=null) con.close();    
//          } catch (Exception e) {
//            System.out.println("Error cerrando conexiones: " + e.toString());
//          } 
//    }
}
