package com.jpmorgan.exerc.test;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.LinkedList;
import java.util.Random;

import com.jpmorgan.exerc.stock.AbstractStock;
import com.jpmorgan.exerc.stock.EnumStockType;
import com.jpmorgan.exerc.stock.StockFactory;
import com.jpmorgan.exerc.trade.EnumTradeIndicator;
import com.jpmorgan.exerc.trade.Trade;
import com.jpmorgan.exerc.trade.TradeMarket;

public class StockTradeMarketExec {

	public static void main(String[] args) {
		// Small example of how the exercise works
		TradeMarket stockTradeMarket = new TradeMarket();
		StockFactory stockFactory = new StockFactory();

		String[] stockSymbols = {"TEA", "POP", "ALE", "GIN", "JOE"};
		EnumStockType[] stockType = {EnumStockType.COMMON, EnumStockType.COMMON,
				EnumStockType.COMMON, EnumStockType.PREFERRED, EnumStockType.COMMON};
		int[] lastDividends = {0, 8, 23, 8, 13};
		int[] fixedDividends = {0, 0, 0, 2, 0};
		int[] parValues = {100, 100, 60, 100, 250};
		long[] numberOfShares = {99939223321L, 49213913345L, 9912932148414L,
				32392102323L, 99540939831L};

		Random stockPrice = new Random();
		AbstractStock tempStock;

		// Create the initial set of stocks
		for (int i = 0; i < 5; i++) {
			tempStock = stockFactory.getStock(stockType[i], stockSymbols[i], 
					lastDividends[i], fixedDividends[i], parValues[i],
					numberOfShares[i]);
			tempStock.setStrockTradePrice(Math.abs(stockPrice.nextDouble()));

			stockTradeMarket.addStock(tempStock);
		}

		// Generate 10 trades for each stock
		Random numOfShares = new Random();
		Random tradePrice = new Random();
		Trade tempTrade;
		int numOfSharesTemp = 0;

		for (int j = 0; j < stockTradeMarket.getNumOfAvailableStocks(); j++) {
			for (int k = 0; k < 10; k++) {
				while ((numOfSharesTemp = numOfShares.nextInt()) <=  0) {
					// loop to make sure the value is greater than 0
				}
				
				tempTrade = new Trade(stockTradeMarket.getNewTradeIdCounter(),
						numOfSharesTemp,
						Timestamp.from(Instant.now()),
						stockTradeMarket.getStockBySymbol(stockSymbols[j]),
						Math.abs(tradePrice.nextDouble()));

				stockTradeMarket.addTrade(tempTrade);
				
			}
			
			System.out.println("Stock: " + stockSymbols[j]);
			System.out.println("Geometric mean: " 
					+ stockTradeMarket.getGeometricMean(stockSymbols[j]));
			System.out.println("Stock price: " 
					+ stockTradeMarket.getStockPrice(stockSymbols[j]));
			System.out.println("Stock PE ratio: " 
					+ stockTradeMarket.getStockBySymbol(stockSymbols[j]).getPeRatio());
			System.out.println("Stock type: "
					+ stockTradeMarket.getStockBySymbol(stockSymbols[j]).getStockType());
			System.out.println("Stock divident yield: "
					+ stockTradeMarket.getStockBySymbol(stockSymbols[j]).getDividendYield());
		}

	}

}
