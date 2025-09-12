import java.util.ArrayList;

public class Hotel {
    private String nome;
    private String endereco;
    private ArrayList<Quarto> quartos;

    public Hotel(String nome, String endereco,int numeroQuarto,String tipoQuarto,
                 double precoPorNoite){

        this.nome = nome;
        this.endereco=endereco;
        this.quartos = new ArrayList<Quarto>();
        Quarto novoQuarto = new Quarto (numeroQuarto,tipoQuarto,precoPorNoite);
        this.quartos.add(novoQuarto);
    }

    public void adicionarQuarto(int numero,String tipo, double precoPorNoite){
        Quarto novoQuarto = new Quarto(numero,tipo,precoPorNoite);
        this.quartos.add(novoQuarto);
    }

    public void hospedar(Hospede hospede,int numeroQuarto){

        for(Quarto q : this.quartos){
            if(q.getNumero() == numeroQuarto){
                q.setHospedeAtual(hospede);
            }
        }
    }

    public void checkout(int numeroQuarto){
        for(Quarto)
    }
}
