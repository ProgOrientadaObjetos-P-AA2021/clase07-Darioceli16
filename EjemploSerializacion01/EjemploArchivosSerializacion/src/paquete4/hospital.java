/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.io.Serializable;

/**
 *
 * @author Smart
 */
public class hospital implements Serializable{

    private String nombre;
    private int numeroCamas;
    private double presupuesto;

    public hospital(String nom, int num, double presu) {
        nombre = nom;
        numeroCamas = num;
        presupuesto = presu;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerNumCamas(int n) {
        numeroCamas = n;
    }

    public void establecerPresopuesto(double n) {
        presupuesto = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }

    public double obtenerPresupueto() {
        return presupuesto;
    }

    // Agregar valor de objetos de tipo hospital a un archivo y leer archivo
}
