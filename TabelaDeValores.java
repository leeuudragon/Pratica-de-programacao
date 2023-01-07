import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TabelaDeValores { //Fazendo uma tabela de valores.
    public static void main(String[] args) {

        //Variáveis

        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        double[] tabela = new double[10000];

        int codigo = 0;

        //Entradas

        try {
            do {
                System.out.print("Digite o código do produto: ");
                codigo = Integer.parseInt(leitor.readLine());

                System.out.print("Digite o valor do produto: ");
                tabela[codigo] = Double.parseDouble(leitor.readLine());

                System.out.print("Digite <S> para mais produtos: ");
            } while (leitor.readLine().equalsIgnoreCase("S"));
        } catch (Exception erro) {
            System.out.println(erro);
        }

        //Saídas

        System.out.println("+================+");
        System.out.println("| Código | Valor |");
        System.out.println("+================+");
        for (int i = 0 ; i < tabela.length ; i++) {
            if (tabela[i] > 0){
                System.out.println("|  " +i+ "\t |  " +tabela[i]+ "\t |");
            }
        }
        System.out.println("+================+");
    }
}
