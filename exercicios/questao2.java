import java.util.Scanner;
public class questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float p1,p2,a,CF;
        int w[] = {2,3};

        System.out.println("Digite a nota do seu primeiro projeto: ");
        p1 = teclado.nextInt();

        System.out.println("Digite a nota do seu segundo projeto: ");
        p2 = teclado.nextInt();

        System.out.println("Digite a sua participação nas aulas: ");
        a = teclado.nextInt();

        CF = (((p1 * w[0]) + (p2 * w[1])) / (w[0] + w[1]) * 0.9f + (a * 0.1f));
        CF = Math.round(CF);

        if(CF >= 6){
            System.out.println("Aprovado!");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}