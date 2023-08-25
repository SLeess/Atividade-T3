package T4.srcCorrigido.main;

import java.util.Scanner;
import T4.srcCorrigido.*;

public class Main {
    public static void main(String[] args) {
        int opt = -1;
        Scanner ler = new Scanner(System.in);
        System.out.println("Sistema de Cálculos Geométricos");

        do{
            System.out.println("Selecione uma das opções a seguir:");
            System.out.println("[1] - Criar Figura");
            System.out.println("[2] - Realizar operações geométricas");
            System.out.println("[3] - Encerrrar");
            opt = ler.nextInt();
        }while(opt != 3);

        ler.close();
    }
}
