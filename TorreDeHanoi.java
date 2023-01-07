import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TorreDeHanoi { //Resolvendo a Torre de Hanói com menos movimentos possíveis.
    public static void main(String[] args) {

        //Variáveis

        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        int quantidadediscos = 0;

        //Entradas

        try {
            System.out.print("Informe a quantidade de discos: ");
            quantidadediscos = Integer.parseInt(leitor.readLine());
        } catch (Exception erro) {
            System.out.println(erro);
        }

        //Processamento

        moverTorre(quantidadediscos, "inicio", "meio", "fim");
    }

    public static void moverTorre(int disco, String inicio, String meio, String fim) {
        if (disco > 0) {
            moverTorre(disco - 1, inicio, fim, meio);
            System.out.println("Movi o disco " +disco+ " do " +inicio+ " para " +fim);

            moverTorre(disco - 1, meio, inicio, fim);
        }
    }
}
