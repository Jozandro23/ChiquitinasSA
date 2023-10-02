package com.mycompany.chiquitinas_sa;

import com.mycompany.chiquitinas_sa.Crud;
import com.mycompany.chiquitinas_sa.Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteService extends Service implements Crud<ClienteTO> {

    @Override
    public void insert(ClienteTO clienteTO) throws Exception {
        
        Connection conectar = getConnection();
        PreparedStatement stmt = conectar.prepareStatement("INSERT INTO chiquitinas.cliente VALUES (?,?,?,?)");
        stmt.setInt(1, clienteTO.getId());
        stmt.setString(2, clienteTO.getNombre());
        stmt.setString(3, clienteTO.getDireccion());
        stmt.setString(4, clienteTO.getCorreo());
        stmt.execute();
        stmt.executeUpdate();
        close(stmt);
        close(conn);

    }

    @Override
    public void delete(ClienteTO clienteTO) throws Exception {
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM cliente WHERE ID=?");
            stmt.setInt(1, clienteTO.getId());
            stmt.executeUpdate();
            
            close(stmt);
            close(conn);
            
            
        } catch (SQLException ex) {
            System.out.println("Error al eliminar usuario: " + ex.getMessage());
        }

    }

    public void actualizar(ClienteTO clienteTO) throws Exception {
        
        Connection conn = getConnection();
        PreparedStatement stmt = conn.prepareStatement("UPDATE chiquitinas.cliente SET nombre = ?, direccion= ?, correo= ? WHERE (id = ?) ");
        stmt.setString(1, clienteTO.getNombre());
        stmt.setString(2, clienteTO.getDireccion());
        stmt.setString(3, clienteTO.getCorreo());
        stmt.setInt(4, clienteTO.getId());
        stmt.executeUpdate();

        System.out.println("Se actualizó con exito");

        stmt.close();

    }

}
