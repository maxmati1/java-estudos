public class Main {
    public static void main(String[] args) {
        Processador cpu = new Processador("Intel i7", 4.5);
        MemoriaRAM ram = new MemoriaRAM(16, "DDR4");

        Computador pc = new Computador(cpu, ram);

        Periferico mouse = new Periferico("Mouse", "Logitech");
        Periferico teclado = new Periferico("Teclado", "Logitech");

        pc.adicionarPeriferico(mouse);
        pc.adicionarPeriferico(teclado);

        pc.mostrarDetalhes();
    }
}