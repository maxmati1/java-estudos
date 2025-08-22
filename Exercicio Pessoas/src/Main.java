public class Main {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa("Joao Pedro",35);

        joao.exibirIdade();
        joao.fazerAniversarios();
        System.out.println();
        joao.exibirIdade();
    }
}
