/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.chiquitinas_sa;

import java.time.Clock;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lizan
 */
public class Chiquitinas_SA {

    public static void main(String[] args) throws Exception {
        
        ClienteTO clTO = new ClienteTO(0, "Juan", "Puntarenas", "Juanito@gmail.com"); 
        ClienteService cliente = new ClienteService();
        cliente.insert(clTO);
        
        OrdenTO ordTO = new OrdenTO(0, new Date, clTO);
        
        ProductoTO prTO = new ProductoTO(0, "Remolacha", 100, 0);
        
        
        
    }
}
