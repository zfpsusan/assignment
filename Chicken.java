package codeAssignment;

public class Chicken extends Bird{
	String sex = null;
	boolean isMature = false;
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public boolean isMature() {
		return isMature;
	}

	public void setMature(boolean isMature) {
		this.isMature = isMature;
	}
	
	Chicken() {}
	
	Chicken(String sex, boolean isMature) {
		this.sex = sex;
		this.isMature = isMature;
	}

	public void sing() {
		if ("male".equalsIgnoreCase(sex) &&
				isMature) {
			System.out.println("Cock-a-doodle-doo");
		} else {
			System.out.println("Cluck, cluck");
		}		
	}
	
	public void fly() {
		System.out.println("I can not fly");
	}
	
	public boolean canFly() {
		return false;
	}

}
