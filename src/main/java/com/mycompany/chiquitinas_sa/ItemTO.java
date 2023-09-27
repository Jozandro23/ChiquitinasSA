/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiquitinas_sa;


public class ItemTO {
    
    //Atributos
    private int consecutivo;
    private double cantidad;
    private Producto producto;

    //constructores
    public ItemTO() {
    }

    public ItemTO(int consecutivo, double cantidad, Producto producto) {
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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    
    
}
