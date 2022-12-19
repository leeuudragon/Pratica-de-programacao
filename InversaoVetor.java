import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InversaoVetor { //Programa que inverte a ordem dos valores digitados.

    public static void main(String[] args) {

        //Variáveis

        BufferedReader leitor = new BufferedReader(
                            new InputStreamReader(System.in));

        int [] vetorOriginal = new int[5];

        int [] vetorInvertido = new int[5];

        //Entradas

        try{
            for (int i = 0 ; i < vetorOriginal.length ; i++) {
                System.out.print("Digite o valor da posição " +i+ " do vetor: ");
                vetorOriginal[i] = Integer.parseInt(leitor.readLine());
            }
        } catch (Exception erro) {
            System.out.print(erro);
        }

        //Processamento

        for (int i = (vetorOriginal.length - 1) ; i >= 0 ; i--) {
            vetorInvertido[vetorOriginal.length - 1 - i] = vetorOriginal[i];
        }

        //Saídas

        for (int i = 0 ; i < vetorInvertido.length ; i++) {
            System.out.println("Vetor[" +i+ "] = " +vetorInvertido[i]);
        }
    }


}
