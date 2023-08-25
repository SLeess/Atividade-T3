package com.calculadora.geometrica.figures;

import com.calculadora.geometrica.interfaces.Ishape;
import static java.lang.Math.PI;

public class Circulo implements Ishape{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public Double getArea() {
        return PI*raio*raio;
    }

    @Override
    public Double getPerimetro() {
        return 2*PI*raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
