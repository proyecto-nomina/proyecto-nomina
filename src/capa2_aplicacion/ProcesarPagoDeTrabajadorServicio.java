
package capa2_aplicacion;

import capa4_persistencia.PagosDAO;
import capa3_dominio.Pagos;
import capa4_persistencia.GestorJDBC;
import capa4_persistencia.GestorJDBCPostgre;


public class ProcesarPagoDeTrabajadorServicio {
    private GestorJDBC gestorJDBC;
    private PagosDAO pagosDAO;

    public ProcesarPagoDeTrabajadorServicio() {
        gestorJDBC = new GestorJDBCPostgre();
        pagosDAO = new PagosDAO(gestorJDBC);
    }
    
    /*public void pagarTrabajadores(Pagos pagos) throws Exception{
        if(!contrato.validarImpuestoTrabajador()){
            throw new Exception("El impuesto no es valido");
        }
        
    }
    */
  }


