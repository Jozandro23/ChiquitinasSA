package com.mycompany.chiquitinas_sa;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Service {
    //atributo
	protected Connection conn = null;
	
    public Service() {
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    protected Connection getConnection() throws Exception {
        //Paso 1
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Paso 2
        
        //----------------- AQUÍ TUVE QUE CAMBIAR EL URL PORQUE ME DABA ERROR -------------------------
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chiquitinas?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
        //System.out.println("CONEXION: " + conn);
        return conn;
    }

    protected void close(Connection conn) throws SQLException {

        if (conn != null && !conn.isClosed()) {

            conn.close();
            conn = null;
        }
    }

    protected void close(ResultSet rs) throws SQLException {
        if (rs != null && !rs.isClosed()) {
            rs.close();
            rs = null;
        }
    }
    
    protected void close(PreparedStatement ps) throws SQLException {
        if (ps != null && !ps.isClosed()) {

            ps.close();
            ps = null;
        }
    }
}

