/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa3_dominio;

import java.sql.Date;
import java.time.LocalDate;

public class Pagos {

    private double monto;
    private String pagoId;
    private double aumento;
    private double descuento;
    private Date fecha;
    private Contrato contrato;

    public Pagos() {
    }

    public Pagos(double monto, String pagoId, double aumento, double descuento, Date fecha, Contrato contrato) {
        this.monto = monto;
        this.pagoId = pagoId;
        this.aumento = aumento;
        this.descuento = descuento;
        this.fecha = fecha;
        this.contrato = contrato;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getPagoId() {
        return pagoId;
    }

    public void setPagoId(String pagoId) {
        this.pagoId = pagoId;
    }

    public double getAumento() {
        return aumento;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public double aumentoTotal() {
        aumento = contrato.calcularAumento();
        return aumento;
    }

    public double descuentoTotal() {
        descuento = contrato.calcularDescuento();
        return descuento;
    }
    
    public double montoTotal(){
    monto = contrato.calcularMontoDeSueldo();
        return monto;
    }
    
    public void calcularFecha(){
        fecha= Date.valueOf(LocalDate.now());
    }
}
