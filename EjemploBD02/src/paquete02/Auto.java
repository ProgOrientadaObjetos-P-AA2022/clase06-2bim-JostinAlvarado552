/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Auto {

    private String placa;
    private double valorMatricula;

    public void establecerPlaca(String p) {
        placa = p;
    }

    public void establecerValorMatricula(double p) {
        valorMatricula = p;
    }

    public String obtenerPlaca() {
        return placa;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    public String toString() {
        String cadena = "";
        cadena = String.format("Placa: %s\t Matricula: %.2f", obtenerPlaca(), obtenerValorMatricula());

        return cadena;
    }
}
