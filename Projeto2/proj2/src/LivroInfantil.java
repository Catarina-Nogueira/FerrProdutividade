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

    public int getIdadeMax() {
        return idadeMax;
    }

    public int getIdadeMin() {
        return idadeMin;
    }

    public String obterInformacoes() {
        return super.toString() + " --- Idade Mínima: " + idadeMin + " --- Idade Máxima: " + idadeMax;
    }


}
