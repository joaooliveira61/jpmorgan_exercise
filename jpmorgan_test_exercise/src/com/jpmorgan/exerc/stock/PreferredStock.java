package com.jpmorgan.exerc.stock;

public class PreferredStock extends AbstractStock {

	public PreferredStock(String stockSymbol, EnumStockType stockType,
			int lastDividend, double fixedDividend, int parValue) {
		super(stockSymbol, stockType, lastDividend, fixedDividend, parValue);
	}

	@Override
	public double getDividendYield(double tickerPrice) {
		return (getFixedDividend()*getParValue())/tickerPrice;
	}

}
