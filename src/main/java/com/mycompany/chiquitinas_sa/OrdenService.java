/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiquitinas_sa;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author lizan
 */
public class OrdenService extends Service implements Crud<OrdenTO>{

    @Override
    public void insert(OrdenTO ordenTO) throws Exception {
        
        Connection conn = getConnection();
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO chiquitinas.orden VALUES (?,?,?,?)");
        stmt.setInt(1, ordenTO.getId());
        stmt.setDate(2, ordenTO.getFecha());
        stmt.setInt(3, ordenTO.getCliente());
        stmt.setInt(4, ordenTO.getItem);
        stmt.execute();
        stmt.executeUpdate();
        close(stmt);
        close(conn);
        
    }

    @Override
    public void delete(OrdenTO obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
