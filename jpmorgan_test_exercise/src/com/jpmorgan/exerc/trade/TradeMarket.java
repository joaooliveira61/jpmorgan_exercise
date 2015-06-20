package com.jpmorgan.exerc.trade;

import java.util.Iterator;
import java.util.LinkedList;

public class TradeMarket {

	private LinkedList<Trade> trades;
	private long tradeIdCounter = 1;
	
	public TradeMarket() {
		this.trades = new LinkedList<Trade>();
	}
	
	public void addTrade(Trade trade) {
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
	
	public void setStockPrice() {
		
	}
	
	public double getStockPrice() {
		return 0.0;
	}
	
	public void setGeometricMean() {
		
		
	}
	
	public double getGeometricMean() {
		return 0.0;
	}
	
	
	public void setPERatio() {
		
	}
	
	public double getPERatio() {
		return 0.0;
	}
	
	public void setDividendYield() {
		
	}
	
	public double getDividendYield() {
		return 0.0;
	}
}
