package com.jpmorgan.exerc.trade;

import java.util.Iterator;
import java.util.LinkedList;

import com.jpmorgan.exerc.stock.AbstractStock;

public class TradeMarket {

	private LinkedList<AbstractStock> listOfStocks;
	private LinkedList<Trade> trades;
	private long tradeIdCounter = 1;

	public TradeMarket() {
		this.trades = new LinkedList<Trade>();
		this.listOfStocks = new LinkedList<AbstractStock>();
	}

	public TradeMarket(LinkedList<AbstractStock> listOfStocks) {
		this.trades = new LinkedList<Trade>();
		this.listOfStocks = listOfStocks;
	}

	public void addStock(AbstractStock stock) {
		this.listOfStocks.add(stock);
	}

	public boolean isTradePossible(Trade trade) {
		if (trade.getStock().getTotalAvailableShares()
				> trade.getNumOfShares()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Adds a new trade to the trade list.
	 * Updates the stock price and PE ratio
	 * @param trade
	 */
	public void addTrade(Trade trade) {
		if (isTradePossible(trade)) {
			// When a new trade is made, the stock price is updated
			setStockPrice(trade);
			/* 
			 * Update the Price-Earnings Ratio after every trade is made,
			 * since it fluctuates with the stock price 
			 */
			getStockBySymbol(trade.getStock().getStockSymbol()).setPeRatio();
			this.trades.add(trade);
		}
	}

	public long getNewTradeIdCounter() {
		return this.tradeIdCounter++;
	}

	public int getNumOfAvailableStocks() {
		return this.listOfStocks.size();
	}

	/**
	 * Used to set a new stock price after every trade
	 * @param trade
	 */
	public void setStockPrice(Trade trade) {
		double x = trade.getTradePrice() * trade.getNumOfShares();
		double y = trade.getStock().getSoldShares() + trade.getStock().getTotalAvailableShares();

		double newStockprice = x/y;

		for (AbstractStock stock : listOfStocks) {
			if (stock.getStockSymbol().equals(trade.getStock().getStockSymbol())) {
				stock.setStockPrice(newStockprice);
				break;
			}
		}
	}

	/**
	 * Returns the stock price for a given stock symbol
	 * @param stockSymbol The stock symbol
	 * @return
	 */
	public double getStockPrice(String stockSymbol) {
		return getStockBySymbol(stockSymbol).getStockPrice();
	}

	/**
	 * Gets the geometric mean of the trade prices for a given stock 
	 * @return The geometric mean of the trades for a given stock
	 */
	public double getGeometricMean(String stockSymbol) {
		int numOfTrades = 0;
		double tradePriceSum = 0.0;

		for (Trade trade : trades) {
			if (trade.getStock().getStockSymbol().equals(stockSymbol)) {
				numOfTrades++;
				tradePriceSum += trade.getStock().getStrockTradePrice(); 
			}
		}

		return Math.pow(tradePriceSum, numOfTrades);
	}

	/**
	 * Returns a stock given it's symbol 
	 * @param stockSymbol
	 * @return
	 */
	public AbstractStock getStockBySymbol(String stockSymbol) {
		for (AbstractStock stock : listOfStocks) {
			if (stock.getStockSymbol().equals(stockSymbol)) {
				return stock;
			}
		}
		return null;
	}
}
