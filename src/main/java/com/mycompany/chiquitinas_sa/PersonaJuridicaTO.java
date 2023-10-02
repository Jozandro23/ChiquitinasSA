/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiquitinas_sa;

import java.io.Serializable;

/**
 *
 * @author lizan
 */
public class PersonaJuridicaTO extends ClienteTO implements Serializable{
    
    //Atributos
    private String contacto;

    //Constructores
    public PersonaJuridicaTO(String contacto) {
        this.contacto = contacto;
    }

    public PersonaJuridicaTO(String contacto, int id, String nombre, String correo, String direccion) {
        super(id, nombre, correo, direccion);
        this.contacto = contacto;
    }

    //Metodos
    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    
    
}
