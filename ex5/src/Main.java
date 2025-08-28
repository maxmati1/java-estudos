public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Haaland", "Atacante");
        Jogador j2 = new Jogador("Rodri", "Volante");

        Time time1 = new Time("Man.City", "Manchester");
        time1.adicionarJogador(j1);
        time1.adicionarJogador(j2);

        time1.listarJogadores();
    }
}