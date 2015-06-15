package com.jpmorgan.exerc.test;

import java.util.LinkedList;
import java.util.Random;

import com.jpmorgan.exerc.stock.AbstractStock;
import com.jpmorgan.exerc.stock.EnumStockType;
import com.jpmorgan.exerc.stock.StockFactory;
import com.jpmorgan.exerc.trade.TradeMarket;

public class StockTradeMarketExec {

	public static void main(String[] args) {
		TradeMarket stockTradeMarket = new TradeMarket();
		LinkedList<AbstractStock> listOfStocks = new LinkedList<AbstractStock>();
		StockFactory stockFactory = new StockFactory();
		
		String[] stockSymbols = {"TEA", "POP", "ALE", "GIN", "JOE"};
		EnumStockType[] stockType = {EnumStockType.COMMON, EnumStockType.COMMON,
				EnumStockType.COMMON, EnumStockType.PREFERRED, EnumStockType.COMMON};
		int[] lastDividends = {0, 8, 23, 8, 13};
		int[] fixedDividends = {0, 0, 0, 2, 0};
		int[] parValues = {100, 100, 60, 100, 250};
		
		// Create the stocks
		for (int i = 0; i < 5; i++) {
			listOfStocks.add(stockFactory.getStock(stockType[i], stockSymbols[i], 
					lastDividends[i], fixedDividends[i], parValues[i]));
		}

		// Generate trades
		
	}

}