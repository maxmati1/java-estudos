public class Livro {
    String titulo;
    Autor autor;

    Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    void exibirDetalhes() {
        System.out.println("Livro: " + titulo);
        System.out.println("Autor: " + autor.nome + " (" + autor.nacionalidade + ")");
    }
}