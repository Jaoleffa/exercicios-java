package util;

public class CurrencyConverter {
    public static final double  IOF = 0.06;

    public static double dollarConverter(double valorDollar, double quantidadeDollar) {
        //return (valorDollar * quantidadeDollar) + (valorDollar * quantidadeDollar * 0.06);
        return valorDollar * quantidadeDollar * (1.0 + IOF); //Aqui multiplica o valor do dolar por 1.06
    }
}
