public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor(80, "Gasolina");
        Carro carro1 = new Carro("Hyundai", "HB20", motor1);

        carro1.exibirDetalhes();
    }
}