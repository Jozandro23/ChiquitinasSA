/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiquitinas_sa;

/**
 *
 * @author lizan
 */
public class ClienteTO {
    //Atributos
    protected int id;
    protected String nombre;
    protected String direccion;
    protected String correo;
    
    //Constructores
    public ClienteTO() {
    }

    public ClienteTO(int id, String nombre, String direccion, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = direccion;
        this.direccion = correo;
    }
    
    
    
    //Metodos
    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
