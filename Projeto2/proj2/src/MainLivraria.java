//Este exercício equivale ao exercício 3 da ficha 4 de programação

public class MainLivraria {
    public static void main(String[] args) {

        LivroRomance r1 = new LivroRomance("Alice Oseman", "HeartStopper", 2021, 18.95, 29, "Seguinte"  );
        LivroRomance r2 = new LivroRomance("Jane Austen", "Orgulho e Preconceito", 1813, 19.50, 13, "Camelot Editora");

        LivroFiccao f1 = new LivroFiccao("Freida McFadden", "A mulher no andar de cima", 2025, 17.51, 5, "Thriller Psicológico");
        LivroFiccao f2 = new LivroFiccao("Aldous Huxley", "Admirável Mundo Novo", 1932, 57.42, 11, "Distopia tecnológica e controlo social");

        LivroInfantil i1 = new LivroInfantil("José Eduardo Agualusa", "A girafa que comia estrelas", 2020, 12.56, 30, 4, 8);
        LivroInfantil i2 = new LivroInfantil("José Saramago", "A maior flor do mundo", 2001, 9.52, 22, 9, 12);
    }
}