package com.jpmorgan.exerc.test;

import java.util.LinkedList;
import java.util.Random;

import com.jpmorgan.exerc.stock.AbstractStock;
import com.jpmorgan.exerc.trade.TradeMarket;

public class StockTradeMarketExec {

	public static void main(String[] args) {
		TradeMarket stockTradeMarket = new TradeMarket();
		LinkedList<AbstractStock> listOfStocks = new LinkedList<AbstractStock>();
		
		Random lastDividendRandom = new Random();
		Random fixedDividendRandom = new Random();
		Random parValueRandom = new Random();
		
		for (int i = 0; i < 10; i++) {
			
		}

	}

}
