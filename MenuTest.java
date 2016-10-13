package OODAssignment;

import java.util.Collections;

public class MenuTest {
	public static void main(String[] args){
		Menu menu1 = new Menu();
		FoodItem chickenRice = new AlaCarte("Chicken Rice",'M',"Chicken with Rice", 10.5f);
		FoodItem chendol = new AlaCarte("Chendol",'D',"Sweet, sweet, sweet", 3.0f);
		FoodItem tehBing = new AlaCarte("Iced tea",'R',"Good for a hot day", 2.5f);
		menu1.addItem(chickenRice);
		menu1.addItem(chendol);
		menu1.addItem(tehBing);
		
		AlaCarte[] package1 = new AlaCarte[3];
		package1[0] = new AlaCarte("Fried Rice",'M',"Rice that's Fried", 8.5f);
		package1[1] = new AlaCarte("Ice Kachang",'D',"Paying for ice", 2.5f);
		package1[2] = new AlaCarte("Coffee",'R',"Straight from the FARC", 3.5f);
		PackageSet sgSpecial = new PackageSet("Singapore Special",package1,"BEST IN SEA",30);
		
		menu1.addItem(sgSpecial);
		
		menu1.printMenu();
		
		menu1.removeItem(chendol);
		
		menu1.printMenu();
		
		menu1.updateItem();
		
		menu1.printMenu();
	}
}
