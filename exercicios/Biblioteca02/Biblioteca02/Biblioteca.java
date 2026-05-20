import java.util.*;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private Set<String> categorias = new HashSet<>();
    private Map<Usuario, List<Livro>> emprestimos = new HashMap<>();

    public void adicionarLivro(Livro livro) {
            boolean duplicado = false;
            for(Livro l : livros) {
                if(l.getId() == livro.getId()) {
                    duplicado = true;
                    break;
                }
            }

        if (!duplicado) {
            livros.add(livro);
            categorias.add(livro.getCategoria());
            System.out.println(livro.getTitulo() + " Adicionado com sucesso.");
        } else {
            System.out.println("ITEM DUPLICADO");
        }
    }

    public void adicionarUsuario(Usuario usuario) {
        boolean verif = false;
        for(Usuario user : usuarios) {
            if(user.getId() == usuario.getId()) {
                verif = true;
                break;
            }
        }
        if(verif) {
            System.out.println("Item duplicado. Não adicionado");
        } else {
            usuarios.add(usuario);
            System.out.println(usuario.getNome() + " adicionado com sucesso.");
        }
    }

    public void listarLivros() {
        if(livros.isEmpty()) {
            System.out.println("LISTA DE LIVROS ESTÁ VAZIA");
        } else {
            System.out.println("LISTA DE LIVROS");
            for(Livro l : livros) {
                System.out.println(l);
                break;
            }
        }
    }

    public void buscarLivroPorTitulo(String titulo) {

        List<Livro> tIguais = new ArrayList<>();
        for(Livro l : livros) {
            if(titulo.equals(l.getTitulo())) {
                tIguais.add(l);

                }
            }
        if(tIguais.isEmpty()) {
            System.out.println("Nenhum titulo foi achado.");

    } else {
            System.out.println("-=-= Títulos iguais =-=-");
            for(Livro l : tIguais) {
                System.out.println(l);
            }
        }
    }

    public void emprestarLivro(Usuario u, Livro l) {
        List<Livro> livroDoUser = new ArrayList<>();
        if(l.isEmprestado()) {
            System.out.println("Livro já emprestado");

        } else {
            l.setEmprestado(true);
            livroDoUser.add(l);
            emprestimos.put(u,livroDoUser);
            System.out.println("Emprestimo feito com sucesso.");
        }



    }

    public void devolverLivro(Usuario usuario,Livro l) {
        List<Livro> livrosUser = emprestimos.get(usuario);

        if(livrosUser == null) {
            System.out.println("Esse usuário não possui livros emprestados");
            return;
        }

        if(!livrosUser.contains(l)) {
            System.out.println("Esse livro não está emprestado para esse usuario");
            return;
        }

        livrosUser.remove(l);
        emprestimos.put(usuario,livrosUser);
        l.setEmprestado(false);
        System.out.println("Livro devolvido");
    }

    public void listarLivrosDoUsuario(Usuario u) {

        List<Livro> livrosUser = emprestimos.get(u);
        if(livrosUser.isEmpty()) {
            System.out.println(u.getNome() + " não possui nenhum livro");

        } else {
            System.out.println("Lista de livros que estão com " + u.getNome());

            for (Livro l : livrosUser) {
                System.out.println(l);
            }
        }


    }

    public void listarCategorias() {
        if(categorias.isEmpty()) {
            System.out.println("Nenhum livro adicionado ainda.");
        } else {
            for(String c : categorias) {
                System.out.println(c);
            }
        }
    }

    public void mostrarRelatorio() {

        System.out.println("N° de users cadastrados ->" + usuarios.size());
        System.out.println("N° de livros cadastrados -> " + livros.size());
        System.out.println("N° de categorias -> " + categorias.size());
        int cont = 0;
        for(List<Livro> E : emprestimos.values()) {
            for(Livro l : E) {
                cont += 1;
            }
        }
        System.out.println("N° de livros emprestados " + cont);
    }
}
