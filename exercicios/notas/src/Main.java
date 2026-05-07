import java.util.Scanner;
public class Main {

    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        int soma = 0;
        for(int i = 0; i < 4;i++) {

            System.out.println("Digite a " + (i + 1) + "° nota:");
            int nota = s.nextInt();
             soma = soma + nota;
        }
        soma = soma / 4;
        System.out.println("A média das notas é " + soma);
        if (soma >= 7) {
            System.out.println("Aprovado....");
        } else if (soma >= 5 && soma <=6) {
            System.out.println("Recuperação.....");
        } else if (soma < 5) {
            System.out.println("Reprovado...");
        }
    }

}