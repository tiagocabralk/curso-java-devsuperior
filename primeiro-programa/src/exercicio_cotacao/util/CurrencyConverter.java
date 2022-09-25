package exercicio_cotacao.util;

public class CurrencyConverter {
    public static double converter (double cotacao, double dollar) {
        double calc = cotacao * dollar;
        double taxa = calc * 6 / 100;
        return  calc + taxa;
    }
}
