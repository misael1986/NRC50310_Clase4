/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nrc50310_clase4;

/**
 *
 * @author misael.perilla
 */
public class Cuadrado extends Figura implements Impresion{
    
    private double lado;

    @Override
    public double calcularArea() {
        //return lado*lado;
        return Math.pow(lado, 2);
        
    }

    @Override
    public double calcularPerimetro() {
        
        return lado*4;
    }

    /**
     * @return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }

    
    @Override
    public void ImprimirArea() {
        System.out.println("El valor del Area es:"+calcularArea());
    }

    
    @Override
    public void ImprimirPerimetro() {
        System.out.println("El valor del perimetro es:"+calcularPerimetro());
    }

    @Override
    public void Imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
