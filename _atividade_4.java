package Java_Minimalista_85_Desafio_Livre;

import java.util.Scanner;

public class _atividade_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double consume = -1; // Inicializamos com -1 para entrar no loop

        while (consume != 0) {
            System.out.print("Digite o consumo em m³ (ou 0 para sair): ");
            consume = sc.nextDouble();

            if (consume > 0) {
                double accountValue;

                if (consume <= 15) {
                    accountValue = 35.00;
                } else if (consume <= 30) {
                    accountValue = 35.00 + ((consume - 15) * 4.50);
                } else {
                    accountValue = 35.00 + ((consume - 15) * 7.00);
                }

                System.out.printf("O valor da conta é: R$ %.2f%n", accountValue);
            }
        }
        System.out.println("Programa encerrado.");
        sc.close();
    }
}
