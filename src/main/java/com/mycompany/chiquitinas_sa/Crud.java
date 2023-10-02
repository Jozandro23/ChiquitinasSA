package com.mycompany.chiquitinas_sa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


/**
 *
 * @author lizan
 */
public interface Crud <T>{
    public void insert(T obj)throws Exception;
    public void delete(T obj)throws Exception;
}
