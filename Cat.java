package codeAssignment;

public class Cat implements Animal{
	public void walk() {
		System.out.println("I am walking");
	}
	
	public boolean canWalk() {
		return true;
	}
	
	public void sing() {
		System.out.println("Meow");
	}
	
	public boolean canSing() {
		return true;
	}
	
	public void fly() {
		System.out.println("I can not fly");
	}	
	
	public boolean canFly() {
		return false;
	}
	
	public void swim() {
		System.out.println("I can not swim");
	}
	
	public boolean canSwim() {
		return false;
	}
	
}
