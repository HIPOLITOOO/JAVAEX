import java.util.Scanner;

public class Teste {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";

    public static void main (String[] args) {



       Scanner entrada = new Scanner(System.in);
       char frame[][] = {{' ', ' ',' '}, {' ', ' ', ' '},{' ', ' ', ' '}};
       char player = 'X';
       int linha,coluna;
        System.out.println(GREEN + "//// JOGO DA VELHA ////" + RESET);
       while (true) {

           System.out.println(YELLOW + "  0  1  2"  + RESET);
           System.out.println("0  " + ( GREEN + frame[0][0] + RESET) + "| " + frame[0][1] + "| " + frame[0][2] + "|");
           System.out.println("1  " + frame[1][0] + "| " + frame[1][1] + "| " + frame[1][2] + "|");
           System.out.println("2  " + frame[2][0] + "| " + frame[2][1] + "| " + frame[2][2] + "|");


           System.out.print("Escolha a linha " + player + ":");
           linha = entrada.nextInt();
           System.out.print("Escolha a coluna " + player + ": ");
           coluna = entrada.nextInt();

           if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || frame[linha][coluna] != ' ') {
               System.out.println("Entrada inválida....");
               continue;
           }

           frame[linha][coluna] = player;

           if(
                // Horinzontal
              frame[0][0] == player && frame[0][1] == player && frame[0][2] == player ||
              frame[1][0] == player && frame[1][1] == player && frame[1][2] == player ||
              frame[2][0] == player && frame[2][1] == player && frame[2][2] == player ||
                // Vertical
              frame[0][0] == player && frame[1][0] == player && frame[2][0] == player ||
              frame[0][1] == player && frame[1][1] == player && frame[2][1] == player ||
              frame[0][2] == player && frame[1][2] == player && frame[2][2] == player ||
                // diagonal
              frame[0][0] == player && frame[1][1] == player && frame[2][2] == player ||
              frame[0][2] == player && frame[1][1] == player && frame[2][0] == player
                )  {
               System.out.println(RED + "Jogador " + player + " ganhou!!!!" + RESET);
               System.out.println(RED + "  0  1  2" + RESET);
               System.out.println(RED + "0  " + frame[0][0] + "| " + frame[0][1] + "| " + frame[0][2] + "|" + RESET);
               System.out.println( RED + "1  " + frame[1][0] + "| " + frame[1][1] + "| " + frame[1][2] + "|" + RESET);
               System.out.println(RED + "2  " + frame[2][0] + "| " + frame[2][1] + "| " + frame[2][2] + "|" + RESET);
               break;

           }
           if (player == 'X') {
               player = 'O';
           } else {
               player = 'X';
           }

       }
    }
}
