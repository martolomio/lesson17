package com.mypackage.innerClass;

public interface Iterator {
	
	public boolean hasNext();
	public Object next();
	
}

class Collection{
	private static Integer[] numbers;
	Collection(Integer[] numbers) {
		Collection.numbers = numbers;
	}
	
	public class Forward implements Iterator{ 
		private int count = 0;

		@Override
		public boolean hasNext() {
			return count< numbers.length;
		}

		@Override
		public Object next() {
			if( numbers[count] % 2 ==1) {
				numbers[count] = 0;
			}
			
			return numbers[count++];
		}
		
	}
	
	public Forward createF() {
		return new Forward();
	}
	
	public class Back implements Iterator{ 
		private int count = numbers.length-1;

		@Override
		public boolean hasNext() {
			return count >= 0;
		}

		@Override
		public Object next() {
			
			for(int i= 0; i<numbers.length; i ++) {
				if(i %2==1) {
				 numbers[i]=null ;
				}
			}
			return numbers[count--] ;
		}
		
	}
	
	public Back createB() {
		return new Back();
	}
}
