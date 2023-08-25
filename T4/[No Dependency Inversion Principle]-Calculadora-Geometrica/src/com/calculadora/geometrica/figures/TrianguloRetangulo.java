/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calculadora.geometrica.figures;

/**
 *
 * @author wendell
 */
public class TrianguloRetangulo extends Shape{
    
    public double getHipotenuza(){
        return Math.sqrt(super.comprimento*super.comprimento + super.largura*super.largura);
    }
    
    @Override
    public double getArea(){
        return super.getArea()/2;
    }
    
    @Override
    public double getPerimetro(){
        return super.comprimento + super.largura + getHipotenuza();
    }
}
