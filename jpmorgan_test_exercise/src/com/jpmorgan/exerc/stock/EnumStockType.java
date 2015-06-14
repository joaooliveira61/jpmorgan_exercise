package com.jpmorgan.exerc.stock;

public enum EnumStockType {
	
	COMMON(1),
	PREFERRED(2);
	
	private final int id;
	
	EnumStockType(int id){
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
}
