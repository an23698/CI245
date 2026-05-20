package chapter9;

public class stock {

	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public stock (String newsymbol, String newname){
		symbol = newsymbol;
		name = newname;
	}
	public String getsymbol( ){
			return symbol;
		}
	public String getname (){
		return name;
	}
	public double getpreviousClosingPrice (){
		return previousClosingPrice;
	}
	public double getCurrentPrice( ){
		return currentPrice;
	}
	public void setpreviousClosingPrice(double newprice){
		previousClosingPrice = newprice;
	}
	public void setcurrentPrice(double newprice){
		currentPrice = newprice;
	}
	public double getChangePercent(){
		return ( currentPrice - previousClosingPrice)/previousClosingPrice;
	}
	public String toString(){
		return "the object: " +
	"\nCompany Name:    " + name +
	"\nStock Symbol:   " + symbol +
	"\ncurrentPrice:    " + currentPrice +
	"\nPercentage change:  " + getChangePercent()*10000 + "x";
	}
	}

	
