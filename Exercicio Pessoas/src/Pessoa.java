public class Pessoa {
    String pessoa;
    int idade;

     Pessoa(String pessoa,int idade){
         this.pessoa = pessoa;
         this.idade = idade;
     }

     void fazerAniversarios(){
         idade++;
     }
     void exibirIdade(){
        System.out.printf("A idade atual é:%d",idade);
     }
}
