package br.com.andradelocadora.model;

public class Caminhao extends Veiculo{

    private int capacidadeCarga;

    public Caminhao () {

    }

    public Caminhao(String nome, String marca, int ano, double valorDiaria, int quantidadeDisponivel,  int capacidadeCarga) {
        super(nome, marca, ano, valorDiaria, quantidadeDisponivel);
        this.capacidadeCarga = capacidadeCarga;
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
