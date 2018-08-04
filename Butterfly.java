package codeAssignment;

public class Butterfly extends Animal{
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
	
	void fly() {
		if ("butterfly".equalsIgnoreCase(stage)) {
			System.out.println("I am flying");
		} else {
			System.out.println("I can not fly");
		}
	}
	
	void walk() {
		System.out.println("I can not walk");
	}
	
	void sing() {
		System.out.println("I can not sing");
	}

}
