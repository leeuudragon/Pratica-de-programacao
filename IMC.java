import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IMC {
    public static void main(String[] args) {

        //Variáveis

        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        double peso = 0;
        double altura = 0;
        double imc = 0;
        int sexo = 0;

        //Entradas

        try {
            System.out.println("Calcular IMC\n");

            System.out.print("Digite o peso: ");
            peso = Double.parseDouble(leitor.readLine());

            System.out.print("Digite a altura:");
            altura = Double.parseDouble(leitor.readLine());

            do {
                System.out.print("Digite o sexo 1 Masculino ou 2 Feminino: ");
                sexo = Integer.parseInt(leitor.readLine());
            } while (sexo < 1 || sexo > 2);
        } catch (Exception erro) {
            System.out.println(erro);
        }

        //Processamento

        imc = (peso / (Math.pow(altura, 2)));

        //Saídas

        switch (sexo) {
            case 1 -> {
                if ((imc >= 20.7) && (imc <= 26.4)) {
                    System.out.println("Seu IMC é: " + imc + ", você está no peso ideal.");
                } else if (imc < 20.7) {
                    System.out.println("Seu IMC é: " + imc + ", você está abaixo do peso ideal.");
                } else {
                    System.out.println("Seu IMC é: " + imc + ", você está acima do peso ideal.");
                }
            }
            case 2 -> {
                if ((imc >= 19.1) && (imc <= 25.8)) {
                    System.out.println("Seu é: " + imc + ", você está na faixa de peso ideal.");
                } else if (imc < 19.1) {
                    System.out.println("Seu IMC é: " + imc + ", você está abaixo do peso ideal.");
                } else {
                    System.out.println("Seu IMC é: " + imc + ", você está acima do peso ideal.");
                }
            }
        }
    }
}
