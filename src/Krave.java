//Item Class

import java.io.*;
import java.util.*;

public class Krave{
	class Item {
		ArrayList<String> allergyList;
		ArrayList<String> tags;

		String name;

		boolean ageLimit; 
		boolean vegan;
		boolean glutenFree;

		Item(String n, int ageBit, int veganBit, int glutenBit){
			name = n;
			ageLimit = (ageBit == 0);
			vegan = (veganBit == 0);
			glutenFree = (glutenBit == 0);

			allergyList = new ArrayList<String>();
			Tags = new ArrayList<String>();
		}

		boolean isAgeLimit(){
			return ageLimit;
		}

	        boolean isVegan(){
			return vegan;
		}	

		boolean isGlutenFree(){
			return glutenFree;
		}
	}

	class Food extends Item{
		ArrayList<Food> relatedList;
		ArrayList<Drink> drinkList;

		Food(String n, int ageBit, int veganBit, int glutenBit){
			super(n, ageBit, veganBit, glutenBit);
			relatedList = new ArrayList<Food>();
			drinkList = new ArrayList<Drink>();
		}	

		void addRelatedFood(ArrayList<Food> suggestLine){
			for(Food f : suggestList){
			//Java's version of for in loops
				relatedList.add(f);
			}
		}

		void addRelatedFood(ArrayList<Food> suggestList){
			for(Food f : suggestList){
				relatedList.add(f);
			}
		}

		void drinkList(ArrayList<Drink> suggestList){
			for(Drink d : suggestList){
				relatedList.add(d);
			}
		}
	}

	class Drink extends Item{
		Drink(String n, int ageBit, int veganBit, int glutenBit){
			super(n, ageBit, veganBit, glutenBit);
			relatedList = new ArrayList<Food>();
			drinkList = new ArrayList<Drink>();
		}
	} 

	boolean veganToggle;
	boolean ageToggle;
	boolean glutenToggle;
	
	ArrayList<Food> foodList = new ArrayList<Food>();
		
	File foodFile = new File("foodList.txt");
	File drinkFile = new File("drinkList.txt");

	void addItems(){
		Scanner in = new Scanner(foodFile);
		while(in.hasNext()){
			foodList.add(in.next());
		}	 
		in = new Scanner(drinkFile);
		while(in.hasNext()){

		}
	}

	void process(){

	}
}





	
