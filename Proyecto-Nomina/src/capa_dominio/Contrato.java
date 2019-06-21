/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_dominio;

/**
 *
 * @author COMPUTO-INGENIERIA
 */
public class Contrato {

    private int idContrato;
    private String tipoContrato;
    private SueldoGrado sueldoGrado;

    public Contrato() {
    }

    public Contrato(int idContrato, String tipoContrato, SueldoGrado sueldoGrado) {
        this.idContrato = idContrato;
        this.tipoContrato = tipoContrato;
        this.sueldoGrado = sueldoGrado;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public SueldoGrado getSueldoGrado() {
        return sueldoGrado;
    }

    public void setSueldoGrado(SueldoGrado sueldoGrado) {
        this.sueldoGrado = sueldoGrado;
    }

  public double definirPagoContrato() {
     double sueldo=0;
     switch(tipoContrato){
         case "full time": sueldo=sueldoGrado.calcularSueldoGrado();break;
         case "part time": sueldo=sueldoGrado.calcularSueldoGrado()/2;break;
     }
      return sueldo;
    }
}
