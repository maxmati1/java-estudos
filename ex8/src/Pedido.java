class Pedido {
    Cliente cliente;
    Produto produto;

    Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    void adicionarProduto(Produto produto) {
        this.produto = produto;
    }

    void mostrarDetalhes() {
        System.out.println("Cliente: " + cliente.nome + " | CPF: " + cliente.cpf);
        System.out.println("Produto comprado: " + produto.nome + " | R$ " + produto.preco);
    }
}