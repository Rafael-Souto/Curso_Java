package util;

public class CurrencyConverter {
	
	public static double iof = 0.06;

	public static double conversaoReais(double qtd, double cot_dollar) {
		return qtd * cot_dollar * (1.0 + iof);
	}
}