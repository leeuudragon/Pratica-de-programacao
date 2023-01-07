import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PesquisarVetor { //Programa que pesquisa o número desejado e informa a sua posição.
    public static void main(String[] args) {

        //Variáveis
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        int[] vetor = new int[10];

        int numero = 0;

        //Entradas

        try {

            for (int i = 0; i < vetor.length; i++) {
                System.out.print("Digite o valor da posição " + i + " do vetor: ");
                vetor[i] = Integer.parseInt(leitor.readLine());
            }

            System.out.print("Digite o número a ser pesquisado: ");
            numero = Integer.parseInt(leitor.readLine());

        } catch (Exception erro) {
            System.out.print(erro);
        }

        //Processamento

        for (int i = 0 ; i < vetor.length ; i++) {
            if (vetor[i] == numero) {
                System.out.println("Localizei na posição: " +i);
                return;
            }
        }
        System.out.println("Não localizei!");
    }
}
