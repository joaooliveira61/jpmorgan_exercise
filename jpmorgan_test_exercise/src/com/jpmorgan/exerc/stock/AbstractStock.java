package com.jpmorgan.exerc.stock;

/**
 * Abstract stock class
 * For this implementation, the ticker price is equivalent to the stock price 
 * @author João Oliveira
 *
 */
public abstract class AbstractStock {

	private String stockSymbol;
	private final EnumStockType stockType;
	private int lastDividend;
	private double fixedDividend;
	private int parValue;
	private double peRatio = 0.0;
	private double stockPrice = 0.0;
	private double strockTradePrice = 0.0;
	private long totalAvailableShares = 0L;
	private long soldShares = 0L;

	public AbstractStock(String stockSymbol, 
			EnumStockType stockType, 
			int lastDividend,
			double fixedDividend, 
			int parValue, 
			long availableShares) {
		
		setStockSymbol(stockSymbol);
		this.stockType = stockType;
		setLastDividend(lastDividend);
		setFixedDividend(fixedDividend);
		setParValue(parValue);
		this.totalAvailableShares = availableShares;
	}

	public String getStockSymbol() {
		return stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	public EnumStockType getStockType() {
		return stockType;
	}

	public int getLastDividend() {
		return lastDividend;
	}

	public void setLastDividend(int lastDividend) {
		this.lastDividend = lastDividend;
	}

	public double getFixedDividend() {
		return fixedDividend;
	}

	public void setFixedDividend(double fixedDividend) {
		this.fixedDividend = fixedDividend;
	}

	public int getParValue() {
		return parValue;
	}

	public void setParValue(int parValue) {
		this.parValue = parValue;
	}

	public double getPeRatio() {
		return peRatio;
	}

	public void setPeRatio() {
		this.peRatio = (getStockPrice()/getLastDividend());
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}
	
	public double getStrockTradePrice() {
		return strockTradePrice;
	}

	public void setStrockTradePrice(double strockTradePrice) {
		this.strockTradePrice = strockTradePrice;
	}
	
	public long getTotalAvailableShares() {
		return totalAvailableShares;
	}

	public void setTotalAvailableShares(long totalAvailableShares) {
		this.totalAvailableShares = totalAvailableShares;
	}
	
	public long getSoldShares() {
		return soldShares;
	}

	public void setSoldShares(long soldShares) {
		this.soldShares = soldShares;
	}
	
	/**
	 * Method do determine the dividend yield,
	 * depending on the type of stock
	 * @param tickerPrice
	 * @return
	 */
	public abstract double getDividendYield();
	
}
