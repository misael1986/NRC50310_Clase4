/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nrc50310_clase4;

/**
 *
 * @author misael.perilla
 */
public class Circulo extends Figura{
    
    private double radio;

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * radio * 2;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
