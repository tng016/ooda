package OODAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	ArrayList<FoodItem> mains = new ArrayList<>();;
	private ArrayList<FoodItem> drinks = new ArrayList<>();;
	private ArrayList<FoodItem> desserts = new ArrayList<>();;
	private ArrayList<FoodItem> packages = new ArrayList<>();;
	
	//constructor for empty menu
	public Menu (){
	}
	
	//constructor for a pre-saved menu
	public Menu(FoodItem[] savedMenu){
		for (int i = 0; i<savedMenu.length; i++)
			addItem(savedMenu[i]);
	}
	
	public void printMenu(){
		int count = 1;
		System.out.println("========================   MAINS   ========================");
		for(FoodItem item:mains){
			System.out.printf("("+count+") ");
			item.getDetails();
			count ++;
		}
		System.out.println("\n========================   Drinks   ========================");
		for(FoodItem item:drinks){
			System.out.printf("("+count+") ");
			item.getDetails();
			count ++;
		}
		System.out.println("\n========================   Desserts   ========================");
		for(FoodItem item:desserts){
			System.out.printf("("+count+") ");
			item.getDetails();
			count ++;
		}
		System.out.println("\n========================   Packages   ========================");
		for(FoodItem item:packages){
			System.out.printf("("+count+") ");
			item.getDetails();
			count ++;
		}
	}
	
	public void addItem(FoodItem i){
		returnArray(i).add(i);
	}
	
	public void removeItem(FoodItem i){
		returnArray(i).remove(i);
	}
	
	public void updateItem(){
		printMenu();
		System.out.println("Select which A la Carte item you would like to update");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt()-1;
		AlaCarte temp = (AlaCarte) returnItem(input);
		returnArray(temp).remove(temp);
		
		sc.nextLine();
		System.out.println("What is the name of the updated item?");
		String name = sc.nextLine();
		System.out.println("What is the description of the updated item?");
		String description = sc.nextLine();
		System.out.println("What is the price of the updated item?");
		int price = sc.nextInt();
		returnArray(temp).add(new AlaCarte(name,temp.getType(),description,price));
		sc.close();
	}

	public FoodItem returnItem(int i){
		if (i<mains.size())
			return mains.get(i);
		i -= mains.size();
		if (i<drinks.size())
			return drinks.get(i);
		i -= drinks.size();
		if (i<desserts.size())
			return desserts.get(i);
		i -= desserts.size();
		return packages.get(i);
	}
	
	private ArrayList<FoodItem> returnArray(FoodItem i){
		if (i instanceof PackageSet)
			return packages;
		else if (((AlaCarte) i).getType() == 'M')
			return mains;
		else if (((AlaCarte) i).getType() == 'R')
			return drinks;
		else if (((AlaCarte) i).getType() == 'D')
			return desserts;
		else
			return null;
	}
	

}