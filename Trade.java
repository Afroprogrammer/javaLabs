public class Trade {

	private String id;  
	private String symbol;
	private int quantity;
	private double price;

	public Trade ( String id, String symbol, int quantity, double price){
		this.id = id;
		this.symbol = symbol;
		this.quantity = quantity;
		this.price = price;
	} 

	public Trade (String id, String symbol , int quantity) {
		this.id = id;
		this.symbol = symbol;
		this.quantity = quantity;
	}

	public double setPrice(double price){
		if(price >= 0){
			this.price = price;
		}
		else{
			System.out.println("Error the price cannot be a negative value!");
		}
	    return this.price;
}
        
	public String toString(){
		return (id + " " + symbol + " " + quantity + " " + price);
	
}
}













