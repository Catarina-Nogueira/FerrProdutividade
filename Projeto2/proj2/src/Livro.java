import java.time.LocalDate;

public class Livro implements Calculos{
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


    @Override
    public double calcularIdade() {
        return LocalDate.now().getYear() - ano;
    }

    @Override
    public double calcularValorTotalStock() {
        return preco * quantidadeStock;
    }

    public String obterInformacoes() {
        return "Título: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + ano +
                ", Preço: " + preco + " euros, Quantidade em Stock: " + quantidadeStock;
    }

}
