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
public class ItemService extends Service implements Crud<ItemTO> {

    @Override
    public void insert(ItemTO itemTO) throws Exception {

        Connection conectar = getConnection();
        PreparedStatement stmt = conectar.prepareStatement("INSERT INTO chiquitinas.item VALUES (?,?,?)");
        stmt.setInt(1, itemTO.getConsecutivo());
        stmt.setDouble(2, itemTO.getCantidad());
        stmt.setInt(3, itemTO.getProducto().getId());

        stmt.execute();
        stmt.executeUpdate();
        close(stmt);
        close(conn);

    }

    @Override
    public void delete(ItemTO itemTO) throws Exception {

        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM item WHERE CONSECUTIVO=?");
            stmt.setInt(1, itemTO.getConsecutivo());
            stmt.executeUpdate();

            close(stmt);
            close(conn);

        } catch (SQLException ex) {
            System.out.println("Error al eliminar usuario: " + ex.getMessage());
        }

    }

    public void update(ItemTO itemTO) throws Exception {
        Connection conn = getConnection();
        PreparedStatement stmt = conn.prepareStatement("UPDATE chiquitinas.item SET cantidad = ?, producto= ? WHERE (consecutivo = ?) ");
        stmt.setDouble(1, itemTO.getCantidad());
        stmt.setInt(2, itemTO.getProducto().getId());

        stmt.setInt(2, itemTO.getConsecutivo());
        stmt.executeUpdate();

        System.out.println("Se actualizó con exito");

        close(stmt);
        close(conn);

    }

}
