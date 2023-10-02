package com.mycompany.chiquitinas_sa;

import com.mycompany.chiquitinas_sa.CapaDatos.Crud;
import com.mycompany.chiquitinas_sa.CapaDatos.Service;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ClienteService extends Service implements Crud<ClienteTO>{

    @Override
    public void insert(ClienteTO clienteTO) throws Exception {
        
        try {

            //super.conectarBBDD();
            PreparedStatement stmt = super.getConexion().prepareStatement("INSERT INTO cliente(nombre, correo, direccion) VALUES (?,?,?)");
            //stmt.setInt(1, userTO.getId());
            stmt.setString(1, clienteTO.getNombre());
            stmt.setString(2, clienteTO.getCorreo());
            stmt.setString(3, clienteTO.getDireccion());
            stmt.execute();

            stmt.close();
            //super.getConexion().close();
        } catch (SQLException ex) {
            System.out.println("Error al insertar usuario: " + ex.getMessage());
        }
        
    }

    @Override
    public void delete(ClienteTO clienteTO) throws Exception {
        try{
                    //super.conectarBBDD();
            PreparedStatement stmt = super.getConexion().prepareStatement("DELETE FROM cliente WHERE ID=?");
            stmt.setInt(1, clienteTO.getId());
            stmt.executeUpdate();

            stmt.close();
            //super.getConexion().close();
        } catch (SQLException ex){
            System.out.println("Error al eliminar usuario: " + ex.getMessage());
        }

    }
    
    public void actualizar(ClienteTO clienteTO) throws Exception{
        
        PreparedStatement stmt = super.getConexion().prepareStatement("UPDATE chiquitinas.cliente SET nombre = ?, correo= ?, direccion= ? WHERE (id = ?) ");
            stmt.setString(1, clienteTO.getNombre());
            stmt.setString(2, clienteTO.getCorreo());
            stmt.setString(3, clienteTO.getDireccion());
            stmt.setInt(4, clienteTO.getId());
            stmt.executeUpdate();

            System.out.println("Se actualizó con exito");

            stmt.close();
        
    }
    
    
}
