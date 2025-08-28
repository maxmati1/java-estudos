public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Matheus", "000.000.000-00");
        Produto produto1 = new Produto("Notebook", 3500.0);

        Pedido pedido1 = new Pedido(cliente1);
        pedido1.adicionarProduto(produto1);

        pedido1.mostrarDetalhes();
    }
}