package com.jpmorgan.exerc.trade;

import java.sql.Timestamp;

import com.jpmorgan.exerc.stock.AbstractStock;

/**
 * 
 * @author João Oliveira
 *
 */
public class Trade {

	private int numOfShares;
	private final long tradeID;
	public long getTradeID() {
		return tradeID;
	}

	private double price;
	private EnumTradeIndicator tradeIndicator;
	private Timestamp timeStamp;
	private AbstractStock stock;

	public Trade(long tradeID, int numOfShares,
			Timestamp timeStamp, AbstractStock stock) {
		this.setStock(stock);
		this.tradeID = tradeID;
		setNumOfShares(numOfShares);
		this.timeStamp = timeStamp;
	}

	public int getNumOfShares() {
		return numOfShares;
	}

	public void setNumOfShares(int numOfShares) {
		/*
		 * If the value is greater than 0, shares are bough
		 * If the value is less than 0, shares are sold
		 * 
		 * If the value is zero, set the following default case:
		 *  -> Number of shares: 1
		 *  -> Trade indicator : Buy
		 */
		if (numOfShares > 0 ) {
			this.numOfShares = numOfShares;
			this.tradeIndicator = EnumTradeIndicator.BUY;
		} else if (numOfShares < 0){
			this.numOfShares = Math.abs(numOfShares);
			this.tradeIndicator = EnumTradeIndicator.SELL;
		} else {
			this.numOfShares = 1;
			this.tradeIndicator = EnumTradeIndicator.BUY;
		}

	}

	public double getPrice() {
		return price;
	}

	/**
	 * Multiplies the number of bough shares in the trade with the current
	 * stock price
	 */
	public void setPrice() {
		this.price = this.stock.getStockPrice() * this.numOfShares;
	}

	public EnumTradeIndicator getTradeIndicator() {
		return tradeIndicator;
	}

	public Timestamp getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	public AbstractStock getStock() {
		return stock;
	}

	public void setStock(AbstractStock stock) {
		this.stock = stock;
	}

}
