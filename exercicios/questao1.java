import java.util.Scanner;
public class questao1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Entre com seu nome: ");
        String nome = teclado.nextLine();

        System.out.printf("Entre com o ano em que nasceu: ");
        int ano = teclado.nextInt();

        System.out.printf("Entre com o ano atual: ");
        int ano_atual = teclado.nextInt();

        int idade = ano_atual - ano;

        System.out.printf("%s, possui %d\n", nome,idade);
    }
}