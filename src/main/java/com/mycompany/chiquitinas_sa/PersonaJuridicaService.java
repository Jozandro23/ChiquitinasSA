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
public class PersonaJuridicaService extends Service implements Crud<PersonaJuridicaTO> {

    @Override
    public void insert(PersonaJuridicaTO personaJTO) throws Exception {

        Connection conectar = getConnection();
        PreparedStatement stmt = conectar.prepareStatement("INSERT INTO chiquitinas.cliente VALUES (?,?,?,?,?)");
        stmt.setInt(1, personaJTO.getId());
        stmt.setString(2, personaJTO.getNombre());
        stmt.setString(3, personaJTO.getDireccion());
        stmt.setString(4, personaJTO.getCorreo());
        stmt.setString(5, personaJTO.getContacto());
        stmt.execute();
        stmt.executeUpdate();
        close(stmt);
        close(conn);

    }

    @Override
    public void delete(PersonaJuridicaTO personaJTO) throws Exception {

        Connection conn = getConnection();
        PreparedStatement stmt = conn.prepareStatement("DELETE FROM cliente WHERE ID=?");
        stmt.setInt(1, personaJTO.getId());
        stmt.executeUpdate();

        close(stmt);
        close(conn);

    }

}
