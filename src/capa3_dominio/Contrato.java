/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa3_dominio;

public class Contrato {

    private int idContrato;
    private String tipoContrato;
    private SueldoGrado sueldoGrado;
    private Trabajador trabajador;
    private RecordAsistencia recordAsistencia;
    private String sistemaDePension;

    public Contrato() {
    }

    public Contrato(int idContrato, String tipoContrato, SueldoGrado sueldoGrado, Trabajador trabajador, RecordAsistencia recordAsistencia, String sistemaDePension) {
        this.idContrato = idContrato;
        this.tipoContrato = tipoContrato;
        this.sueldoGrado = sueldoGrado;
        this.trabajador = trabajador;
        this.recordAsistencia = recordAsistencia;
        this.sistemaDePension = sistemaDePension;
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

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public RecordAsistencia getRecordAsistencia() {
        return recordAsistencia;
    }

    public void setRecordAsistencia(RecordAsistencia recordAsistencia) {
        this.recordAsistencia = recordAsistencia;
    }

    public String getSistemaDePension() {
        return sistemaDePension;
    }

    public void setSistemaDePension(String sistemaDePension) {
        this.sistemaDePension = sistemaDePension;
    }

    public double definirPagoContrato() {
        double sueldo = 0;
        switch (tipoContrato) {
            case "full time":
                sueldo = sueldoGrado.calcularSueldo();
                break;
            case "part time":
                sueldo = sueldoGrado.calcularSueldo() / 2;
                break;
        }
        return sueldo;
    }

    public double calcularPagoPorDia() {
        double pagoPorDia = 0;
        pagoPorDia = definirPagoContrato() / 30;
        return pagoPorDia;
    }

    public double calcularPagoPorHora() {
        double pagoPorHora = 0;
        pagoPorHora = calcularPagoPorDia() / 8;
        return pagoPorHora;
    }

    public double calcularPagoHorasExtra() {
        double pagoHorasExtra = 0;
        if (recordAsistencia.getHorasExtra() < 3 && recordAsistencia.getHorasExtra() > 0) {
            return pagoHorasExtra = calcularPagoPorHora() * 0.25;
        } else {
            return pagoHorasExtra = calcularPagoPorHora() * 0.35;
        }
    }

    public double calcularPagoDiasExtra() {
        double pagoDiasFeriados = 0;
        pagoDiasFeriados = calcularPagoPorDia() * 0.35;
        return pagoDiasFeriados;
    }

    public double calcularDescuentoDePension(String sistemaDePension) {
        double descuentoPension = 0;
        switch (sistemaDePension) {
            case "ONP":
                descuentoPension = definirPagoContrato() * 0.13;
                break;
            case "AFP":
                descuentoPension = definirPagoContrato() * 0.1173;
                break;
        }
        return descuentoPension;
    }

    public double calcularDescuentoPorFaltas() {
        double descuentoPorFaltas = 0;
        descuentoPorFaltas = calcularPagoPorDia() * recordAsistencia.getNumeroDeFaltas();
        return descuentoPorFaltas;
    }

    public double calcularImpuesto() {
        double impuesto = 0;
        impuesto = definirPagoContrato() * 0.08;
        return impuesto;
    }

    public boolean esImpuestoValido() {
        boolean impuestoTrabajador = true;
        if (definirPagoContrato() > 2075) {
            return impuestoTrabajador;
        } else {
            return !impuestoTrabajador;
        }
    }

    public double calcularDescuento() {
        double descuento = 0;
        descuento = calcularImpuesto() + calcularDescuentoDePension(sistemaDePension) + calcularDescuentoPorFaltas();
        return descuento;
    }

    public double calcularAumento() {
        double aumento = 0;
        aumento = calcularPagoDiasExtra() + calcularPagoHorasExtra();
        return aumento;
    }

    public double calcularMontoDeSueldo() {
        double montoDeSueldo;
        montoDeSueldo = definirPagoContrato() - calcularDescuento() + calcularAumento();
        return montoDeSueldo;
    }
}
