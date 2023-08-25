package com.calculadora.geometrica.main;

import com.calculadora.geometrica.figures.*;
import com.calculadora.geometrica.interfaces.Ishape;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opt = -1;
        Scanner ler = new Scanner(System.in);
        System.out.println("Sistema de Cálculos Geométricos");
        Ishape figure = null;
        
        do{
            
            System.out.println("Selecione uma das opções a seguir:");
            System.out.println("[1] - Criar Figura");
            System.out.println("[2] - Realizar operações geométricas");
            System.out.println("[5] - Encerrrar");
            System.out.print("Opção: ");
            opt = ler.nextInt();
            
            if(opt == 1){
                System.out.println("\nQual figura deseja criar:");
                System.out.println("[1] - Quadrilátero");
                System.out.println("[2] - Circulo");
                System.out.println("[3] - Triângulo Retângulo");
                System.out.print("Opção: ");
                //opt = 
                switch (ler.nextInt()) {
                    case 1:
                        System.out.print("Digite os valores de x e y do quadrilátero: ");
                        figure = new Quadrilatero(ler.nextDouble(), ler.nextDouble());
                        break;
                    case 2:
                        System.out.print("Digite o valor do raio do círculo: ");
                        figure = new Circulo(ler.nextDouble());
                        break;
                    case 3:
                        System.out.print("Digite o valor dos catetos e da hipotenusa: ");
                        figure = new TrianguloRetangulo(ler.nextDouble(),ler.nextDouble(),ler.nextDouble());
                        break;
                    default:
                        break;
                }
                System.out.print("\n\n\n");
                System.out.println("Figura Criada com sucesso");
            }
            
            else if(opt == 2){
                System.out.print("\n\nFigura selecionada atualmente: ");
                if(figure instanceof Quadrilatero){
                    System.out.println("Quadrilátero");
                } else if(figure instanceof Circulo){
                    System.out.println("Círculo");
                } else if(figure instanceof TrianguloRetangulo){
                    System.out.println("Triângulo Retângulo");
                }
                System.out.print(figure.toString());
                
                System.out.println("\nO que deseja calcular da figura?");
                System.out.println("[1] - Calcular área");
                System.out.println("[2] - Calcular perímetro");
                System.out.print("Opção: ");
                switch (ler.nextInt()) {
                    case 1:
                        System.out.println("\n\n\nA àrea da figura equivale a: " + figure.getArea() + "ua²");
                        break;
                    case 2:
                        System.out.println("\n\n\nO perímetro da figura equivale a: " + figure.getPerimetro() + "ua²");
                        break;
                    default:
                        break;
                }
            }
        }while(opt != 5);

        ler.close();
    }
}
