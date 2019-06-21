/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa4_persistencia;

import capa3_dominio.SueldoGrado;

public class SueldoGradoDAO {
    
    private GestorJDBC gestorJDBC;
    
    public SueldoGradoDAO(GestorJDBC gestorJDBC) {
        this.gestorJDBC = gestorJDBC;
    }
    public void guardar(SueldoGrado sueldoGrado) throws Exception{
        
    }
}
