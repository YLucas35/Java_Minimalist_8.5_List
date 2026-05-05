package Java_Minimalista_85_Desafio_Livre;

import java.util.Scanner;

public class _atividade_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = 0;

        while (n1 >= 0) {
            System.out.print("Digite a primeira nota (negativo para sair): ");
            n1 = sc.nextDouble();

            if (n1 > 0) {
                System.out.print("Digite a segunda nota: ");
                double n2 = sc.nextDouble();
                System.out.print("Digite a terceira nota: ");
                double n3 = sc.nextDouble();

                double maior, meio, menor;

                if (n1 >= n2 && n1 >= n3) {
                    maior = n1;
                    if (n2 >= n3) { meio = n2; menor = n3; }
                    else { meio = n3; menor = n2; }
                } else if (n2 >= n1 && n2 >= n3) {
                    maior = n2;
                    if (n1 >= n3) { meio = n1; menor = n3; }
                    else { meio = n3; menor = n1; }
                } else {
                    maior = n3;
                    if (n1 >= n2) { meio = n1; menor = n2; }
                    else { meio = n2; menor = n1; }
                }

                double media = (maior * 5 + meio * 3 + menor * 2) / 10;

                System.out.println("A Média Ponderada: " + media);

                if (media >= 7 && n1 >= 4 && n2 >= 4 && n3 >= 4) {
                    System.out.println("Status: Aprovado Especial");
                } else {
                    System.out.println("Status: Não se qualificou");
                }
            }
        }

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
