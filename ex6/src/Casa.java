public class Casa {
    String endereco;
    Comodo[] comodos = new Comodo[3];

    Casa(String endereco, Comodo c1, Comodo c2, Comodo c3) {
        this.endereco = endereco;
        this.comodos[0] = c1;
        this.comodos[1] = c2;
        this.comodos[2] = c3;
    }

    void exibirDetalhes() {
        System.out.println("Casa: " + endereco);
        System.out.println("Cômodos:");
        for (int i = 0; i < comodos.length; i++) {
            System.out.println("- " + comodos[i].nome);
        }
    }
}