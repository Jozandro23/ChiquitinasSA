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
public class ItemService extends Service implements Crud<ItemTO> {

    @Override
    public void insert(ItemTO itemTO) throws Exception {
        
        try{
            PreparedStatement stmt = super.getConexion().prepareStatement("INSERT INTO item(consecutivo, cantidad, producto_id) VALUES (?,?,?)");
            stmt.setInt(1, itemTO.getConsecutivo());
            stmt.setDouble(2, itemTO.getCantidad());
            stmt.setInt(3, itemTO.getProducto().getId());
            stmt.execute();

            stmt.close();
            
        }catch(SQLException ex){
            System.out.println("Error al insertar usuario: " + ex.getMessage());

        }
        
        
    }

    @Override
    public void delete(ItemTO itemTO) throws Exception {
               
        try{
            PreparedStatement stmt = super.getConexion().prepareStatement("DELETE FROM item WHERE consecutivo=?");
            stmt.setInt(1, itemTO.getConsecutivo());
            stmt.executeUpdate();

            stmt.close();
            
            stmt.close();
            
        }catch(SQLException ex){
            System.out.println("Error al insertar usuario: " + ex.getMessage());

        }
        
    }
    
    public void update(ItemTO itemTO) throws Exception {
     
        try{
            PreparedStatement stmt = super.getConexion().prepareStatement("UPDATE chiquitinas.item SET cantidad = ?, producto= ?, WHERE (id = ?) ");
            stmt.setDouble(1, itemTO.getCantidad());
            stmt.setInt(2, itemTO.getProducto().getId());
            
            stmt.setInt(4, itemTO.getConsecutivo());
            
            
        }catch(SQLException ex){
            System.out.println("Error al insertar usuario: " + ex.getMessage());

        }
        
    }
    
    
    
    
}
