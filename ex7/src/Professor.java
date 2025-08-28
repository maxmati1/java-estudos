public class Professor {
    String nome;
    Disciplina[] disciplinas = new Disciplina[10];
    int quantidade = 0;

    Professor(String nome) {
        this.nome = nome;
    }

    void adicionarDisciplina(Disciplina d) {
        disciplinas[quantidade] = d;
        quantidade++;
    }

    void listarDisciplinas() {
        System.out.println("Professor: " + nome);
        System.out.println("Disciplinas lecionadas:");
        for (int i = 0; i < quantidade; i++) {
            System.out.println("- " + disciplinas[i].nome);
        }
    }
}