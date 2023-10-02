/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiquitinas_sa;

import com.mycompany.chiquitinas_sa.Crud;
import com.mycompany.chiquitinas_sa.Service;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author julio
 */
public class ProductoService extends Service implements Crud<ProductoTO> {

    @Override
    public void insert(ProductoTO productoTO) throws Exception {
        
        try{
            PreparedStatement stmt = super.getConexion().prepareStatement("INSERT INTO producto(nombre, precio, impuesto) VALUES (?,?,?)");
            stmt.setString(1, productoTO.getNombre());
            stmt.setDouble(2, productoTO.getPrecio());
            //cambiar BdD
            stmt.setString(3, productoTO.getImpuesto());
            stmt.execute();

            stmt.close();
            
        }catch (SQLException ex) {
            System.out.println("Error al insertar usuario: " + ex.getMessage());
 
        }
        
    }

    @Override
    public void delete(ProductoTO productoTO) throws Exception {
        
        try{
            PreparedStatement stmt = super.getConexion().prepareStatement("DELETE FROM producto WHERE ID=?");
            stmt.setInt(1, productoTO.getId());
            stmt.executeUpdate();

            stmt.close();
            
        }catch (SQLException ex) {      
            System.out.println("Error al insertar usuario: " + ex.getMessage());
        }
        
        
    }
    
    
        public void update(ProductoTO productoTO) throws Exception {
        
        try{
            PreparedStatement stmt = super.getConexion().prepareStatement("UPDATE chiquitinas.producto SET nombre = ?, precio= ?, impuesto= ? WHERE (id = ?) ");
            stmt.setString(1, productoTO.getNombre());
            stmt.setDouble(2, productoTO.getPrecio());
            //cambiar BdD
            stmt.setDouble(3, productoTO.getImpuesto());
            stmt.setInt(4, productoTO.getId());
            
        }catch (SQLException ex) {
            System.out.println("Error al insertar usuario: " + ex.getMessage());
 
        }
        
    }
    
    
}
