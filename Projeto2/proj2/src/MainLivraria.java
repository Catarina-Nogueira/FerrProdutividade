//Este exercício equivale ao exercício 3 da ficha 4 de programação

public class MainLivraria {
    public static void main(String[] args) {

        LivroRomance r1 = new LivroRomance("Alice Oseman", "HeartStopper", 2021, 18.95, 29, "Seguinte"  );
        LivroRomance r2 = new LivroRomance("Jane Austen", "Orgulho e Preconceito", 1813, 19.50, 13, "Camelot Editora");

        LivroFiccao f1 = new LivroFiccao("Freida McFadden", "A mulher no andar de cima", 2025, 17.51, 5, "Thriller Psicológico");
        LivroFiccao f2 = new LivroFiccao("Aldous Huxley", "Admirável Mundo Novo", 1932, 57.42, 11, "Distopia tecnológica e controlo social");

        LivroInfantil i1 = new LivroInfantil("José Eduardo Agualusa", "A girafa que comia estrelas", 2020, 12.56, 30, 4, 8);
        LivroInfantil i2 = new LivroInfantil("José Saramago", "A maior flor do mundo", 2001, 9.52, 22, 9, 12);

        Livro[] contentorLivros = new Livro[10];
        contentorLivros[0] = r1;
        contentorLivros[1] = r2;
        contentorLivros[2] = f1;
        contentorLivros[3] = f2;
        contentorLivros[4] = i1;
        contentorLivros[5] = i2;

        // 1. Listagem das representações textuais dos livros
        for (Livro livro : contentorLivros) {
            if (livro != null) {
                System.out.println(livro);
            }
        }

        System.out.println("\n--- Livros Romance ---");
        // 2. Listagem apenas dos livros de romance
        for (Livro livro : contentorLivros) {
            if (livro instanceof LivroRomance) {
                System.out.println(livro);
            }
        }

        System.out.println("\n--- Livros de Ficção ---");
        // 3. Listagem apenas dos livros infantis
        for (Livro livro : contentorLivros) {
            if (livro instanceof LivroFiccao) {
                System.out.println(livro.toString());
            }
        }

        System.out.println("\n--- Livros Infantis ---");
        // 4. Listagem apenas dos livros infantis
        for (Livro livro : contentorLivros) {
            if (livro instanceof LivroInfantil) {
                System.out.println(livro);
            }
        }

        System.out.println("\n--- Títulos, Idade e Valor Total de Stock ---");
        // 3. Listagem dos títulos, idades e valores totais de stock
        for (Livro livro : contentorLivros) {
            if (livro != null) {
                System.out.printf("Título: %s --- Idade: " +  livro.calcularIdade() +" anos --- Valor Total de Stock: euros%.2f\n",
                        livro.getTitulo(), livro.calcularValorTotalStock());
            }
        }
    }
}