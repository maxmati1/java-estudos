public class Time {
    String nome;
    String cidade;
    Jogador[] jogadores = new Jogador[100];
    int quantidade = 0;

    Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    void adicionarJogador(Jogador j) {
        jogadores[quantidade] = j;
        quantidade++;
    }

    void listarJogadores() {
        System.out.println("Time: " + nome + " (" + cidade + ")");
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Jogador: " + jogadores[i].nome + " - " + jogadores[i].posicao);
        }
    }
}