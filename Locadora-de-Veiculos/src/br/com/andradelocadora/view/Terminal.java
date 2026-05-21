package br.com.andradelocadora.view;

import br.com.andradelocadora.model.Carros;
import br.com.andradelocadora.model.Motos;

public class Terminal {
    public static void main(String[] args) {
        System.out.println("==== DADOS CARROS ====");
        Carros carros = new Carros(
                "Fusca",
                "Golf",
                2021,
                200,
                40,
                4,
                "Alcol"
        );
        System.out.println(carros);

        System.out.println("\n==== DADOS DE MOTOS ====");
        Motos moto = new Motos(
                "Honda",
                "CB 500",
                2021,
                500,
                20,
                "Gasolina"
        );
        System.out.println(moto);
    }
}
