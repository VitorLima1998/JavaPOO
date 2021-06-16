package EntitiesCotacao;

public class Cotacao {
	public static final double IOF = 0.06;
	static double cotacao;

	public static double CurrencyConverter(double dolar, double real) {
		cotacao = dolar * real;
		return cotacao += cotacao * IOF;
	}

}
