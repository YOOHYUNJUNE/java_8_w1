package com.opp.inheritance;

public class InheritanceExample {
	public static void main(String[] args) {
		
		Parents parents = new Parents();
		System.out.println(parents.eyeColor);
		parents.walk();
		
		System.out.println();
		
		Child child = new Child();
		System.out.println(child.job);
		child.hello();
		
		// 상속
		System.out.println(child.eyeColor);
		child.walk();
		
		
	}
}
