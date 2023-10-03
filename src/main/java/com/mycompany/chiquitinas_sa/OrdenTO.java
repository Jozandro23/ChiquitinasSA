/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiquitinas_sa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdenTO {

    //Atributos
    private int id;
    private Date fecha;
    private ClienteTO cliente;
    private List<ItemTO> listaItem = new ArrayList<ItemTO>();

    //Constructores
    public OrdenTO() {
    }

    public OrdenTO(int id, Date fecha, ClienteTO cliente) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    //Metodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ClienteTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteTO cliente) {
        this.cliente = cliente;
    }

    public void agregarItem(ItemTO item) {
        this.listaItem.add(item);
    }
    
    // Fin

    @Override
    public String toString() {
        
        
        
        StringBuffer sb = new StringBuffer();
        sb.append("====================================================\n");
        sb.append("==================== CHIQUITINAS ===================\n");
        sb.append("====================================================\n");
        sb.append("Nombre:\t"+this.cliente.getNombre()+"\tNo. Orden: "+this.getId()+"\n");
        sb.append("Dirección:"+this.getCliente().getDireccion()+"\tCorreo: "+this.getCliente().getCorreo()+"\n");
        sb.append("====================================================\n");
        for (ItemTO item : this.listaItem) {
            double impuesto = 0.0;
            if (item.getProducto() instanceof Remolacha) {
                impuesto = ((Remolacha)item.getProducto()).getImpuesto();
            }
            
            
            sb.append(item.getConsecutivo() + " - "
                    + item.getCantidad() + " - "
                    + item.getProducto().getNombre() + " - "
                    + item.getProducto().getPrecio()+ 
                    " - "+impuesto+"\n");
        }
        
        return sb.toString() ;
    }
    
    

}
