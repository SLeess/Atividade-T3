package com.calculadora.geometrica.figures;

import com.calculadora.geometrica.interfaces.Ishape;

public class TrianguloRetangulo implements Ishape{
    private double c1, c2, h;

    public TrianguloRetangulo(double c1, double c2, double h) {
        this.c1 = c1;
        this.c2 = c2;
        this.h = h;
    }

    @Override
    public Double getArea() {
        return (c1*c2)/2;
    }

    @Override
    public Double getPerimetro() {
        return c1+c2+h;
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
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    
    
}
