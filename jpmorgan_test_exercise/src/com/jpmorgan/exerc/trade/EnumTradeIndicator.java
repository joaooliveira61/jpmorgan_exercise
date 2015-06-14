package com.jpmorgan.exerc.trade;

public enum EnumTradeIndicator {

	BUY(1),
	SELL(2);
	
	private final int id;
	
	EnumTradeIndicator(int id){
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
}
