package com.jpmorgan.exerc.stock;

/**
 * Stock class
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
	
	public AbstractStock(String stockSymbol, EnumStockType stockType, int lastDividend,
			double fixedDividend, int parValue) {
		this.stockSymbol = stockSymbol;
		this.stockType = stockType;
		this.lastDividend = lastDividend;
		this.fixedDividend = fixedDividend;
		this.parValue = parValue;
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

	public void setPeRatio(double peRatio) {
		this.peRatio = peRatio;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}
	
	/**
	 * Method do determine the dividend yield,
	 * depending on the type of stock
	 * @param tickerPrice
	 * @return
	 */
	public abstract double getDividendYield(double
			tickerPrice);
	
}
