public class LivroInfantil extends Livro{

    private int idadeMin;
    private int idadeMax;

    public LivroInfantil(int idadeMin, int idadeMax) {
        this.idadeMin = idadeMin;
        this.idadeMax = idadeMax;
    }

    public LivroInfantil (){
        this.idadeMin = 2;
        this.idadeMax = 13;
    }

    public LivroInfantil(String autor, String titulo, int ano, double preco, int quantidadeStock, int idadeMin, int idadeMax) {
        super(autor, titulo, ano, preco, quantidadeStock);
        this.idadeMin = idadeMin;
        this.idadeMax = idadeMax;
    }



}
