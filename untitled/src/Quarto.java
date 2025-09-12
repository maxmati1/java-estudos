public class Quarto {
    private int numero;
    private String tipoQuarto;
    private double precoPorNoite;

    private boolean ocupado;
    private Hospede hospedeAtual;

    public Quarto(int numero,String tipo,double precoPorNoite){
        this.numero=numero;
        this.tipoQuarto=tipoQuarto;
        this.precoPorNoite=precoPorNoite;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setHospedeAtual(Hospede hospedeAtual){
        if(this.ocupado){
            System.out.println();
        }
    }


}
