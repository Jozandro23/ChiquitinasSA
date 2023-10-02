/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiquitinas_sa;

import com.mycompany.chiquitinas_sa.Crud;
import com.mycompany.chiquitinas_sa.Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author julio
 */
public class ProductoService extends Service implements Crud<ProductoTO> {

    @Override
    public void insert(ProductoTO productoTO) throws Exception {
       
        Connection conectar = getConnection();
        PreparedStatement stmt = conectar.prepareStatement("INSERT INTO chiquitinas.producto VALUES (?,?,?,?)");
        stmt.setInt(1, productoTO.getId());
        stmt.setString(2, productoTO.getNombre());
        stmt.setDouble(3, productoTO.getPrecio());
        stmt.setInt(4, productoTO.getImpuesto());
        stmt.execute();
        stmt.executeUpdate();
        close(stmt);
        close(conn);
        
    }

    @Override
    public void delete(ProductoTO productoTO) throws Exception {
        
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM producto WHERE ID=?");
            stmt.setInt(1, productoTO.getId());
            stmt.executeUpdate();
            
            close(stmt);
            close(conn);
            
            
        } catch (SQLException ex) {
            System.out.println("Error al eliminar usuario: " + ex.getMessage());
        }
        
        
    }
    
    
        public void update(ProductoTO productoTO) throws Exception {
        
        try{
            Connection conn= getConnection();
            PreparedStatement stmt = conn.prepareStatement("UPDATE chiquitinas.producto SET nombre = ?, precio= ?, impuesto= ? WHERE (id = ?) ");
            stmt.setString(1, productoTO.getNombre());
            stmt.setDouble(2, productoTO.getPrecio());
            stmt.setDouble(3, productoTO.getImpuesto());
            stmt.setInt(4, productoTO.getId());
            
        }catch (SQLException ex) {
            System.out.println("Error al actualizar el producto: " + ex.getMessage());
 
        }
        
    }
    
    
}
