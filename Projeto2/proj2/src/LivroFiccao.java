public class LivroFiccao extends Livro{

    private String tema;

    public LivroFiccao(String tema) {
        this.tema = tema;
    }

    public LivroFiccao (){
        this.tema = "Feitiçaria";
    }

    public LivroFiccao(String autor, String titulo, int ano, double preco, int quantidadeStock, String tema) {
        super(autor, titulo, ano, preco, quantidadeStock);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public String toString() {
        return super.toString() + " --- Tema: " + tema;
    }
}
