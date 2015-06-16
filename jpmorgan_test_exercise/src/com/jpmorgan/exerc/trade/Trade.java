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
	
	public Trade(long tradeID, int numOfShares, double price, EnumTradeIndicator tradeIndicator,
			Timestamp timeStamp, AbstractStock stock) {
		this.tradeID = tradeID;
		this.numOfShares = numOfShares;
		this.price = price;
		this.tradeIndicator = tradeIndicator;
		this.timeStamp = timeStamp;
		this.setStock(stock);
	}

	public int getNumOfShares() {
		return numOfShares;
	}

	public void setNumOfShares(int numOfShares) {
		this.numOfShares = numOfShares;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public EnumTradeIndicator getTradeIndicator() {
		return tradeIndicator;
	}

	public void setTradeIndicator(EnumTradeIndicator tradeIndicator) {
		this.tradeIndicator = tradeIndicator;
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
