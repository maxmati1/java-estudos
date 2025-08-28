class Computador {
    Processador processador;
    MemoriaRAM memoria;
    Periferico[] perifericos;
    int contador = 0;

    Computador(Processador processador, MemoriaRAM memoria) {
        this.processador = processador;
        this.memoria = memoria;
        this.perifericos = new Periferico[10];
    }

    void adicionarPeriferico(Periferico p) {
        if (contador < perifericos.length) {
            perifericos[contador++] = p;
        }
    }

    void mostrarDetalhes() {
        System.out.println("Computador:");
        System.out.println("- Processador: " + processador.modelo + " " + processador.frequenciaGHz + "GHz");
        System.out.println("- Memoria RAM: " + memoria.capacidadeGB + "GB " + memoria.tipo);
        System.out.println("- Perifericos:");
        for (int i = 0; i < contador; i++) {
            System.out.println("  * " + perifericos[i].tipo + " - " + perifericos[i].marca);
        }
    }
}