package com.mypackage.innerClass;

public class Main {

	public static void main(String[] args) {
		
		Integer[] numbers = {34, 2, 56, 43, 9 ,12, 21, 67, 54, 78, 99};
		Collection collect = new Collection(numbers);
		
		Iterator iterator = collect.createF();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		
		Iterator iterator2 = collect.createB();
		while(iterator2.hasNext()) {
			
			System.out.println(iterator2.next());
		}
	
	}

}
