public class Carro {
    String marca;
    String modelo;
    Motor motor;

    Carro(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    void exibirDetalhes() {
        System.out.println("Carro: " + marca + " " + modelo);
        System.out.println("Motor: " + motor.potencia + "cv - " + motor.tipoCombustivel);
    }
}