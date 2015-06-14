package com.jpmorgan.exerc.stock;

public class StockFactory {

	
	public AbstractStock getStock(EnumStockType stockType, String stockSymbol,
			int lastDividend, int fixedDividend, int parValue) {
		if (stockType == null) {
			return null;
		}
		
		if (stockType.equals(EnumStockType.COMMON)) {
			return new CommonStock(stockSymbol, stockType, lastDividend,
					fixedDividend, parValue);
		} else if (stockType.equals(EnumStockType.PREFERRED)) {
			return new PreferredStock(stockSymbol, stockType, lastDividend,
					fixedDividend, parValue);
		}
		
		return null;
	}
	
}
