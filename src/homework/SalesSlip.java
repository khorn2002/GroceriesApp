package homework;

import java.util.ArrayList;

public class SalesSlip {
	//variables
	ArrayList<SalesItem> groceries;
	
	//constructor
	public SalesSlip() {
		groceries = new ArrayList<SalesItem>(); 
	}
	
	//add an item to the list
	public void add(SalesItem i) {
		groceries.add(i);
	}
	
	//sum up everything on the list
	public double cost() {
		double sum = 0;
		for(int i = 0; i < groceries.size(); i ++) {
			sum += groceries.get(i).getPrice() * groceries.get(i).getQuantity();
		}
		return sum;
	}
	
	//print out the list
	public String toString() {
		String groceryList = "";
		for(int i = 0; i < groceries.size(); i ++) {
			groceryList += groceries.get(i).toString() + "\n";
		}
		return groceryList;
	}

}
