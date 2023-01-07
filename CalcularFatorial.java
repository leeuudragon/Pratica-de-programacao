public class CalcularFatorial {
    public static double calcularFatorial(double numero) {

        double retorno = 0;

        if (numero == 0) {
            retorno = 1;
        } else {
            retorno = numero * calcularFatorial(numero - 1);
        }

        return retorno;
    }

    public static void main(String[] args) {
        System.out.println(calcularFatorial(5));
    }
}
