package codeAssignment;

public class Duck extends Bird{
	public void sing() {
		System.out.println("Quack, quack");
	}
	
	public void swim() {
		System.out.println("I am swimming");
	}
	
	public boolean canSwim() {
		return true;
	}
}
