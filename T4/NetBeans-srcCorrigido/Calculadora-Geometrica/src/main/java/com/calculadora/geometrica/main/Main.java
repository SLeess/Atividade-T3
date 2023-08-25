package com.calculadora.geometrica.main;

import com.calculadora.geometrica.figures.Quadrilatero;
import com.calculadora.geometrica.interfaces.Ishape;
import java.util.Scanner;
//import com.calculadora.geometrica.*;

public class Main {
    public static void main(String[] args) {
        int opt = -1;
        Scanner ler = new Scanner(System.in);
        System.out.println("Sistema de Cálculos Geométricos");
        Ishape figure = null;

        do{
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
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
                opt = ler.nextInt();
                if(opt == 1)
                    double x = ler.nextDouble();
                    figure = new Quadrilatero();
            }
        }while(opt != 5);

        ler.close();
    }
}
