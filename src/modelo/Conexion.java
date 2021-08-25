/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


        
/**
 * https://github.com/xerial/sqlite-jdbc
 * @author User
 */
public class Conexion {

    //Probar si la base de datos existe y se puede abrir
    public static boolean probar_base_de_datos(String path) throws SQLException{
        path = "jdbc:sqlite:"+path;
        try {
            System.out.println("Probando base de datos");
            DriverManager.getConnection(path);
            
        }
        catch (Exception e) {
          return false;
        }
        return true;
    }
    
    
}

