public class Veiculo implements Cores, Imposto {
    private String matricula;
    private int cilindrada;
    private String cor;

    public Veiculo(String matricula, int cilindrada, String cor) {
        this.matricula = matricula;
        this.cilindrada = cilindrada;
        this.cor = cor;
    }

    public Veiculo (){
        this.cilindrada = 1000;
        this.cor = Cores.VERMELHO;
        this.matricula = "41-76-GN";
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getCor() {
        return cor;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return String.format("Veículo com matrícula %s e cilindrada %d tem cor %s",
                matricula, cilindrada, cor);
    }

    @Override
    public float calculaImposto() {
        if (cilindrada < 1500) {
            return 15.0f;
        } else {
            return 40.0f;
        }
    }
}
