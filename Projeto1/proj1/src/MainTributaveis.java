//Este exercício equivale ao exercício 1 da ficha 5 de programação

public class MainTributaveis {
    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("22-33-CC", 1000, "verde");
        System.out.println("\n" + v1);

        Veiculo v2 = new Veiculo("44-55-DD", 2500, Cores.AZUL);
        System.out.println("\n" + v2);

        Veiculo v3 = new Veiculo();
        System.out.println("\n" + v3);

        Moradia m1 = new Moradia("Rua do Dr. Plácido da Costa", 90, Cores.CINZENTO);
        System.out.println("\n" + m1);

    }
}