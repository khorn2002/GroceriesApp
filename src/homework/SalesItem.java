package homework;

public class SalesItem {
	//variables
	private String item;
	private double price;
	private int quantity;
	
	//constructor
	public SalesItem(String i, double p, int q) {
		item = i;
		price = p;
		quantity = q;
	}
	
	//setters
	public void setItem(String i) {
		item = i;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	
	public void setQuantity(int q) {
		quantity = q;
	}
	
	//getters
	public String getItem() {
		return item;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public String toString() {
		return item + "\t" + price + "\t" + quantity; 
	}
	
}
