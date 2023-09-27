/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiquitinas_sa;

/**
 *
 * @author lizan
 */
public class PersonaJuridicaTO extends ClienteTO {
    
    //Atributos
    private String contacto;

    //Constructores
    public PersonaJuridicaTO(String contacto) {
        this.contacto = contacto;
    }

    public PersonaJuridicaTO(String contacto, int id, String nombre, String correo) {
        super(id, nombre, correo);
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
