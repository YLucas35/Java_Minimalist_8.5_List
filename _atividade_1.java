package Java_Minimalista_85_Desafio_Livre;

import java.util.Scanner;

public class _atividade_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número (inteiro) positivo: ");
        int numero = sc.nextInt();
        int passos = 0;

        while (numero != 1) {
            if (numero % 2 == 0) {
                numero = numero / 2;
            } else {
                numero = (numero * 3) + 1;
            }
            passos++;
        }

        System.out.println("Passos necessários: "+passos);

        sc.close();
    }
}
