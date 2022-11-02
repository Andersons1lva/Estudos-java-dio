public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // para declarar uma variavél e garantir que essa não seja alterada o seu valor, usamos "final e seu nome em CAIXA ALTA".
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
    }
}
