import java.util.Scanner;

public class Main {
    public static void main(String args []) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Conversor Celsius para Fahrenheit ===");
        System.out.print("Digite a temperatura °: ");
        double temp = input.nextDouble();
        double conta = (temp * 1.8) + 32;
        System.out.println("Temperatura em Fahrenheit --> " + conta);


    }
}