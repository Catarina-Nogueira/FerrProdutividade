public class Livro {
    private String autor;
    private String titulo;
    private int ano;
    private double preco;
    private int quantidadeStock;

    public Livro() {
        this.autor = "NA";
        this.titulo = "NA";
        this.ano = 2000;
        this.preco = 10.50;
        this.quantidadeStock = 5;
    }

    public Livro(String autor, String titulo, int ano, double preco, int quantidadeStock) {
        this.autor = autor;
        this.titulo = titulo;
        this.ano = ano;
        this.preco = preco;
        this.quantidadeStock = quantidadeStock;
    }


}
