/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chiquitinas_sa;

import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author lizan
 */
public class Chiquitinas_SA {

    public static void main(String[] args) throws Exception {
        OrdenTO orden = new OrdenTO();
        Scanner lector = new Scanner(System.in);
        int i= 1;
        
        while (i==1){
            
            System.out.println("¿Deseas realizar una factura?");
            System.out.println("1- Si");
            System.out.println("2- No");
            int opc = lector.nextInt();
            
            if (opc == 1){
                System.out.println("Ingrese los datos del comprador");
                System.out.print("Nombre --> ");
                String nom = lector.next();
                System.out.print("Provincia --> ");
                String dir = lector.next();
                System.out.print("Email --> ");
                String email = lector.next();
                
                
                
                ClienteService cliente = new ClienteService();
                ClienteTO clienteTO = new ClienteTO(0, nom, dir, email);
                cliente.insert(clienteTO);
                System.out.println("Datos ingresados correctamente");
                
                
            }else{
                System.out.println("Fin del sistema");
            }
            
            
        }
        
        
    }
}
