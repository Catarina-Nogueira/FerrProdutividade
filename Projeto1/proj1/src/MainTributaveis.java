//Este exercício equivale ao exercício 1 da ficha 5 de programação

import java.util.ArrayList;

public class MainTributaveis {
    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("22-33-CC", 1000, "verde");
        System.out.println("\n" + v1);
        System.out.println("Imposto: " + v1.calculaImposto());

        Veiculo v2 = new Veiculo("44-55-DD", 2500, Cores.AZUL);
        System.out.println("\n" + v2);
        System.out.println("Imposto: " + v2.calculaImposto());

        Veiculo v3 = new Veiculo();
        System.out.println("\n" + v3);
        System.out.println("Imposto: " + v3.calculaImposto());

        Moradia m1 = new Moradia("Rua do Dr. Plácido da Costa", 90, Cores.CINZENTO);
        System.out.println("\n" + m1);
        System.out.println("Imposto: " + m1.calculaImposto());


        ArrayList<Cores> tributaveis = new ArrayList<>();
        tributaveis.add(v1);
        tributaveis.add(v2);
        tributaveis.add(v3);
        tributaveis.add(m1);
        System.out.println("\n" + tributaveis);
    }
}