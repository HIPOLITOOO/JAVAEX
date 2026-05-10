import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Sistema de login ---");
        String login = "admin";
        String senha = "admin001";

        System.out.print("Digite o user: ");
        String inputlogin = teclado.next();


        while (!inputlogin.equals(login)) {
            System.out.println("User errado, digite novamente.");
            inputlogin = teclado.next();

        }

        System.out.println("Digite a senha:");
        String inputsenha = teclado.next();
        while (!inputsenha.equals(senha)) {
            System.out.println("Senha errada, digite novamente");
            inputsenha = teclado.next();
        }
    }
}