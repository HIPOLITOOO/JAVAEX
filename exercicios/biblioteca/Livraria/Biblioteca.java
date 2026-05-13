package Livraria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    List<Livro> livros = new ArrayList<>();



    public void comecar() {
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("===== BIBLIOTECA =====");
            System.out.println("[1] Adicionar livro");
            System.out.println("[2] Remover livro");
            System.out.println("[3] Listar livros");
            System.out.println("[0] Encerrar");

                int escolha = entrada.nextInt();
            if (escolha == 1) {
                adicionarLivro();
            } else if (escolha == 2) {
                    removerLivro();
            } else if (escolha == 3) {
                listarLivros();
            } else if (escolha == 0) {
                System.out.println("PROGRAMA ENCERRADO");
                break;
            }

        }

    }





    private void listarLivros() {
        if(livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado");
        } else {
            String rpt = "*";
            System.out.println("-- LISTA DOS LIVROS -- ");
            for(Livro livro: livros) {
                System.out.println(rpt.repeat(15));
                System.out.print("Nome: " + livro.getNome());
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println(rpt.repeat(15));

            }
        }
    }


    private void removerLivro() {
        Scanner entrada = new Scanner(System.in);
        if(livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado ainda");
        } else {
            System.out.println("*** LISTA DE LIVROS ***");
            for(Livro livro : livros) {
                String s = "-";

                System.out.println(s.repeat(15));
                System.out.print("Nome: " + livro.getNome());
                System.out.println(" ");
                System.out.print("Título : " + livro.getTitulo());
                System.out.println(" ");
                System.out.println("Autor: " + livro.getTitulo());
                System.out.println(s.repeat(15));
                System.out.println(" ");
            }

            System.out.println("Digite o nome do livro para remover");
            String remocao = entrada.next();
            tirarLivro(remocao);

        }


    }


    private void adicionarLivro() {
        Scanner entrada = new Scanner(System.in);
        if(livros.isEmpty()) {
            System.out.print("Nome do Livro: ");
            String nome = entrada.next();

            System.out.print("Titulo do livro: ");
            String titulo = entrada.next();

            System.out.print("Autor do livro: ");
            String autor = entrada.next();
            System.out.println(" ");

            livros.add(criarLivro(nome,titulo,autor));
                System.out.println("lIVRO ADICIONADO COM SUCESOO!!!");
        } else {
            System.out.print("Nome do Livro: ");
            String nome = entrada.next();

            System.out.print("Titulo do livro: ");
            String titulo = entrada.next();

            System.out.println("Autor do livro: ");
            String autor = entrada.next();
            Boolean conf = verificacao(nome,titulo,autor);
            if(conf == true) {
                livros.add(criarLivro(nome,titulo,autor));
                System.out.println("Livro adiconado com sucesso.");
                System.out.println();
                for(Livro livro : livros) {
                    System.out.println(livro);
                }
            } else {
                System.out.println("Livro não adicionado.. repetido");
            }
        }





    }

    public Boolean verificacao(String nome, String titulo, String autor) {

         for(Livro livro : livros) {
             if(nome.equals(livro.getNome()) && titulo.equals(livro.getTitulo()) && autor.equals(autor)) {
                return false;
             }
         }

         return true;

    }

    public Livro criarLivro(String nome, String titulo, String autor) {
        Livro livro = new Livro();
        livro.setNome(nome);
        livro.setAutor(autor);
        livro.setTitulo(titulo);
        return livro;
    }

    public void tirarLivro(String nome) {
        if(livros.isEmpty()) {
            System.out.println("Nenhum livro adicionado ainda...");

        } else {
            for(Livro livro : livros) {
                if(nome.equals(livro.getNome())) {
                    System.out.println("--- Livro removido ---");
                    livros.remove(livro);
                    break;
                }
            }
        }


    }


}
