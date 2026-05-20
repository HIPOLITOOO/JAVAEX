public class Livro {
    private int id;
    private String titulo;
    private String categoria;
    private boolean emprestado;

    public Livro(int id, String titulo, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public void emprestar() {

    }

    public void devolver() {
        setEmprestado(false);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return
                "Id:" + id +
                ", titulo:" + titulo  +
                ", categoria:" + categoria  +
                ", emprestado:" + emprestado;
    }
}
