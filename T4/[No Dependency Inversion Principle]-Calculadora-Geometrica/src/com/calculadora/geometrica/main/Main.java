/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calculadora.geometrica.main;

import com.calculadora.geometrica.figures.*;
import java.util.Scanner;
/**
 *
 * @author wendell
 */
public class Main {
    public static void main(String[] args){
        int opt;
        Scanner ler = new Scanner(System.in);
        Quadrilatero quadrilatero = new Quadrilatero();
        TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo();
        Circulo circulo = new Circulo();
        
        while(true){
            System.out.println("--------Sistema de Calculos Geometricos-------");
            System.out.println("\nSelecione uma figura:");
            System.out.println("(1) Quadrilatero");
            System.out.println("(2) Triangulo Retangulo");
            System.out.println("(3) Circulo");
            System.out.println("(0) Sair");
            System.out.printf(": ");
            opt = ler.nextInt();
            
            if(opt == 0)
                break;
            
            switch (opt) {
                case 1 -> {
                    System.out.printf("\nComprimento: ");
                    quadrilatero.setComprimento(ler.nextDouble());
                    System.out.printf("Largura: ");
                    quadrilatero.setLargura(ler.nextDouble());
                    System.out.println("\nArea -> " + quadrilatero.getArea() + " u.a^2");
                    System.out.println("Perimetro -> " + quadrilatero.getPerimetro() + " u.a");
                }
                case 2 -> {
                    System.out.printf("\nComprimento: ");
                    trianguloRetangulo.setComprimento(ler.nextDouble());
                    System.out.printf("Largura: ");
                    trianguloRetangulo.setLargura(ler.nextDouble());
                    System.out.println("\nArea -> " + trianguloRetangulo.getArea() + " u.a^2");
                    System.out.println("Perimetro -> " + trianguloRetangulo.getPerimetro() + " u");
                    System.out.println("Hipotenuza -> " + trianguloRetangulo.getHipotenuza()+ " u");
                }
                case 3 -> {
                    System.out.printf("\nRaio: ");
                    circulo.setRaio(ler.nextDouble());
                    System.out.println("\nArea -> " + circulo.getArea() + " u.a^2");
                    System.out.println("Perimetro -> " + circulo.getPerimetro() + " u");
                }
                default -> {
                }
            }
            System.out.println("");
        }
    }
}
