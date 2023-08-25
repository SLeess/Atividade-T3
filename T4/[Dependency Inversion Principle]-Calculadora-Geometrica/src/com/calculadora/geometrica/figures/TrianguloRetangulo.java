package com.calculadora.geometrica.figures;

import com.calculadora.geometrica.interfaces.Ishape;

public class TrianguloRetangulo implements Ishape{
    private double c1, c2;

    public TrianguloRetangulo(double c1, double c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public Double getArea() {
        return (c1*c2)/2;
    }

    @Override
    public Double getPerimetro() {
        return c1+c2+getH();
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }

    public double getH() {
        return Math.sqrt(c1*c1 + c2*c2);
    }

    @Override
    public String toString(){
        return "Cateto 1: " + this.getC1() + "\nCateto 2: " + this.getC2() + "\nHipotenusa: " + this.getH();
    }
    
}
