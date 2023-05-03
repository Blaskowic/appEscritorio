/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.*;
import java.sql.DriverManager;
/**
 *
 * @author Julian Corredor
 */
public class conexion {
    
    Connection con;
    
    public Connection conectar(){
       try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba_java", "root", "");
    } catch (Exception e) {
    System.out.println("Error al conectar con la base de datos: " + e.getMessage());
    }
    return con;
    }        
   
}
