package com.jpmorgan.exerc.stock;

public class PreferredStock extends AbstractStock {

	public PreferredStock(String stockSymbol, EnumStockType stockType,
			int lastDividend, double fixedDividend,
			int parValue,
			long availableShares) {
		super(stockSymbol, stockType, lastDividend, fixedDividend,
				parValue, availableShares);
	}

	@Override
	public double getDividendYield() {
		return (getFixedDividend()*getParValue())/getStockPrice();
	}

}
