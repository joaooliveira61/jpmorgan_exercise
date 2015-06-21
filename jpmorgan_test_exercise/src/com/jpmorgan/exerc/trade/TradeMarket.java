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
	
	public void addTrade(Trade trade) {
		// When a new trade is made, the stock price is updated
		setStockPrice(trade);
		/* 
		 * Update the Price-Earnings Ratio after every trade is made,
		 * since it fluctuates with the stock price 
		 */
		getStockBySymbol(trade.getStock().getStockSymbol()).setPeRatio();
		this.trades.add(trade);
	}
	
	public void removeTrade(long tradeId) {
		Iterator<Trade> it = trades.iterator();
		
		Trade temp;
		while (it.hasNext()) {
			temp = it.next();
			if (temp.getTradeID() == tradeId) {
				trades.remove(temp);
				break;
			}
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
		double newStockprice = (trade.getTradePrice() * trade.getNumOfShares())
				/(trade.getStock().getSoldShares() + trade.getStock().getTotalAvailableShares());
		
		getStockBySymbol(trade.getStock().getStockSymbol())
		.setStockPrice(newStockprice);		
	}
	
	public double getStockPrice() {
		return 0.0;
	}
	
	public void setGeometricMean() {
		
	}
	
	public double getGeometricMean() {
		return 0.0;
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
