package codeAssignment;

public class Butterfly implements Animal{
	String stage = null;

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}
	
	Butterfly(String stage) {
		this.stage = stage;
	}
	
	public void walk() {
		if ("butterfly".equalsIgnoreCase(stage)) {
			System.out.println("I can not walk");
		} else {
			System.out.println("I am crawing");
		}
	}
	
	public boolean canWalk() {
		if ("butterfly".equalsIgnoreCase(stage)) {
			return false;
		} else {
			return true;
		}
	}
	
	public void sing() {
		System.out.println("I can not sing");
	}
	
	public boolean canSing() {
		return false;
	}
	
	public void fly() {
		if ("butterfly".equalsIgnoreCase(stage)) {
			System.out.println("I am flying");
		} else {
			System.out.println("I can not fly");
		}
	}	
	
	public boolean canFly() {
		if ("butterfly".equalsIgnoreCase(stage)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void swim() {
		System.out.println("I don't know yet");
	}
	
	public boolean canSwim() {
		return false;
	}
	
}
