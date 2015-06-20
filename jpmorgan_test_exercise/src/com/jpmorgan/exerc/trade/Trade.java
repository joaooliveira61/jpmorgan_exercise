package com.jpmorgan.exerc.trade;

import java.sql.Timestamp;

import com.jpmorgan.exerc.stock.AbstractStock;

/**
 * 
 * @author João Oliveira
 *
 */
public class Trade {

	private long numOfShares;
	private final long tradeID;
	private double tradePrice;
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

	public long getNumOfShares() {
		return numOfShares;
	}
	/**
	 * 
	 * @param numOfShares
	 * @return True if the trade was completed successfuly,
	 * false if the number of shares available is smaller than the
	 * number of shares bought in the trade
	 */
	public boolean setNumOfShares(long numOfShares) {
		if (this.getStock().getTotalAvailableShares()
				> numOfShares) {
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
				/*
				 * Updates the number of available shares and the number
				 * of sold shares
				 */
				this.getStock()
				.setTotalAvailableShares(
						this.getStock().getTotalAvailableShares() - numOfShares);
				this.getStock().setSoldShares(
						this.getStock().getSoldShares() + numOfShares);
				this.tradeIndicator = EnumTradeIndicator.BUY;
			} else if (numOfShares < 0){
				this.numOfShares = Math.abs(numOfShares);
				/*
				 * Updates the number of available shares and the number
				 * of sold shares
				 */
				this.getStock()
				.setTotalAvailableShares(
						this.getStock().getTotalAvailableShares() + numOfShares);
				this.getStock().setSoldShares(
						this.getStock().getSoldShares() - numOfShares);
				this.tradeIndicator = EnumTradeIndicator.SELL;
			} else {
				this.numOfShares = 1;
				/*
				 * Updates the number of available shares and the number
				 * of sold shares
				 */
				this.getStock()
				.setTotalAvailableShares(
						this.getStock().getTotalAvailableShares() + 1);
				this.getStock().setSoldShares(
						this.getStock().getSoldShares() - 1);
				this.tradeIndicator = EnumTradeIndicator.BUY;
			}

			return true;

		} else {
			return false;
		}
	}

	public long getTradeID() {
		return tradeID;
	}

	public double getTradePrice() {
		return tradePrice;
	}

	/**
	 * Multiplies the number of bough shares in the trade with the current
	 * stock price
	 */
	public void setTradePrice() {
		this.tradePrice = this.stock.getStockPrice() * this.numOfShares;
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
