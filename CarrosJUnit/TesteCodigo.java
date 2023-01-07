package CarrosJUnit;

import java.time.LocalDate;

public class TesteCodigo {
    public static void main(String[] args) {

        Colecionador devmedia = new Colecionador("DevMedia");

        Carro carro1 = new Carro("Mustang", "Ford", 1994, LocalDate.now());
        Carro carro2 = new Carro("Enzo", "Ferrari", 2002, LocalDate.now());
        Carro carro3 = new Carro("Urus", "Lamborghini", 2017, LocalDate.now());

        devmedia.getColecao().add(carro1);
        devmedia.getColecao().add(carro2);
        devmedia.getColecao().add(carro3);

        int ano = devmedia.obterAnoDoCarroMaisAntigo();

        System.out.println("Ano do carro mais antigo: " + ano);
    }
}
