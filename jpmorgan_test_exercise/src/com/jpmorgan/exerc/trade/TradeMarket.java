package com.jpmorgan.exerc.trade;

import java.util.Iterator;
import java.util.LinkedList;

public class TradeMarket {

	private LinkedList<Trade> trades;
	
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
	
	public void setStockPrice() {
		
	}
	
	
}
