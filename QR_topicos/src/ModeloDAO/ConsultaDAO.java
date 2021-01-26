
package ModeloDAO;

import Conexion.Conexion;
import Modelo.Consulta;
import Modelo.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultaDAO {
            Conexion cn = new Conexion();
    Usuarios us = new Usuarios();
    Consulta ct = new Consulta();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
public void insertar(Consulta ct){
   String sql="insert into consultas(dni,fecha,accion,contenido) value(?,?,?,?)";
   try{
         con=cn.Conection();
         ps=con.prepareStatement(sql);
         ps.setInt(1,ct.getDni());
         ps.setString(2,ct.getFecha());
         ps.setInt(3,ct.getAccion());
         ps.setString(4,ct.getContenido());
         ps.executeUpdate();
   }catch(Exception e){
       
   }
}    
public int dni(int id){
   String sql="select dni from usuarios where id_usuario="+id;
   int dni_user=0;
   try{
         con=cn.Conection();
         ps=con.prepareStatement(sql);
         rs=ps.executeQuery();
         while(rs.next()){
             dni_user=rs.getInt("dni");
         }
   }catch(Exception e){
       
   }
   return dni_user;
}    
}
