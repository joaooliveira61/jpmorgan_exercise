package com.jpmorgan.exerc.stock;

public class CommonStock extends AbstractStock {

	public CommonStock(String stockSymbol, EnumStockType stockType,
			int lastDividend, double fixedDividend, int parValue) {
		super(stockSymbol, stockType, lastDividend, fixedDividend, parValue);
	}

	@Override
	public double getDividendYield(double tickerPrice) {
		return getLastDividend()/tickerPrice;
	}

}
