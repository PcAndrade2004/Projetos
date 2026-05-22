package br.com.andradelocadora.model;

public class Caminhao extends Veiculo{

    private int capacidadeCarga;

    public Caminhao () {

    }

    public Caminhao(String nome, String marca, int ano, double valorDiaria, int quantidadeDisponivel,  int capacidadeCarga) {
        super(nome, marca, ano, valorDiaria, quantidadeDisponivel);
        this.capacidadeCarga = capacidadeCarga;
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

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCapacidade de Carga: " + capacidadeCarga;
    }


}
