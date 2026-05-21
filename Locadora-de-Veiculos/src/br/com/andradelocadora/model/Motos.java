package br.com.andradelocadora.model;

public class Motos extends Veiculo {
    private String cilindrada;

    public Motos() {

    }

    public Motos(String nome, String marca, int ano, double valorDiaria, int quantidadeDisponivel, String cilindrada) {
        super(nome, marca, ano, valorDiaria, quantidadeDisponivel);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularDesconto() {
        if (getQuantidadeDisponivel() > 20) {
            return getValorDiaria() * 0.90;
        }
        return getValorDiaria();
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCilindrada: " + cilindrada;
    }
}
