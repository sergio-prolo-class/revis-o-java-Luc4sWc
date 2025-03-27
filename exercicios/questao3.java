import java.util.Scanner;
public class questao3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com a quantidade de alunos: ");
        int quantidade = teclado.nextInt();

        System.out.print("Entre com a nota dos alunos separadas por espaço: ");
        float [] notas = new float [quantidade];
        for (int i = 0; i < quantidade; i++) {
            notas[i] = teclado.nextFloat();
        }

        int[][] intervalos = {
                {0,2}, {3,5}, {6,8}, {9,10}
        };
        int[] frequencia = new int[intervalos.length]; //vai ser usado pra contar os asteristicos em cada intervalo

        for (float nota : notas) {
            for (int j = 0; j < intervalos.length; j++) {
                if (nota >= intervalos[j][0] && nota <= intervalos[j][1]) { //compara se a nota está dentro do intervalo ex: nota >= 0 && nota <= 2
                    frequencia[j]++;
                    break;
                }
            }
        }

        System.out.println("\nHistograma de Notas:");
        for (int i = 0; i < intervalos.length; i++) {
            System.out.printf("%2d - %2d | %s\n", intervalos[i][0], intervalos[i][1], "*".repeat(frequencia[i]));
        }



    }
}
