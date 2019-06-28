/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa4_persistencia;
import capa3_dominio.Pagos;

public class PagosDAO {
    
    private GestorJDBC gestorJDBC;
    
    public PagosDAO(GestorJDBC gestorJDBC) {
        this.gestorJDBC = gestorJDBC;
    }
    public void Pagar(Pagos pagos) throws Exception{
        
    }
    
}
