import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main (String args[]) {
        List<String> masc = new ArrayList<String>();
        List<String> fem = new ArrayList<String>();

        Scanner s = new Scanner(System.in);
        System.out.println("Deseja entrar no programa?");
        String entrada = s.next();

        while (entrada.equalsIgnoreCase("sim")) {

            System.out.print("Digite seu nome: ");
            String nome = s.next();

            System.out.println("Digite seu sexo: [M/F]");
            String presx = s.next().toUpperCase();
            while (!presx.equals("M") && !presx.equals("F")) {
                System.out.println("Apenas M ou F");
                presx = s.next();

            }
            String sx = presx;
            if (sx.equalsIgnoreCase("F")) {
                System.out.println("Pessoa gênero (F) adicionada");
                fem.add(nome);
            } else {
                System.out.println("Pessoa gênero (M) adicionada");
                masc.add(nome);
            }


            System.out.println("Deseja cadastrar outra pessoa? ");
            entrada = s.next();
            if (entrada.equalsIgnoreCase("sim")) {
                continue;

            } else if (entrada.equalsIgnoreCase("não")) {
                break;
            }
            System.out.println("---- Lista Masculina ----");
          for(String p : masc) {
              System.out.println(p);
          }
          System.out.println("");
          System.out.println("--- Lista Feminina -----");
          for (String d : fem) {
              System.out.println(d);
          }
        }

    }
}
