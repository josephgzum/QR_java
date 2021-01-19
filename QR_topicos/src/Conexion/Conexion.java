/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Gambo
 */
public class Conexion {
    Connection con;
public Connection Conection(){
    
    try{
       Class.forName("com.mysql.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_topicos","root","");
        if (con!=null) {
            System.out.println("Conexion Exitosa");
        }
 
    }catch(Exception e){
            System.out.println("Error en la Conexion");
    }
    return con;
}
}
