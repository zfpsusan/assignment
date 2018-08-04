package codeAssignment;

public class MarineAnimal implements Animal{
	public void walk() {
		System.out.println("I can not walking");
	}
	
	public boolean canWalk() {
		return false;
	}
	
	public void sing() {
		System.out.println("I can not sing");
	}
	
	public boolean canSing() {
		return false;
	}
	
	public void fly() {
		System.out.println("I can not fly");
	}	
	
	public boolean canFly() {
		return false;
	}
	
	public void swim() {
		System.out.println("I am swimming");
	}
	
	public boolean canSwim() {
		return true;
	}
	
}
