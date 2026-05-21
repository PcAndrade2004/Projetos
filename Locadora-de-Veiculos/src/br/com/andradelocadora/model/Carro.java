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


