package br.com.andradelocadora.model;

    public class Carro extends Veiculo {

        private int quantidadePortas;
        private String tipoCombustivel;

        public Carro() {
        }

        public Carro(String nome, String marca, int ano, double valorDiaria, int quantidadeDisponivel, int quantidadePortas, String tipoCombustivel) {
            super(nome, marca, ano, valorDiaria, quantidadeDisponivel);
            this.quantidadePortas = quantidadePortas;
            this.tipoCombustivel = tipoCombustivel;
        }

        @Override
        public double calcularDesconto() {
            if (getQuantidadeDisponivel() > 10) {
                return getValorDiaria() * 0.90;
            }
            return getValorDiaria();
        }

        @Override
        public double calcularDesconto(double porcentagem) {
            if (porcentagem == 10) {
                return getValorDiaria() * 0.90;
            }else if (porcentagem == 20) {
                return getValorDiaria() * 0.80;
            }else if (porcentagem == 30) {
                return getValorDiaria() * 0.70;
            }
            return getValorDiaria();
        }

        public int getQuantidadePortas() {
            return quantidadePortas;
        }

        public void setQuantidadePortas(int quantidadePortas) {
            this.quantidadePortas = quantidadePortas;
        }

        public String getTipoCombustivel() {
            return tipoCombustivel;
        }

        public void setTipoCombustivel(String tipoCombustivel) {
            this.tipoCombustivel = tipoCombustivel;
        }


        @Override
        public String toString() {
            return super.toString() +
                    "\nPortas = " + quantidadePortas +
                    "\nCombustivel = " + tipoCombustivel;
        }
    }


