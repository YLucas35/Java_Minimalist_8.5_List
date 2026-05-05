package Java_Minimalista_85_Desafio_Livre;

import java.util.Scanner;

public class _atividade_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double popA = 50000;
        double popB = 150000;
        int anos = 0;

        System.out.print("Digite a taxa de crescimento anual da cidade A (ex: 3 para 3%): ");
        double taxaA = sc.nextDouble() / 100;
        double taxaB = 0.015;

        while (popA < popB) {
            popA += popA * taxaA;
            popB += popB * taxaB;
            anos++;

            if ((popB - popA < 10000) || (anos % 5 == 0)) {
                System.out.println("Ano "+anos+" - Atenção: Cidades se aproximando em tamanho!");
            }
        }

        System.out.println("Levou "+anos+" anos para a cidade A ultrapassar a B.");
        System.out.println("População A: "+(int)popA);
        System.out.println("População B: "+(int)popB);

        sc.close();
    }
}
