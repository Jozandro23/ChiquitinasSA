
package com.mycompany.chiquitinas_sa.CapaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Service {
    
    //Atribtos
    private Connection conectar = null;
    private String url = "--------Digite el URL de la base de datos aqui ------------"; //Se busca el URL en el server
    private String usuario = "root"; //El usuario del MySQL
    private String password = "root"; // La contraseña del MySQL
    
    //Constructor

    public Service() {
    }
    
    
    public Connection conectarBBDD() throws SQLException {
        conectar = DriverManager.getConnection(url, usuario, password);
        System.out.println("Conexión Exitosa " + conectar);
        return conectar;
    }
    
    public Connection getConexion()
    {
        if (conectar == null)
            try{
                conectarBBDD();
            } catch(SQLException ex){
                
                
            }
        
        return conectar;
    }
}
