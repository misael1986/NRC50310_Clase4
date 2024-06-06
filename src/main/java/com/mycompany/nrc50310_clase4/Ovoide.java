/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nrc50310_clase4;

/**
 *
 * @author misael.perilla
 */
public class Ovoide extends Figura {

    private double semiejeA;
    private double semiejeB;

    @Override
    public double calcularArea() {
        return Math.PI * semiejeA * semiejeB;
    }

    @Override
    public double calcularPerimetro() {
        double a = semiejeA;
        double b = semiejeB;
        return Math.PI * (3 * (a + b) - Math.sqrt(((3 * a) + b) * (a + (3 * b))));
    }

    public double getSemiejeA() {
        return semiejeA;
    }

    public void setSemiejeA(double semiejeA) {
        this.semiejeA = semiejeA;
    }

    public double getSemiejeB() {
        return semiejeB;
    }

    public void setSemiejeB(double semiejeB) {
        this.semiejeB = semiejeB;
    }

    public Ovoide(double semiejeA, double semiejeB) {
        this.semiejeA = semiejeA;
        this.semiejeB = semiejeB;
    }

}
