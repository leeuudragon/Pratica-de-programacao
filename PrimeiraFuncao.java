public class PrimeiraFuncao {
    //Retorno nome(parametros)
    public static int soma(int a, int b) {
        int retorno = 0;

        retorno = (a + b);
        a = 200; //Se for valor não altera, mas se for por referência altera.
        return retorno;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int resultado = 0;

        resultado = soma(num1, num2);

        System.out.println(resultado);

    } //Em java os tipos básicos são todos por valor, os objetos são por referência.
}
