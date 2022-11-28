import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SistemaOperacionalServidores { //Pesquisa sobre qual é o melhor sistema operacional para servidores.
    public static void main(String[] args) {
        //Variáveis

        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        int opcao;

        double windows = 0;
        double unix = 0;
        double linux = 0;
        double netware = 0;
        double macOS = 0;
        double outro = 0;

        double percentualWindows;
        double percentualUnix;
        double percentualLinux;
        double percentualNetware;
        double percentualMacOS;
        double percentualOutro;

        double totalVotos;

        int sair = 1;

        //Entradas
        do {
            try {
                System.out.println("Qual o melhor sistema operacional para uso em servidores?\n\n");
                do {
                    System.out.println("""
                            1- Windows Server.
                            2- Unix.
                            3- Linux.
                            4- Netware.
                            5- Mac OS.
                            6- Outro.
                            """);
                    opcao = Integer.parseInt(leitor.readLine());
                } while (opcao < 1 || opcao > 6);

                    switch (opcao) {
                        case 1 -> windows++;
                        case 2 -> unix++;
                        case 3 -> linux++;
                        case 4 -> netware++;
                        case 5 -> macOS++;
                        case 6 -> outro++;
                    }

                System.out.print("Para sair digite 0: ");
                sair = Integer.parseInt(leitor.readLine());

            } catch (Exception erro) {
                System.out.println(erro);
            }
        } while (sair != 0);

        //Processamento
        totalVotos = (windows + unix + linux + netware + macOS + outro);

        percentualWindows = ((windows / totalVotos) * 100);
        percentualUnix = ((unix / totalVotos) * 100);
        percentualLinux = ((linux / totalVotos) * 100);
        percentualNetware = ((netware / totalVotos) * 100);
        percentualMacOS = ((macOS / totalVotos) * 100);
        percentualOutro = ((outro / totalVotos) *100);

        //Saídas

        System.out.println("\nO percentual de votos em Windows Server é: " +percentualWindows+ "%.");
        System.out.println("O percentual de votos em Unix é: " +percentualUnix+ "%.");
        System.out.println("O percentual de votos em Linux é: " +percentualLinux+ "%.");
        System.out.println("O percentual de votos em Netware é: " +percentualNetware+ "%.");
        System.out.println("O percentual de votos em Mac OS é: " +percentualMacOS+ "%.");
        System.out.println("O percentual de votos em Outro é: " +percentualOutro+ "%.");

    }
}