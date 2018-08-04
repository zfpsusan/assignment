package codeAssignment;

public class Bird implements Animal{
	public void walk() {
		System.out.println("I am walking");
	}
	
	public boolean canWalk() {
		return true;
	}
	
	public void sing() {
		System.out.println("I am singing");
	}
	
	public boolean canSing() {
		return true;
	}
	
	public void fly() {
		System.out.println("I am flying");
	}	
	
	public boolean canFly() {
		return true;
	}
	
	public void swim() {
		System.out.println("I don't know yet");
	}
	
	public boolean canSwim() {
		return false;
	}
}
