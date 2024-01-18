package com.kh.collection;

import java.util.ArrayList;
import java.util.List;

class Food{
	String name;
	int kacl;
	
	public Food() {}
	
	public Food(String name, int kcal) {
		this.kacl = kcal;
		this.name = name;
	}
}

class Pizza extends Food{
	
}

public class CollectionPractice {
	public static void main(String[] args) {
		List<Food> first = new ArrayList<>();
		
		Food f1 = new Food("밥한공기!", 300);
		first.add(f1);
		
		first.add(new Food("햄버거", 400));
	}
}
