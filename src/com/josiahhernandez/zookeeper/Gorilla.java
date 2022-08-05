package com.josiahhernandez.zookeeper;

public class Gorilla extends Mammal {
	public String Name = "new Gorilla";



	public void throwSomething() {
		System.out.println(Name + "threw a banana");
		energyLevel -= 5;
	}



	public void eatBananas() {
		System.out.println(Name + "enjoys a banana");
	}


	public void climb() {
		System.out.println(Name + "The Gorilla climbed a tree");
		energyLevel -= 10;
	}
	

}

