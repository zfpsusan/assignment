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

	void sing() {
		if ("male".equalsIgnoreCase(sex) &&
				isMature) {
			System.out.println("“Cock-a-doodle-doo");
		} else {
			System.out.println("Cluck, cluck");
		}		
	}
	
	void fly() {
		System.out.println("I can not fly");
	}

}
