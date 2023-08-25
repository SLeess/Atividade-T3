/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calculadora.geometrica.figures;
/**
 *
 * @author wendell
 */
public class Shape {
    protected double comprimento, largura;
    
    public double getComprimento(){
        return this.comprimento;
    }
    
    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }
    
    public double getLargura(){
        return this.largura;
    }
    
    public void setLargura(double largura){
        this.largura = largura;
    }
    
    public double getArea(){
        return comprimento*largura;
    }
    
    public double getPerimetro(){
        return 2*comprimento + 2*largura;
    }
    
}
