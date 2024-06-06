/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
to change this license
 */

package com.mycompany.nrc50310_clase4;

/**
 *
 * @author misael.perilla
 */
public class NRC50310_Clase4 {

    public static void main(String[] args) {
        
        Cuadrado cuadrado= new Cuadrado();
        cuadrado.setLado(23.5);
        System.out.println(cuadrado.calcularArea());
        Circulo circle= new Circulo(4.7);
        System.out.println(circle.calcularArea());
        Ovoide elipse= new Ovoide(3,6);
        System.out.println(elipse.calcularArea());
        Persona p= new Persona("Misael","Perilla",
                "Benitez");
        p.Imprimir();
        
    }
}
