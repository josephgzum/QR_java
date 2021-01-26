
package ModeloDAO;

import Conexion.Conexion;
import Modelo.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginDAO {
    Conexion cn = new Conexion();
    Usuarios us = new Usuarios();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
 public int login(Usuarios us){
     String sql ="select * from usuarios where dni=? and clave=?";
     int estado=0;
     try{
         con=cn.Conection();
         ps=con.prepareStatement(sql);
         ps.setInt(1,us.getDni());
         ps.setString(2,us.getPass());
         rs=ps.executeQuery();
         while(rs.next()){
             estado=1;
         }
     }catch(Exception e){
         
     }
     return estado;
 }   
    
 public int id_user(Usuarios us){
     String sql ="select * from usuarios where dni=? and clave=?";
     int id=0;
     try{
         con=cn.Conection();
         ps=con.prepareStatement(sql);
         ps.setInt(1,us.getDni());
         ps.setString(2,us.getPass());
         rs=ps.executeQuery();
         while(rs.next()){
             id=rs.getInt("id_usuario");
         }
     }catch(Exception e){
         
     }
     return id;
 }   
    
}
