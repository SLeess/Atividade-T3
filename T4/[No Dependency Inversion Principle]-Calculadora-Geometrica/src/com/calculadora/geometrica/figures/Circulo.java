/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calculadora.geometrica.figures;

/**
 *
 * @author wendell
 */
public class Circulo extends Shape{
    protected double raio;
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double getArea(){
        return Math.PI*this.raio*this.raio;
    }
    
    @Override
    public double getPerimetro(){
        return 2*Math.PI*this.raio;
    }
}
