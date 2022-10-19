import java.util.Scanner;

public class CalculadoraDoisNumeros {
    public static void main(String[] args) {

        //Variáveis

        Scanner leitor = new Scanner(System.in);

        double n1;
        double n2;

        int opcao;

        //Entradas

        System.out.print("Calculadora de dois números:");

        do {
            System.out.print("\n\nQual operação deseja realizar?");
            System.out.print("\n\n1 - soma");
            System.out.print("\n2 - subtração");
            System.out.print("\n3 - multiplacação");
            System.out.print("\n4 - divisão\n\n");
            opcao = leitor.nextInt();
        } while (opcao > 4);


        System.out.print("\nInforme o primeiro número: ");
        n1 = leitor.nextDouble();

        System.out.print("Informe o segundo número: ");
        n2 = leitor.nextDouble();

        leitor.close();

        //saídas

        switch (opcao) {
            case 1 -> System.out.print("\nO total da soma é: " + (n1 + n2));

            case 2 -> System.out.print("\nO total da subtração é: " + (n1 - n2));

            case 3 -> System.out.print("\nO total da multiplicação é: " + (n1 * n2));

            case 4 -> System.out.print("\nO total da divisão é: " + (n1 / n2));
        }


    }
}
