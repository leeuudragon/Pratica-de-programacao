import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TratamentoStrings {
    public static void main(String[] args) {

        //Variáveis

        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        String texto = "";
        String remover = "";
        String procurar = "";
        int contador = 0;
        int posicao = 0;

        //Entradas

        try {
            System.out.print("Digite um texto: ");
            texto = leitor.readLine();

            System.out.print("Digite o que deve ser removido do texto: ");
            remover = leitor.readLine();

            System.out.print("Digite o que deve ser procurado no texto: ");
            procurar = leitor.readLine();
        } catch (Exception erro) {
            System.out.println(erro);
        }

        //Processamento

        posicao = 1;

        do {
            posicao = texto.indexOf(procurar, posicao + 1);
            if (posicao > -1) {
                contador++;
            }
        } while (posicao > -1);

        //Saídas

        System.out.println("\nPrimeira letra: " +texto.substring(0, 1));
        System.out.println("Última letra: " +texto.substring(texto.length() - 1));
        System.out.println("Tamanho: " +texto.length());
        System.out.println("Tudo em maiúsculo: " +texto.toUpperCase());
        System.out.println("Tudo em minúsculo: " +texto.toLowerCase());
        System.out.println("Texto removido: " +texto.replace(remover, ""));
        System.out.println("Quantidade de ocorrências: " +contador); //Quando preencho uma letra minúscula em "procurar" ele não retorna as ocorrências maiúsculas e vice versa. Resolver!
    }
}
