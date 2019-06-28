/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa3_dominio;

public class SueldoGrado {

    private String grado;

    public SueldoGrado() {
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public double calcularSueldo() {
        double sueldo = 0;
        switch (grado) {
            case "Bachiller":
                sueldo = 1200;
                break;
            case "Maestria":
                sueldo = 1500;
                break;
            case "Doctor":
                sueldo = 2000;
                break;
            case "Tecnico":
                sueldo = 950;
                break;
        }
        return sueldo;
    }


}
