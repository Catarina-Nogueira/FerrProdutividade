public class LivroRomance extends Livro{
    private String editora;

    public LivroRomance(String editora) {
        this.editora = editora;
    }

    public LivroRomance(String autor, String titulo, int ano, double preco, int quantidadeStock, String editora) {
        super(autor, titulo, ano, preco, quantidadeStock);
        this.editora = editora;
    }

    public LivroRomance (){
        this.editora = "Areal";
    }


}
