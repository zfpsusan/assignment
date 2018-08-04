package codeAssignment;

public class Solution {
	public static void main (String[] args) {
		/*
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

		System.out.println("parrot");
		Parrot parrot = new Parrot();
		Dog dog = new Dog();
		parrot.setLiveWith(dog);
		parrot.sing();
		Cat cat = new Cat();
		parrot.setLiveWith(cat);
		parrot.sing();
		parrot.setLiveWith(rooster);
		parrot.sing();
		System.out.println();

		System.out.println("fish");
		Fish fish = new Fish();
		fish.walk();
		fish.sing();
		fish.swim();
		System.out.println();

		System.out.println("shark");
		Shark shark = new Shark();
		shark.walk();
		shark.sing();
		shark.swim();
		shark.character();
		System.out.println();

		System.out.println("clownfish");
		Clownfish clownfish = new Clownfish();
		clownfish.walk();
		clownfish.sing();
		clownfish.swim();
		clownfish.character();
		System.out.println();

		System.out.println("dolphin");
		Dolphin dolphin = new Dolphin();
		dolphin.walk();
		dolphin.sing();
		dolphin.swim();
		System.out.println();

		System.out.println("butterfly");
		Butterfly butterfly = new Butterfly("butterfly");
		butterfly.walk();
		butterfly.fly();
		butterfly.sing();
		System.out.println();

		System.out.println("caterpillar");
		Butterfly caterpillar = new Butterfly("caterpillar");
		caterpillar.walk();
		caterpillar.fly();
		caterpillar.sing();
		System.out.println();
		*/
		
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Chicken("male", true),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolphin(),
				new Dog(),
				new Butterfly("butterfly"),
				new Cat() }; 		
		int totalWalk = 0, totalFly = 0, totalSwim = 0, totalSing = 0;
		
		for (int i=0; i<animals.length; i++) {
			if (animals[i].canWalk()) {
				totalWalk++;
			}
			
			if (animals[i].canFly()) {
				totalFly++;
			}
			
			if (animals[i].canSwim()) {
				totalSwim++;
			}
			
			if (animals[i].canSing()) {
				totalSing++;
			}
		}
		
		System.out.println("Walk " + totalWalk);
		System.out.println("Fly " + totalFly);
		System.out.println("Swim " + totalSwim);
		System.out.println("Sing " + totalSing);
	}
}
