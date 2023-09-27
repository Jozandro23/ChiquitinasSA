/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chiquitinas_sa;

import java.time.Clock;

/**
 *
 * @author lizan
 */
public class Chiquitinas_SA {

    public static void main(String[] args) {
        OrdenTO orden = new OrdenTO();
        
        
        ClienteTO cliente = new PersonaFisica();
        cliente.setId(1);
        
        cliente.setNombre("Pedro");
        cliente.setCorreo("pepe@gmail.com");
        
        //Se que se puede hacer directo, pero me dio una embolia :v
        String nombre = cliente.getNombre();
        String correo = cliente.getCorreo();
        
        System.out.println( nombre+ " " + " " +correo);
    }
}
