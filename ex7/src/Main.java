public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Silva");

        Disciplina d1 = new Disciplina("Matemática");
        Disciplina d2 = new Disciplina("Física");

        prof1.adicionarDisciplina(d1);
        prof1.adicionarDisciplina(d2);

        prof1.listarDisciplinas();
    }
}