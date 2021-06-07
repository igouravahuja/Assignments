package com.gourav.coffee;

public enum CoffeeEnum
{
	MOCHA("England",200,2),LATTEE("Paris",300,4),AMERICANO("California",600,1),CAPPUCCINO("India",500,3);
	
	CoffeeEnum(String origin,int price, int quantity)
	{
		this.origin=origin;
		this.price=price;
		this.quantity=quantity;
	}
	private String origin;
	private int price,quantity;
	
	public String getOrigin()
	{
		return origin;
	}
	public int getPrice()
	{
		return price;
	}
	public int getQuantity()
	{
		return quantity;
	}



}

