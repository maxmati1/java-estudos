public class Main {
    public static void main(String[] args) {
        Comodo c1 = new Comodo("Sala");
        Comodo c2 = new Comodo("Cozinha");
        Comodo c3 = new Comodo("Quarto");

        Casa casa1 = new Casa("Avenida Brasil, 123", c1, c2, c3);

        casa1.exibirDetalhes();
    }
}