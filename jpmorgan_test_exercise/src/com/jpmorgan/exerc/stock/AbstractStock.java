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
	private double stockPrice = 0L;
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
		return this.stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	public EnumStockType getStockType() {
		return this.stockType;
	}

	public int getLastDividend() {
		return this.lastDividend;
	}

	public void setLastDividend(int lastDividend) {
		this.lastDividend = lastDividend;
	}

	public double getFixedDividend() {
		return this.fixedDividend;
	}

	public void setFixedDividend(double fixedDividend) {
		this.fixedDividend = fixedDividend;
	}

	public int getParValue() {
		return this.parValue;
	}

	public void setParValue(int parValue) {
		this.parValue = parValue;
	}

	public double getPeRatio() {
		return this.peRatio;
	}

	public void setPeRatio() {
		if (getLastDividend() == 0) {
			this.peRatio = 0;
		} else {
			this.peRatio = (getStockPrice()/getLastDividend());
		}
	}

	public double getStockPrice() {
		return this.stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public double getStrockTradePrice() {
		return this.strockTradePrice;
	}

	public void setStrockTradePrice(double strockTradePrice) {
		this.strockTradePrice = strockTradePrice;
	}

	public long getTotalAvailableShares() {
		return this.totalAvailableShares;
	}

	public void setTotalAvailableShares(long totalAvailableShares) {
		this.totalAvailableShares = totalAvailableShares;
	}

	public long getSoldShares() {
		return this.soldShares;
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
