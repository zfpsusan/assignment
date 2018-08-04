package codeAssignment;

public class Solution {
	public static void main (String[] args) {
		System.out.println("bird");
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		System.out.println();
		
		System.out.println("duck");
		Duck duck = new Duck();
		duck.walk();
		duck.fly();
		duck.sing();
		duck.swim();
		System.out.println();
		
		System.out.println("chicken");
		Chicken chicken = new Chicken();
		chicken.walk();
		chicken.fly();
		chicken.sing();
		System.out.println();

		System.out.println("rooster");
		Chicken rooster = new Chicken();
		rooster.setSex("male");
		rooster.setMature(true);
		rooster.walk();
		rooster.fly();
		rooster.sing();
		System.out.println();
	}
}
