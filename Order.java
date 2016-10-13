package OODAssignment;

import java.util.ArrayList;

public class Order {
	private Staff staff;
	private ArrayList<FoodItem> food_order;
	private int tablenumber;
	
	Order(Staff s, int t){
		setStaff(s);
		tablenumber = t;
		food_order = new ArrayList<FoodItem>();
	}

	public Staff getStaff() {
		return staff;
	}


	public void setStaff(Staff staff) {
		this.staff = staff;
	}


	public FoodItem[] getFood_order() {
		return food_order;
	}

	public void setFood_order(FoodItem[] food_order) {
		this.food_order = food_order;
	}
	
	public void printOrder(){
		for (FoodItem f:food_order){
			f.getDetails();
		}
	}
	
	public void addItem(FoodItem f){
		food_order.add(f);
	}
	
	public void removeItem(int choice){
		food_order.remove(choice);
	}
	
}
