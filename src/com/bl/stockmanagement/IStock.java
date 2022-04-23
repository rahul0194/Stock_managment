package com.bl.stockmanagement;

public interface IStock {
	public void createStockAccount();
	public double valueOf();
	public void buy(String stock);
	public double printReport();
	public void sell(String stock);
}
