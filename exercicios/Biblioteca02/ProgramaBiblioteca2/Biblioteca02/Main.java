public class Main {

    public static void main(String args[]) {
        Biblioteca B = new Biblioteca();
        Livro l1 = new Livro(233,"Cronicas","Comédia");
        Usuario user1 = new Usuario(92,"gabriel","gabriel@gmail.com");
        Usuario user2 = new Usuario(92,"gabriel","gabriel@gmail.com");

        Livro l2 = new Livro(23213,"ovocato","Romance");
        Livro l4 = new Livro(988,"ovocato","Romance");
        Livro l3 = new Livro(2222,"ovocato","Romance");
        B.adicionarLivro(l2);
        B.adicionarLivro(l1);
        B.adicionarLivro(l3);
        B.adicionarLivro(l4);
        B.adicionarUsuario(user2);

        B.emprestarLivro(user2,l2);
        B.emprestarLivro(user1,l3);


        B.listarLivrosDoUsuario(user1);

    }
}
