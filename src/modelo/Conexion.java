/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.DriverManager;
import java.sql.SQLException;

// Clase que maneja la conexion a un archivo de base de datos SQLITE
public class Conexion {

    

    /**
     * //Probar si la base de datos existe y se puede abrir //
     * @param path: El nombre del archivo de base de datos SQLITE
     * @return Booleano: True si el archivo existe y se logra conectar, false si no.
     * @throws SQLException
     */
    public static boolean probar_base_de_datos(String path) throws SQLException{
        path = "jdbc:sqlite:"+path;
        try {
            System.out.println("Probando base de datos");
            DriverManager.getConnection(path);
            
        }
        catch (SQLException e) {
          return false;
        }
        return true;
    }
    
    
    
    
}

