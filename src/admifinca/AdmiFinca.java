/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admifinca;

import java.sql.SQLException;
import modelo.Conexion;
import modelo.Sample;

 
/**
 *
 * @author User
 */
public class AdmiFinca {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        System.out.println("Ejecutando main");
        
        //Sample ejemplo = new Sample();
        //Sample.main();
        
        if (Conexion.probar_base_de_datos("finca.sqlite")){
            System.out.println("Base de datos conectada");
        }   
    }
}
