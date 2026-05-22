package br.com.andradelocadora.model;

public class Motos extends Veiculo {
    private String cilindrada;

    public Motos() {

    }

    public Motos(String nome, String marca, int ano, double valorDiaria, int quantidadeDisponivel, String cilindrada) {
        super(nome, marca, ano, valorDiaria, quantidadeDisponivel);
        this.cilindrada = cilindrada;
    }

    // Calculando desconto automatico.
    @Override
    public double calcularDesconto() {
        if (getQuantidadeDisponivel() > 20) {
            return getValorDiaria() * 0.90;
        }
        return getValorDiaria();
    }

    // Calculando desconto se gerente inserir o desconto.
    @Override
    public double calcularDesconto(double porcentagem) {
        double valorProduto = getValorDiaria();
        double valorComDesconto = valorProduto * (porcentagem / 100.0);
        return  valorProduto - valorComDesconto;
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
