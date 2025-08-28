public class Pessoa {
    String nome;
    int idade;

    Pessoa(String pessoa,int idade){
        this.nome = pessoa;
        this.idade = idade;
    }

    void fazerAniversario(){
        idade++;
    }
    void exibirIdade(){
        System.out.printf("A idade atual é:%d",idade);
    }
}