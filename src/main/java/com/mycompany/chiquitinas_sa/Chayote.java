/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiquitinas_sa;

/**
 *
 * @author lizan
 */
public class Chayote extends Producto implements Taxeable{

    @Override
    public double getImpuesto() {
        return 0.02;
    }

}
