/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiquitinas_sa;


public class ItemTO {
    
    //Atributos
    private int consecutivo;
    private double cantidad;
    private ProductoTO producto;

    //constructores
    public ItemTO() {
    }

    public ItemTO(int consecutivo, double cantidad, ProductoTO producto) {
        this.consecutivo = consecutivo;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    //Metodos
    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public ProductoTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoTO producto) {
        this.producto = producto;
    }
    
    
    
    
}
