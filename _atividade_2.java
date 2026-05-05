package Java_Minimalista_85_Desafio_Livre;

public class _atividade_2 {
    public static void main(String[] args) {
        int last = 0;
        int now = 1;
        int sumTotal = 0;

        while (now < 50000) {
            if (now % 2 != 0 && now % 3 == 0) {
                sumTotal += now;
            }
            
            int next = last + now;
            last = now;
            now = next;
        }
        System.out.println(sumTotal);
    }
}
