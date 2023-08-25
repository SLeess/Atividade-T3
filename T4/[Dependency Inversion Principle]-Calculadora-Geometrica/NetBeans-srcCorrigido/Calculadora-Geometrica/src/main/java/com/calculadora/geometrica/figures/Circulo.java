package com.calculadora.geometrica.figures;

import com.calculadora.geometrica.interfaces.Ishape;

public class Circulo implements Ishape{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public Double getArea() {
        return 3.1415*raio*raio;
    }

    @Override
    public Double getPerimetro() {
        return 2*3.1415*raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
