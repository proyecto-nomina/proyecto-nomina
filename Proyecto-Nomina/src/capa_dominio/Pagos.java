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
public class Pagos {
    private String sistemaDePension;
    private double monto;
    private Contrato contrato;
    private int horasExtra;
    private int Faltas;
    public double calcularPagoPorDia() {
        double pagoPorDia = 0;
        pagoPorDia = contrato.definirPagoContrato() / 30;
        return pagoPorDia;
    }

    public double calcularPagoPorHora() {
        double pagoPorHora = 0;
        pagoPorHora = calcularPagoPorDia() / 8;
        return pagoPorHora;
    }

    public double calcularPagoHorasExtra(int horasExtra) {
        double pagoHorasExtra = 0;
        if (horasExtra < 3 && horasExtra > 0) {
            return pagoHorasExtra = calcularPagoPorHora() * 0.25;
        } else {
            return pagoHorasExtra = calcularPagoPorHora() * 0.35;
        }

    }

    public double calcularPagoDiasFeriados() {
        double pagoDiasFeriados = 0;
        pagoDiasFeriados = calcularPagoPorDia() * 0.35;
        return pagoDiasFeriados;
    }

    public double calcularDescuentoPension(String sistemaDePension) {
        double descuentoPension = 0;
        switch (sistemaDePension) {
            case "ONP":
                descuentoPension = contrato.definirPagoContrato() * 0.13;
                break;
            case "AFP":
                descuentoPension = contrato.definirPagoContrato() * 0.1173;
                break;
        }
        return descuentoPension;
    }

    public boolean validarImpuestoTrabajador() {
        boolean impuestoTrabajador = true;
        if (contrato.definirPagoContrato() > 2075) {
            return impuestoTrabajador;
        } else {
            return !impuestoTrabajador;
        }
    }

    public double calcularImpuesto() {
           double Impuesto=0;
           Impuesto=contrato.definirPagoContrato()*0.08;
        return Impuesto;
    }

    public double calcularDescuentoPorFalta(int Faltas) {
        double descuentoPorFaltas=0;
        
        descuentoPorFaltas= calcularPagoPorDia()*Faltas;
        return descuentoPorFaltas;
    }

    public double calcularMontoDeSueldo() {
        double montoDeSueldo; 

        montoDeSueldo =contrato.definirPagoContrato()- calcularImpuesto()+calcularPagoDiasFeriados()+
                calcularPagoHorasExtra(horasExtra)-calcularDescuentoPension(sistemaDePension)-calcularDescuentoPorFalta(Faltas);
        return 0;
    }

}
