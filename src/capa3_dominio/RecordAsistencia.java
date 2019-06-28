/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa3_dominio;

public class RecordAsistencia {
    private int numeroDeFaltas;
    private int numeroDeTardanzas;
    private int numeroDeDiasExtra;
    private int horasExtra;

    public RecordAsistencia() {
    }

    public RecordAsistencia(int numeroDeFaltas, int numeroDeTardanzas, int numeroDeDiasExtra, int horasExtra) {
        this.numeroDeFaltas = numeroDeFaltas;
        this.numeroDeTardanzas = numeroDeTardanzas;
        this.numeroDeDiasExtra = numeroDeDiasExtra;
        this.horasExtra = horasExtra;
    }

    public int getNumeroDeFaltas() {
        return numeroDeFaltas;
    }

    public void setNumeroDeFaltas(int numeroDeFaltas) {
        this.numeroDeFaltas = numeroDeFaltas;
    }

    public int getNumeroDeTardanzas() {
        return numeroDeTardanzas;
    }

    public void setNumeroDeTardanzas(int numeroDeTardanzas) {
        this.numeroDeTardanzas = numeroDeTardanzas;
    }

    public int getNumeroDeDiasExtra() {
        return numeroDeDiasExtra;
    }

    public void setNumeroDeDiasExtra(int numeroDeDiasExtra) {
        this.numeroDeDiasExtra = numeroDeDiasExtra;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
    
    
    
}
