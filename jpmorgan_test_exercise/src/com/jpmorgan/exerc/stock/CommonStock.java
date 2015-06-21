package com.jpmorgan.exerc.stock;

public class CommonStock extends AbstractStock {

	public CommonStock(String stockSymbol, EnumStockType stockType,
			int lastDividend, double fixedDividend, int parValue,
			long availableShares) {
		super(stockSymbol, stockType, lastDividend, fixedDividend,
				parValue, availableShares);
	}

	@Override
	public double getDividendYield() {
		return getLastDividend()/getStockPrice();
	}

}
