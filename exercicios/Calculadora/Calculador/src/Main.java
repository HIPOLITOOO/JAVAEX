import java.util.Scanner;
public class Main {
    public static void main (String args[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("==== Calculadora ====");
        System.out.print("Digite o primeiro número: ");
        int n1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = entrada.nextInt();

        System.out.println("Escolha a operação ");
        System.out.println(" + - / *");

        String conferencia = entrada.next();
        while (!conferencia.equals("+") && !conferencia.equals("-") && !conferencia.equals("/") && !conferencia.equals("*")) {
            System.out.println("Apenas + - / *");
            conferencia = entrada.next();
        }
        String conta = conferencia;
        if (conta.equals("+")) {
            int soma = n1 + n2;
            System.out.println("A soma de " + n1 + " e " + n2 + " é " + soma);

        } else if (conta.equals("-")) {
            int sub = n1 - n2;
            System.out.println("A subtração de " + n1 + " e " + n2 + " é " + sub);
        } else if (conta.equals("/")) {
            int div = n1 / n2;
            System.out.println("A divisão entre " + n1 + " e " + n2 + " é " + div);
        } else {
            int mult = n1 * n2;
            System.out.println("A multiplicação entre " + n1 + " e " + n2 + " é " + mult);
        }


    }
}