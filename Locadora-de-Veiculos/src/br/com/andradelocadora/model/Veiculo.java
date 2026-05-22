package br.com.andradelocadora.model;

public class Veiculo {

    private String nome;
    private String marca;
    private int ano;
    private double valorDiaria;
    private int quantidadeDisponivel;

    public Veiculo() {

    }

    public Veiculo(String nome, String marca, int ano,
                   double valorDiaria, int quantidadeDisponivel) {

        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public double calcularDesconto() {
        return valorDiaria;
    }

    public double calcularDesconto(double porcentagem) {
        return valorDiaria - (valorDiaria * (porcentagem / 100));
    }

    public double calcularDesconto(String cupom){
        return valorDiaria - calcularDesconto(cupom);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    @Override
    public String toString() {
        return "Veiculo: " +
                "\nNome: " + nome +
                "\nMarca: " + marca +
                "\nAno: " + ano +
                "\nValor Diaria: " + valorDiaria +
                "\nEstoque: " + quantidadeDisponivel;
    }
}
