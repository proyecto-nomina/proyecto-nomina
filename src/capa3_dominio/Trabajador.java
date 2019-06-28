/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa3_dominio;

public class Trabajador {
    private int trabajadorid;
    private String nombre;
    private String dni;    
    
    public Trabajador(){
        
    }

    public int getTrabajadorid() {
        return trabajadorid;
    }

    public void setTrabajadorid(int trabajadorid) {
        this.trabajadorid = trabajadorid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    

}
