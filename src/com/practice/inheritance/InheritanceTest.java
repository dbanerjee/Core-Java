package com.practice.inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		SuperClass superObject = new SubClass();
		SubClass subObject = (SubClass) new SuperClass();
		
		superObject.show();
		subObject.show();
		//subObject.display();
		
	}

}
