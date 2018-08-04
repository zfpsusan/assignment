package codeAssignment;

public class Parrot extends Bird{
	Animal liveWith = null;

	public Animal getLiveWith() {
		return liveWith;
	}

	public void setLiveWith(Animal liveWith) {
		this.liveWith = liveWith;
	}
	
	void sing() {
		if (liveWith != null) {
			liveWith.sing();
		}
	}
}
