
package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class Conectar {
    Connection con = null;
   public Connection conexion()
   {
       try{
           
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost/conexionsql","root","");
           JOptionPane.showMessageDialog(null,"Conexion exitosa");
       }catch (Exception e){
           JOptionPane.showMessageDialog(null,"Error "+ e);
       }
       return con;
             
   }
    
}
